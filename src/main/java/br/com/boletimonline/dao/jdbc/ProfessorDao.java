package br.com.boletimonline.dao.jdbc;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.boletimonline.factory.ConexaoBancoFactory;
import br.com.boletimonline.model.usuario.Professor;

public class ProfessorDao {

	private static final String INSERT_PROFESSOR = "INSERT INTO professor (nome_professor, acesso,login) VALUES (?,?,?)";

	public Integer adiciona(Professor professor) {
		
		if (ConexaoBancoFactory.getConexao().isPresent()) {
			try {
				
				PreparedStatement preparedStatement = ConexaoBancoFactory.getConexao().get().prepareStatement(INSERT_PROFESSOR);
				
				preparedStatement.setString(1, professor.getNome());
				preparedStatement.setString(2, professor.getAcesso());
				preparedStatement.setString(3, professor.getLogin());
				
				int id = preparedStatement.executeUpdate();
				
				professor.setId(id);
				
				return id;
			} catch (SQLException e) {
				e.printStackTrace();
			}	
		}
		throw new RuntimeException("Erro ao tentar adicionar");		
	}
	
}
