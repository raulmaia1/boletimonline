package br.com.boletimonline.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import br.com.boletimonline.builder.BimestreBuilder;
import br.com.boletimonline.model.usuario.Professor;

@Entity
@Table(name = "disciplina")
public class Disciplina {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	@Column(nullable = false)
	private String nomeMateria = "";
	@OneToOne(targetEntity = Professor.class,cascade = CascadeType.PERSIST)
	private Professor professor;
	@OneToOne(targetEntity = Bimestre.class, cascade = CascadeType.PERSIST, optional = true)
	private Bimestre primeiro = new BimestreBuilder().addNumeroBimestre(1).build()
			,segundo = new BimestreBuilder().addNumeroBimestre(2).build()
			,terceiro = new BimestreBuilder().addNumeroBimestre(3).build()
			,quarto = new BimestreBuilder().addNumeroBimestre(4).build();
	
	public void setProfessor(Professor professor) {
		this.professor = professor;
	}
	
	public Professor getProfessor() {
		return professor;
	}
	
	public Disciplina setNomeMateria(String nomeMateria) {
		this.nomeMateria = nomeMateria;
		return this;
	}
	
	public String getNomeMateria() {
		return nomeMateria;
	}
	
	public Bimestre getPrimeiro() {
		return primeiro;
	}
	
	public Bimestre getSegundo() {
		return segundo;
	}
	
	public Bimestre getTerceiro() {
		return terceiro;
	}
	
	public Bimestre getQuarto() {
		return quarto;
	}
	
	public void setPrimeiro(Bimestre primeiro) {
		this.primeiro = primeiro;
	}
	
	public void setSegundo(Bimestre segundo) {
		this.segundo = segundo;
	}
	
	public void setTerceiro(Bimestre terceiro) {
		this.terceiro = terceiro;
	}
	
	public void setQuarto(Bimestre quarto) {
		this.quarto = quarto;
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
