package br.com.boletimonline.factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Optional;

public class ConexaoBancoFactory {
	
	static Optional<Connection> conn = Optional.empty();
	
	public static Optional<Connection> getConexao() {
		try {
			conn = Optional.ofNullable(DriverManager.getConnection("jdbc:mysql://localhost/diario_online?" +
			                               "user=admin&password=adminX123$*"));
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return conn;
	}
	
	public static void main(String[] args) {
		ConexaoBancoFactory.getConexao().ifPresent((con) ->{
			try {
				System.out.println(con.isClosed());
			} catch (SQLException e) {
				e.printStackTrace();
			}
		});
		
	}
}
