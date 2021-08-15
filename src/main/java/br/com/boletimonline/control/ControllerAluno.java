package br.com.boletimonline.control;

import javax.persistence.EntityManager;

import br.com.boletimonline.factory.EntidadeFactory;
import br.com.boletimonline.model.Aluno;
import br.com.boletimonline.model.Turma;

public class ControllerAluno {
	
	private static final String SQL_INSERT_ALUNO = "INSERT INTO aluno"
			+ "(nomeAluno,dataNasc,numero)" + "VALUES"
			+ "(:nomeAluno,:dataNasc,:numero)";
	
	private static final String SQL_INSERT_TURMA = "INSERT INTO turma"
			+ "(descricaoTurma,turno)" + "VALUES"
			+ "(:descricaoTurma,:turno)";
	
	public void adicionaAluno(Aluno aluno) {

	EntityManager entityManager = EntidadeFactory.loadTableAluno();
//	https://www.guj.com.br/t/hibernate-jsf-erro-ao-persistir-objeto/337939
	if (!entityManager.getTransaction().isActive())
		entityManager.getTransaction().begin();

	entityManager.createNativeQuery(SQL_INSERT_ALUNO).setParameter("nomeAluno",aluno.getNomeAluno())
			.setParameter("descricaoMacroscopica", aluno.getDataNasc())
			.setParameter("dataNascimento", aluno.getNumero()).executeUpdate();
	
		entityManager.getTransaction().commit();
	}

	
	public void adicionaTurma(Turma turma) {
		EntityManager entityManager = EntidadeFactory.loadTableAluno();
		
		if (!entityManager.getTransaction().isActive())
			entityManager.getTransaction().begin();

		entityManager.createNativeQuery(SQL_INSERT_TURMA).setParameter("descricaoTurma",turma.getDescricaoTurma())
				.setParameter("turno", turma.getTurno()).executeUpdate();
		
			entityManager.getTransaction().commit();
		}
	}
		
//		exame.getImagens().forEach(imagem -> {
//
//			EntityManager em1 = EntidadeFactory.loadTableImagem();
//			if (!em1.getTransaction().isActive())
//				em1.getTransaction().begin();
//
//			em1.createNativeQuery(SQL_INSERT_IMAGEM)
//					.setParameter("localImagem", imagem.getLocalImagem()).executeUpdate();
//
//			Integer last = (Integer) em1.createNativeQuery(SQL_SELECT_IMAGEM).getSingleResult();
//			imagem.setId((long) last);
//			
//			em1.getTransaction().commit();
//		
//			EntityManager em2 = EntidadeFactory.loadTableExameColposcopicoImagem();
//			if (!em2.getTransaction().isActive())
//				em2.getTransaction().begin();
//			
//					
//			
//			em2.createNativeQuery(SQL_INSERT_COLPO_IMAGEM)
//				.setParameter("ExameColposcopico_id", exame.getId())
//				.setParameter("imagens_id", imagem.getId())
//				.executeUpdate();
//			
//			em2.getTransaction().commit();
//		});

