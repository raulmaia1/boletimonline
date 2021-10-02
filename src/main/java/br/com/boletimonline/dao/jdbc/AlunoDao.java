package br.com.boletimonline.dao.jdbc;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import br.com.boletimonline.factory.ConexaoBancoFactory;
import br.com.boletimonline.model.Aluno;

public class AlunoDao {

	private static final String SQL_ALUNO = "INSERT INTO aluno (nome_aluno, numero, id_escola,id_turma) VALUES (?,?,?,?)";

	public void adicionaAlunos(List<Aluno> alunos) {
		
		
		ConexaoBancoFactory.getConexao().ifPresent((conn) -> {
			
			alunos.forEach((aluno) ->{
				try {
					PreparedStatement preparedStatement = conn.prepareStatement(SQL_ALUNO);
					preparedStatement.setString(1, aluno.getNomeAluno());
					preparedStatement.setInt(2, aluno.getNumero());
					preparedStatement.setInt(3, 1);
					preparedStatement.setInt(4, 8);
					
					preparedStatement.executeUpdate();
			
				} catch (SQLException e) {
					e.printStackTrace();
				}
			
			});
			

		});
	}
	
}
