package br.com.boletimonline.model.altera.relatorio;

import java.util.ArrayList;
import java.util.List;

import br.com.boletimonline.model.ConteudoProgramatico;
import br.com.boletimonline.model.usuario.Professor;

public class ConteudoProgramaticoRelatorio {
	
	private Professor professor;
	
	private List<ConteudoProgramatico> conteudos = new ArrayList<>();
	
	public void setConteudos(List<ConteudoProgramatico> conteudos) {
		this.conteudos = conteudos;
	}
	
	public List<ConteudoProgramatico> getConteudos() {
		return conteudos;
	}
	
	public void setProfessor(Professor professor) {
		this.professor = professor;
	}
	
	public Professor getProfessor() {
		return professor;
	}
}	
