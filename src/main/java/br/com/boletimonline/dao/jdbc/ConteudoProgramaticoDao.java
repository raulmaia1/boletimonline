package br.com.boletimonline.dao.jdbc;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.boletimonline.factory.ConexaoBancoFactory;
import br.com.boletimonline.model.ConteudoProgramatico;
import br.com.boletimonline.model.usuario.Professor;

public class ConteudoProgramaticoDao {

	private static final String SQL_ADD_CONTEUDO = "INSERT INTO conteudo_programatico (data, id_disciplina, id_turma ,id_professor,conteudo,quant_aulas) VALUES (?,?,?,?,?,?)";
	private static final String SQL_BUSCAR_POR_PROFESSOR = null;

	public void adiciona(ConteudoProgramatico conteudo) {

		ConexaoBancoFactory.getConexao().ifPresent((conn) -> {

			PreparedStatement preparedStatement;
			try {
				preparedStatement = conn.prepareStatement(SQL_ADD_CONTEUDO);

				preparedStatement.setString(1, conteudo.getData());
				preparedStatement.setInt(2, conteudo.getDisciplina().getId());
				preparedStatement.setInt(3, conteudo.getTurma().getId());
				preparedStatement.setInt(4, conteudo.getProfessor().getId());
				preparedStatement.setString(5, conteudo.getConteudo());
				preparedStatement.setInt(6, Integer.valueOf(conteudo.getQuantAulas()));

				preparedStatement.executeUpdate();
				preparedStatement.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		});

	}

	public List<ConteudoProgramatico> pesquisaPorProfessor(Professor professor) {
		List<ConteudoProgramatico> lista = new ArrayList<>();
		try {
			PreparedStatement stmt = ConexaoBancoFactory.getConexao().get().prepareStatement(SQL_BUSCAR_POR_PROFESSOR);

			stmt.setInt(1, professor.getId());

			ResultSet rs = stmt.executeQuery();

			while (rs.next()) {
				ConteudoProgramatico conteudoProgramatico = new ConteudoProgramatico();
				conteudoProgramatico.setData(rs.getString("data"));
				conteudoProgramatico.setConteudo(rs.getString("conteudo"));
				
				conteudoProgramatico.setDisciplina(new DisciplinaDao().pesquisaPorID(rs.getInt("id_disciplina")).get());
				conteudoProgramatico.setProfessor(new ProfessorDao().pesquisaPorID(rs.getInt("id_professor")).get());	
				conteudoProgramatico.setTurma(new TurmaDao().pesquisaPorID(rs.getInt("id_turma")).get());
				
				
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return lista;
	}

}
