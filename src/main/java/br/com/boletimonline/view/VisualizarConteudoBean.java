package br.com.boletimonline.view;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

import br.com.boletimonline.dao.jdbc.ConteudoProgramaticoDao;
import br.com.boletimonline.model.ConteudoProgramatico;
import br.com.boletimonline.model.Turma;
import br.com.boletimonline.model.usuario.Professor;

@ManagedBean
@ViewScoped
public class VisualizarConteudoBean {

	private Turma turmaSelecionada;
	private List<ConteudoProgramatico> conteudos = new ArrayList<>();

	@PostConstruct
	private void init() {
		Professor professor (Professor) FacesContext.getCurrentInstance().getExternalContext().getSessionMap().get("usuario");
		new ConteudoProgramaticoDao().pesquisaPorProfessor(professor);
		this.conteudos = .getConteudoProgramatico();	
	}
	
//	public Turma getTurma() {
//		return turma;
//	}
//		
//	public List<ConteudoProgramatico> getConteudos() {
//		return conteudos;
//	}
//	
//	public String getHorasAulas() {
//		Integer horas = 0;
//		for (ConteudoProgramatico cP : conteudos) {
//			horas = horas + Integer.valueOf(cP.getQuantAulas());
//		} 
//		return horas.toString();
//	}
}
