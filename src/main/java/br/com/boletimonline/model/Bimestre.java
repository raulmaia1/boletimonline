package br.com.boletimonline.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "bimestre")
public class Bimestre {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	@Column(nullable = false)
	private Integer numeroBimestre;
	
	@OneToOne(targetEntity = Nota.class, cascade = CascadeType.ALL, optional = true)
	private Nota notaAtividade, notaProva;
	private String quantFaltas;
	
	@Column
	private Aluno aluno;
	
	public Integer getNumeroBimestre() {
		return numeroBimestre;
	}
	
	public Nota getNotaAtividade() {
		return notaAtividade;
	}
	
	public Nota getNotaProva() {
		return notaProva;
	}
	
	public String getQuantFaltas() {
		return quantFaltas;
	}
	
	public void setNotaAtividade(Nota notaAtividade) {
		this.notaAtividade = notaAtividade;
	}
	
	public void setNotaProva(Nota notaProva) {
		this.notaProva = notaProva;
	}
	
	public void setQuantFaltas(String quantFaltas) {
		this.quantFaltas = quantFaltas;
	}
	
	public void setNumeroBimestre(Integer numeroBimestre) {
		this.numeroBimestre = numeroBimestre;
	}
	
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}
	
	public Aluno getAluno() {
		return aluno;
	}
}
