package br.com.boletimonline.dao.jdbc;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.boletimonline.factory.ConexaoBancoFactory;
import br.com.boletimonline.model.Turma;

public class TurmaDao {
	
	private static final String INSERT_TURMA = "INSERT INTO turma (descricao_turma, turno,ano) VALUES (?,?,?)";
	
	public Integer adicionaTurma(Turma turma) {
		
		if (ConexaoBancoFactory.getConexao().isPresent()) {
			try {
				PreparedStatement preparedStatement = ConexaoBancoFactory.getConexao().get().prepareStatement(INSERT_TURMA);

				preparedStatement.setString(1, turma.getDescricaoTurma());
				preparedStatement.setString(2, turma.getTurno());
				preparedStatement.setInt(3, Integer.valueOf(turma.getAno()));
				preparedStatement.setInt(4, 1);
				
				Integer id = preparedStatement.executeUpdate();
				
				turma.setId(id);
				
				return id;
			} catch (SQLException e) {
				e.printStackTrace();
			}		
	}
	throw new RuntimeException("Erro ao tentar abrir banco");	
	}
}
