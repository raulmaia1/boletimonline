package br.com.boletimonline.builder;

import br.com.boletimonline.model.Escola;

public class EscolaBuilder {
	private Escola escola = new Escola();
	
	public EscolaBuilder addNomeEscola(String nomeEscola) {
		escola.setNomeEscola(nomeEscola);
		return this;
	}
	
	public EscolaBuilder addInep(String inep) {
		escola.setInep(inep);
		return this;
	}
	
	public EscolaBuilder addEndereco(String endereco) {
		escola.setEndereco(endereco);
		return this;
	}
	
	public Escola build() {
		return escola;
	}

	public EscolaBuilder addID(int id) {
		
		escola.setId(id);
		
		return this;
	}
}
