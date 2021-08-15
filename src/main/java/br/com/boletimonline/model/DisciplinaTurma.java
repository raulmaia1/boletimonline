package br.com.boletimonline.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import br.com.boletimonline.model.usuario.Professor;

@Entity
@Table(name = "disciplina_turma")
public class DisciplinaTurma {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
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
