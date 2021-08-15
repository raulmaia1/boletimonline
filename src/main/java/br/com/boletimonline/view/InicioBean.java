package br.com.boletimonline.view;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;

import br.com.boletimonline.model.Turma;
import br.com.boletimonline.model.usuario.Professor;

@ManagedBean
@RequestScoped
public class InicioBean implements Serializable {

	private static final long serialVersionUID = 1L;
	private Professor professor;

	@PostConstruct
	private void init() {
		this.professor = (Professor) FacesContext.getCurrentInstance().getExternalContext().getSessionMap().get("usuario");
	
		FacesContext.getCurrentInstance().getExternalContext().getSessionMap().put("professor",professor);	

	}

	public List<Turma> getTurmas() {		
		return professor.getTurmas();
	}

	public Professor getProfessor() {
		return professor;
	}
	
}
