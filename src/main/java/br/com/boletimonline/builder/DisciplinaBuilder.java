package br.com.boletimonline.builder;

import br.com.boletimonline.model.Disciplina;

public class DisciplinaBuilder {

	private Disciplina disciplina = new Disciplina();

	public DisciplinaBuilder addNomeMateria(String nome) {
		disciplina.setNomeMateria(nome);
		return this;
	}
	
	public Disciplina builder(){
		
		return disciplina;
	}
	
	
	
	
}
