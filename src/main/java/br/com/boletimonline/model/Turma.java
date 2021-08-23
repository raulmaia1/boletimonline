package br.com.boletimonline.model;

public class Turma {
	
	private Long id;
	
	private String descricaoTurma ="",turno="",ano ="2021";	
	
	private Escola escola;

	public void setDescricaoTurma(String descricaoTurma) {
		this.descricaoTurma = descricaoTurma;
	}
	
	public String getAno() {
		return ano;
	}
	
	public void setAno(String ano) {
		this.ano = ano;
	}
	
	public String getDescricaoTurma() {
		return descricaoTurma;
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

