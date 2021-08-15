package br.com.boletimonline.view;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean
@ViewScoped
public class ConteudoBean {

//	private Turma turma;
//	private List<ConteudoProgramatico> conteudos = new ArrayList<>();
//
//	@PostConstruct
//	private void init() {
//		this.conteudos = ((Professor) FacesContext.getCurrentInstance().getExternalContext().getSessionMap().get("professor")).getConteudoProgramatico();	
//	}
//	
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
