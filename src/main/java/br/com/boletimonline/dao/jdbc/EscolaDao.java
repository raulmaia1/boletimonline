package br.com.boletimonline.dao.jdbc;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Optional;

import br.com.boletimonline.factory.ConexaoBancoFactory;
import br.com.boletimonline.model.Escola;

public class EscolaDao {

	private static final String SQL_BUSCAR_POR_ID = "SELECT * from escola where id = ?";

	public Optional<Escola> procuraEscolaPorID(Integer idEscola) {
		try {
			PreparedStatement stmt = ConexaoBancoFactory.getConexao().get().prepareStatement(SQL_BUSCAR_POR_ID);
			stmt.setInt(1, idEscola);

			ResultSet rs = stmt.executeQuery();
			if (rs.next()) {
				Escola escola = new Escola();
				escola.setId(rs.getInt("id"));
				escola.setNomeEscola("nome_escola");
				escola.setInep("inep");
				new EnderecoDao().pesquisaEnderecoPorID(rs.getInt("id_endereco")).ifPresent(endereco ->{
					escola.setEndereco(endereco);					
				});
				
				return Optional.ofNullable(escola);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	
		return Optional.empty();
	}
	
	
}
