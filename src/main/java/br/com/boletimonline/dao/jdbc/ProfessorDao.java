package br.com.boletimonline.dao.jdbc;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Optional;

import br.com.boletimonline.factory.ConexaoBancoFactory;
import br.com.boletimonline.model.usuario.Professor;

public class ProfessorDao {

	private static final String INSERT_PROFESSOR = "INSERT INTO professor (nome_professor, acesso,login) VALUES (?,?,?)";
	private static final String SQL_BUSCAR_PROFESSOR = "SELECT * FROM professor WHERE login LIKE ? and acesso LIKE ?";

	public Integer adiciona(Professor professor) {

		if (ConexaoBancoFactory.getConexao().isPresent()) {
			try {
//				https://www.ti-enxame.com/pt/java/como-obter-o-id-de-insercao-no-jdbc/968596366/
				String[] colunaID = { "id" };

				PreparedStatement preparedStatement = ConexaoBancoFactory.getConexao().get()
						.prepareStatement(INSERT_PROFESSOR, colunaID);

				preparedStatement.setString(1, professor.getNome());
				preparedStatement.setString(2, professor.getAcesso());
				preparedStatement.setString(3, professor.getLogin());

				preparedStatement.executeUpdate();

				ResultSet rs = preparedStatement.getGeneratedKeys();

				if (rs.next()) {
					professor.setId(rs.getInt(1));
				}

				return professor.getId();

			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		throw new RuntimeException("Erro ao tentar adicionar");
	}

	public Optional<Professor> loginProfessor(String login, String acesso) {
		Optional<Professor> optional = Optional.empty();

		try {
			PreparedStatement stmt = ConexaoBancoFactory.getConexao().get().prepareStatement(SQL_BUSCAR_PROFESSOR);
			stmt.setString(1, "%" + login + "%");
			stmt.setString(2, "%" + acesso + "%");
			
			ResultSet rs = stmt.executeQuery();
			
			while (rs.next()) {
				Professor professor = new Professor();
				professor.setId(rs.getInt("id"));
				professor.setNome(rs.getString("nome_professor"));
				professor.setLogin(rs.getString("login"));
				professor.setAcesso(rs.getString("acesso"));

				optional = Optional.ofNullable(professor);
			}

			rs.close();
			stmt.close();
		
		} catch (SQLException e) {
			e.printStackTrace();
		}



		return optional;

	}
	
	public Optional<Professor> pesquisaPorID(Integer id) {

		return null;
	}
	
}
