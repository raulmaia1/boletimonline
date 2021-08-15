package br.com.boletimonline.view;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

import br.com.boletimonline.model.AlunoBoletim;
import br.com.boletimonline.model.Bimestre;
import br.com.boletimonline.model.Disciplina;
import br.com.boletimonline.model.Turma;
import br.com.boletimonline.model.usuario.Professor;

@ManagedBean
@ViewScoped
public class AlunoBean implements Serializable {

	private static final long serialVersionUID = 1L;
	private Turma turma;
	private Disciplina disciplina;
	private Professor professor;
	private Bimestre bimestreSelecionado;
	private Disciplina disciplinaSelecionada;
	
	@PostConstruct
	private void init() {
		this.disciplina = (Disciplina) FacesContext.getCurrentInstance().getExternalContext().getSessionMap().get("disciplinaSelecionada");
		this.turma = (Turma) FacesContext.getCurrentInstance().getExternalContext().getSessionMap().get("turmaSelecionada");
		this.professor = (Professor) FacesContext.getCurrentInstance().getExternalContext().getSessionMap().get("professor");
		this.bimestreSelecionado = (Bimestre) FacesContext.getCurrentInstance().getExternalContext().getSessionMap().get("bimestreSelecionado");
		this.disciplinaSelecionada = (Disciplina) FacesContext.getCurrentInstance().getExternalContext().getSessionMap().get("disciplinaSelecionada");
	}
	
	public Turma getTurma() {
		return turma;
	}
	
	public void adicionaNota() {
				
		List<AlunoBoletim> lista = new ArrayList<>();
		this.turma.getAlunos().forEach((aluno) -> {
			AlunoBoletim alunoBoletim = new AlunoBoletim();
		
			alunoBoletim.setAluno(aluno);
			alunoBoletim.setTurma(turma);
						
			alunoBoletim.setDisciplina(this.disciplinaSelecionada);
			
			alunoBoletim.setBimestreSelecionado(bimestreSelecionado);
			
			lista.add(alunoBoletim);
		});
		
		for (AlunoBoletim alunoBoletim : lista) {
			System.out.println(alunoBoletim);
		}
		
//		ControllerAluno controllerAluno = new ControllerAluno();
//		controllerAluno.atualizarNotas(this.bimestre);
	}

}
