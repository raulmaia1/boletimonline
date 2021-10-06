package br.com.boletimonline.model;

public class Disciplina {

	private Integer id;
	private String nomeMateria = "";
	
	public Disciplina setNomeMateria(String nomeMateria) {
		this.nomeMateria = nomeMateria;
		return this;
	}
	
	public String getNomeMateria() {
		return nomeMateria;
	}
	
	@Override
	public String toString() {
		return nomeMateria;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nomeMateria == null) ? 0 : nomeMateria.hashCode());
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
		Disciplina other = (Disciplina) obj;
		if (nomeMateria == null) {
			if (other.nomeMateria != null)
				return false;
		} else if (!nomeMateria.equals(other.nomeMateria))
			return false;
		return true;
	}

	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	
}
