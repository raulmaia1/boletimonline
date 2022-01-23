package br.com.boletimonline.dao.jdbc;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Optional;

import br.com.boletimonline.factory.ConexaoBancoFactory;
import br.com.boletimonline.model.Endereco;

public class EnderecoDao {

	private static final String SQL_BUSCAR_POR_ID = "select * from endereco where id = ?";

	public Optional<Endereco> pesquisaEnderecoPorID(Integer idEndereco) {
		
		try {
			PreparedStatement stmt = ConexaoBancoFactory.getConexao().get().prepareStatement(SQL_BUSCAR_POR_ID);
			stmt.setInt(1, idEndereco);
			
			ResultSet rs = stmt.executeQuery();
			
			if (rs.next()) {
				Endereco endereco = new Endereco();
				endereco.setId(rs.getInt("id"));
				endereco.setBairro(rs.getString("bairro"));
				endereco.setCidade(rs.getString("cidade"));
				endereco.setLogradouro(rs.getString("logradouro"));
				endereco.setNumero(rs.getString("numero"));
				
				return Optional.ofNullable(endereco);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return Optional.empty();
		
	}

}
