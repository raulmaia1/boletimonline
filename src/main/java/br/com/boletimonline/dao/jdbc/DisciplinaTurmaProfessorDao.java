package br.com.boletimonline.dao.jdbc;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import br.com.boletimonline.factory.ConexaoBancoFactory;
import br.com.boletimonline.model.Disciplina;
import br.com.boletimonline.model.DisciplinaTurma;
import br.com.boletimonline.model.Turma;
import br.com.boletimonline.model.usuario.Professor;

public class DisciplinaTurmaProfessorDao {

//	private static final String SQLDISCIPLINA_PROFESSOR_TURMA = "INSERT INTO disciplina_turma_professor (id_disciplina, id_turma, id_professor) VALUES (?,?,?)";
//	private static final String SQL_BUSCAR_DISCIPLINA = "SELECT * FROM disciplina WHERE nomeMateria LIKE ?";
	private static final String SQL_BUSCAR_TURMA_DISCIPLINA = "SELECT * FROM disciplina_turma_professor WHERE id_professor = ?";
	private static final String SQL_BUSCAR_DISCIPLINA_POR_ID = "SELECT * FROM disciplina WHERE id = ?";

//	public void adiciona(Professor professor) {
//
//		professor.getDisciplinasTurmas().forEach((disciplinaTurma) -> {
//
//			int idTurma = new TurmaDao().adicionaTurma(disciplinaTurma.getTurma());
//
//			List<Integer> idDisciplinas = pesquisarDisciplinas(disciplinaTurma.getDisciplinas());
//
//			idDisciplinas.forEach((idDisciplina) -> {
//				this.adicionaDisciplinaTurmaProfessor(professor, idTurma, idDisciplina);
//			});
//
//		});
//
//	}

//	public void adicionaDisciplinaTurmaProfessor(Professor professor, int idTurma, Integer idDisciplina) {
//		ConexaoBancoFactory.getConexao().ifPresent((conn) -> {
//			try {
//				PreparedStatement preparedStatement = conn.prepareStatement(SQLDISCIPLINA_PROFESSOR_TURMA);
//
//				preparedStatement.setInt(1, idDisciplina);
//				preparedStatement.setInt(2, idTurma);
//				preparedStatement.setInt(3, professor.getId());
//
//				preparedStatement.executeUpdate();
//				preparedStatement.close();
//
//			} catch (SQLException e) {
//				e.printStackTrace();
//			}
//		});
//
//	}

	
//	public List<Integer> pesquisarDisciplinas(List<Disciplina> disciplinas) {
//		List<Integer> listaIdsDisciplinas = new ArrayList<>();
//
//		disciplinas.forEach((disciplina) -> {
//			try {
//				PreparedStatement stmt = ConexaoBancoFactory.getConexao().get().prepareStatement(SQL_BUSCAR_DISCIPLINA);
//				stmt.setString(1, "%" + disciplina.getNomeMateria() + "%");
//				ResultSet rs = stmt.executeQuery();
//				rs.next();
//				listaIdsDisciplinas.add(rs.getInt("id"));
//				rs.close();
//				stmt.close();
//
//			} catch (SQLException e) {
//				e.printStackTrace();
//			}
//
//		});
//
//		return listaIdsDisciplinas;
//	}

	/*
	 * Esse metodo pesquisa ids das tabelas turmas, disciplina e colocam em uma Instancia de DisciplinaTurma
	 * 
	 */
	public List<DisciplinaTurma> listarDisciplinaPorProfessor(Professor professor) {

		List<DisciplinaTurma> lista = new ArrayList<>();

		try {
			
			PreparedStatement stmt = ConexaoBancoFactory.getConexao().get()
					.prepareStatement(SQL_BUSCAR_TURMA_DISCIPLINA);
			
			stmt.setInt(1, professor.getId());
			ResultSet rs = stmt.executeQuery();
			int ultimaTurma = 0;
			DisciplinaTurma disciplinaTurma = new DisciplinaTurma();
			
			while (rs.next()) {
				if(ultimaTurma == rs.getInt("id_turma")) {
					Optional<Disciplina> optional = pesquisaDisciplinaPorID(rs.getInt("id_disciplina"));
					
					if(optional.isPresent()) {
						disciplinaTurma.addDisciplina(optional.get());												
					}
					
				}else {
					disciplinaTurma = new DisciplinaTurma();
					Optional<Turma> optionalTurma = new TurmaDao().pesquisaPorID(rs.getInt("id_turma"));
					Optional<Disciplina> optionalDisciplina = pesquisaDisciplinaPorID(rs.getInt("id_disciplina"));
					
					disciplinaTurma.setProfessor(professor);
					if(optionalTurma.isPresent())
						disciplinaTurma.setTurma(optionalTurma.get());												
									
					if(optionalDisciplina.isPresent())
						disciplinaTurma.addDisciplina(optionalDisciplina.get());						
					
					
					
					ultimaTurma = rs.getInt("id_turma");
					lista.add(disciplinaTurma);
				}
				
		
			}

			rs.close();
			stmt.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return lista;
	}

	private Optional<Disciplina> pesquisaDisciplinaPorID(Integer idDisciplina) {
		
		try {
			PreparedStatement stmt = ConexaoBancoFactory.getConexao().get()
					.prepareStatement(SQL_BUSCAR_DISCIPLINA_POR_ID);

			stmt.setInt(1, idDisciplina);

			ResultSet rs = stmt.executeQuery();
			rs.next();
		
			Disciplina disciplina = new Disciplina();
			disciplina.setId(rs.getInt("id"));
			disciplina.setNomeMateria(rs.getString("nome_materia"));
			
			rs.close();
			stmt.close();

			return Optional.ofNullable(disciplina);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return Optional.empty();
	}

}
