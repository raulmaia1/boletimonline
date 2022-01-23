package br.com.boletimonline.model;

import java.util.ArrayList;
import java.util.List;

import br.com.boletimonline.model.usuario.Professor;


public class DisciplinaTurma {
	
	@Override
	public String toString() {
		return "DisciplinaTurma [id=" + id + ", turma=" + turma + ", disciplinas=" + disciplinas + ", professor="
				+ professor + "]";
	}

	private Long id;
	
	private Turma turma;
	
	private List<Disciplina> disciplinas = new ArrayList<>();
	
	private Professor professor;
	
	public void setTurma(Turma turma) {
		this.turma = turma;
	}
	
	public Turma getTurma() {
		return turma;
	}
	
	public void addDisciplina(Disciplina disciplina) {
		disciplinas.add(disciplina);
	}
	
	public List<Disciplina> getDisciplinas() {
		return disciplinas;
	}
	
	
	public void setProfessor(Professor professor) {
		this.professor = professor;
	}
	
	public Professor getProfessor() {
		return professor;
	}
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}	
}
