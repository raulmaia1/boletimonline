package br.com.boletimonline.view;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

import br.com.boletimonline.model.Disciplina;
import br.com.boletimonline.model.usuario.Professor;

@ManagedBean
@ViewScoped
public class DisciplinaBean implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private Professor professor;

	@PostConstruct
	private void init() {
		this.professor = (Professor) FacesContext.getCurrentInstance().getExternalContext().getSessionMap().get("professor");
	}
	
	public Professor getProfessor() {
		return professor;
	}
	
	public void abriBimestre(Disciplina disciplina) {
		FacesContext.getCurrentInstance().getExternalContext().getSessionMap().put("disciplinaSelecionada", disciplina);
	}
	
}
