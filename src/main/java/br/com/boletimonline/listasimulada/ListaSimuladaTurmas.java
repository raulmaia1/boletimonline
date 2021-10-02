package br.com.boletimonline.listasimulada;

import java.util.Arrays;
import java.util.List;

import br.com.boletimonline.builder.AlunoBuilder;
import br.com.boletimonline.builder.DisciplinaBuilder;
import br.com.boletimonline.builder.EscolaBuilder;
import br.com.boletimonline.model.Aluno;
import br.com.boletimonline.model.Disciplina;
import br.com.boletimonline.model.DisciplinaTurma;
import br.com.boletimonline.model.Escola;
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
	private static Disciplina ensino_religioso = new DisciplinaBuilder().addNomeMateria("Ensino Religioso").builder();
	public static Escola escolaJorge = new EscolaBuilder().addID(1).addEndereco("PRAÇA CAPITÃO JOSÉ ANTONIO, 03  - TRIZIDELA - BACABAL – MARANHÃO").addInep("21278911").addNomeEscola("U. E. F. PREFEITO JORGE JOSE DE MENDONÇA").build();
	
	
	public static Professor getProfessoraFernanda() {

		Professor professor = new Professor();
		professor.setNome("Profª Fernanda Carolina Ferreira Mendonça");
		professor.setAcesso("06094427327");
		professor.setLogin("fernanda");
		professor.setEscola(escolaJorge);
		
		DisciplinaTurma disciplina_turma = new DisciplinaTurma();
		
		disciplina_turma.setTurma(getTurmaPrimeiroAno());
		disciplina_turma.getDisciplinas().addAll(Arrays.asList(portugues, matematica,ciencias,historia,geografia,artes,ingles,filosofia,informatica));
			
		professor.adicionaDisciplina_Turma(disciplina_turma);
		

		return professor;

	}

	public static Professor getProfessoraLidianeAlmeidadaSilva() {

		Professor professor = new Professor();
		// Disciplinas


		
		// Professor
		professor.setNome("Profª Lidiane Almeida da Silva ");
		professor.setAcesso("86122592315");
		professor.setLogin("lidiane");
		professor.setEscola(escolaJorge);

		
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
		professor.setEscola(escolaJorge);

		
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
		professor.setEscola(escolaJorge);

		DisciplinaTurma disciplina_turma = new DisciplinaTurma();
		
		disciplina_turma.setTurma(getTurmaQuinto());
		disciplina_turma.getDisciplinas().addAll(Arrays.asList(portugues, matematica,ciencias,historia,geografia,artes,ingles,filosofia,informatica));

		professor.adicionaDisciplina_Turma(disciplina_turma);
		
		return professor;	
	}

	
	public static Professor getProfessoraAnaPaulaBarbosaDeJesus() {
		Professor professor = new Professor();

		professor.setNome("Profª Ana Paula Barbosa de Jesus");
		professor.setAcesso("00634334352");
		professor.setLogin("paula");
		professor.setEscola(escolaJorge);

		DisciplinaTurma sextoAnoA = new DisciplinaTurma();
		sextoAnoA.setTurma(getTurmaSextoAnoA());
		sextoAnoA.getDisciplinas().addAll(Arrays.asList(ingles,informatica));

		DisciplinaTurma sextoAnoB = new DisciplinaTurma();
		sextoAnoB.setTurma(getTurmaSextoAnoB());
		sextoAnoB.getDisciplinas().addAll(Arrays.asList(ingles,informatica));
		
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
		nonoAnoB.setTurma(getTurmaNonoAnoB());
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
		professor.setEscola(escolaJorge);

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
		nonoAnoB.setTurma(getTurmaNonoAnoB());
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
		professor.setEscola(escolaJorge);
	
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
		professor.setEscola(escolaJorge);

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
		nonoAnoB.setTurma(getTurmaNonoAnoB());
		nonoAnoB.getDisciplinas().addAll(Arrays.asList(artes));
		
		professor.adicionaDisciplina_Turma(setimoAnoA);
		professor.adicionaDisciplina_Turma(setimoAnoB);
		professor.adicionaDisciplina_Turma(oitavoAnoA);
		professor.adicionaDisciplina_Turma(oitavoAnoB);
		professor.adicionaDisciplina_Turma(nonoAnoA);
		professor.adicionaDisciplina_Turma(nonoAnoB);
		
		return professor;		
	}
	
	public static Professor getProfessorJoseWerbeteDaConceicaoPereira() {
		Professor professor = new Professor();
		// Disciplinas
		professor.setNome("Prof José Werbete da Conceição Pereira");
		professor.setAcesso("01087919398");
		professor.setLogin("jose");
		professor.setEscola(escolaJorge);

		DisciplinaTurma setimoAnoA = new DisciplinaTurma();
		setimoAnoA.setTurma(getTurmaSetimoAnoA());
		setimoAnoA.getDisciplinas().addAll(Arrays.asList(historia));

		DisciplinaTurma setimoAnoB = new DisciplinaTurma();
		setimoAnoB.setTurma(getTurmaSetimoAnoB());
		setimoAnoB.getDisciplinas().addAll(Arrays.asList(historia));

		DisciplinaTurma oitavoAnoA = new DisciplinaTurma();
		oitavoAnoA.setTurma(getTurmaOitavoAnoA());
		oitavoAnoA.getDisciplinas().addAll(Arrays.asList(historia));

		DisciplinaTurma oitavoAnoB = new DisciplinaTurma();
		oitavoAnoB.setTurma(getTurmaOitavoAnoB());
		oitavoAnoB.getDisciplinas().addAll(Arrays.asList(historia));

		DisciplinaTurma nonoAnoA = new DisciplinaTurma();
		nonoAnoA.setTurma(getTurmaNonoAnoA());
		nonoAnoA.getDisciplinas().addAll(Arrays.asList(historia));
		
		DisciplinaTurma nonoAnoB = new DisciplinaTurma();
		nonoAnoB.setTurma(getTurmaNonoAnoB());
		nonoAnoB.getDisciplinas().addAll(Arrays.asList(historia));
		
		professor.adicionaDisciplina_Turma(setimoAnoA);
		professor.adicionaDisciplina_Turma(setimoAnoB);
		professor.adicionaDisciplina_Turma(oitavoAnoA);
		professor.adicionaDisciplina_Turma(oitavoAnoB);
		professor.adicionaDisciplina_Turma(nonoAnoA);
		professor.adicionaDisciplina_Turma(nonoAnoB);
		
		return professor;
	}
	
	public static Professor getProfessorWelyson() {
		Professor professor = new Professor();
		// Disciplinas
		
		professor.setNome("Prof Welyson");
		professor.setAcesso("56990405368");
		professor.setLogin("welyson");
		professor.setEscola(escolaJorge);

		DisciplinaTurma setimoAnoA = new DisciplinaTurma();
		setimoAnoA.setTurma(getTurmaSetimoAnoA());
		setimoAnoA.getDisciplinas().addAll(Arrays.asList(geografia));

		DisciplinaTurma setimoAnoB = new DisciplinaTurma();
		setimoAnoB.setTurma(getTurmaSetimoAnoB());
		setimoAnoB.getDisciplinas().addAll(Arrays.asList(geografia));

		DisciplinaTurma oitavoAnoA = new DisciplinaTurma();
		oitavoAnoA.setTurma(getTurmaOitavoAnoA());
		oitavoAnoA.getDisciplinas().addAll(Arrays.asList(geografia));

		DisciplinaTurma oitavoAnoB = new DisciplinaTurma();
		oitavoAnoB.setTurma(getTurmaOitavoAnoB());
		oitavoAnoB.getDisciplinas().addAll(Arrays.asList(geografia));

		DisciplinaTurma nonoAnoA = new DisciplinaTurma();
		nonoAnoA.setTurma(getTurmaNonoAnoA());
		nonoAnoA.getDisciplinas().addAll(Arrays.asList(geografia));
		
		DisciplinaTurma nonoAnoB = new DisciplinaTurma();
		nonoAnoB.setTurma(getTurmaNonoAnoB());
		nonoAnoB.getDisciplinas().addAll(Arrays.asList(geografia));
		
		professor.adicionaDisciplina_Turma(setimoAnoA);
		professor.adicionaDisciplina_Turma(setimoAnoB);
		professor.adicionaDisciplina_Turma(oitavoAnoA);
		professor.adicionaDisciplina_Turma(oitavoAnoB);
		professor.adicionaDisciplina_Turma(nonoAnoA);
		professor.adicionaDisciplina_Turma(nonoAnoB);
		
		return professor;
	}
	
	public static Professor getProfessoraSayonaraBarbosaCarvalhoDosSantos() {
		Professor professor = new Professor();
		// Disciplinas
		
		professor.setNome("Profª Sayonara Barbosa Carvalho dos Santos");
		professor.setAcesso("05506159382");
		professor.setLogin("sayonara");
		professor.setEscola(escolaJorge);

		DisciplinaTurma sextoAnoA = new DisciplinaTurma();
		sextoAnoA.setTurma(getTurmaSextoAnoA());
		sextoAnoA.getDisciplinas().addAll(Arrays.asList(matematica));

		DisciplinaTurma sextoAnoB = new DisciplinaTurma();
		sextoAnoB.setTurma(getTurmaSextoAnoB());
		sextoAnoB.getDisciplinas().addAll(Arrays.asList(matematica));
				
		DisciplinaTurma setimoAnoA = new DisciplinaTurma();
		setimoAnoA.setTurma(getTurmaSetimoAnoA());
		setimoAnoA.getDisciplinas().addAll(Arrays.asList(ciencias));

		DisciplinaTurma setimoAnoB = new DisciplinaTurma();
		setimoAnoB.setTurma(getTurmaSetimoAnoB());
		setimoAnoB.getDisciplinas().addAll(Arrays.asList(ciencias));

		DisciplinaTurma oitavoAnoA = new DisciplinaTurma();
		oitavoAnoA.setTurma(getTurmaOitavoAnoA());
		oitavoAnoA.getDisciplinas().addAll(Arrays.asList(ciencias));

		DisciplinaTurma oitavoAnoB = new DisciplinaTurma();
		oitavoAnoB.setTurma(getTurmaOitavoAnoB());
		oitavoAnoB.getDisciplinas().addAll(Arrays.asList(ciencias));

		DisciplinaTurma nonoAnoA = new DisciplinaTurma();
		nonoAnoA.setTurma(getTurmaNonoAnoA());
		nonoAnoA.getDisciplinas().addAll(Arrays.asList(ciencias));
		
		DisciplinaTurma nonoAnoB = new DisciplinaTurma();
		nonoAnoB.setTurma(getTurmaNonoAnoB());
		nonoAnoB.getDisciplinas().addAll(Arrays.asList(ciencias));
		
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
		 
	public static Professor getProfessoraJoseaneNevesFreire() {
		Professor professor = new Professor();
		// Disciplinas
		
		professor.setNome("Profª Joseane Neves Freire");
		professor.setAcesso("46766944315");
		professor.setLogin("joseane");
		professor.setEscola(escolaJorge);

		DisciplinaTurma sextoAnoA = new DisciplinaTurma();
		sextoAnoA.setTurma(getTurmaSextoAnoA());
		sextoAnoA.getDisciplinas().addAll(Arrays.asList(historia,geografia,artes,filosofia));
		
		DisciplinaTurma sextoAnoB = new DisciplinaTurma();
		sextoAnoB.setTurma(getTurmaSextoAnoB());
		sextoAnoB.getDisciplinas().addAll(Arrays.asList(historia,geografia,artes,filosofia));
				
		DisciplinaTurma setimoAnoA = new DisciplinaTurma();
		setimoAnoA.setTurma(getTurmaSetimoAnoA());
		setimoAnoA.getDisciplinas().addAll(Arrays.asList(ensino_religioso));

		DisciplinaTurma setimoAnoB = new DisciplinaTurma();
		setimoAnoB.setTurma(getTurmaSetimoAnoB());
		setimoAnoB.getDisciplinas().addAll(Arrays.asList(ensino_religioso));

		DisciplinaTurma oitavoAnoA = new DisciplinaTurma();
		oitavoAnoA.setTurma(getTurmaOitavoAnoA());
		oitavoAnoA.getDisciplinas().addAll(Arrays.asList(ensino_religioso));

		DisciplinaTurma oitavoAnoB = new DisciplinaTurma();
		oitavoAnoB.setTurma(getTurmaOitavoAnoB());
		oitavoAnoB.getDisciplinas().addAll(Arrays.asList(ensino_religioso));

		DisciplinaTurma nonoAnoA = new DisciplinaTurma();
		nonoAnoA.setTurma(getTurmaNonoAnoA());
		nonoAnoA.getDisciplinas().addAll(Arrays.asList(informatica,ensino_religioso));
		
		DisciplinaTurma nonoAnoB = new DisciplinaTurma();
		nonoAnoB.setTurma(getTurmaNonoAnoB());
		nonoAnoB.getDisciplinas().addAll(Arrays.asList(informatica,ensino_religioso));
		
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

	
	public static Professor getProfessoraMariaDeFatimaBarbosaSantana() {
		Professor professor = new Professor();
		// Disciplinas
		
		professor.setNome("Profª Maria de Fátima Barbosa Santana");
		professor.setAcesso("40866467300");
		professor.setLogin("maria");
		professor.setEscola(escolaJorge);

		DisciplinaTurma sextoAnoA = new DisciplinaTurma();
		sextoAnoA.setTurma(getTurmaSextoAnoA());
		sextoAnoA.getDisciplinas().addAll(Arrays.asList(ciencias));

		DisciplinaTurma sextoAnoB = new DisciplinaTurma();
		sextoAnoB.setTurma(getTurmaSextoAnoB());
		sextoAnoB.getDisciplinas().addAll(Arrays.asList(ciencias));
		
		professor.adicionaDisciplina_Turma(sextoAnoA);
		professor.adicionaDisciplina_Turma(sextoAnoB);	
		
		return professor;
	}
	
	public static Professor getProfessoraIvaniaAlmeidaDaSilva() {
		Professor professor = new Professor();
		// Disciplinas
		
		professor.setNome("Profª Ivania Almeida da Silva ");
		professor.setAcesso("03341093370");
		professor.setLogin("ivania");
		professor.setEscola(escolaJorge);
	
		DisciplinaTurma oitavoAnoA = new DisciplinaTurma();
		oitavoAnoA.setTurma(getTurmaOitavoAnoA());
		oitavoAnoA.getDisciplinas().addAll(Arrays.asList(portugues));

		DisciplinaTurma oitavoAnoB = new DisciplinaTurma();
		oitavoAnoB.setTurma(getTurmaOitavoAnoB());
		oitavoAnoB.getDisciplinas().addAll(Arrays.asList(portugues));

		DisciplinaTurma nonoAnoA = new DisciplinaTurma();
		nonoAnoA.setTurma(getTurmaNonoAnoA());
		nonoAnoA.getDisciplinas().addAll(Arrays.asList(portugues));
		
		DisciplinaTurma nonoAnoB = new DisciplinaTurma();
		nonoAnoB.setTurma(getTurmaNonoAnoB());
		nonoAnoB.getDisciplinas().addAll(Arrays.asList(portugues));
		

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
		Turma turma = new Turma();
		turma.setDescricaoTurma("Primeiro Ano");
		turma.setTurno("MATUTINO");
		
		return turma;
	}
	
	public static List<Aluno> getAlunosPrimeiroAno() {

		Aluno aluno1 = new AlunoBuilder().addTurma(getTurmaPrimeiroAno()).addNomeAluno("Andreyanna Valentina Matos Silva").addNumero(1).builder();
		Aluno aluno2 = new AlunoBuilder().addTurma(getTurmaPrimeiroAno()).addNomeAluno("Carlos Emanuel Sousa Santos").addNumero(2).builder();
		Aluno aluno3 = new AlunoBuilder().addTurma(getTurmaPrimeiroAno()).addNomeAluno("Deila Lorena dos Santos Goncalves").addNumero(3).builder();
		Aluno aluno4 = new AlunoBuilder().addTurma(getTurmaPrimeiroAno()).addNomeAluno("Francisca Emanoelle Pereira Santos").addNumero(4).builder();
		Aluno aluno5 = new AlunoBuilder().addTurma(getTurmaPrimeiroAno()).addNomeAluno("Isabela Oliveira Silva ").addNumero(5).builder();
		Aluno aluno6 = new AlunoBuilder().addTurma(getTurmaPrimeiroAno()).addNomeAluno("Jandeson Geovane dos Santos Campos").addNumero(6).builder();
		Aluno aluno7 = new AlunoBuilder().addTurma(getTurmaPrimeiroAno()).addNomeAluno("Jerbson Daniel Maia Cantanhede").addNumero(7).builder();
		Aluno aluno8 = new AlunoBuilder().addTurma(getTurmaPrimeiroAno()).addNomeAluno("Jocevandro Viana Silva Junior").addNumero(8).builder();
		Aluno aluno9 = new AlunoBuilder().addTurma(getTurmaPrimeiroAno()).addNomeAluno("Késia Pereira da Conceição").addNumero(9).builder();
		Aluno aluno10 = new AlunoBuilder().addTurma(getTurmaPrimeiroAno()).addNomeAluno("Luana Maria da Silva Gomes").addNumero(10).builder();
		Aluno aluno11 = new AlunoBuilder().addTurma(getTurmaPrimeiroAno()).addNomeAluno("Luanny Grazielly Feitosa Machado").addNumero(11).builder();
		Aluno aluno12 = new AlunoBuilder().addTurma(getTurmaPrimeiroAno()).addNomeAluno("Luis Augusto Barros Monteiro").addNumero(12).builder();
		Aluno aluno13 = new AlunoBuilder().addTurma(getTurmaPrimeiroAno()).addNomeAluno("Luis Matheus Marques Martins").addNumero(13).builder();
		Aluno aluno14 = new AlunoBuilder().addTurma(getTurmaPrimeiroAno()).addNomeAluno("Maria Débora Sousa do Nascimento").addNumero(14).builder();
		Aluno aluno15 = new AlunoBuilder().addTurma(getTurmaPrimeiroAno()).addNomeAluno("Maria Gabriela dos Santos Sampaio ").addNumero(15).builder();
		Aluno aluno16 = new AlunoBuilder().addTurma(getTurmaPrimeiroAno()).addNomeAluno("Maria Julia Barbosa Rocha").addNumero(16).builder();
		Aluno aluno17 = new AlunoBuilder().addTurma(getTurmaPrimeiroAno()).addNomeAluno("Maria Sophia da Silva Nascimento").addNumero(17).builder();
		Aluno aluno18 = new AlunoBuilder().addTurma(getTurmaPrimeiroAno()).addNomeAluno("Maria Vitoria de Assunção Silva").addNumero(18).builder();
		Aluno aluno19 = new AlunoBuilder().addTurma(getTurmaPrimeiroAno()).addNomeAluno("Milton Neto da Silva Ferreira").addNumero(19).builder();
		Aluno aluno20 = new AlunoBuilder().addTurma(getTurmaPrimeiroAno()).addNomeAluno("Nattasha Vitória de Souza Silva").addNumero(20).builder();
		Aluno aluno21 = new AlunoBuilder().addTurma(getTurmaPrimeiroAno()).addNomeAluno("Renê Arthur Costa Lima").addNumero(21).builder();
		Aluno aluno22 = new AlunoBuilder().addTurma(getTurmaPrimeiroAno()).addNomeAluno("Rhyanna Jasmin Ferreira Sousa").addNumero(22).builder();
		Aluno aluno23 = new AlunoBuilder().addTurma(getTurmaPrimeiroAno()).addNomeAluno("Thaylson Freitas Parga").addNumero(23).builder();

		
		return Arrays.asList(aluno1, aluno2, aluno3, aluno4, aluno5, aluno6, aluno7, aluno8, aluno9,
				aluno10, aluno11, aluno12, aluno13, aluno14, aluno15, aluno16, aluno17, aluno18, aluno19, aluno20,
				aluno21, aluno22, aluno23);
	}

	/*
	 * Segundo Ano
	 */
	public static Turma getTurmaSegundoAno() {
		Turma turma = new Turma();
		turma.setDescricaoTurma("Segundo Ano");
		turma.setTurno("MATUTINO");
		return turma;
	}
	
	public static List<Aluno> getAlunosSegundoAno() {
		
		Aluno aluno1 = new AlunoBuilder().addTurma(getTurmaSegundoAno()).addNomeAluno("Alan Silva Pereira").addNumero(1).builder();
		Aluno aluno2 = new AlunoBuilder().addTurma(getTurmaSegundoAno()).addNomeAluno("Alessandro Santos Cutrim ").addNumero(2).builder();
		Aluno aluno3 = new AlunoBuilder().addTurma(getTurmaSegundoAno()).addNomeAluno("Camila Pereira Barros ").addNumero(3).builder();
		Aluno aluno4 = new AlunoBuilder().addTurma(getTurmaSegundoAno()).addNomeAluno("Danillo Sousa da Silva").addNumero(4).builder();
		Aluno aluno5 = new AlunoBuilder().addTurma(getTurmaSegundoAno()).addNomeAluno("Davi Moura Silva ").addNumero(5).builder();
		Aluno aluno6 = new AlunoBuilder().addTurma(getTurmaSegundoAno()).addNomeAluno("Débora Celeine Sampaio Rodrigues").addNumero(6).builder();
		Aluno aluno7 = new AlunoBuilder().addTurma(getTurmaSegundoAno()).addNomeAluno("Deborah Lethicia de Assunção Amorim ").addNumero(7).builder();
		Aluno aluno8 = new AlunoBuilder().addTurma(getTurmaSegundoAno()).addNomeAluno("Enzo Gabryel Oliveira Ribeiro ").addNumero(8).builder();
		Aluno aluno9 = new AlunoBuilder().addTurma(getTurmaSegundoAno()).addNomeAluno("Isabelle Vitória dos Santos Pereira ").addNumero(9).builder();
		Aluno aluno10 = new AlunoBuilder().addTurma(getTurmaSegundoAno()).addNomeAluno("Jorge Petrus Nunes da Conceição Sales ").addNumero(10)
				.builder();

		Aluno aluno11 = new AlunoBuilder().addTurma(getTurmaSegundoAno()).addNomeAluno("Kalleb Daniel de Carvalho Reis").addNumero(11).builder();
		Aluno aluno12 = new AlunoBuilder().addTurma(getTurmaSegundoAno()).addNomeAluno("Líviah Maria Pereira da Silva").addNumero(12).builder();

		Aluno aluno13 = new AlunoBuilder().addTurma(getTurmaSegundoAno()).addNomeAluno("Luan Vieira da Silva").addNumero(13).builder();

		Aluno aluno14 = new AlunoBuilder().addTurma(getTurmaSegundoAno()).addNomeAluno("Luis Felipe Malhão da Conceição").addNumero(14).builder();
		Aluno aluno15 = new AlunoBuilder().addTurma(getTurmaSegundoAno()).addNomeAluno("Lyara Emanueli Costa da Silva").addNumero(15).builder();

		Aluno aluno16 = new AlunoBuilder().addTurma(getTurmaSegundoAno()).addNomeAluno("Paula Gabriele da Conceição da Silva ").addNumero(16)
				.builder();
		Aluno aluno17 = new AlunoBuilder().addTurma(getTurmaSegundoAno()).addNomeAluno("Raila Samanta Lima de Oliveira ").addNumero(17).builder();
		Aluno aluno18 = new AlunoBuilder().addTurma(getTurmaSegundoAno()).addNomeAluno("Roberta Silva da Conceição ").addNumero(18).builder();
		Aluno aluno19 = new AlunoBuilder().addTurma(getTurmaSegundoAno()).addNomeAluno("Shofia Fontes Machado ").addNumero(19).builder();
		Aluno aluno20 = new AlunoBuilder().addTurma(getTurmaSegundoAno()).addNomeAluno("Thewsly Lohrany Silva Ferreira ").addNumero(20).builder();
		Aluno aluno21 = new AlunoBuilder().addTurma(getTurmaSegundoAno()).addNomeAluno("Vitoria Cristina Saraiva de Sousa ").addNumero(21).builder();

		return Arrays.asList(aluno1, aluno2, aluno3, aluno4, aluno5, aluno6, aluno7, aluno8, aluno9, aluno10, aluno11,
						aluno12, aluno13, aluno14, aluno15, aluno16, aluno17, aluno18, aluno19, aluno20, aluno21);

	}
	/*
	 * Quarto Ano
	 */
	public static Turma getTurmaQuartoAno() {
		Turma turma = new Turma();
		turma.setDescricaoTurma("Quarto Ano");
		turma.setTurno("MATUTINO");
		
		return turma;
	}
	
    public static List<Aluno> getAlunosQuartoAno() {

		Aluno aluno1 = new AlunoBuilder().addTurma(getTurmaQuartoAno()).addNomeAluno("Adriele Araujo dos Santos ").addNumero(1).builder();
		Aluno aluno2 = new AlunoBuilder().addTurma(getTurmaQuartoAno()).addNomeAluno("Ana Letícia Malhão da Conceição").addNumero(2).builder();
		Aluno aluno3 = new AlunoBuilder().addTurma(getTurmaQuartoAno()).addNomeAluno("Angelo Gabriel Santos Borge").addNumero(3).builder();
		Aluno aluno4 = new AlunoBuilder().addTurma(getTurmaQuartoAno()).addNomeAluno("Angelo Gabriel Silva Lima ").addNumero(4).builder();
		Aluno aluno5 = new AlunoBuilder().addTurma(getTurmaQuartoAno()).addNomeAluno("Benícia Emanuelle Sampaio Rodrigues  ").addNumero(5).builder();
		Aluno aluno6 = new AlunoBuilder().addTurma(getTurmaQuartoAno()).addNomeAluno("Carlos Francisco Lisbôa Santos").addNumero(6).builder();
		Aluno aluno7 = new AlunoBuilder().addTurma(getTurmaQuartoAno()).addNomeAluno("Claudio Emanuel Rodrigues Lima").addNumero(7).builder();
		Aluno aluno8 = new AlunoBuilder().addTurma(getTurmaQuartoAno()).addNomeAluno("Débora do Nascimento de Sousa ").addNumero(8).builder();
		Aluno aluno9 = new AlunoBuilder().addTurma(getTurmaQuartoAno()).addNomeAluno("Fredson Henrique Miranda marques").addNumero(9).builder();
		Aluno aluno10 = new AlunoBuilder().addTurma(getTurmaQuartoAno()).addNomeAluno("Harmando Guilhermy Silva Carneiro").addNumero(10).builder();

		Aluno aluno11 = new AlunoBuilder().addTurma(getTurmaQuartoAno()).addNomeAluno("Helloah Christina Costa Pereira").addNumero(11).builder();
		Aluno aluno12 = new AlunoBuilder().addTurma(getTurmaQuartoAno()).addNomeAluno("Iccaro Dhermeson Silva Lago ").addNumero(12).builder();

		Aluno aluno13 = new AlunoBuilder().addTurma(getTurmaQuartoAno()).addNomeAluno("Ìcaro Roberto Fernandes da Conceição").addNumero(13).builder();

		Aluno aluno14 = new AlunoBuilder().addTurma(getTurmaQuartoAno()).addNomeAluno("Jadson Mykael Medeiros Alencar  ").addNumero(14).builder();
		Aluno aluno15 = new AlunoBuilder().addTurma(getTurmaQuartoAno()).addNomeAluno("João Paulo Silva Cavalcante ").addNumero(15).builder();

		Aluno aluno16 = new AlunoBuilder().addTurma(getTurmaQuartoAno()).addNomeAluno("Kezya Loranna Medeiros Freitas ").addNumero(16).builder();
		Aluno aluno17 = new AlunoBuilder().addTurma(getTurmaQuartoAno()).addNomeAluno("Ludmilla Mel da Silva Silva ").addNumero(17).builder();
		Aluno aluno18 = new AlunoBuilder().addTurma(getTurmaQuartoAno()).addNomeAluno("Luis Fernando Silva Ferreira   ").addNumero(18).builder();
		Aluno aluno19 = new AlunoBuilder().addTurma(getTurmaQuartoAno()).addNomeAluno("Luís Inácio Ferreira Damasceno   ").addNumero(19).builder();
		Aluno aluno20 = new AlunoBuilder().addTurma(getTurmaQuartoAno()).addNomeAluno("Marcela Pereira da Silva  ").addNumero(20).builder();
		Aluno aluno21 = new AlunoBuilder().addTurma(getTurmaQuartoAno()).addNomeAluno("Maria Alyce Carvalho Silva  ").addNumero(21).builder();
		Aluno aluno22 = new AlunoBuilder().addTurma(getTurmaQuartoAno()).addNomeAluno("Maria Gabrielly Feitosa Ferreira ").addNumero(22).builder();
		Aluno aluno23 = new AlunoBuilder().addTurma(getTurmaQuartoAno()).addNomeAluno("Márlon Emanuel Feitoza de Sousa  ").addNumero(23).builder();
		Aluno aluno24 = new AlunoBuilder().addTurma(getTurmaQuartoAno()).addNomeAluno("Maysa da Conceição de Sousa ").addNumero(24).builder();
		Aluno aluno25 = new AlunoBuilder().addTurma(getTurmaQuartoAno()).addNomeAluno("Nathalya Beatriz Castro Queiroz ").addNumero(25).builder();
		Aluno aluno26 = new AlunoBuilder().addTurma(getTurmaQuartoAno()).addNomeAluno("Vitor Manoel Miranda da Silva").addNumero(26).builder();
		Aluno aluno27 = new AlunoBuilder().addTurma(getTurmaQuartoAno()).addNomeAluno("Waslan Jadson Freitas da Conceição").addNumero(27).builder();
		Aluno aluno28 = new AlunoBuilder().addTurma(getTurmaQuartoAno()).addNomeAluno("Wemerson Lucas Lima Reis").addNumero(28).builder();


		return Arrays.asList(aluno1, aluno2, aluno3, aluno4, aluno5, aluno6, aluno7, aluno8, aluno9,
				aluno10, aluno11, aluno12, aluno13, aluno14, aluno15, aluno16, aluno17, aluno18, aluno19, aluno20,
				aluno21, aluno22, aluno23, aluno24, aluno25, aluno26, aluno27, aluno28);

	}
	/*
	 * Quinto ano
	 */
	public static Turma getTurmaQuinto() {

		Turma turma = new Turma();
		turma.setDescricaoTurma("Quinto Ano");
		turma.setTurno("MATUTINO");
		
		return turma;

	}
	
	public static List<Aluno> getAlunosQuintoAno() {

		return	Arrays.asList(getAluno("Agata Geovana Carneiro Abreu ", 1,getTurmaQuinto()),
				getAluno("Alef Breno Rodrigues Alves   ", 2,getTurmaQuinto()),
				getAluno("Ana Clara Silva Moreira  ", 3,getTurmaQuinto()),
				getAluno("Antonio Lucio Aguiar dos Santos ", 4,getTurmaQuinto()),
				getAluno("Débora Vitória dos Santos  ", 5,getTurmaQuinto()),
				getAluno("Dhébora Victhória Sousa Silva ", 6,getTurmaQuinto()),
				getAluno("Elizabeth do Nascimento Santos ", 7,getTurmaQuinto()),
				getAluno("Erinaldo Pereira Ferreira ", 8,getTurmaQuinto()),
				getAluno("Francisco Gutierre Matos de Sousa", 9,getTurmaQuinto()),
				getAluno("Geovana Santos Medeiros ", 10,getTurmaQuinto()),
				getAluno("Guilherme Nascimento dos Santos ", 11,getTurmaQuinto()),
				getAluno("Guilherme Richard Rêgo Silva ", 12,getTurmaQuinto()),
				getAluno("Kaio Gabriel Nascimento de Lima ", 13,getTurmaQuinto()),
				getAluno("Luís Eduardo Barros Silva", 14,getTurmaQuinto()),
				getAluno("Maria Clara Félix de Sousa", 15,getTurmaQuinto()),
				getAluno("Mateus Henrique Silva Reis", 16,getTurmaQuinto()),
				getAluno("Railson Kelvin Oliveira da Silva ", 17,getTurmaQuinto()),
				getAluno("Rayllanne Medeiros da Silva",18,getTurmaQuinto()),
				getAluno("Wesley Antonio da Silva ",19,getTurmaQuinto()));
		
	}
	/*
	 * Sexto Ano A
	 * 
	 */
	public static Turma getTurmaSextoAnoA() {

		Turma turma = new Turma();
		turma.setDescricaoTurma("Sexto Ano A");
		turma.setTurno("MATUTINO");

		return turma;

	}
	
	public static List<Aluno> getAlunosSextoAnoA(){
		
		return Arrays.asList(getAluno("Alice Joelma Silva Cavalcante", 1,getTurmaSextoAnoA()),
				getAluno("Ana Beatriz Freitas da Conceição  ", 2,getTurmaSextoAnoA()),
				getAluno("Ana Clara da Silva ", 3,getTurmaSextoAnoA()),
				getAluno("Ana Francisca da Conceição Silva   ", 4,getTurmaSextoAnoA()),
				getAluno("Ana Luciane do Nascimento Carvalho", 5,getTurmaSextoAnoA()),
				getAluno("Anthony Durval Carvalho Silva ", 6,getTurmaSextoAnoA()),
				getAluno("Antonio Kewvi Barros Ferreira ", 7,getTurmaSextoAnoA()),
				
				getAluno("Antonio Marcos dos Santos Vieira Júnior ", 8,getTurmaSextoAnoA()),
				getAluno("Carlos Daniel da Conceição de Sousa  ", 9,getTurmaSextoAnoA()),
				getAluno("Claudiane Gonçalves Garcia ", 10,getTurmaSextoAnoA()),
				getAluno("Daniele da Silva Carvalho ", 11,getTurmaSextoAnoA()),
				getAluno("Dhéryk Ruann Alves Rodrigues ", 12,getTurmaSextoAnoA()),
				getAluno("Francisca Eduarda Bezerra da Conceição", 13,getTurmaSextoAnoA()),
				getAluno("Francisco Rodrigo da Silva Pinto ", 14,getTurmaSextoAnoA()),
				getAluno("Fredson kauan Conceição Sousa ", 15,getTurmaSextoAnoA()),
				getAluno("Giselle Silva Santos  ", 16,getTurmaSextoAnoA()),
				getAluno("Gleyciane Rocha de Lima ", 17,getTurmaSextoAnoA()),
				getAluno("Jamille Maria de Sousa Alves",18,getTurmaSextoAnoA()),
				getAluno("João Pedro Rocha de Lima ",19,getTurmaSextoAnoA()),
				getAluno("Josemilson da Silva de Sousa",20,getTurmaSextoAnoA()),
				getAluno("Josivania do Nascimento Leite ",21,getTurmaSextoAnoA()),
				getAluno("Lauan Enrik Feitosa Machado",22,getTurmaSextoAnoA()),
				getAluno("Manuela Maria da Silva e Silva",23,getTurmaSextoAnoA()),
				getAluno("Marcielle Pereira da Silva",24,getTurmaSextoAnoA()),
				getAluno("Marcos Vinícius Ferreira Vieira",25,getTurmaSextoAnoA()),
				getAluno("Maria Dacyara da Conceição Silva",26,getTurmaSextoAnoA()),
				getAluno("Maria Fernanda Silva Almeida",27,getTurmaSextoAnoA()),   
				getAluno("Maycon da Silva Santos  ",28,getTurmaSextoAnoA()),
				getAluno("Nanderson da Silva ",29,getTurmaSextoAnoA()),  
				getAluno("Pedro Gilvan Silva do Nascimento",30,getTurmaSextoAnoA()),
				
				getAluno("Samuel da Silva Medeiros",31,getTurmaSextoAnoA()),
				getAluno("Vítor Manoel da Silva Rocha Lima",32,getTurmaSextoAnoA()),
				getAluno("Weslley Braga da Silva",33,getTurmaSextoAnoA())); 
	}
	/*
	 * Sexto Ano B
	 * 
	 */
	public static Turma getTurmaSextoAnoB() {

		Turma turma = new Turma();
		turma.setDescricaoTurma("Sexto Ano B");
		turma.setTurno("MATUTINO");

		return turma;
	}
	
	public static List<Aluno> getAlunosSextoAnoB(){
		return Arrays.asList(getAluno("Bruna Lorrane Silva Feitosa ", 1,getTurmaSextoAnoB()),
				getAluno("Carlos Eduardo da Silva de Jesus", 2,getTurmaSextoAnoB()),
				getAluno("Dafny Waleska Sousa Pereira ",3,getTurmaSextoAnoB()),
				getAluno("Davi Emanuel dos Santos Silva",4,getTurmaSextoAnoB()),
				getAluno("Deyvson Kauan da Silva ",5,getTurmaSextoAnoB()),
				getAluno("Elanne da Conceição Silva",6,getTurmaSextoAnoB()),
				getAluno("Eloha Silva de Sousa",7,getTurmaSextoAnoB()),
				getAluno("Erik Matheus Mendes de Araujo",8,getTurmaSextoAnoB()),
				getAluno("Erisvaldo da Conceição da Silva ",9,getTurmaSextoAnoB()),
				getAluno("Evelly Cristina Berredo Vieira ",10,getTurmaSextoAnoB()),
				getAluno("Gabrielle Sousa da Silva ",11,getTurmaSextoAnoB()),
				getAluno("Geovane Reis Sales",12,getTurmaSextoAnoB()),
				getAluno("Isabelle Vitória Silva Rodrigues ",13,getTurmaSextoAnoB()),
				getAluno("João Miguel Santiago da Conceição  ",14,getTurmaSextoAnoB()),
				getAluno("João Vithor Borges Vidal  ",15,getTurmaSextoAnoB()),
				getAluno("José Luciano Vieira Santos",16,getTurmaSextoAnoB()),
				getAluno("Lyedson Thauan Gama da Silva ",17,getTurmaSextoAnoB()),
				getAluno("Marcos Alexandre Carvalho dos Santos ",18,getTurmaSextoAnoB()),
				getAluno("Marcos Cauan Rodrigues da Conceição Pinto ",19,getTurmaSextoAnoB()),
				getAluno("Maria Alice Rodrigues de Sousa ",20,getTurmaSextoAnoB()),
				getAluno("Maria Eduarda da Silva Sousa ",21,getTurmaSextoAnoB()),
				getAluno("Maria Eduarda Santos Lícar  ",22,getTurmaSextoAnoB()),
				getAluno("Maria Hediane Soares Martins  ",23,getTurmaSextoAnoB()),
				getAluno("Maria Inês dos Santos ",24,getTurmaSextoAnoB()),
				getAluno("Moizaniel Licá Martins ",25,getTurmaSextoAnoB()),
				getAluno("Natanael Bulhão Soares ",26,getTurmaSextoAnoB()),
				getAluno("Rakelly Lohanny da Silva Vieira ",27,getTurmaSextoAnoB()),
				getAluno("Robério Alves Firmo ",28,getTurmaSextoAnoB()),
				getAluno("Rosiele da Conceição Nascimento ",29,getTurmaSextoAnoB()),
				getAluno("Sabrina Evelyn Silva de Almeida ",30,getTurmaSextoAnoB()),
				getAluno("Wana Witória Santos Braga ",31,getTurmaSextoAnoB()),
				getAluno("Wemerson de Oliveira Pereira",32,getTurmaSextoAnoB()),
				getAluno("Wesley Kauan Cruz de Sousa",33,getTurmaSextoAnoB()));
	}
	
	/*
	 * Setimo Ano A
	 * 
	 */
	public static Turma getTurmaSetimoAnoA() {

		Turma turma = new Turma();
		turma.setDescricaoTurma("Setimo Ano A");
		turma.setTurno("MATUTINO");

		return turma;
	}
		
	public static List<Aluno> getAlunosSetimoAnoA(){
		
		return Arrays.asList(getAluno("Ana Mirian Reis Matos", 1,getTurmaSetimoAnoA()),
				getAluno("Antonia Gabriele da Silva", 2,getTurmaSetimoAnoA()),
				getAluno("Antoniel Sousa da Conceição", 3,getTurmaSetimoAnoA()),
				getAluno("Antonio Marcos Ferreira Vieira ", 4,getTurmaSetimoAnoA()),
				getAluno("Antonya Domynique Carvalho Silva", 5,getTurmaSetimoAnoA()),
				getAluno("Benício Emanuell Sampaio Rodrigues", 6,getTurmaSetimoAnoA()),
				getAluno("Carlos Daniel Ribeiro da Silva  ", 7,getTurmaSetimoAnoA()),
				getAluno("Claudenilson da Silva Lago", 8,getTurmaSetimoAnoA()),
				getAluno("Débora Natielly Pereira Silva da Costa", 9,getTurmaSetimoAnoA()),
				getAluno("Dimy da Conceição de Sousa ", 10,getTurmaSetimoAnoA()),
				getAluno("Euziane Pereira Mota", 11,getTurmaSetimoAnoA()),
				getAluno("Francisco Vitor Sousa Nascimento ", 12,getTurmaSetimoAnoA()),
				getAluno("Janiele da Silva Sousa ", 13,getTurmaSetimoAnoA()),
				getAluno("João Gabriel Sousa de Paula  ", 14,getTurmaSetimoAnoA()),
				getAluno("Josiane da Silva de Sousa     ", 15,getTurmaSetimoAnoA()),
				getAluno("Kamilly Vitoria Ferreira da Conceição ", 16,getTurmaSetimoAnoA()),
				getAluno("Kamylla Teixeira Barros", 17,getTurmaSetimoAnoA()),
				getAluno("Laércio Araújo Bezerra ", 18,getTurmaSetimoAnoA()),
				getAluno("Leonardo Morais Lima   ", 19,getTurmaSetimoAnoA()),
				getAluno("Luis Carlos Rocha do Nascimento ", 20,getTurmaSetimoAnoA()),
				getAluno("Maria Safira da Silva de Sousa ", 21,getTurmaSetimoAnoA()),
				getAluno("Marcos Rocha Freitas ", 22,getTurmaSetimoAnoA()),
				getAluno("Mirella Marques de Amorim", 23,getTurmaSetimoAnoA()),
				getAluno("Nahin Araújo Pereira", 24,getTurmaSetimoAnoA()),
				getAluno("Nicolas de Oliveira Pereira ", 25,getTurmaSetimoAnoA()),
				getAluno("Pedro Henrique Ribeiro Pinto", 26,getTurmaSetimoAnoA()),
				getAluno("Pedro Lucas Sousa Rodrigues", 27,getTurmaSetimoAnoA()),
				getAluno("Raylan Sotero dos Santos ", 28,getTurmaSetimoAnoA()),
				getAluno("Samuel Carvalho dos Santos", 29,getTurmaSetimoAnoA()),
				getAluno("Tereza Cristina Alves Costa", 30,getTurmaSetimoAnoA()), 
				getAluno("Vítor Emanuel Nascimento dos Santos", 31,getTurmaSetimoAnoA()),
				getAluno("Vitor Santos Silva ", 32,getTurmaSetimoAnoA()),
				getAluno("Wellington de Araújo da Silva  ", 33,getTurmaSetimoAnoA()),
				getAluno("William Deyvison Cruz Sousa ", 34,getTurmaSetimoAnoA()));
	}
	/*
	 * Setimo Ano B
	 * 
	 */
	public static Turma getTurmaSetimoAnoB() {
		Turma turma = new Turma();
		turma.setDescricaoTurma("Setimo Ano B");
		turma.setTurno("MATUTINO");
		return turma;
	}
		
	public static List<Aluno> getAlunosSetimoAnoB(){
		
	return Arrays.asList(getAluno("Alana Maria Felix do Nascimento", 1,getTurmaSetimoAnoB()),
				getAluno("Bruna Victória Rodrigues da Silva ", 2,getTurmaSetimoAnoB()),
				getAluno("Carlos Adriano Rocha do Nascimento ", 3,getTurmaSetimoAnoB()),
				getAluno("Danielle Nascimento Borges", 4,getTurmaSetimoAnoB()),
				getAluno("David Kauan Silva Lima", 5,getTurmaSetimoAnoB()),
				getAluno("Emilly Kelly Braga Teixeira", 6,getTurmaSetimoAnoB()),
				getAluno("Francisco Gomes da Silva Neto", 7,getTurmaSetimoAnoB()),
				getAluno("Francisco Ìtalo Silva da Cruz", 8,getTurmaSetimoAnoB()),
				getAluno("Gabriel da Conceição dos Reis", 9,getTurmaSetimoAnoB()),
				getAluno("Isabelly Christine de Paula Sousa", 10,getTurmaSetimoAnoB()),
				getAluno("Jairadarly Garrido da Silva ", 11,getTurmaSetimoAnoB()),
				getAluno("Jeison Mendes da Silva ", 12,getTurmaSetimoAnoB()),
				getAluno("João Victor Pereira Silva ", 13,getTurmaSetimoAnoB()),
				getAluno("João Victor Silva Sousa ", 14,getTurmaSetimoAnoB()),
				getAluno("José Vinicius Conceição da Cruz ", 15,getTurmaSetimoAnoB()),
				getAluno("José Vitor Conceição da Cruz ", 16,getTurmaSetimoAnoB()),
				getAluno("José Vinicius Conceição da Cruz ", 17,getTurmaSetimoAnoB()),
				getAluno("Josué Alexandre de Paula dos Santos ", 18,getTurmaSetimoAnoB()),
				getAluno("Katarina Jayane dos Santos Sampaio ", 19,getTurmaSetimoAnoB()),
				getAluno("Marcos Santos de Almeida ", 20,getTurmaSetimoAnoB()),
				getAluno("Maria Cristina dos Santos Freitas", 21,getTurmaSetimoAnoB()),
				getAluno("Marina Kaillany Pereira dos Santos Mesquita  ", 22,getTurmaSetimoAnoB()),
				getAluno("Michael Araújo Bezerra ", 23, getTurmaSetimoAnoB()),
				getAluno("Natanaelle Bulhão Soares", 24, getTurmaSetimoAnoB()),
				getAluno("Natiely Lima Aquino", 25, getTurmaSetimoAnoB()),
				getAluno("Pablo Cauã Oliveira Silva", 26,getTurmaSetimoAnoB()),
				getAluno("Pedro Ycaro Costa Silva ", 27, getTurmaSetimoAnoB()),
				getAluno("Pyetro Silva Leal", 28,getTurmaSetimoAnoB()),
				getAluno("Rikelme Richard Sousa da Silva", 29,getTurmaSetimoAnoB()),
				getAluno("Rômulo Matheus Batista Sousa", 30,getTurmaSetimoAnoB()),
				getAluno("Sarah Layze Barbosa Martins", 31,getTurmaSetimoAnoB()),
				getAluno("Suzana Vitória Mota Santos Licá", 32,getTurmaSetimoAnoB()),
				getAluno("Tânia Janicy Borges Barros", 33,getTurmaSetimoAnoB()),
				getAluno("Weslley da Silva Santos", 34,getTurmaSetimoAnoB()));				
	}
	
	/*
	 * Oitavo Ano A
	 */
	private static Turma getTurmaOitavoAnoA() {

		Turma turma = new Turma();
		turma.setDescricaoTurma("Oitavo Ano A");
		turma.setTurno("VESPERTINO");                  

		return turma;
	}

	public static List<Aluno> getAlunosOitavoAnoA(){
	
		return Arrays.asList(
				getAluno("Adriana Nascimento de Oliveira", 1, getTurmaOitavoAnoA()),
				getAluno("Alessandra Silva Pereira", 2,getTurmaOitavoAnoA()),
				getAluno("Antonio Anderson Matos de Sousa", 3,getTurmaOitavoAnoA()),
				getAluno("Arioston Lima Miranda Júnior", 4,getTurmaOitavoAnoA()),
				getAluno("Carliane Reis dos Santos", 5,getTurmaOitavoAnoA()),
				getAluno("Carlos Alexandre da Silva Costa", 6,getTurmaOitavoAnoA()),
				getAluno("Denilson Moura Silva", 7,getTurmaOitavoAnoA()),
				getAluno("Derik Gabriel da Conceição Silva", 8,getTurmaOitavoAnoA()), 
				getAluno("Fabricio das Chagas da Silva   ", 9,getTurmaOitavoAnoA()),
				getAluno("Flávia Rebeca Santos Braga   ", 10,getTurmaOitavoAnoA()),	
				getAluno("Genival Neto do Nascimento Novais", 11,getTurmaOitavoAnoA()),
				getAluno("Gilvana Silva do Nascimento", 12,getTurmaOitavoAnoA()),
				getAluno("Gustavo Henrique de Sousa Gomes", 13,getTurmaOitavoAnoA()),
				getAluno("Jasmin Maria de Sousa Alves", 14,getTurmaOitavoAnoA()),
				getAluno("Joandersom Riquelmesom Palhano Rodrigues", 15,getTurmaOitavoAnoA()),
				getAluno("João Pedro Silva Viana", 16,getTurmaOitavoAnoA()), 
				getAluno("Kamila da Silva Sousa", 17,getTurmaOitavoAnoA()),
				getAluno("Kauane Teixeira Barros", 18,getTurmaOitavoAnoA()),
				getAluno("Kevem Alan Oliveira do Nascimento", 19,getTurmaOitavoAnoA()),
				getAluno("Lucas Mateus da Silva Carvalho", 20,getTurmaOitavoAnoA()), 
				getAluno("Lucatony Vieira Santos", 21,getTurmaOitavoAnoA()),
				getAluno("Maciel Pereira Ferreira", 22,getTurmaOitavoAnoA()),
				getAluno("Marcos Vinícius Araújo da Silva", 23,getTurmaOitavoAnoA()),
				getAluno("Maria Fernanda das Chagas da Silva", 24,getTurmaOitavoAnoA()),
				getAluno("Maria Madalena Lisbôa Lopes", 25,getTurmaOitavoAnoA()),
				getAluno("Mateus Costa Nascimento", 26,getTurmaOitavoAnoA()),
				getAluno("Mayane da Silva de Jesus", 27,getTurmaOitavoAnoA()),
				getAluno("Neylane Costa Pereira", 28,getTurmaOitavoAnoA()),
				getAluno("Pamela da Silva Sousa", 29,getTurmaOitavoAnoA()),
				getAluno("Ronielson Custodio de Abreu", 30,getTurmaOitavoAnoA()),
				getAluno("Weverton Lima Silva", 31,getTurmaOitavoAnoA()),
				getAluno("William Gabriel Oliveira Pereira  ", 32,getTurmaOitavoAnoA()));
	}
	
	/*
	 * Oitavo Ano B
	 */
	public static Turma getTurmaOitavoAnoB() {
		
		Turma turma = new Turma();
		turma.setDescricaoTurma("Oitavo Ano B");
		turma.setTurno("VESPERTINO"); 
		
		return turma;
	}
	
	public static List<Aluno> getAlunosOitavoAnoB(){
	
		Aluno aluno1 = new AlunoBuilder().addTurma(getTurmaOitavoAnoB()).addNomeAluno("Alailson dos Santos Freitas ").addNumero(1).builder();
		Aluno aluno2 = new AlunoBuilder().addTurma(getTurmaOitavoAnoB()).addNomeAluno("Alessandro dos Santos Araújo ").addNumero(2).builder();
		Aluno aluno3 = new AlunoBuilder().addTurma(getTurmaOitavoAnoB()).addNomeAluno("Ana Luiza Monteiro da Silva").addNumero(3).builder();
		Aluno aluno4 = new AlunoBuilder().addTurma(getTurmaOitavoAnoB()).addNomeAluno("Ana Luiza Rocha do Nascimento ").addNumero(4).builder();
		Aluno aluno5 = new AlunoBuilder().addTurma(getTurmaOitavoAnoB()).addNomeAluno("Antonio Bruno Rocha Duarte    ").addNumero(5).builder();
		Aluno aluno6 = new AlunoBuilder().addTurma(getTurmaOitavoAnoB()).addNomeAluno("Carlos André Rocha do Nascimento   ").addNumero(6).builder();
		Aluno aluno7 = new AlunoBuilder().addTurma(getTurmaOitavoAnoB()).addNomeAluno("Carlos Henrique Oliveira dos Santos ").addNumero(7).builder();
		Aluno aluno8 = new AlunoBuilder().addTurma(getTurmaOitavoAnoB()).addNomeAluno("Deyvilla Rayssa da Cruz Amorim ").addNumero(8).builder();
		Aluno aluno9 = new AlunoBuilder().addTurma(getTurmaOitavoAnoB()).addNomeAluno("Elayne Kauanny Palhano Rodrigues   ").addNumero(9).builder();
		Aluno aluno10 = new AlunoBuilder().addTurma(getTurmaOitavoAnoB()).addNomeAluno("Elane Muniz Ribeiro ").addNumero(10).builder();

		Aluno aluno11 = new AlunoBuilder().addTurma(getTurmaOitavoAnoB()).addNomeAluno("Elias Neto Lima Arruda").addNumero(11).builder();
		Aluno aluno12 = new AlunoBuilder().addTurma(getTurmaOitavoAnoB()).addNomeAluno("Fladson da Silva Barros").addNumero(12).builder();

		Aluno aluno13 = new AlunoBuilder().addTurma(getTurmaOitavoAnoB()).addNomeAluno("Francisca Pâmela Freitas Lopes").addNumero(13).builder();

		Aluno aluno14 = new AlunoBuilder().addTurma(getTurmaOitavoAnoB()).addNomeAluno("Gabriel Lourenço da Silva Assunção Morais  ").addNumero(14)
				.builder();
		Aluno aluno15 = new AlunoBuilder().addTurma(getTurmaOitavoAnoB()).addNomeAluno("Haroldo da Silva Nascimento Junior ").addNumero(15).builder();

		Aluno aluno16 = new AlunoBuilder().addTurma(getTurmaOitavoAnoB()).addNomeAluno("Heric Rian da Silva Ferreira ").addNumero(16).builder();
		Aluno aluno17 = new AlunoBuilder().addTurma(getTurmaOitavoAnoB()).addNomeAluno("Italo Gabriel Almeida de Carvalho      ").addNumero(17)
				.builder();
		Aluno aluno18 = new AlunoBuilder().addTurma(getTurmaOitavoAnoB()).addNomeAluno("José Matheus Viana Rodrigues   ").addNumero(18).builder();
		Aluno aluno19 = new AlunoBuilder().addTurma(getTurmaOitavoAnoB()).addNomeAluno("Júlio César de Sousa da Silva").addNumero(19).builder();
		Aluno aluno20 = new AlunoBuilder().addTurma(getTurmaOitavoAnoB()).addNomeAluno("Klécio Messias Lima dos Santos ").addNumero(20).builder();
		Aluno aluno21 = new AlunoBuilder().addTurma(getTurmaOitavoAnoB()).addNomeAluno("Larissa Carvalho dos Santos").addNumero(21).builder();
		Aluno aluno22 = new AlunoBuilder().addTurma(getTurmaOitavoAnoB()).addNomeAluno("Larissa Mikaelly Silva Santos").addNumero(22).builder();
		Aluno aluno23 = new AlunoBuilder().addTurma(getTurmaOitavoAnoB()).addNomeAluno("Layanne Cristina Bezerra da Silva").addNumero(23).builder();
		Aluno aluno24 = new AlunoBuilder().addTurma(getTurmaOitavoAnoB()).addNomeAluno("Lucas Michael Pereira Silva").addNumero(24).builder();
		Aluno aluno25 = new AlunoBuilder().addTurma(getTurmaOitavoAnoB()).addNomeAluno("Maria de Nazaré Braga Costa").addNumero(25).builder();
		Aluno aluno26 = new AlunoBuilder().addTurma(getTurmaOitavoAnoB()).addNomeAluno("Ondrezo Sousa Lopes").addNumero(26).builder();
		Aluno aluno27 = new AlunoBuilder().addTurma(getTurmaOitavoAnoB()).addNomeAluno("Pedro Lucas Gomes Silva da Silva").addNumero(27).builder();
		Aluno aluno28 = new AlunoBuilder().addTurma(getTurmaOitavoAnoB()).addNomeAluno("Rafael Cicero Vital Sousa ").addNumero(28).builder();
		Aluno aluno29 = new AlunoBuilder().addTurma(getTurmaOitavoAnoB()).addNomeAluno("Railson Sotelo dos Santos ").addNumero(29).builder();
		Aluno aluno30 = new AlunoBuilder().addTurma(getTurmaOitavoAnoB()).addNomeAluno("Romeu Silva Lopes").addNumero(30).builder();
		Aluno aluno31 = new AlunoBuilder().addTurma(getTurmaOitavoAnoB()).addNomeAluno("Ruydeglan Carvalho Vieira  ").addNumero(31).builder();
		Aluno aluno32 = new AlunoBuilder().addTurma(getTurmaOitavoAnoB()).addNomeAluno("Vitor Santos Carvalho ").addNumero(32).builder();
		Aluno aluno33 = new AlunoBuilder().addTurma(getTurmaOitavoAnoB()).addNomeAluno("Walysson Lucas Freitas da Conceição  ").addNumero(33)
				.builder();

		
		return Arrays.asList(aluno1, aluno2, aluno3, aluno4, aluno5, aluno6, aluno7, aluno8, aluno9,
				aluno10, aluno11, aluno12, aluno13, aluno14, aluno15, aluno16, aluno17, aluno18, aluno19, aluno20,
				aluno21, aluno22, aluno23, aluno24, aluno25, aluno26, aluno27, aluno28, aluno29, aluno30, aluno31,
				aluno32, aluno33);
		
	}
	/*
	 * Nono Ano A
	 */
	public static Turma getTurmaNonoAnoA() {
		Turma turma = new Turma();
		turma.setDescricaoTurma("Nono Ano A");
		turma.setTurno("VESPERTINO");
		return turma;

	}
	
	public static List<Aluno> getAlunosNonoAnoA(){
		
		Aluno aluno1 = new AlunoBuilder().addTurma(getTurmaNonoAnoA()).addNomeAluno("Alexandre Moura Feitosa ").addNumero(1).builder();
		Aluno aluno2 = new AlunoBuilder().addTurma(getTurmaNonoAnoA()).addNomeAluno("Ana Paula Moura da Silva").addNumero(2).builder();
		Aluno aluno3 = new AlunoBuilder().addTurma(getTurmaNonoAnoA()).addNomeAluno("Antonio Joel Silva Costa").addNumero(3).builder();
		Aluno aluno4 = new AlunoBuilder().addTurma(getTurmaNonoAnoA()).addNomeAluno("Brenda Lohanny Rocha Morais    ").addNumero(4).builder();
		Aluno aluno5 = new AlunoBuilder().addTurma(getTurmaNonoAnoA()).addNomeAluno("Bruna Cristina Silva Costa  ").addNumero(5).builder();
		Aluno aluno6 = new AlunoBuilder().addTurma(getTurmaNonoAnoA()).addNomeAluno("Bruno Expedito Ferreira da Conceição ").addNumero(6).builder();
		Aluno aluno7 = new AlunoBuilder().addTurma(getTurmaNonoAnoA()).addNomeAluno("Bruno Henrique Pereira Moreira ").addNumero(7).builder();
		Aluno aluno8 = new AlunoBuilder().addTurma(getTurmaNonoAnoA()).addNomeAluno("Danielle Carvalho Santos ").addNumero(8).builder();
		Aluno aluno9 = new AlunoBuilder().addTurma(getTurmaNonoAnoA()).addNomeAluno("Elayne Kauanny Palhano Rodrigues   ").addNumero(9).builder();
		Aluno aluno10 = new AlunoBuilder().addTurma(getTurmaNonoAnoA()).addNomeAluno("Fernanda Mikaelly dos Santos Garrida ").addNumero(10)
				.builder();

		Aluno aluno11 = new AlunoBuilder().addTurma(getTurmaNonoAnoA()).addNomeAluno("Gabriel da Conceição de Sousa").addNumero(11).builder();
		Aluno aluno12 = new AlunoBuilder().addTurma(getTurmaNonoAnoA()).addNomeAluno("Gustavo Alves de Souza ").addNumero(12).builder();

		Aluno aluno13 = new AlunoBuilder().addTurma(getTurmaNonoAnoA()).addNomeAluno("Janaínna da Silva Altíno").addNumero(13).builder();

		Aluno aluno14 = new AlunoBuilder().addTurma(getTurmaNonoAnoA()).addNomeAluno("João Victor da Silva Sobral ").addNumero(14).builder();
		Aluno aluno15 = new AlunoBuilder().addTurma(getTurmaNonoAnoA()).addNomeAluno("João Víctor Vieira Silva   ").addNumero(15).builder();

		Aluno aluno16 = new AlunoBuilder().addTurma(getTurmaNonoAnoA()).addNomeAluno("Josélya Borges Barros").addNumero(16).builder();
		
		Aluno aluno17 = new AlunoBuilder().addTurma(getTurmaNonoAnoA()).addNomeAluno("Maria Eduarda Sousa Costa   ").addNumero(17).builder();
		Aluno aluno18 = new AlunoBuilder().addTurma(getTurmaNonoAnoA()).addNomeAluno("Michele Reis Cruz ").addNumero(18).builder();
		Aluno aluno19 = new AlunoBuilder().addTurma(getTurmaNonoAnoA()).addNomeAluno("Nathyele Bulhão Soares    ").addNumero(19).builder();
		Aluno aluno20 = new AlunoBuilder().addTurma(getTurmaNonoAnoA()).addNomeAluno("Nayeli da Silva do Nascimento  ").addNumero(20).builder();
		Aluno aluno21 = new AlunoBuilder().addTurma(getTurmaNonoAnoA()).addNomeAluno("Pablo Kenedy Santos Oliveira ").addNumero(21).builder();
		Aluno aluno22 = new AlunoBuilder().addTurma(getTurmaNonoAnoA()).addNomeAluno("Paulo Ricardo Oliveira dos Santos   ").addNumero(22).builder();
		Aluno aluno23 = new AlunoBuilder().addTurma(getTurmaNonoAnoA()).addNomeAluno("Ray Sotelo dos Santos ").addNumero(23).builder();
		Aluno aluno24 = new AlunoBuilder().addTurma(getTurmaNonoAnoA()).addNomeAluno("Thiago da Silva Medeiros  ").addNumero(24).builder();
		Aluno aluno25 = new AlunoBuilder().addTurma(getTurmaNonoAnoA()).addNomeAluno("Wellen Cristina da Silva Lago").addNumero(25).builder();

		
		return Arrays.asList(aluno1, aluno2, aluno3, aluno4, aluno5, aluno6, aluno7, aluno8, aluno9,
				aluno10, aluno11, aluno12, aluno13, aluno14, aluno15, aluno16, aluno17, aluno18, aluno19, aluno20,
				aluno21, aluno22, aluno23, aluno24, aluno25);

	}
	/*
	 * Nono Ano B
	 */
	public static Turma getTurmaNonoAnoB() {
		Turma turma = new Turma();
		turma.setDescricaoTurma("Nono Ano B");
		turma.setTurno("VESPERTINO"); 
		
		return turma;
	}
		
	public static List<Aluno> getAlunosNonoAno(){
	
		return Arrays.asList(getAluno("Amanda do Nascimento Serras  ", 1,getTurmaNonoAnoB())
						,getAluno("Brenno Abreu de Sousa", 2,getTurmaNonoAnoB())
						,getAluno("Camilla Emily Duarte Sousa", 3,getTurmaNonoAnoB())
						,getAluno("Carlos da Conceição Silva", 4,getTurmaNonoAnoB())
						,getAluno("Gustavo Silveira de Souza", 5,getTurmaNonoAnoB())
						,getAluno("José Guilherme Conceição da Cruz ", 6,getTurmaNonoAnoB())
						,getAluno("João Lucas da Silva de Sousa  ", 7,getTurmaNonoAnoB())
						,getAluno("Joselia Pereira Silva   ", 8,getTurmaNonoAnoB())
						,getAluno("Kevellyn Cristina Carvalho Cantanhêde", 9,getTurmaNonoAnoB())
						,getAluno("Leonel da Silva Viana", 10,getTurmaNonoAnoB())
						,getAluno("Maria Eduarda Oliveira Carvalho", 11,getTurmaNonoAnoB())
						,getAluno("Maria Fernanda Alves Firmo", 12,getTurmaNonoAnoB())
						
						,getAluno("Maria Letícia Conceição da Cruz ", 13,getTurmaNonoAnoB())
						,getAluno("Maria Stheffany Araújo Bezerra   ", 14,getTurmaNonoAnoB())
						,getAluno("Mariana Leticia dos Santos Almeida   ", 15,getTurmaNonoAnoB())
						,getAluno("Paulo Vinícius Carvalho Silva", 16,getTurmaNonoAnoB())
						,getAluno("Pedro Ytalo Magalhães da Luz", 17,getTurmaNonoAnoB())
						,getAluno("Rafaela Costa da Cruz", 18,getTurmaNonoAnoB())
						,getAluno("Raylana de Sousa da Silva", 19,getTurmaNonoAnoB())
						,getAluno("Ricardo Salazar Alves Sousa", 20,getTurmaNonoAnoB())
						,getAluno("Ricardo Vinicius Matias de Sousa", 21,getTurmaNonoAnoB())
						,getAluno("Vitor Gabriel dos Santos Sampaio", 22,getTurmaNonoAnoB())
						,getAluno("Vitoria Marques da Silva", 23,getTurmaNonoAnoB())
						,getAluno("Zenilza Teixeira da Silva", 24,getTurmaNonoAnoB())
						);
		
	}
	
	private static Aluno getAluno(String nome, Integer numero, Turma turma) {
		return new AlunoBuilder().addTurma(turma).addNomeAluno(nome).addNumero(numero).builder();
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
