package br.com.boletimonline.listasimulada;

import java.util.Arrays;

import br.com.boletimonline.builder.AlunoBuilder;
import br.com.boletimonline.builder.DisciplinaBuilder;
import br.com.boletimonline.model.Aluno;
import br.com.boletimonline.model.Disciplina;
import br.com.boletimonline.model.DisciplinaTurma;
import br.com.boletimonline.model.Turma;
import br.com.boletimonline.model.usuario.Professor;

public class ListaSimuladaTurmas {

	private static Disciplina portugues = new DisciplinaBuilder().addNomeMateria("Português").builder();
	private static Disciplina matematica = new DisciplinaBuilder().addNomeMateria("Matemática").builder();
	private static Disciplina ciencias = new DisciplinaBuilder().addNomeMateria("Ciências").builder();
	private static Disciplina historia = new DisciplinaBuilder().addNomeMateria("História").builder();
	private static Disciplina geografia = new DisciplinaBuilder().addNomeMateria("Geografia").builder();
	private static Disciplina artes = new DisciplinaBuilder().addNomeMateria("Artes").builder();
	private static Disciplina ingles = new DisciplinaBuilder().addNomeMateria("Inglês").builder();
	private static Disciplina filosofia = new DisciplinaBuilder().addNomeMateria("Filosofia").builder();
	private static Disciplina informatica = new DisciplinaBuilder().addNomeMateria("Informática").builder();
	
	
	public static Professor getProfessoraFernanda() {

		Professor professor = new Professor();
		professor.setNome("Profª Fernanda Carolina Ferreira Mendonça");
		professor.setAcesso("06094427327");
		professor.setLogin("fernanda");
		
		DisciplinaTurma disciplina_turma = new DisciplinaTurma();
		
		disciplina_turma.setTurma(getTurmaPrimeiroAno());
		disciplina_turma.getDisciplinas().addAll(Arrays.asList(portugues, matematica,ciencias,historia,geografia,artes,ingles,filosofia,informatica));
			
		professor.adicionaDisciplina_Turma(disciplina_turma );
		

		return professor;

	}

	public static Professor getLidianeAlmeidadaSilva() {

		Professor professor = new Professor();
		// Disciplinas


		
		// Professor
		professor.setNome("Profª Lidiane Almeida da Silva ");
		professor.setAcesso("86122592315");
		professor.setLogin("lidiane");
		
		DisciplinaTurma disciplina_turma = new DisciplinaTurma();
		
		disciplina_turma.setTurma(getTurmaQuartoAno());
		disciplina_turma.getDisciplinas().addAll(Arrays.asList(portugues, matematica,ciencias,historia,geografia,artes,ingles,filosofia,informatica));

		professor.adicionaDisciplina_Turma(disciplina_turma);
		
		return professor;

	}

	public static Professor getProfessoraFranciscaDaSilva() {
		Professor professor = new Professor();

		professor.setNome("Profª Francisca da Silva ");
		professor.setAcesso("01371229341");
		professor.setLogin("francisca");
		
		
		DisciplinaTurma disciplina_turma = new DisciplinaTurma();
		
		disciplina_turma.setTurma(getTurmaSegundoAno());
		disciplina_turma.getDisciplinas().addAll(Arrays.asList(portugues, matematica,ciencias,historia,geografia,artes,ingles,filosofia,informatica));

		professor.adicionaDisciplina_Turma(disciplina_turma);
		
		return professor;
	}
	
	public static Professor getProfessoraAnaCarolinaSouzaDeMorais() {
		Professor professor = new Professor();

		professor.setNome("Profª Ana Carolina Souza de Morais ");
		professor.setAcesso("1234");
		professor.setLogin("carolina");
		
		DisciplinaTurma disciplina_turma = new DisciplinaTurma();
		
		disciplina_turma.setTurma(getTurmaQuinto());
		disciplina_turma.getDisciplinas().addAll(Arrays.asList(portugues, matematica,ciencias,historia,geografia,artes,ingles,filosofia,informatica));

		professor.adicionaDisciplina_Turma(disciplina_turma);
		
		return professor;	
	}

	
	public static Professor getProfessoraAnaPaulaBarbosaDeJesus() {
		Professor professor = new Professor();

		professor.setNome("Profª Ana Carolina Souza de Morais ");
		professor.setAcesso("00634334352");
		professor.setLogin("paula");
		
		DisciplinaTurma sextoAnoA = new DisciplinaTurma();
		sextoAnoA.setTurma(getTurmaSextoAnoA());
		sextoAnoA.getDisciplinas().addAll(Arrays.asList(ingles));

		DisciplinaTurma sextoAnoB = new DisciplinaTurma();
		sextoAnoB.setTurma(getTurmaSextoAnoB());
		sextoAnoB.getDisciplinas().addAll(Arrays.asList(ingles));
		
		DisciplinaTurma setimoAnoA = new DisciplinaTurma();
		setimoAnoA.setTurma(getTurmaSetimoAnoA());
		setimoAnoA.getDisciplinas().addAll(Arrays.asList(ingles,informatica));

		DisciplinaTurma setimoAnoB = new DisciplinaTurma();
		setimoAnoB.setTurma(getTurmaSetimoAnoB());
		setimoAnoB.getDisciplinas().addAll(Arrays.asList(ingles,informatica));

		DisciplinaTurma oitavoAnoA = new DisciplinaTurma();
		oitavoAnoA.setTurma(getTurmaOitavoAnoA());
		oitavoAnoA.getDisciplinas().addAll(Arrays.asList(ingles,informatica));

		DisciplinaTurma oitavoAnoB = new DisciplinaTurma();
		oitavoAnoB.setTurma(getTurmaOitavoAnoB());
		oitavoAnoB.getDisciplinas().addAll(Arrays.asList(ingles,informatica));

		DisciplinaTurma nonoAnoA = new DisciplinaTurma();
		nonoAnoA.setTurma(getTurmaNonoAnoA());
		nonoAnoA.getDisciplinas().addAll(Arrays.asList(informatica));
		
		DisciplinaTurma nonoAnoB = new DisciplinaTurma();
		nonoAnoB.setTurma(getTurmaNonoAnoA());
		nonoAnoB.getDisciplinas().addAll(Arrays.asList(informatica));
		
		
		professor.adicionaDisciplina_Turma(sextoAnoA);
		professor.adicionaDisciplina_Turma(sextoAnoB);
		professor.adicionaDisciplina_Turma(setimoAnoA);
		professor.adicionaDisciplina_Turma(setimoAnoB);
		professor.adicionaDisciplina_Turma(oitavoAnoA);
		professor.adicionaDisciplina_Turma(oitavoAnoB);
		professor.adicionaDisciplina_Turma(nonoAnoA);
		professor.adicionaDisciplina_Turma(nonoAnoB);
		
		return professor;
	}
	 
	public static Professor getProfessorFranklinDouglasDeSousaSilva() {
		Professor professor = new Professor();
		// Disciplinas

		professor.setNome("Prof Franklin Douglas de Sousa Silva  ");
		professor.setAcesso("53052560387");
		professor.setLogin("franklin");

		DisciplinaTurma setimoAnoA = new DisciplinaTurma();
		setimoAnoA.setTurma(getTurmaSetimoAnoA());
		setimoAnoA.getDisciplinas().addAll(Arrays.asList(matematica));

		DisciplinaTurma setimoAnoB = new DisciplinaTurma();
		setimoAnoB.setTurma(getTurmaSetimoAnoB());
		setimoAnoB.getDisciplinas().addAll(Arrays.asList(matematica));

		DisciplinaTurma oitavoAnoA = new DisciplinaTurma();
		oitavoAnoA.setTurma(getTurmaOitavoAnoA());
		oitavoAnoA.getDisciplinas().addAll(Arrays.asList(matematica));

		DisciplinaTurma oitavoAnoB = new DisciplinaTurma();
		oitavoAnoB.setTurma(getTurmaOitavoAnoB());
		oitavoAnoB.getDisciplinas().addAll(Arrays.asList(matematica));

		DisciplinaTurma nonoAnoA = new DisciplinaTurma();
		nonoAnoA.setTurma(getTurmaNonoAnoA());
		nonoAnoA.getDisciplinas().addAll(Arrays.asList(matematica));
		
		DisciplinaTurma nonoAnoB = new DisciplinaTurma();
		nonoAnoB.setTurma(getTurmaNonoAnoA());
		nonoAnoB.getDisciplinas().addAll(Arrays.asList(matematica));
		
		professor.adicionaDisciplina_Turma(setimoAnoA);
		professor.adicionaDisciplina_Turma(setimoAnoB);
		professor.adicionaDisciplina_Turma(oitavoAnoA);
		professor.adicionaDisciplina_Turma(oitavoAnoB);
		professor.adicionaDisciplina_Turma(nonoAnoA);
		professor.adicionaDisciplina_Turma(nonoAnoB);
			
		
		return professor;
	}
	
	public static Professor getProfessoraRegileideAlvesDaSilva() {
		Professor professor = new Professor();
		// Disciplinas

		professor.setNome("Profª Regileide Alves da Silva");
		professor.setAcesso("97798347372");
		professor.setLogin("regileide");
			
		DisciplinaTurma setimoAnoA = new DisciplinaTurma();
		setimoAnoA.setTurma(getTurmaSetimoAnoA());
		setimoAnoA.getDisciplinas().addAll(Arrays.asList(portugues));

		DisciplinaTurma setimoAnoB = new DisciplinaTurma();
		setimoAnoB.setTurma(getTurmaSetimoAnoB());
		setimoAnoB.getDisciplinas().addAll(Arrays.asList(portugues));
		
		professor.adicionaDisciplina_Turma(setimoAnoA);
		professor.adicionaDisciplina_Turma(setimoAnoB);
		
		return professor;
	}
	
	 
	public static Professor getProfessoraSuelySantosMoreiradeOliveira () {
		Professor professor = new Professor();
		// Disciplinas
		professor.setNome("Profª Suely Santos Moreira de Oliveira");
		professor.setAcesso("43224148349");
		professor.setLogin("suely");
		
		DisciplinaTurma setimoAnoA = new DisciplinaTurma();
		setimoAnoA.setTurma(getTurmaSetimoAnoA());
		setimoAnoA.getDisciplinas().addAll(Arrays.asList(artes));

		DisciplinaTurma setimoAnoB = new DisciplinaTurma();
		setimoAnoB.setTurma(getTurmaSetimoAnoB());
		setimoAnoB.getDisciplinas().addAll(Arrays.asList(artes));

		DisciplinaTurma oitavoAnoA = new DisciplinaTurma();
		oitavoAnoA.setTurma(getTurmaOitavoAnoA());
		oitavoAnoA.getDisciplinas().addAll(Arrays.asList(artes));

		DisciplinaTurma oitavoAnoB = new DisciplinaTurma();
		oitavoAnoB.setTurma(getTurmaOitavoAnoB());
		oitavoAnoB.getDisciplinas().addAll(Arrays.asList(artes));

		DisciplinaTurma nonoAnoA = new DisciplinaTurma();
		nonoAnoA.setTurma(getTurmaNonoAnoA());
		nonoAnoA.getDisciplinas().addAll(Arrays.asList(artes));
		
		DisciplinaTurma nonoAnoB = new DisciplinaTurma();
		nonoAnoB.setTurma(getTurmaNonoAnoA());
		nonoAnoB.getDisciplinas().addAll(Arrays.asList(artes));
		
		professor.adicionaDisciplina_Turma(setimoAnoA);
		professor.adicionaDisciplina_Turma(setimoAnoB);
		professor.adicionaDisciplina_Turma(oitavoAnoA);
		professor.adicionaDisciplina_Turma(oitavoAnoB);
		professor.adicionaDisciplina_Turma(nonoAnoA);
		professor.adicionaDisciplina_Turma(nonoAnoB);
		
		return professor;		
	}
	
	/*
	 * Primeiro Ano
	 */
	public static Turma getTurmaPrimeiroAno() {
		Aluno aluno1 = new AlunoBuilder().addNomeAluno("Andreyanna Valentina Matos Silva").addNumero(1).builder();
		Aluno aluno2 = new AlunoBuilder().addNomeAluno("Carlos Emanuel Sousa Santos").addNumero(2).builder();
		Aluno aluno3 = new AlunoBuilder().addNomeAluno("Deila Lorena dos Santos Goncalves").addNumero(3).builder();
		Aluno aluno4 = new AlunoBuilder().addNomeAluno("Francisca Emanoelle Pereira Santos").addNumero(4).builder();
		Aluno aluno5 = new AlunoBuilder().addNomeAluno("Isabela Oliveira Silva ").addNumero(5).builder();
		Aluno aluno6 = new AlunoBuilder().addNomeAluno("Jandeson Geovane dos Santos Campos").addNumero(6).builder();
		Aluno aluno7 = new AlunoBuilder().addNomeAluno("Jerbson Daniel Maia Cantanhede").addNumero(7).builder();
		Aluno aluno8 = new AlunoBuilder().addNomeAluno("Jocevandro Viana Silva Junior").addNumero(8).builder();
		Aluno aluno9 = new AlunoBuilder().addNomeAluno("Késia Pereira da Conceição").addNumero(9).builder();
		Aluno aluno10 = new AlunoBuilder().addNomeAluno("Luana Maria da Silva Gomes").addNumero(10).builder();
		Aluno aluno11 = new AlunoBuilder().addNomeAluno("Luanny Grazielly Feitosa Machado").addNumero(11).builder();
		Aluno aluno12 = new AlunoBuilder().addNomeAluno("Luis Augusto Barros Monteiro").addNumero(12).builder();
		Aluno aluno13 = new AlunoBuilder().addNomeAluno("Luis Matheus Marques Martins").addNumero(13).builder();
		Aluno aluno14 = new AlunoBuilder().addNomeAluno("Maria Débora Sousa do Nascimento").addNumero(14).builder();
		Aluno aluno15 = new AlunoBuilder().addNomeAluno("Maria Gabriela dos Santos Sampaio ").addNumero(15).builder();
		Aluno aluno16 = new AlunoBuilder().addNomeAluno("Maria Julia Barbosa Rocha").addNumero(16).builder();
		Aluno aluno17 = new AlunoBuilder().addNomeAluno("Maria Sophia da Silva Nascimento").addNumero(17).builder();
		Aluno aluno18 = new AlunoBuilder().addNomeAluno("Maria Vitoria de Assunção Silva").addNumero(18).builder();
		Aluno aluno19 = new AlunoBuilder().addNomeAluno("Milton Neto da Silva Ferreira").addNumero(19).builder();
		Aluno aluno20 = new AlunoBuilder().addNomeAluno("Nattasha Vitória de Souza Silva").addNumero(20).builder();
		Aluno aluno21 = new AlunoBuilder().addNomeAluno("Renê Arthur Costa Lima").addNumero(21).builder();
		Aluno aluno22 = new AlunoBuilder().addNomeAluno("Rhyanna Jasmin Ferreira Sousa").addNumero(22).builder();
		Aluno aluno23 = new AlunoBuilder().addNomeAluno("Thaylson Freitas Parga").addNumero(23).builder();

		Turma turma = new Turma();
		turma.setDescricaoTurma("Primeiro Ano");
		turma.adicionaAluno(Arrays.asList(aluno1, aluno2, aluno3, aluno4, aluno5, aluno6, aluno7, aluno8, aluno9,
				aluno10, aluno11, aluno12, aluno13, aluno14, aluno15, aluno16, aluno17, aluno18, aluno19, aluno20,
				aluno21, aluno22, aluno23));

		return turma;
	}

	/*
	 * Segundo Ano
	 */
	private static Turma getTurmaSegundoAno() {

		Aluno aluno1 = new AlunoBuilder().addNomeAluno("Alan Silva Pereira").addNumero(1).builder();
		Aluno aluno2 = new AlunoBuilder().addNomeAluno("Alessandro Santos Cutrim ").addNumero(2).builder();
		Aluno aluno3 = new AlunoBuilder().addNomeAluno("Camila Pereira Barros ").addNumero(3).builder();
		Aluno aluno4 = new AlunoBuilder().addNomeAluno("Danillo Sousa da Silva").addNumero(4).builder();
		Aluno aluno5 = new AlunoBuilder().addNomeAluno("Davi Moura Silva ").addNumero(5).builder();
		Aluno aluno6 = new AlunoBuilder().addNomeAluno("Débora Celeine Sampaio Rodrigues").addNumero(6).builder();
		Aluno aluno7 = new AlunoBuilder().addNomeAluno("Deborah Lethicia de Assunção Amorim ").addNumero(7).builder();
		Aluno aluno8 = new AlunoBuilder().addNomeAluno("Enzo Gabryel Oliveira Ribeiro ").addNumero(8).builder();
		Aluno aluno9 = new AlunoBuilder().addNomeAluno("Isabelle Vitória dos Santos Pereira ").addNumero(9).builder();
		Aluno aluno10 = new AlunoBuilder().addNomeAluno("Jorge Petrus Nunes da Conceição Sales ").addNumero(10)
				.builder();

		Aluno aluno11 = new AlunoBuilder().addNomeAluno("Kalleb Daniel de Carvalho Reis").addNumero(11).builder();
		Aluno aluno12 = new AlunoBuilder().addNomeAluno("Líviah Maria Pereira da Silva").addNumero(12).builder();

		Aluno aluno13 = new AlunoBuilder().addNomeAluno("Luan Vieira da Silva").addNumero(13).builder();

		Aluno aluno14 = new AlunoBuilder().addNomeAluno("Luis Felipe Malhão da Conceição").addNumero(14).builder();
		Aluno aluno15 = new AlunoBuilder().addNomeAluno("Lyara Emanueli Costa da Silva").addNumero(15).builder();

		Aluno aluno16 = new AlunoBuilder().addNomeAluno("Paula Gabriele da Conceição da Silva ").addNumero(16)
				.builder();
		Aluno aluno17 = new AlunoBuilder().addNomeAluno("Raila Samanta Lima de Oliveira ").addNumero(17).builder();
		Aluno aluno18 = new AlunoBuilder().addNomeAluno("Roberta Silva da Conceição ").addNumero(18).builder();
		Aluno aluno19 = new AlunoBuilder().addNomeAluno("Shofia Fontes Machado ").addNumero(19).builder();
		Aluno aluno20 = new AlunoBuilder().addNomeAluno("Thewsly Lohrany Silva Ferreira ").addNumero(20).builder();
		Aluno aluno21 = new AlunoBuilder().addNomeAluno("Vitoria Cristina Saraiva de Sousa ").addNumero(21).builder();

		Turma turma = new Turma();
		turma.setDescricaoTurma("Segundo Ano");
		turma.adicionaAluno(
				Arrays.asList(aluno1, aluno2, aluno3, aluno4, aluno5, aluno6, aluno7, aluno8, aluno9, aluno10, aluno11,
						aluno12, aluno13, aluno14, aluno15, aluno16, aluno17, aluno18, aluno19, aluno20, aluno21));

		return turma;
	}
	/*
	 * Quarto Ano
	 */
	private static Turma getTurmaQuartoAno() {

		Aluno aluno1 = new AlunoBuilder().addNomeAluno("Adriele Araujo dos Santos ").addNumero(1).builder();
		Aluno aluno2 = new AlunoBuilder().addNomeAluno("Ana Letícia Malhão da Conceição").addNumero(2).builder();
		Aluno aluno3 = new AlunoBuilder().addNomeAluno("Angelo Gabriel Santos Borge").addNumero(3).builder();
		Aluno aluno4 = new AlunoBuilder().addNomeAluno("Angelo Gabriel Silva Lima ").addNumero(4).builder();
		Aluno aluno5 = new AlunoBuilder().addNomeAluno("Benícia Emanuelle Sampaio Rodrigues  ").addNumero(5).builder();
		Aluno aluno6 = new AlunoBuilder().addNomeAluno("Carlos Francisco Lisbôa Santos").addNumero(6).builder();
		Aluno aluno7 = new AlunoBuilder().addNomeAluno("Claudio Emanuel Rodrigues Lima").addNumero(7).builder();
		Aluno aluno8 = new AlunoBuilder().addNomeAluno("Débora do Nascimento de Sousa ").addNumero(8).builder();
		Aluno aluno9 = new AlunoBuilder().addNomeAluno("Fredson Henrique Miranda marques").addNumero(9).builder();
		Aluno aluno10 = new AlunoBuilder().addNomeAluno("Harmando Guilhermy Silva Carneiro").addNumero(10).builder();

		Aluno aluno11 = new AlunoBuilder().addNomeAluno("Helloah Christina Costa Pereira").addNumero(11).builder();
		Aluno aluno12 = new AlunoBuilder().addNomeAluno("Iccaro Dhermeson Silva Lago ").addNumero(12).builder();

		Aluno aluno13 = new AlunoBuilder().addNomeAluno("Ìcaro Roberto Fernandes da Conceição").addNumero(13).builder();

		Aluno aluno14 = new AlunoBuilder().addNomeAluno("Jadson Mykael Medeiros Alencar  ").addNumero(14).builder();
		Aluno aluno15 = new AlunoBuilder().addNomeAluno("João Paulo Silva Cavalcante ").addNumero(15).builder();

		Aluno aluno16 = new AlunoBuilder().addNomeAluno("Kezya Loranna Medeiros Freitas ").addNumero(16).builder();
		Aluno aluno17 = new AlunoBuilder().addNomeAluno("Ludmilla Mel da Silva Silva ").addNumero(17).builder();
		Aluno aluno18 = new AlunoBuilder().addNomeAluno("Luis Fernando Silva Ferreira   ").addNumero(18).builder();
		Aluno aluno19 = new AlunoBuilder().addNomeAluno("Luís Inácio Ferreira Damasceno   ").addNumero(19).builder();
		Aluno aluno20 = new AlunoBuilder().addNomeAluno("Marcela Pereira da Silva  ").addNumero(20).builder();
		Aluno aluno21 = new AlunoBuilder().addNomeAluno("Maria Alyce Carvalho Silva  ").addNumero(21).builder();
		Aluno aluno22 = new AlunoBuilder().addNomeAluno("Maria Gabrielly Feitosa Ferreira ").addNumero(22).builder();
		Aluno aluno23 = new AlunoBuilder().addNomeAluno("Márlon Emanuel Feitoza de Sousa  ").addNumero(23).builder();
		Aluno aluno24 = new AlunoBuilder().addNomeAluno("Maysa da Conceição de Sousa ").addNumero(24).builder();
		Aluno aluno25 = new AlunoBuilder().addNomeAluno("Nathalya Beatriz Castro Queiroz ").addNumero(25).builder();
		Aluno aluno26 = new AlunoBuilder().addNomeAluno("Vitor Manoel Miranda da Silva").addNumero(26).builder();
		Aluno aluno27 = new AlunoBuilder().addNomeAluno("Waslan Jadson Freitas da Conceição").addNumero(27).builder();
		Aluno aluno28 = new AlunoBuilder().addNomeAluno("Wemerson Lucas Lima Reis").addNumero(28).builder();

		Turma turma = new Turma();
		turma.setDescricaoTurma("Quarto Ano");
		turma.adicionaAluno(Arrays.asList(aluno1, aluno2, aluno3, aluno4, aluno5, aluno6, aluno7, aluno8, aluno9,
				aluno10, aluno11, aluno12, aluno13, aluno14, aluno15, aluno16, aluno17, aluno18, aluno19, aluno20,
				aluno21, aluno22, aluno23, aluno24, aluno25, aluno26, aluno27, aluno28));

		return turma;
	}
	/*
	 * Quinto ano
	 */
	private static Turma getTurmaQuinto() {

		Turma turma = new Turma();
		turma.setDescricaoTurma("Quinto Ano");
		turma.setTurno("MATUTINO");
		turma.adicionaAluno(Arrays.asList(getAluno("Agata Geovana Carneiro Abreu ", 1),
				getAluno("Alef Breno Rodrigues Alves   ", 2),
				getAluno("Ana Clara Silva Moreira  ", 3),
				getAluno("Antonio Lucio Aguiar dos Santos ", 4),
				getAluno("Débora Vitória dos Santos  ", 5),
				getAluno("Dhébora Victhória Sousa Silva ", 6),
				getAluno("Elizabeth do Nascimento Santos ", 7),
				getAluno("Erinaldo Pereira Ferreira ", 8),
				getAluno("Francisco Gutierre Matos de Sousa", 9),
				getAluno("Geovana Santos Medeiros ", 10),
				getAluno("Guilherme Nascimento dos Santos ", 11),
				getAluno("Guilherme Richard Rêgo Silva ", 12),
				getAluno("Kaio Gabriel Nascimento de Lima ", 13),
				getAluno("Luís Eduardo Barros Silva", 14),
				getAluno("Maria Clara Félix de Sousa", 15),
				getAluno("Mateus Henrique Silva Reis", 16),
				getAluno("Railson Kelvin Oliveira da Silva ", 17),
				getAluno("Rayllanne Medeiros da Silva",18),
				getAluno("Wesley Antonio da Silva ",19)));
		
		return turma;
	}
	/*
	 * Sexto Ano A
	 * 
	 */
	public static Turma getTurmaSextoAnoA() {

		Turma turma = new Turma();
		turma.setDescricaoTurma("Sexto Ano A");
		turma.setTurno("MATUTINO");
		turma.adicionaAluno(Arrays.asList(getAluno("Alice Joelma Silva Cavalcante", 1),
				getAluno("Ana Beatriz Freitas da Conceição  ", 2),
				getAluno("Ana Clara da Silva ", 3),
				getAluno("Ana Francisca da Conceição Silva   ", 4),
				getAluno("Ana Luciane do Nascimento Carvalho", 5),
				getAluno("Anthony Durval Carvalho Silva ", 6),
				getAluno("Antonio Kewvi Barros Ferreira ", 7),
				
				getAluno("Antonio Marcos dos Santos Vieira Júnior ", 8),
				getAluno("Carlos Daniel da Conceição de Sousa  ", 9),
				getAluno("Claudiane Gonçalves Garcia ", 10),
				getAluno("Daniele da Silva Carvalho ", 11),
				getAluno("Dhéryk Ruann Alves Rodrigues ", 12),
				getAluno("Francisca Eduarda Bezerra da Conceição", 13),
				getAluno("Francisco Rodrigo da Silva Pinto ", 14),
				getAluno("Fredson kauan Conceição Sousa ", 15),
				getAluno("Giselle Silva Santos  ", 16),
				getAluno("Gleyciane Rocha de Lima ", 17),
				getAluno("Jamille Maria de Sousa Alves",18),
				getAluno("João Pedro Rocha de Lima ",19),
				getAluno("Josemilson da Silva de Sousa",20),
				getAluno("Josivania do Nascimento Leite ",21),
				getAluno("Lauan Enrik Feitosa Machado",22),
				getAluno("Manuela Maria da Silva e Silva",23),
				getAluno("Marcielle Pereira da Silva",24),
				getAluno("Marcos Vinícius Ferreira Vieira",25),
				getAluno("Maria Dacyara da Conceição Silva",26),
				getAluno("Maria Fernanda Silva Almeida",27),   
				getAluno("Maycon da Silva Santos  ",28),
				getAluno("Nanderson da Silva ",29),  
				getAluno("Pedro Gilvan Silva do Nascimento",30),
				
				getAluno("Samuel da Silva Medeiros",31),
				getAluno("Vítor Manoel da Silva Rocha Lima",32),
				getAluno("Weslley Braga da Silva",33))); 
		return turma;
	}
	/*
	 * Sexto Ano B
	 * 
	 */
	public static Turma getTurmaSextoAnoB() {

		Turma turma = new Turma();
		turma.setDescricaoTurma("Sexto Ano B");
		turma.setTurno("MATUTINO");
		turma.adicionaAluno(Arrays.asList(getAluno("Bruna Lorrane Silva Feitosa ", 1),
				getAluno("Carlos Eduardo da Silva de Jesus", 2),
				getAluno("Dafny Waleska Sousa Pereira ",3),
				getAluno("Davi Emanuel dos Santos Silva",4),
				getAluno("Deyvson Kauan da Silva ",5),
				getAluno("Elanne da Conceição Silva",6),
				getAluno("Eloha Silva de Sousa",7),
				getAluno("Erik Matheus Mendes de Araujo",8),
				getAluno("Erisvaldo da Conceição da Silva ",9),
				getAluno("Evelly Cristina Berredo Vieira ",10),
				getAluno("Gabrielle Sousa da Silva ",11),
				getAluno("Geovane Reis Sales",12),
				getAluno("Isabelle Vitória Silva Rodrigues ",13),
				getAluno("João Miguel Santiago da Conceição  ",14),
				getAluno("João Vithor Borges Vidal  ",15),
				getAluno("José Luciano Vieira Santos",16),
				getAluno("Lyedson Thauan Gama da Silva ",17),
				getAluno("Marcos Alexandre Carvalho dos Santos ",18),
				getAluno("Marcos Cauan Rodrigues da Conceição Pinto ",19),
				getAluno("Maria Alice Rodrigues de Sousa ",20),
				getAluno("Maria Eduarda da Silva Sousa ",21),
				getAluno("Maria Eduarda Santos Lícar  ",22),
				getAluno("Maria Hediane Soares Martins  ",23),
				getAluno("Maria Inês dos Santos ",24),
				getAluno("Moizaniel Licá Martins ",25),
				getAluno("Natanael Bulhão Soares ",26),
				getAluno("Rakelly Lohanny da Silva Vieira ",27),
				getAluno("Robério Alves Firmo ",28),
				getAluno("Rosiele da Conceição Nascimento ",29),
				getAluno("Sabrina Evelyn Silva de Almeida ",30),
				getAluno("Wana Witória Santos Braga ",31),
				getAluno("Wemerson de Oliveira Pereira",32),
				getAluno("Wesley Kauan Cruz de Sousa",33)));
	
		return turma;
	}
	/*
	 * Setimo Ano A
	 * 
	 */
	public static Turma getTurmaSetimoAnoA() {

		Turma turma = new Turma();
		turma.setDescricaoTurma("Setimo Ano A");
		turma.setTurno("MATUTINO");
		turma.adicionaAluno(Arrays.asList(getAluno("Ana Mirian Reis Matos", 1),
				getAluno("Antonia Gabriele da Silva", 2),
				getAluno("Antoniel Sousa da Conceição", 3),
				getAluno("Antonio Marcos Ferreira Vieira ", 4),
				getAluno("Antonya Domynique Carvalho Silva", 5),
				getAluno("Benício Emanuell Sampaio Rodrigues", 6),
				getAluno("Carlos Daniel Ribeiro da Silva  ", 7),
				getAluno("Claudenilson da Silva Lago", 8),
				getAluno("Débora Natielly Pereira Silva da Costa", 9),
				getAluno("Dimy da Conceição de Sousa ", 10),
				getAluno("Euziane Pereira Mota", 11),
				getAluno("Francisco Vitor Sousa Nascimento ", 12),
				getAluno("Janiele da Silva Sousa ", 13),
				getAluno("João Gabriel Sousa de Paula  ", 14),
				getAluno("Josiane da Silva de Sousa     ", 15),
				getAluno("Kamilly Vitoria Ferreira da Conceição ", 16),
				getAluno("Kamylla Teixeira Barros", 17),
				getAluno("Laércio Araújo Bezerra ", 18),
				getAluno("Leonardo Morais Lima   ", 19),
				getAluno("Luis Carlos Rocha do Nascimento ", 20),
				getAluno("Maria Safira da Silva de Sousa ", 21),
				getAluno("Marcos Rocha Freitas ", 22),
				getAluno("Mirella Marques de Amorim", 23),
				getAluno("Nahin Araújo Pereira", 24),
				getAluno("Nicolas de Oliveira Pereira ", 25),
				getAluno("Pedro Henrique Ribeiro Pinto", 26),
				getAluno("Pedro Lucas Sousa Rodrigues", 27),
				getAluno("Raylan Sotero dos Santos ", 28),
				getAluno("Samuel Carvalho dos Santos", 29),
				getAluno("Tereza Cristina Alves Costa", 30), 
				getAluno("Vítor Emanuel Nascimento dos Santos", 31),
				getAluno("Vitor Santos Silva ", 32),
				getAluno("Wellington de Araújo da Silva  ", 33),
				getAluno("William Deyvison Cruz Sousa ", 34)));
	
		return turma;
	}
	/*
	 * Setimo Ano B
	 * 
	 */
	public static Turma getTurmaSetimoAnoB() {

		Turma turma = new Turma();
		turma.setDescricaoTurma("Setimo Ano B");
		turma.setTurno("MATUTINO");
		turma.adicionaAluno(Arrays.asList(getAluno("Alana Maria Felix do Nascimento", 1),
				getAluno("Bruna Victória Rodrigues da Silva ", 2),
				getAluno("Carlos Adriano Rocha do Nascimento ", 3),
				getAluno("Danielle Nascimento Borges", 4),
				getAluno("David Kauan Silva Lima", 5),
				getAluno("Emilly Kelly Braga Teixeira", 6),
				getAluno("Francisco Gomes da Silva Neto", 7),
				getAluno("Francisco Ìtalo Silva da Cruz", 8),
				getAluno("Gabriel da Conceição dos Reis", 9),
				getAluno("Isabelly Christine de Paula Sousa", 10),
				getAluno("Jairadarly Garrido da Silva ", 11),
				getAluno("Jeison Mendes da Silva ", 12),
				getAluno("João Victor Pereira Silva ", 13),
				getAluno("João Victor Silva Sousa ", 14),
				getAluno("José Vinicius Conceição da Cruz ", 15),
				getAluno("José Vitor Conceição da Cruz ", 16),
				getAluno("José Vinicius Conceição da Cruz ", 17),
				getAluno("Josué Alexandre de Paula dos Santos ", 18),
				getAluno("Katarina Jayane dos Santos Sampaio ", 19),
				getAluno("Marcos Santos de Almeida ", 20),
				getAluno("Maria Cristina dos Santos Freitas", 21),
				getAluno("Marina Kaillany Pereira dos Santos Mesquita  ", 22),
				getAluno("Michael Araújo Bezerra ", 23),
				getAluno("Natanaelle Bulhão Soares", 24),
				getAluno("Natiely Lima Aquino", 25),
				getAluno("Pablo Cauã Oliveira Silva", 26),
				getAluno("Pedro Ycaro Costa Silva ", 27),
				getAluno("Pyetro Silva Leal", 28),
				getAluno("Rikelme Richard Sousa da Silva", 29),
				getAluno("Rômulo Matheus Batista Sousa", 30),
				getAluno("Sarah Layze Barbosa Martins", 31),
				getAluno("Suzana Vitória Mota Santos Licá", 32),
				getAluno("Tânia Janicy Borges Barros", 33),
				getAluno("Weslley da Silva Santos", 34)));				
								
				return turma;
	}
	/*
	 * Oitavo Ano A
	 */
	private static Turma getTurmaOitavoAnoA() {

		Turma turma = new Turma();
		turma.setDescricaoTurma("Oitavo Ano A");
		turma.adicionaAluno(Arrays.asList(getAluno("Adriana Nascimento de Oliveira", 1),
				getAluno("Alessandra Silva Pereira", 2), getAluno("Antonio Anderson Matos de Sousa", 3),
				getAluno("Arioston Lima Miranda Júnior", 4), getAluno("Carliane Reis dos Santos", 5),
				getAluno("Carlos Alexandre da Silva Costa", 6), getAluno("Denilson Moura Silva", 7),
				getAluno("Derik Gabriel da Conceição Silva", 8), getAluno("Fabricio das Chagas da Silva   ", 9),
				getAluno("Flávia Rebeca Santos Braga   ", 10), getAluno("Genival Neto do Nascimento Novais", 11),
				getAluno("Gilvana Silva do Nascimento", 12), getAluno("Gustavo Henrique de Sousa Gomes", 13),
				getAluno("Jasmin Maria de Sousa Alves", 14), getAluno("Joandersom Riquelmesom Palhano Rodrigues", 15),
				getAluno("João Pedro Silva Viana", 16), getAluno("Kamila da Silva Sousa", 17),
				getAluno("Kauane Teixeira Barros", 18), getAluno("Kevem Alan Oliveira do Nascimento", 19),
				getAluno("Lucas Mateus da Silva Carvalho", 20), getAluno("Lucatony Vieira Santos", 21),
				getAluno("Maciel Pereira Ferreira", 22), getAluno("Marcos Vinícius Araújo da Silva", 23),
				getAluno("Maria Fernanda das Chagas da Silva", 24), getAluno("Maria Madalena Lisbôa Lopes", 25),
				getAluno("Mateus Costa Nascimento", 26), getAluno("Mayane da Silva de Jesus", 27),
				getAluno("Neylane Costa Pereira", 28), getAluno("Pamela da Silva Sousa", 29),
				getAluno("Ronielson Custodio de Abreu", 30), getAluno("Weverton Lima Silva", 31),
				getAluno("William Gabriel Oliveira Pereira    ", 32)));

		return turma;
	}
	/*
	 * Oitavo Ano B
	 */
	private static Turma getTurmaOitavoAnoB() {

		Aluno aluno1 = new AlunoBuilder().addNomeAluno("Alailson dos Santos Freitas ").addNumero(1).builder();
		Aluno aluno2 = new AlunoBuilder().addNomeAluno("Alessandro dos Santos Araújo ").addNumero(2).builder();
		Aluno aluno3 = new AlunoBuilder().addNomeAluno("Ana Luiza Monteiro da Silva").addNumero(3).builder();
		Aluno aluno4 = new AlunoBuilder().addNomeAluno("Ana Luiza Rocha do Nascimento ").addNumero(4).builder();
		Aluno aluno5 = new AlunoBuilder().addNomeAluno("Antonio Bruno Rocha Duarte    ").addNumero(5).builder();
		Aluno aluno6 = new AlunoBuilder().addNomeAluno("Carlos André Rocha do Nascimento   ").addNumero(6).builder();
		Aluno aluno7 = new AlunoBuilder().addNomeAluno("Carlos Henrique Oliveira dos Santos ").addNumero(7).builder();
		Aluno aluno8 = new AlunoBuilder().addNomeAluno("Deyvilla Rayssa da Cruz Amorim ").addNumero(8).builder();
		Aluno aluno9 = new AlunoBuilder().addNomeAluno("Elayne Kauanny Palhano Rodrigues   ").addNumero(9).builder();
		Aluno aluno10 = new AlunoBuilder().addNomeAluno("Elane Muniz Ribeiro ").addNumero(10).builder();

		Aluno aluno11 = new AlunoBuilder().addNomeAluno("Elias Neto Lima Arruda").addNumero(11).builder();
		Aluno aluno12 = new AlunoBuilder().addNomeAluno("Fladson da Silva Barros").addNumero(12).builder();

		Aluno aluno13 = new AlunoBuilder().addNomeAluno("Francisca Pâmela Freitas Lopes").addNumero(13).builder();

		Aluno aluno14 = new AlunoBuilder().addNomeAluno("Gabriel Lourenço da Silva Assunção Morais  ").addNumero(14)
				.builder();
		Aluno aluno15 = new AlunoBuilder().addNomeAluno("Haroldo da Silva Nascimento Junior ").addNumero(15).builder();

		Aluno aluno16 = new AlunoBuilder().addNomeAluno("Heric Rian da Silva Ferreira ").addNumero(16).builder();
		Aluno aluno17 = new AlunoBuilder().addNomeAluno("Italo Gabriel Almeida de Carvalho      ").addNumero(17)
				.builder();
		Aluno aluno18 = new AlunoBuilder().addNomeAluno("José Matheus Viana Rodrigues   ").addNumero(18).builder();
		Aluno aluno19 = new AlunoBuilder().addNomeAluno("Júlio César de Sousa da Silva").addNumero(19).builder();
		Aluno aluno20 = new AlunoBuilder().addNomeAluno("Klécio Messias Lima dos Santos ").addNumero(20).builder();
		Aluno aluno21 = new AlunoBuilder().addNomeAluno("Larissa Carvalho dos Santos").addNumero(21).builder();
		Aluno aluno22 = new AlunoBuilder().addNomeAluno("Larissa Mikaelly Silva Santos").addNumero(22).builder();
		Aluno aluno23 = new AlunoBuilder().addNomeAluno("Layanne Cristina Bezerra da Silva").addNumero(23).builder();
		Aluno aluno24 = new AlunoBuilder().addNomeAluno("Lucas Michael Pereira Silva").addNumero(24).builder();
		Aluno aluno25 = new AlunoBuilder().addNomeAluno("Maria de Nazaré Braga Costa").addNumero(25).builder();
//		Aluno aluno25 = new AlunoBuilder().addNomeAluno("").addNumero().builder();
		Aluno aluno26 = new AlunoBuilder().addNomeAluno("Ondrezo Sousa Lopes").addNumero(26).builder();
		Aluno aluno27 = new AlunoBuilder().addNomeAluno("Pedro Lucas Gomes Silva da Silva").addNumero(27).builder();
		Aluno aluno28 = new AlunoBuilder().addNomeAluno("Rafael Cicero Vital Sousa ").addNumero(28).builder();
		Aluno aluno29 = new AlunoBuilder().addNomeAluno("Railson Sotelo dos Santos ").addNumero(29).builder();
		Aluno aluno30 = new AlunoBuilder().addNomeAluno("Romeu Silva Lopes").addNumero(30).builder();
		Aluno aluno31 = new AlunoBuilder().addNomeAluno("Ruydeglan Carvalho Vieira  ").addNumero(31).builder();
		Aluno aluno32 = new AlunoBuilder().addNomeAluno("Vitor Santos Carvalho ").addNumero(32).builder();
		Aluno aluno33 = new AlunoBuilder().addNomeAluno("Walysson Lucas Freitas da Conceição  ").addNumero(33)
				.builder();

		Turma turma = new Turma();
		turma.setDescricaoTurma("Oitavo Ano B");
		turma.adicionaAluno(Arrays.asList(aluno1, aluno2, aluno3, aluno4, aluno5, aluno6, aluno7, aluno8, aluno9,
				aluno10, aluno11, aluno12, aluno13, aluno14, aluno15, aluno16, aluno17, aluno18, aluno19, aluno20,
				aluno21, aluno22, aluno23, aluno24, aluno25, aluno26, aluno27, aluno28, aluno29, aluno30, aluno31,
				aluno32, aluno33));

		return turma;
	}
	/*
	 * Nono Ano A
	 */
	private static Turma getTurmaNonoAnoA() {

		Aluno aluno1 = new AlunoBuilder().addNomeAluno("Alexandre Moura Feitosa ").addNumero(1).builder();
		Aluno aluno2 = new AlunoBuilder().addNomeAluno("Ana Paula Moura da Silva").addNumero(2).builder();
		Aluno aluno3 = new AlunoBuilder().addNomeAluno("Antonio Joel Silva Costa").addNumero(3).builder();
		Aluno aluno4 = new AlunoBuilder().addNomeAluno("Brenda Lohanny Rocha Morais    ").addNumero(4).builder();
		Aluno aluno5 = new AlunoBuilder().addNomeAluno("Bruna Cristina Silva Costa  ").addNumero(5).builder();
		Aluno aluno6 = new AlunoBuilder().addNomeAluno("Bruno Expedito Ferreira da Conceição ").addNumero(6).builder();
		Aluno aluno7 = new AlunoBuilder().addNomeAluno("Bruno Henrique Pereira Moreira ").addNumero(7).builder();
		Aluno aluno8 = new AlunoBuilder().addNomeAluno("Danielle Carvalho Santos ").addNumero(8).builder();
		Aluno aluno9 = new AlunoBuilder().addNomeAluno("Elayne Kauanny Palhano Rodrigues   ").addNumero(9).builder();
		Aluno aluno10 = new AlunoBuilder().addNomeAluno("Fernanda Mikaelly dos Santos Garrida ").addNumero(10)
				.builder();

		Aluno aluno11 = new AlunoBuilder().addNomeAluno("Gabriel da Conceição de Sousa").addNumero(11).builder();
		Aluno aluno12 = new AlunoBuilder().addNomeAluno("Gustavo Alves de Souza ").addNumero(12).builder();

		Aluno aluno13 = new AlunoBuilder().addNomeAluno("Janaínna da Silva Altíno").addNumero(13).builder();

		Aluno aluno14 = new AlunoBuilder().addNomeAluno("João Victor da Silva Sobral ").addNumero(14).builder();
		Aluno aluno15 = new AlunoBuilder().addNomeAluno("João Víctor Vieira Silva   ").addNumero(15).builder();

		Aluno aluno16 = new AlunoBuilder().addNomeAluno("Josélya Borges Barros").addNumero(16).builder();
		Aluno aluno17 = new AlunoBuilder().addNomeAluno("Maria Eduarda Sousa Costa   ").addNumero(17).builder();
		Aluno aluno18 = new AlunoBuilder().addNomeAluno("Michele Reis Cruz ").addNumero(18).builder();
		Aluno aluno19 = new AlunoBuilder().addNomeAluno("Nathyele Bulhão Soares    ").addNumero(19).builder();
		Aluno aluno20 = new AlunoBuilder().addNomeAluno("Nayeli da Silva do Nascimento  ").addNumero(20).builder();
		Aluno aluno21 = new AlunoBuilder().addNomeAluno("Pablo Kenedy Santos Oliveira ").addNumero(21).builder();
		Aluno aluno22 = new AlunoBuilder().addNomeAluno("Paulo Ricardo Oliveira dos Santos   ").addNumero(22).builder();
		Aluno aluno23 = new AlunoBuilder().addNomeAluno("Ray Sotelo dos Santos ").addNumero(23).builder();
		Aluno aluno24 = new AlunoBuilder().addNomeAluno("Thiago da Silva Medeiros  ").addNumero(24).builder();
		Aluno aluno25 = new AlunoBuilder().addNomeAluno("Wellen Cristina da Silva Lago").addNumero(25).builder();

		Turma turma = new Turma();
		turma.setDescricaoTurma("Nono Ano A");
		turma.setTurno("VESPERTINO");
		turma.adicionaAluno(Arrays.asList(aluno1, aluno2, aluno3, aluno4, aluno5, aluno6, aluno7, aluno8, aluno9,
				aluno10, aluno11, aluno12, aluno13, aluno14, aluno15, aluno16, aluno17, aluno18, aluno19, aluno20,
				aluno21, aluno22, aluno23, aluno24, aluno25));

		return turma;
	}
	/*
	 * Nono Ano B
	 */
	private static Turma getTurmaNonoAnoB() {
		Turma turma = new Turma();
		turma.setDescricaoTurma("Nono Ano B");
		turma.adicionaAluno(
				Arrays.asList(getAluno("Amanda do Nascimento Serras  ", 1)
						,getAluno("Brenno Abreu de Sousa", 2)
						,getAluno("Camilla Emily Duarte Sousa", 3)
						,getAluno("Carlos da Conceição Silva", 4)
						,getAluno("Gustavo Silveira de Souza", 5)
						,getAluno("José Guilherme Conceição da Cruz ", 6)
						,getAluno("João Lucas da Silva de Sousa  ", 7)
						,getAluno("Joselia Pereira Silva   ", 8)
						,getAluno("Kevellyn Cristina Carvalho Cantanhêde", 9)
						,getAluno("Leonel da Silva Viana", 10)
						,getAluno("Maria Eduarda Oliveira Carvalho", 11)
						,getAluno("Maria Fernanda Alves Firmo", 12)
						
						,getAluno("Maria Letícia Conceição da Cruz ", 13)
						,getAluno("Maria Stheffany Araújo Bezerra   ", 14)
						,getAluno("Mariana Leticia dos Santos Almeida   ", 15)
						,getAluno("Paulo Vinícius Carvalho Silva", 16)
						,getAluno("Pedro Ytalo Magalhães da Luz", 17)
						,getAluno("Rafaela Costa da Cruz", 18)
						,getAluno("Raylana de Sousa da Silva", 19)
						,getAluno("Ricardo Salazar Alves Sousa", 20)
						,getAluno("Ricardo Vinicius Matias de Sousa", 21)
						,getAluno("Vitor Gabriel dos Santos Sampaio", 22)
						,getAluno("Vitoria Marques da Silva", 23)
						,getAluno("Zenilza Teixeira da Silva", 24)
						));

		return turma;				
	}
	
	private static Aluno getAluno(String nome, Integer numero) {
		return new AlunoBuilder().addNomeAluno(nome).addNumero(numero).builder();
	}
}

//public static Professor getProfessoraIvaniaAlmeidaDaSilva() {
//
//	Professor professor = new Professor();
//	// Disciplinas
//
//	professor.adicionaTurmas(Arrays.asList(getTurmaOitavoAnoA(),getTurmaOitavoAnoB(),getTurmaNonoAnoA(),getTurmaNonoAnoB()));
//
//	// Professor
//	professor.setNome("Profª Ivania Almeida da Silva ");
//	professor.setAcesso("123");//03341093370
//	professor.setLogin("ivania");
//	professor.adicionaDisciplina(Arrays.asList(portugues));
//
//	return professor;
//
//}
