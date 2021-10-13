package br.com.boletimonline.view;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

import br.com.boletimonline.model.DisciplinaTurma;
import br.com.boletimonline.model.usuario.Professor;

@ManagedBean
@ViewScoped
public class DisciplinaBean implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private Professor professor;
	private List<DisciplinaTurma> disciplinasTurmas;

	@PostConstruct
	private void init() {
		this.professor = (Professor) FacesContext.getCurrentInstance().getExternalContext().getSessionMap().get("usuario");
		this.disciplinasTurmas = (List<DisciplinaTurma>) FacesContext.getCurrentInstance().getExternalContext().getSessionMap().get("disciplinasTurmas");
	}
	
	public Professor getProfessor() {
		return professor;
	}
	
	public List<DisciplinaTurma> getDisciplinasTurmas() {
		return disciplinasTurmas;
	}
		
	public void abriBimestre(DisciplinaTurma disciplinaTurma) {
		FacesContext.getCurrentInstance().getExternalContext().getSessionMap().put("disciplinaTurmaSelecionada", disciplinaTurma);
	}
	
}
