package br.com.boletimonline.dao.jdbc;

import java.math.BigDecimal;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.boletimonline.factory.ConexaoBancoFactory;
import br.com.boletimonline.model.Disciplina;
import br.com.boletimonline.model.DisciplinaTurma;

public class DisciplinaTurmaDao {

	private static final String SQLDISCIPLINATURMA = "";
	private static final String SQLDISCIPLINA_DISCIPLINATURMA = "INSERT INTO disciplina_disciplinaturma (id_disciplinaturma, id_disciplina) VALUES (?,?)";

	public Integer adiciona(DisciplinaTurma disciplinaTurma) {

		if (ConexaoBancoFactory.getConexao().isPresent()) {
			try {
				PreparedStatement preparedStatement = ConexaoBancoFactory.getConexao().get().prepareStatement(SQL);

				preparedStatement.setString(1, disciplinaTurma.getProfessor().g);
				preparedStatement.setBigDecimal(2, new BigDecimal(799.88));

				return preparedStatement.executeUpdate();
			} catch (SQLException e) {
				e.printStackTrace();
			}

		}
		throw new RuntimeException("Erro");
	}
	
	public void adicionaDisciplina(Integer idDisciplinaTurma,Integer idDisciplina) {
		
		try {
			PreparedStatement preparedStatement = ConexaoBancoFactory.getConexao().get().prepareStatement(SQLDISCIPLINA_DISCIPLINATURMA);
			preparedStatement.setInt(1, idDisciplinaTurma);
			preparedStatement.setInt(1, idDisciplina);
			
			preparedStatement.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
