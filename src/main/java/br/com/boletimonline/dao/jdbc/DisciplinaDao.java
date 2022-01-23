package br.com.boletimonline.dao.jdbc;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Optional;

import br.com.boletimonline.factory.ConexaoBancoFactory;
import br.com.boletimonline.model.Disciplina;

public class DisciplinaDao implements Pesquisa<Disciplina>{
	
	private static final String SQL_BUSCAR_DISCIPLINA_POR_ID = "SELECT * FROM disciplina WHERE id = ?";

	@Override
	public Optional<Disciplina> pesquisaPorID(Integer id) {
		Optional<Disciplina> optional = Optional.empty();
		try {
			PreparedStatement stmt = ConexaoBancoFactory.getConexao().get()
					.prepareStatement(SQL_BUSCAR_DISCIPLINA_POR_ID);

			stmt.setInt(1, id);
			
			ResultSet rs = stmt.executeQuery();
			
			if(rs.next()) {
				Disciplina disciplina = new Disciplina();
				disciplina.setId(rs.getInt("id"));
				disciplina.setNomeMateria(rs.getString("nome_materia"));
				optional = Optional.ofNullable(disciplina);
			}
				
			rs.close();
			stmt.close();
						
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return optional;
	}
}
