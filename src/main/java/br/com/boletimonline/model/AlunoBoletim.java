package br.com.boletimonline.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "aluno_boletim")
public class AlunoBoletim {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	@OneToOne( targetEntity = Aluno.class, cascade = CascadeType.ALL, optional = true)
	private Aluno aluno;
	
	@OneToOne(targetEntity = Turma.class, cascade = CascadeType.ALL, optional = true)
	private Turma turma;
	@OneToOne(targetEntity = Disciplina.class, cascade = CascadeType.ALL, optional = true)
	private Disciplina disciplina;
	@OneToOne(targetEntity = Bimestre.class, cascade = CascadeType.ALL, optional = true)
	private Bimestre bimestreSelecionado;

	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}

	public void setTurma(Turma turma) {
		this.turma = turma;
	}
	
	public Aluno getAluno() {
		return aluno;
	}
	
	public Turma getTurma() {
		return turma;
	}
	
	public Bimestre getBimestreSelecionado() {
		return bimestreSelecionado;
	}
	
	public Disciplina getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(Disciplina disciplina) {
		this.disciplina = disciplina;
	}

	public void setBimestreSelecionado(Bimestre bimestreSelecionado) {
		this.bimestreSelecionado = bimestreSelecionado;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((aluno == null) ? 0 : aluno.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
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
		AlunoBoletim other = (AlunoBoletim) obj;
		if (aluno == null) {
			if (other.aluno != null)
				return false;
		} else if (!aluno.equals(other.aluno))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	
	
}
