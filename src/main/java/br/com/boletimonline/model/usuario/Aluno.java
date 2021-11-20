package br.com.boletimonline.model.usuario;

import br.com.boletimonline.model.Escola;
import br.com.boletimonline.model.Turma;

public class Aluno extends Usuario{
		
	
	private Escola escola;
	
	private String dataNasc ="";
	
	private Integer numero = 0;
	
	private Turma turma;
	
	@Override
	public String toString() {
		return super.getNome();
	}
	
	/// Getters and Setters
	
	public void setTurma(Turma turma) {
		this.turma = turma;
	}
	
	public Turma getTurma() {
		return turma;
	}
			
	public void setEscola(Escola escola) {
		this.escola = escola;
	}
	
	public void setDataNasc(String dataNasc) {
		this.dataNasc = dataNasc;
	}
	
	public String getDataNasc() {
		return dataNasc;
	}
		
		
	
	
	public void setNumero(Integer numero) {
		this.numero = numero;
	}
			
	public Integer getNumero() {
		return numero;
	}
	
	
	
	public Escola getEscola() {
		return escola;
	}
}
