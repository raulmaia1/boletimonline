package br.com.boletimonline.dao.jdbc;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import br.com.boletimonline.factory.ConexaoBancoFactory;
import br.com.boletimonline.model.Turma;
import br.com.boletimonline.model.usuario.Professor;

public class TurmaDao {

	private static final String INSERT_TURMA = "INSERT INTO turma (descricao_turma, turno,ano,id_escola) VALUES (?,?,?,?)";
	private static final String SQL_BUSCAR_TURMA = "SELECT * FROM turma WHERE descricao_turma LIKE ?";
	private static final String SQL_BUSCAR_TURMA_PROFESSOR = "SELECT * FROM disciplina_turma_professor WHERE id_professor = ?";
	private static final String SQL_BUSCAR_TURMA_POR_ID = "SELECT * FROM turma WHERE id = ?";

	public Integer adicionaTurma(Turma turma) {
		int resultadoPesquisa = pesquisaTurma(turma);
		if (resultadoPesquisa == -1) {

			if (ConexaoBancoFactory.getConexao().isPresent()) {
				try {
//				https://www.ti-enxame.com/pt/java/como-obter-o-id-de-insercao-no-jdbc/968596366/
					String[] colunaID = { "id" };

					PreparedStatement preparedStatement = ConexaoBancoFactory.getConexao().get()
							.prepareStatement(INSERT_TURMA, colunaID);

					preparedStatement.setString(1, turma.getDescricaoTurma());
					preparedStatement.setString(2, turma.getTurno());
					preparedStatement.setInt(3, Integer.valueOf(turma.getAno()));
					preparedStatement.setInt(4, 1); // Aqui o id da escola

					preparedStatement.executeUpdate();

					ResultSet rs = preparedStatement.getGeneratedKeys();

					if (rs.next()) {
						turma.setId(rs.getInt(1));
					}

					return turma.getId();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		} else {
			return resultadoPesquisa;
		}
		throw new RuntimeException("Erro ao tentar abrir banco");
	}

	public int pesquisaTurma(Turma turma) {
		try {
			PreparedStatement stmt = ConexaoBancoFactory.getConexao().get().prepareStatement(SQL_BUSCAR_TURMA);
			stmt.setString(1, "%" + turma.getDescricaoTurma() + "%");
			ResultSet rs = stmt.executeQuery();
			if (rs.next()) {
				return rs.getInt("id");
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return -1;
	}

	/*
	 * Primeiro pegamos as ids das Turmas na tabela disciplina_turma_professor
	 * Com essas ids vamos fazer uma consulta na tabela Turmas, que vai retornar as turmas do professor
	 * 
	 */
	
	public List<Turma> listaTurmasPorProfessor(Professor professor) {
		List<Integer> lista = new ArrayList<>();

		try {
			PreparedStatement stmt = ConexaoBancoFactory.getConexao().get()
					.prepareStatement(SQL_BUSCAR_TURMA_PROFESSOR);

			stmt.setInt(1, professor.getId());

			ResultSet rs = stmt.executeQuery();

			while (rs.next()) {
				if (!lista.contains(rs.getInt("id_turma"))) {
					lista.add(rs.getInt("id_turma"));					
				}
			}

			rs.close();
			stmt.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return this.pesquisaTurmaPorID(lista);
	}

	private List<Turma> pesquisaTurmaPorID(List<Integer> lista) {
		List<Turma> turmas = new ArrayList<Turma>();
		
		for (Integer idTurma : lista) {
			
			try {
				PreparedStatement stmt = ConexaoBancoFactory.getConexao().get()
						.prepareStatement(SQL_BUSCAR_TURMA_POR_ID);

				stmt.setInt(1, idTurma);
				
				ResultSet rs = stmt.executeQuery();
				
				while (rs.next()) {
					Turma turma = new Turma();
					turma.setId(rs.getInt("id"));
					turma.setDescricaoTurma(rs.getString("descricao_turma"));
					turma.setTurno(rs.getString("turno"));
					turma.setAno(rs.getString("ano"));
					
					turmas.add(turma);
				}
				
				rs.close();
				stmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}

		}
		
		return turmas;
	}

	public Optional<Turma> pesquisaPorID(Integer idTurma) {
			Optional<Turma> optional = Optional.empty();
			try {
				PreparedStatement stmt = ConexaoBancoFactory.getConexao().get()
						.prepareStatement(SQL_BUSCAR_TURMA_POR_ID);

				stmt.setInt(1, idTurma);
				
				ResultSet rs = stmt.executeQuery();
				
				if(rs.next()) {
					Turma turma = new Turma();
					turma.setId(rs.getInt("id"));
					turma.setDescricaoTurma(rs.getString("descricao_turma"));
					turma.setTurno(rs.getString("turno"));
					turma.setAno(rs.getString("ano"));					
					optional = Optional.ofNullable(turma);
				}
					
				rs.close();
				stmt.close();
				
				return optional;
				
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
			return optional;
		}
	
	
	public static void main(String[] args) {

		new ProfessorDao().loginProfessor("franklin", "53052560387").ifPresent(prof -> {
			new TurmaDao().listaTurmasPorProfessor(prof).forEach(System.out::println);
		});

	}
}
