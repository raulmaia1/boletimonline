package br.com.boletimonline.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "turma")
public class Turma {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	@Column(nullable = false)
	private String descricaoTurma ="",turno="",ano ="2021";	
	
	@OneToMany(targetEntity = Aluno.class,cascade=CascadeType.ALL)
	private List<Aluno> alunos = new ArrayList<>();
	
	public void setDescricaoTurma(String descricaoTurma) {
		this.descricaoTurma = descricaoTurma;
	}
			
	public String getDescricaoTurma() {
		return descricaoTurma;
	}
	
	public void adicionaAluno(List<Aluno> alunos) {
		this.alunos.addAll(alunos);
	}
	
	public List<Aluno> getAlunos() {
		return alunos;
	}

	public String getQuantAlunos() {
		return String.valueOf(alunos.size());
	}
	
	@Override
	public String toString() {
		return descricaoTurma;
	}

	public void setTurno(String turno) {
		this.turno = turno;	
	}
	
	public String getTurno() {
		return turno;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((descricaoTurma == null) ? 0 : descricaoTurma.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((turno == null) ? 0 : turno.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Turma other = (Turma) obj;
		if (descricaoTurma == null) {
			if (other.descricaoTurma != null)
				return false;
		} else if (!descricaoTurma.equals(other.descricaoTurma))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (turno == null) {
			if (other.turno != null)
				return false;
		} else if (!turno.equals(other.turno))
			return false;
		return true;
	}
	
	
}

