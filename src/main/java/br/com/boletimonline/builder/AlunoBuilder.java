package br.com.boletimonline.builder;

import br.com.boletimonline.listasimulada.ListaSimuladaTurmas;
import br.com.boletimonline.model.Escola;
import br.com.boletimonline.model.Turma;
import br.com.boletimonline.model.usuario.Aluno;

public class AlunoBuilder {
	
	private Aluno aluno = new Aluno();
//	public static Escola escola = ListaSimuladaTurmas.escolaJorge;
	
	public AlunoBuilder addNomeAluno(String nomeAluno) {
		aluno.setNome(nomeAluno);
		return this;
	}
	
	public AlunoBuilder addNumero(Integer mumeroAluno) {
		aluno.setNumero(mumeroAluno);
		return this;
	}
	
	public Aluno builder(){
		return aluno;
	}

	public AlunoBuilder addTurma(Turma turma) {
		aluno.setTurma(turma);
		return this;
	}
	
}
