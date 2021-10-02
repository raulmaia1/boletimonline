package br.com.boletimonline.view;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;

import br.com.boletimonline.dao.jdbc.DisciplinaTurmaProfessorDao;
import br.com.boletimonline.dao.jdbc.TurmaDao;
import br.com.boletimonline.model.DisciplinaTurma;
import br.com.boletimonline.model.Turma;
import br.com.boletimonline.model.usuario.Professor;

@ManagedBean
@RequestScoped
public class InicioBean implements Serializable {

	private static final long serialVersionUID = 1L;
	private Professor professor;
	private List<Turma> turmas = new ArrayList<>();
	private List<DisciplinaTurma> disciplinas = new ArrayList<>();
	
	@PostConstruct
	private void init() {
		this.professor = (Professor) FacesContext.getCurrentInstance().getExternalContext().getSessionMap().get("usuario");	
		FacesContext.getCurrentInstance().getExternalContext().getSessionMap().put("professor",professor);	
	
		this.turmas = new TurmaDao().listaTurmasPorProfessor(professor);
		
		this.disciplinas = new DisciplinaTurmaProfessorDao().listaDisciplinaPorProfessor(professor);
		
	}

	public List<Turma> getTurmas() {
		return turmas;
	}
	
	public Professor getProfessor() {
		return professor;
	}
	
	public List<DisciplinaTurma> getDisciplinas() {
		return disciplinas;
	}	
}
