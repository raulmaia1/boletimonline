package br.com.boletimonline.view;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

import br.com.boletimonline.dao.jdbc.AlunoDao;
import br.com.boletimonline.dao.jdbc.BimestreDao;
import br.com.boletimonline.model.Bimestre;
import br.com.boletimonline.model.Disciplina;
import br.com.boletimonline.model.DisciplinaTurma;
import br.com.boletimonline.model.usuario.Professor;

@ManagedBean
@ViewScoped
public class AlunoBean implements Serializable {

	private static final long serialVersionUID = 1L;
	private List<Bimestre> lista = new ArrayList<>();

	@PostConstruct
	private void init() {
		Professor professor = (Professor) FacesContext.getCurrentInstance().getExternalContext().getSessionMap()
				.get("usuario");
		
		Integer numeroBimestre = (Integer) FacesContext.getCurrentInstance().getExternalContext().getSessionMap()
				.get("numeroBimestre");
		
		DisciplinaTurma disciplinaTurma = (DisciplinaTurma) FacesContext.getCurrentInstance().getExternalContext().getSessionMap()
				.get("disciplinaTurmaSelecionada");

		Disciplina disciplina = (Disciplina) FacesContext.getCurrentInstance().getExternalContext().getSessionMap()
				.get("disciplinaSelecionada");

		
		
		
		List<Bimestre> listaResult = new BimestreDao().verificaBimestrePorTurmaENumero(disciplinaTurma.getTurma(),
				numeroBimestre);

		if (!listaResult.isEmpty()) {
			this.lista.addAll(listaResult);
		} else {
			
			new AlunoDao().pesquisaAlunosPorTurma(disciplinaTurma.getTurma()).forEach(aluno -> {
				Bimestre bimestre = new Bimestre();
				bimestre.setAluno(aluno);
				bimestre.setProfessor(professor);
				bimestre.setDisciplina(disciplina);
				bimestre.setNumeroBimestre(numeroBimestre);
				bimestre.setTurma(aluno.getTurma());
				bimestre.setEscola(aluno.getEscola());
				this.lista.add(bimestre);
			});
		}
	}

	public void adicionaNota() {
		
		new BimestreDao().adiciona(lista);
		
//		ControllerAluno controllerAluno = new ControllerAluno();
//		controllerAluno.atualizarNotas(this.bimestre);
	}

	public List<Bimestre> getLista() {
		return lista;
	}
	
}
