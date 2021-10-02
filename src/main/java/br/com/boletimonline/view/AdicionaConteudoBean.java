package br.com.boletimonline.view;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

import br.com.boletimonline.model.ConteudoProgramatico;
import br.com.boletimonline.model.Disciplina;
import br.com.boletimonline.model.Turma;
import br.com.boletimonline.model.usuario.Professor;

@ManagedBean
@ViewScoped
public class AdicionaConteudoBean implements Serializable {

	private static final long serialVersionUID = 1L;
	private Professor professor;
	private List<Disciplina> disciplinas;
	private Disciplina disciplina;
	private Turma turma;
	
	private ConteudoProgramatico conteudo = new ConteudoProgramatico();
	
	@PostConstruct
	private void init() {
		this.professor = (Professor) FacesContext.getCurrentInstance().getExternalContext().getSessionMap().get("professor");	
		this.disciplinas = professor.getDisciplinas();

	}
	
	public void salvar() {
		conteudo.setDisciplina(this.disciplina);
		conteudo.setTurma(this.turma);
		
//		professor.adicionarConteudo(this.conteudo);
		FacesContext.getCurrentInstance().getExternalContext().getSessionMap().put("professor",professor);	

		this.conteudo = new ConteudoProgramatico();
		FacesContext.getCurrentInstance().addMessage("msgCP",new FacesMessage(FacesMessage.SEVERITY_INFO, "Diário Online", "Salvo com sucesso"));

		
	}
	
	public ConteudoProgramatico getConteudo() {
		return conteudo;
	}
	
	public Turma getTurma() {
		return turma;
	}
	
	public void setTurma(Turma turma) {
		this.turma = turma;
	}
	
	public Disciplina getDisciplina() {
		return disciplina;
	}
	
//	public List<Turma> getTurmas() {
//		return professor.getTurmas();
//	}
	
	public void setDisciplina(Disciplina disciplina) {
		this.disciplina = disciplina;
	}
	
	
	public List<Disciplina> getDisciplinas() {
		return disciplinas;
	}
	
	
}
