package br.com.boletimonline.dao.jdbc;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.boletimonline.factory.ConexaoBancoFactory;
import br.com.boletimonline.model.Disciplina;
import br.com.boletimonline.model.DisciplinaTurma;
import br.com.boletimonline.model.usuario.Professor;

public class DisciplinaTurmaProfessorDao {

	private static final String SQLDISCIPLINA_PROFESSOR_TURMA = "INSERT INTO disciplina_turma_professor (id_disciplina, id_turma, id_professor) VALUES (?,?,?)";
	private static final String SQL_BUSCAR_DISCIPLINA = "SELECT * FROM disciplina WHERE nomeMateria LIKE ?";

	
	
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

	public void adicionaDisciplinaTurmaProfessor(Professor professor, int idTurma, Integer idDisciplina) {
		ConexaoBancoFactory.getConexao().ifPresent((conn) -> {
			try {
				PreparedStatement preparedStatement = conn.prepareStatement(SQLDISCIPLINA_PROFESSOR_TURMA);

				preparedStatement.setInt(1, idDisciplina);
				preparedStatement.setInt(2, idTurma);
				preparedStatement.setInt(3, professor.getId());

				preparedStatement.executeUpdate();
				preparedStatement.close();

			} catch (SQLException e) {
				e.printStackTrace();
			}
		});

	}

	public List<Integer> pesquisarDisciplinas(List<Disciplina> disciplinas) {
		List<Integer> listaIdsDisciplinas = new ArrayList<>();

		disciplinas.forEach((disciplina) -> {
			try {
				PreparedStatement stmt = ConexaoBancoFactory.getConexao().get()
						.prepareStatement(SQL_BUSCAR_DISCIPLINA);
				stmt.setString(1, "%" +disciplina.getNomeMateria()+"%");
				ResultSet rs = stmt.executeQuery();
				rs.next();
				listaIdsDisciplinas.add(rs.getInt("id"));
				rs.close();
				stmt.close();

			} catch (SQLException e) {
				e.printStackTrace();
			}

		});

		return listaIdsDisciplinas;
	}

	public List<DisciplinaTurma> listaDisciplinaPorProfessor(Professor professor) {
		
		
		
		return null;
	}

}
