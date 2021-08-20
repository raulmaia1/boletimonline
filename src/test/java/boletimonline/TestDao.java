package boletimonline;

import javax.persistence.EntityManager;

import br.com.boletimonline.factory.EntidadeFactory;
import br.com.boletimonline.listasimulada.ListaSimuladaTurmas;

public class TestDao {
	
	 public static void main(String[] args) {
		
		 EntityManager entityManager = EntidadeFactory.loadTableAluno();
		 
		 entityManager.getTransaction().begin();
		 entityManager.persist(ListaSimuladaTurmas.getProfessoraFernanda());
		 entityManager.persist(ListaSimuladaTurmas.getProfessoraLidianeAlmeidadaSilva());
		 entityManager.persist(ListaSimuladaTurmas.getProfessoraFranciscaDaSilva());
		 entityManager.persist(ListaSimuladaTurmas.getProfessoraAnaCarolinaSouzaDeMorais());
		 entityManager.persist(ListaSimuladaTurmas.getProfessoraAnaPaulaBarbosaDeJesus());
		 entityManager.persist(ListaSimuladaTurmas.getProfessorFranklinDouglasDeSousaSilva());
		 entityManager.persist(ListaSimuladaTurmas.getProfessoraRegileideAlvesDaSilva());
		 entityManager.persist(ListaSimuladaTurmas.getProfessoraSuelySantosMoreiradeOliveira());
		 entityManager.persist(ListaSimuladaTurmas.getProfessoraSuelySantosMoreiradeOliveira());
		 entityManager.persist(ListaSimuladaTurmas.getProfessorJoseWerbeteDaConceicaoPereira());
		 entityManager.persist(ListaSimuladaTurmas.getProfessorWelyson());
		 entityManager.persist(ListaSimuladaTurmas.getProfessoraSayonaraBarbosaCarvalhoDosSantos());
		 entityManager.persist(ListaSimuladaTurmas.getProfessoraJoseaneNevesFreire());
		 entityManager.persist(ListaSimuladaTurmas.getProfessoraMariaDeFatimaBarbosaSantana());
		 entityManager.persist(ListaSimuladaTurmas.getProfessoraIvaniaAlmeidaDaSilva());

		 entityManager.getTransaction().commit();
		 
	        
	}
}
