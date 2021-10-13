package br.com.boletimonline.dao.jdbc;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

import br.com.boletimonline.factory.ConexaoBancoFactory;
import br.com.boletimonline.model.ConteudoProgramatico;
import br.com.boletimonline.model.Turma;
import br.com.boletimonline.model.usuario.Professor;

public class ConteudoProgramaticoDao {

	private static final String SQL_ADD_CONTEUDO = "INSERT INTO conteudo_programatico (data, id_disciplina, id_turma ,id_professor,conteudo,quant_aulas) VALUES (?,?,?,?,?,?)";
	private static final String SQL_BUSCAR_POR_PROFESSOR = "SELECT * from conteudo_programatico where id_professor = ?";
	private static final String SQL_BUSCAR_POR_DATA = "SELECT * from conteudo_programatico where data = ? && id_turma = ?";

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
				conteudoProgramatico.setId(rs.getInt("id"));
				conteudoProgramatico.setData(rs.getString("data"));
				conteudoProgramatico.setConteudo(rs.getString("conteudo"));
				conteudoProgramatico.setQuantAulas(Integer.toString(rs.getInt("quant_aulas")));
				new DisciplinaDao().pesquisaPorID(rs.getInt("id_disciplina"))
						.ifPresent(d -> conteudoProgramatico.setDisciplina(d));

				new ProfessorDao().pesquisaPorID(rs.getInt("id_professor"))
						.ifPresent(p -> conteudoProgramatico.setProfessor(p));

				new TurmaDao().pesquisaPorID(rs.getInt("id_turma")).ifPresent(t -> conteudoProgramatico.setTurma(t));

				lista.add(conteudoProgramatico);

			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return lista;
	}

	
	public List<ConteudoProgramatico> pesquisaPorIntervaloData(String dataIncial, String dataFinal,Turma turmaSelecionada) {
		List<ConteudoProgramatico> lista = new ArrayList<>();

		String[] splitInicial = dataIncial.split("/");
		String[] splitFinal = dataFinal.split("/");

		LocalDate startDate = LocalDate.of(Integer.valueOf(splitInicial[2]), Integer.valueOf(splitInicial[1]),
				Integer.valueOf(splitInicial[0]));
		LocalDate endDate = LocalDate.of(Integer.valueOf(splitFinal[2]), Integer.valueOf(splitFinal[1]),
				Integer.valueOf(splitFinal[0]));

		Stream<LocalDate> distinct = startDate.datesUntil(endDate).distinct();

		distinct.forEach(data -> {
			String value = diaZeroEsquerda(String.valueOf(data.getDayOfMonth()))+ "/" + String.valueOf(data.getMonthValue())
				+ "/" + String.valueOf(data.getYear());
			
			pesquisaData(value,turmaSelecionada).ifPresent(conteudos -> lista.addAll(conteudos));

		});
		
		pesquisaData(dataFinal,turmaSelecionada).ifPresent(conteudos -> lista.addAll(conteudos));

		return lista;
	}

	private Optional<List<ConteudoProgramatico>> pesquisaData(String valor,Turma turmaSelecionada){
		List<ConteudoProgramatico> lista = new ArrayList<>();

		try {
			PreparedStatement stmt = ConexaoBancoFactory.getConexao().get()
					.prepareStatement(SQL_BUSCAR_POR_DATA);

			stmt.setString(1, valor);
			stmt.setInt(2, turmaSelecionada.getId());
			ResultSet rs = stmt.executeQuery();

			while (rs.next()) {
				ConteudoProgramatico conteudoProgramatico = new ConteudoProgramatico();
				conteudoProgramatico.setId(rs.getInt("id"));
				conteudoProgramatico.setData(rs.getString("data"));
				conteudoProgramatico.setConteudo(rs.getString("conteudo"));
				conteudoProgramatico.setQuantAulas(Integer.toString(rs.getInt("quant_aulas")));
				new DisciplinaDao().pesquisaPorID(rs.getInt("id_disciplina"))
						.ifPresent(d -> conteudoProgramatico.setDisciplina(d));

				new ProfessorDao().pesquisaPorID(rs.getInt("id_professor"))
						.ifPresent(p -> conteudoProgramatico.setProfessor(p));

				new TurmaDao().pesquisaPorID(rs.getInt("id_turma"))
						.ifPresent(t -> conteudoProgramatico.setTurma(t));
				
				lista.add(conteudoProgramatico);
			}
			
			} catch (SQLException e) {
				e.printStackTrace();
			}
		
		return Optional.ofNullable(lista);
	}
	
	private String diaZeroEsquerda(String valueOf) {
		return valueOf.length() == 1?"0"+ valueOf:valueOf;
	}
	
//
//	public static void main(String[] args) {
////		new ConteudoProgramaticoDao().pesquisaPorIntervaloData("03/10/2021", "05/10/2021").forEach(System.out::println);
//		
//	}
}
