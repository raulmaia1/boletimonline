package boletimonline;

import javax.persistence.EntityManager;

import br.com.boletimonline.factory.EntidadeFactory;
import br.com.boletimonline.listasimulada.ListaSimuladaTurmas;

public class TestDao {
	 public static void main(String[] args) {
		
		 EntityManager entityManager = EntidadeFactory.loadTableAluno();
		 
		 entityManager.getTransaction().begin();
		 entityManager.persist(ListaSimuladaTurmas.getProfessoraFernanda());
		 entityManager.getTransaction().commit();
		 
	        
	}
}
