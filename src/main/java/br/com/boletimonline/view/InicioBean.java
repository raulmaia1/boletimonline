package br.com.boletimonline.view;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

import br.com.boletimonline.dao.jdbc.DisciplinaTurmaProfessorDao;
import br.com.boletimonline.model.DisciplinaTurma;
import br.com.boletimonline.model.usuario.Professor;

@ManagedBean
@ViewScoped
public class InicioBean implements Serializable {

	private static final long serialVersionUID = 1L;
	private Professor professor;
	private List<DisciplinaTurma> disciplinasTurmas = new ArrayList<>();
	
	@PostConstruct
	private void init() {
		this.professor = (Professor) FacesContext.getCurrentInstance().getExternalContext().getSessionMap().get("usuario");	

		
		this.disciplinasTurmas = new DisciplinaTurmaProfessorDao().listarDisciplinaPorProfessor(professor);
		
		FacesContext.getCurrentInstance().getExternalContext().getSessionMap().put("disciplinasTurmas", this.disciplinasTurmas);	
		
	}

	
	public Professor getProfessor() {
		return professor;
	}
	
	public List<DisciplinaTurma> getDisciplinasTurmas() {
		return disciplinasTurmas;
	}
}
