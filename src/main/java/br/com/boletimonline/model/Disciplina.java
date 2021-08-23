package br.com.boletimonline.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "disciplina")
public class Disciplina {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	@Column(nullable = false)
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

	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	
}
