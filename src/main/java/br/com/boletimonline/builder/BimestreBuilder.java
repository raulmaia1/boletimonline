package br.com.boletimonline.builder;

import br.com.boletimonline.model.Bimestre;

public class BimestreBuilder {
	private Bimestre bimestre = new Bimestre();
		
	public BimestreBuilder addNumeroBimestre(Integer numero){
		bimestre.setNumeroBimestre(numero);
		return this;
	}
	
	public Bimestre build() {
		return bimestre;
	}
}
