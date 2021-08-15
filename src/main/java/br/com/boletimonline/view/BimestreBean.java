package br.com.boletimonline.view;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

import br.com.boletimonline.model.Bimestre;
import br.com.boletimonline.model.Disciplina;

@ManagedBean
@ViewScoped
public class BimestreBean {

	private Disciplina disciplina;

	@PostConstruct
	private void init() {
		this.disciplina = (Disciplina) FacesContext.getCurrentInstance().getExternalContext().getSessionMap().get("disciplinaSelecionada");
	}
//	
	public Disciplina getDisciplina() {
		return disciplina;
	}
	
	public void abriPrimeiroBimestre() {
		alteraBimestre(disciplina.getPrimeiro());
	}
	
	public void abriSegundoBimestre() {
		alteraBimestre(disciplina.getSegundo());
	}
	
	public void abriTerceiroBimestre() {
		alteraBimestre(disciplina.getTerceiro());
	}
	
	public void abriQuartoBimestre() {
		alteraBimestre(disciplina.getQuarto());		
	}

	private void alteraBimestre(Bimestre bimestre) {
		FacesContext.getCurrentInstance().getExternalContext().getSessionMap().put("bimestre", null);
		FacesContext.getCurrentInstance().getExternalContext().getSessionMap().put("bimestreSelecionado", bimestre);
	}
}
