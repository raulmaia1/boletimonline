package boletimonline;

import br.com.boletimonline.dao.jdbc.AlunoDao;
import br.com.boletimonline.dao.jdbc.DisciplinaTurmaProfessorDao;
import br.com.boletimonline.dao.jdbc.ProfessorDao;
import br.com.boletimonline.listasimulada.ListaSimuladaTurmas;
import br.com.boletimonline.model.usuario.Professor;

public class TestDao {
	
	 public static void main(String[] args) {
				 
//		 Professor professora = ListaSimuladaTurmas.getProfessoraIvaniaAlmeidaDaSilva();
//		 
//		 new ProfessorDao().adiciona(professora);
//		 
//		 new DisciplinaTurmaProfessorDao().adiciona(professora);
//		  cadastrar os alunos
	
		 new AlunoDao().adicionaAlunos(ListaSimuladaTurmas.getAlunosSetimoAnoA());
		 
		 
//		 System.out.println(new TurmaDao().pesquisaTurma(ListaSimuladaTurmas.getTurmaNonoAnoA()));
		 
//		 entityManager.persist(ListaSimuladaTurmas.getProfessoraLidianeAlmeidadaSilva());
//		 entityManager.persist(ListaSimuladaTurmas.getProfessoraFranciscaDaSilva());
//		 entityManager.persist(ListaSimuladaTurmas.getProfessoraAnaCarolinaSouzaDeMorais());
//		 entityManager.persist(ListaSimuladaTurmas.getProfessoraAnaPaulaBarbosaDeJesus());
//		 entityManager.persist(ListaSimuladaTurmas.getProfessorFranklinDouglasDeSousaSilva());
//		 entityManager.persist(ListaSimuladaTurmas.getProfessoraRegileideAlvesDaSilva());
//		 entityManager.persist(ListaSimuladaTurmas.getProfessoraSuelySantosMoreiradeOliveira());
//		 entityManager.persist(ListaSimuladaTurmas.getProfessoraSuelySantosMoreiradeOliveira());
//		 entityManager.persist(ListaSimuladaTurmas.getProfessorJoseWerbeteDaConceicaoPereira());
//		 entityManager.persist(ListaSimuladaTurmas.getProfessorWelyson());
//		 entityManager.persist(ListaSimuladaTurmas.getProfessoraSayonaraBarbosaCarvalhoDosSantos());
//		 entityManager.persist(ListaSimuladaTurmas.getProfessoraJoseaneNevesFreire());
//		 entityManager.persist(ListaSimuladaTurmas.getProfessoraMariaDeFatimaBarbosaSantana());
//		 entityManager.persist(ListaSimuladaTurmas.getProfessoraIvaniaAlmeidaDaSilva());

//		 entityManager.getTransaction().commit();
		 
	        
	}
}
