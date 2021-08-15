package br.com.boletimonline.builder;

import br.com.boletimonline.model.Aluno;
import br.com.boletimonline.model.Escola;

public class AlunoBuilder {
	
	private Aluno aluno = new Aluno();
	private static Escola escola = new Escola().setNomeEscola("U. E. F. PREFEITO JORGE JOSE DE MENDONÇA");
	
	public AlunoBuilder addNomeAluno(String nomeAluno) {
		aluno.setNomeAluno(nomeAluno);
		return this;
	}
	
	public AlunoBuilder addNumero(Integer mumeroAluno) {
		aluno.setNumero(mumeroAluno);
		return this;
	}
	
	public Aluno builder(){
		aluno.setEscola(escola);
		return aluno;
	}
	
}
