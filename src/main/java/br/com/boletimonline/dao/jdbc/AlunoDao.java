package br.com.boletimonline.dao.jdbc;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import br.com.boletimonline.factory.ConexaoBancoFactory;
import br.com.boletimonline.listasimulada.ListaSimuladaTurmas;
import br.com.boletimonline.model.Turma;
import br.com.boletimonline.model.usuario.Aluno;

public class AlunoDao {

	private static final String SQL_ALUNO = "INSERT INTO aluno (nome_aluno, numero, id_escola,id_turma) VALUES (?,?,?,?)";
	private static final String SQL_BUSCAR_POR_TURMA = "SELECT * from aluno where id_turma = ?";
	private static final String SQL_BUSCAR_POR_ID = "SELECT * from aluno where id = ?";

	
	public void adicionaAlunos(List<Aluno> alunos) {
		
		
		ConexaoBancoFactory.getConexao().ifPresent((conn) -> {
			
			alunos.forEach((aluno) ->{
				try {
					PreparedStatement preparedStatement = conn.prepareStatement(SQL_ALUNO);
					preparedStatement.setString(1, aluno.getNome());
					preparedStatement.setInt(2, aluno.getNumero());
					preparedStatement.setInt(3, 1);
					preparedStatement.setInt(4, 13);
					
					preparedStatement.executeUpdate();
			
				} catch (SQLException e) {
					e.printStackTrace();
				}
			
			});
			

		});
	}

	public List<Aluno> pesquisaAlunosPorTurma(Turma turma) {
		
		List<Aluno> alunos = new ArrayList<>();
		
		try {
			PreparedStatement stmt = ConexaoBancoFactory.getConexao().get().prepareStatement(SQL_BUSCAR_POR_TURMA);
			stmt.setInt(1, turma.getId());

			ResultSet rs = stmt.executeQuery();

			while (rs.next()) {
				Aluno aluno =  new Aluno();
				aluno.setId(rs.getInt("id"));
				aluno.setDataNasc(rs.getString("data_nasc"));
				new EscolaDao().procuraEscolaPorID(rs.getInt("id_escola")).ifPresent(escola -> aluno.setEscola(escola));
				aluno.setNome(rs.getString("nome_aluno"));
				aluno.setTurma(turma);
				aluno.setNumero(rs.getInt("numero"));
				
				alunos.add(aluno);
				
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return alunos;
	}
	

	public Optional<Aluno> pesquisaAlunosPorID(Integer id) {
		try {
			PreparedStatement stmt = ConexaoBancoFactory.getConexao().get().prepareStatement(SQL_BUSCAR_POR_ID);
			stmt.setInt(1, id);

			ResultSet rs = stmt.executeQuery();
			
			if (rs.next()) {
				Aluno aluno =  new Aluno();
				aluno.setId(rs.getInt("id"));
				aluno.setNome(rs.getString("nome_aluno"));
				aluno.setDataNasc(rs.getString("data_nasc"));
				
				new EscolaDao().procuraEscolaPorID(rs.getInt("id_escola")).ifPresent(escola -> aluno.setEscola(escola));
				new TurmaDao().pesquisaPorID(rs.getInt("id_turma")).ifPresent(turma -> aluno.setTurma(turma));
				
				aluno.setNumero(rs.getInt("numero"));
				
				return Optional.ofNullable(aluno);
				
			}
		
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return Optional.empty();
	}
	
	public static void main(String[] args) {
		new AlunoDao().pesquisaAlunosPorTurma(ListaSimuladaTurmas.getTurmaSetimoAnoA()).forEach(System.out::println);
	}
}
