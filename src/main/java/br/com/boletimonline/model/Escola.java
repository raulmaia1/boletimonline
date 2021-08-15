package br.com.boletimonline.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "escola")
public class Escola {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	@Column(nullable = true)
	private String nomeEscola;
	
	public Escola setNomeEscola(String nomeEscola) {
		this.nomeEscola = nomeEscola;
		return this; 
	}
	
	public String getNomeEscola() {
		return nomeEscola;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public Long getId() {
		return id;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((nomeEscola == null) ? 0 : nomeEscola.hashCode());
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
		Escola other = (Escola) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (nomeEscola == null) {
			if (other.nomeEscola != null)
				return false;
		} else if (!nomeEscola.equals(other.nomeEscola))
			return false;
		return true;
	}
	
	
}
