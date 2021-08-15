package br.com.boletimonline.factory;

import java.util.Optional;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EntidadeFactory {

	private static Optional<EntityManager> entityManager = Optional.empty();
	
	public static EntityManager loadTableAluno() {
		
		if (!entityManager.isPresent()) {
			EntityManagerFactory emf = Persistence.createEntityManagerFactory("diario_online");			
			entityManager = Optional.ofNullable(emf.createEntityManager());
		}
		
		return entityManager.get();

	}
//	
//	public static EntityManager loadTableTurma() {
//		if (!entityManager.isPresent()) {
//			EntityManagerFactory emf = Persistence.createEntityManagerFactory("turma");			
//			entityManager = Optional.ofNullable(emf.createEntityManager());
//		}
//		
//		return entityManager.get();
//		
//	}
//	
//	public static EntityManager loadTableExameColposcopicoImagem() {
//		if (!entityManager.isPresent()) {
//			EntityManagerFactory emf = Persistence.createEntityManagerFactory("exame_colposcopico_imagem");			
//			entityManager = Optional.ofNullable(emf.createEntityManager());
//		}
//		
//		return entityManager.get();
//		
//	}
	

}
