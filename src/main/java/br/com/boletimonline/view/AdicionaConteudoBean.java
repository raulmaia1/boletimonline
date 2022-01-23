package br.com.boletimonline.view;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

import br.com.boletimonline.dao.jdbc.ConteudoProgramaticoDao;
import br.com.boletimonline.model.ConteudoProgramatico;
import br.com.boletimonline.model.Disciplina;
import br.com.boletimonline.model.DisciplinaTurma;
import br.com.boletimonline.model.Turma;
import br.com.boletimonline.model.usuario.Professor;

@ManagedBean
@ViewScoped
public class AdicionaConteudoBean implements Serializable {

	private static final long serialVersionUID = 1L;
	private Professor professor;
	private ConteudoProgramatico conteudo = new ConteudoProgramatico();
	
	private Disciplina disciplinaSelecionada;
	private Turma turmaSelecionada;
	
	
	private List<DisciplinaTurma> disciplinasTurmas = new ArrayList<DisciplinaTurma>();

	private List<Turma> turmas = new ArrayList<>();
	private List<Disciplina> disciplinas = new ArrayList<>();
	
	@PostConstruct
	private void init() {
		this.professor = (Professor) FacesContext.getCurrentInstance().getExternalContext().getSessionMap().get("usuario");	
		this.disciplinasTurmas = (List<DisciplinaTurma>) FacesContext.getCurrentInstance().getExternalContext().getSessionMap().get("disciplinasTurmas");

		disciplinasTurmas.forEach(dt ->{
			this.turmas.add(dt.getTurma());			
			
			dt.getDisciplinas().forEach(disciplina ->{
				
				if(!disciplinas.contains(disciplina)) {
					disciplinas.add(disciplina);
				}
				
			});
			
		});
			
	}
	
	public void salvar() {
		conteudo.setDisciplina(this.disciplinaSelecionada);
		conteudo.setTurma(this.turmaSelecionada);
		conteudo.setProfessor(this.professor);
		
		new ConteudoProgramaticoDao().adiciona(this.conteudo);

		this.conteudo = new ConteudoProgramatico();
		FacesContext.getCurrentInstance().addMessage("msgCP",new FacesMessage(FacesMessage.SEVERITY_INFO, "Diário Online", "Salvo com sucesso"));

	}
	
	public ConteudoProgramatico getConteudo() {
		return conteudo;
	}
	
	public Disciplina getDisciplinaSelecionada() {
		return disciplinaSelecionada;
	}
		
	public void setDisciplinaSelecionada(Disciplina disciplinaSelecionada) {
		this.disciplinaSelecionada = disciplinaSelecionada;
	}
	
	public Turma getTurmaSelecionada() {
		return turmaSelecionada;
	}
	
	public void setTurmaSelecionada(Turma turmaSelecionada) {
		this.turmaSelecionada = turmaSelecionada;
	}
	
	public List<Disciplina> getDisciplinas() {
		return disciplinas;
	}
	
	public List<Turma> getTurmas() {
		return turmas;
	}
}
