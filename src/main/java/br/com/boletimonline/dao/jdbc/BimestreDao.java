package br.com.boletimonline.dao.jdbc;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.boletimonline.factory.ConexaoBancoFactory;
import br.com.boletimonline.model.Bimestre;
import br.com.boletimonline.model.Disciplina;
import br.com.boletimonline.model.Turma;
import br.com.boletimonline.model.relatorio.BimestreRelatorio;
import br.com.boletimonline.model.usuario.Aluno;

public class BimestreDao {

	private static final String SQL_BUSCAR_POR_TURMA_NUMERO = "select * from bimestre where id_turma = ? && numero_bimestre = ?";
	private static final String SQL_BUSCAR_POR_TURMA_NUMERO_ALUNO = "select * from bimestre where id_turma = ? && numero_bimestre = ? && id_aluno = ?";

	private static final String SQL_UPDATE_POR_TURMA_NUMERO = "update bimestre SET nota_prova = ?,faltas = ?, nota_atividade = ? WHERE id_turma = ? and numero_bimestre = ? and id_aluno = ?";
	private static final String INSERT_BIMESTRE = "INSERT INTO bimestre (nota_prova, id_aluno, id_turma, id_disciplina , id_professor, faltas, id_escola,numero_bimestre,nota_atividade) VALUES (?,?,?,?,?,?,?,?,?)";
	private static final String SQL_BUSCAR_POR_TURMA_DISCIPLINA = "select * from bimestre where id_turma = ? && id_disciplina = ?";

	public List<Bimestre> verificaBimestrePorTurmaENumero(Turma turma, Integer numeroBimestre) {
		List<Bimestre> lista = new ArrayList<>();
		try {
			PreparedStatement stmt = ConexaoBancoFactory.getConexao().get()
					.prepareStatement(SQL_BUSCAR_POR_TURMA_NUMERO);
			stmt.setInt(1, turma.getId());
			stmt.setInt(2, numeroBimestre);

			ResultSet rs = stmt.executeQuery();

			while (rs.next()) {

				Bimestre bimestre = new Bimestre();
				bimestre.setId(rs.getInt("id"));
				bimestre.setNumeroBimestre(rs.getInt("numero_bimestre"));
				bimestre.setNotaAtividade(rs.getDouble("nota_atividade"));
				bimestre.setNotaProva(rs.getDouble("nota_prova"));
				bimestre.setQuantFaltas(rs.getInt("faltas"));
				bimestre.setTurma(turma);

				new DisciplinaDao().pesquisaPorID(rs.getInt("id_disciplina"))
						.ifPresent(disciplina -> bimestre.setDisciplina(disciplina));
				new ProfessorDao().pesquisaPorID(rs.getInt("id_professor"))
						.ifPresent(professor -> bimestre.setProfessor(professor));
				new AlunoDao().pesquisaAlunosPorID(rs.getInt("id_aluno")).ifPresent(aluno -> bimestre.setAluno(aluno));
				new EscolaDao().procuraEscolaPorID(rs.getInt("id_escola"))
						.ifPresent(escola -> bimestre.setEscola(escola));

				lista.add(bimestre);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return lista;

	}

	public void adiciona(List<Bimestre> lista) {

		for (Bimestre bimestre : lista) {
			if (isAdicionado(bimestre.getAluno(), bimestre.getTurma(), bimestre.getNumeroBimestre())) {
				alteraBimestre(bimestre);
			} else
				adiciona(bimestre);
		}
	}
	
	private void adiciona(Bimestre bimestre) {
		try {
			PreparedStatement preparedStatement = ConexaoBancoFactory.getConexao().get()
					.prepareStatement(INSERT_BIMESTRE);

			preparedStatement.setDouble(1, bimestre.getNotaProva());
			preparedStatement.setInt(2, bimestre.getAluno().getId());
			preparedStatement.setInt(3, bimestre.getTurma().getId());
			preparedStatement.setInt(4, bimestre.getDisciplina().getId());
			preparedStatement.setInt(5, bimestre.getProfessor().getId());
			preparedStatement.setInt(6, bimestre.getQuantFaltas());
			preparedStatement.setInt(7, bimestre.getEscola().getId());
			preparedStatement.setInt(8, bimestre.getNumeroBimestre());
			preparedStatement.setDouble(9, bimestre.getNotaAtividade());

			preparedStatement.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	private void alteraBimestre(Bimestre bimestre) {

		try {
			PreparedStatement stmt = ConexaoBancoFactory.getConexao().get()
					.prepareStatement(SQL_UPDATE_POR_TURMA_NUMERO);

			stmt.setDouble(1, bimestre.getNotaProva());
			stmt.setInt(2, bimestre.getQuantFaltas());
			stmt.setDouble(3, bimestre.getNotaAtividade());
			stmt.setInt(4, bimestre.getTurma().getId());
			stmt.setInt(5, bimestre.getNumeroBimestre());
			stmt.setInt(6, bimestre.getAluno().getId());

			stmt.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	private boolean isAdicionado(Aluno aluno, Turma turma, Integer numeroBimestre) {

		try {
			PreparedStatement stmt = ConexaoBancoFactory.getConexao().get()
					.prepareStatement(SQL_BUSCAR_POR_TURMA_NUMERO_ALUNO);

			stmt.setInt(1, turma.getId());
			stmt.setInt(2, numeroBimestre);
			stmt.setInt(3, aluno.getId());
			

			ResultSet rs = stmt.executeQuery();

			return rs.next();

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return false;
	}

	
	public List<BimestreRelatorio> verificaBimestrePorTurmaEDisciplina(Turma turma, Disciplina disciplina) {
		
		List<Bimestre> lista = new ArrayList<>();
		
		try {
			PreparedStatement stmt = ConexaoBancoFactory.getConexao().get()
						.prepareStatement(SQL_BUSCAR_POR_TURMA_DISCIPLINA);
			stmt.setInt(1, turma.getId());
			stmt.setInt(2, disciplina.getId());

			ResultSet rs = stmt.executeQuery();
			
			while (rs.next()) {

				Bimestre bimestre = new Bimestre();
				bimestre.setId(rs.getInt("id"));
				bimestre.setNumeroBimestre(rs.getInt("numero_bimestre"));
				bimestre.setNotaAtividade(rs.getDouble("nota_atividade"));
				bimestre.setNotaProva(rs.getDouble("nota_prova"));
				bimestre.setQuantFaltas(rs.getInt("faltas"));
				bimestre.setTurma(turma);
				bimestre.setDisciplina(disciplina);
				
				new ProfessorDao().pesquisaPorID(rs.getInt("id_professor"))
						.ifPresent(professor -> bimestre.setProfessor(professor));
				new AlunoDao().pesquisaAlunosPorID(rs.getInt("id_aluno")).ifPresent(aluno -> bimestre.setAluno(aluno));
				new EscolaDao().procuraEscolaPorID(rs.getInt("id_escola"))
						.ifPresent(escola -> bimestre.setEscola(escola));

				lista.add(bimestre);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return intersecaoDeLista(lista);
		
		
	}

	public static void main(String[] args) {
		Turma turma = new TurmaDao().pesquisaPorID(10).get();
		Disciplina disciplina = new DisciplinaDao().pesquisaPorID(1).get();
		
		List<BimestreRelatorio> list = new BimestreDao().verificaBimestrePorTurmaEDisciplina(turma, disciplina);
//		
//		Map<String, Object> param = new HashMap<String, Object>();
//		param.put("disciplina", disciplina.getNomeMateria());
//		
//		try {
//			InputStream caminho = GeraRelatorioNotaPorDisciplina.class.getResourceAsStream("/relatorios/bimestre_disciplina.jasper");
//			JasperReport report = (JasperReport) JRLoader.loadObject(caminho);
//			JasperPrint print = JasperFillManager.fillReport(report, param, new JRBeanCollectionDataSource(list));
//            JasperViewer.viewReport(print, false);
//		} catch (Exception e) {
//			e.printStackTrace();

		list.forEach(System.out::println);
	}



	private List<BimestreRelatorio> intersecaoDeLista(List<Bimestre> lista1) {
		List<BimestreRelatorio> listaRelatorio = new ArrayList<>();
		
		List<Bimestre> lista2 = new ArrayList<>();
		lista2.addAll(lista1);
		
		for (Bimestre bimestre : lista1) {
			for (Bimestre bimestre2 : lista2) {
				if(bimestre.getAluno().equals(bimestre2.getAluno())) {
					for (BimestreRelatorio bimestreRelatorio : listaRelatorio) {
						
						if((listaRelatorio.isEmpty()) || (bimestreRelatorio.getAluno().equals(bimestre2.getAluno()))) {
							BimestreRelatorio bR = new BimestreRelatorio();
							bR.adicionaInformacoes(bimestre2);
							bR.adicionaBimestre(bimestre2);															
							listaRelatorio.add(bR);	
						}else {
							bimestreRelatorio.adicionaBimestre(bimestre2);																												
						}
					}
				}
			}
		}
		
		return listaRelatorio;
	}
	
}
