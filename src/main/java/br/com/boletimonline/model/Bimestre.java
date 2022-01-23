package br.com.boletimonline.model;

import br.com.boletimonline.model.usuario.Aluno;
import br.com.boletimonline.model.usuario.Professor;

public class Bimestre {

	private Integer id, numeroBimestre,quantFaltas = 0;
	
	private Double notaAtividade = 0.0, notaProva = 0.0;
	
	private Aluno aluno;

	private Professor professor;

	private Turma turma;

	private Disciplina disciplina;

	private Escola escola;
	
	public Escola getEscola() {
		return escola;
	} 
	
	public Disciplina getDisciplina() {
		return disciplina;
	}
	
	public Integer getNumeroBimestre() {
		return numeroBimestre;
	}
	
	public Double getNotaAtividade() {
		return notaAtividade;
	}
	
	public Double getNotaProva() {
		return notaProva;
	}
		
	public Integer getQuantFaltas() {
		return quantFaltas;
	}
	
	public void setNotaAtividade(Double notaAtividade) {
		this.notaAtividade = notaAtividade;
	}
	
	public void setNotaProva(Double notaProva) {
		this.notaProva = notaProva;
	}
	
	public void setQuantFaltas(Integer quantFaltas) {
		this.quantFaltas = quantFaltas;
	}
	
	public void setNumeroBimestre(Integer numeroBimestre) {
		this.numeroBimestre = numeroBimestre;
	}
	
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}
	
	public Aluno getAluno() {
		return aluno;
	}

	public void setProfessor(Professor professor) {
		this.professor = professor;
	}
	
	public Professor getProfessor() {
		return professor;
	}

	public void setTurma(Turma turma) {
		this.turma = turma;
	}
	
	public Turma getTurma() {
		return turma;
	}

	public void setDisciplina(Disciplina disciplina) {
		this.disciplina = disciplina;
	}

	public void setEscola(Escola escola) {
		this.escola = escola;
	}
	
}
