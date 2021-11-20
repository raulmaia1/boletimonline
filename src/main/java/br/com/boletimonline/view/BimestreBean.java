package br.com.boletimonline.view;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

@ManagedBean
@ViewScoped
public class BimestreBean {
		
	public void abriPrimeiroBimestre() {
		alteraBimestre(1);		
	}
	
	public void abriSegundoBimestre() {
		alteraBimestre(2);
	}
	
	public void abriTerceiroBimestre() {
		alteraBimestre(3);
	}
	
	public void abriQuartoBimestre() {
		alteraBimestre(4);		
	}

	private void alteraBimestre(Integer numeroBimestre) {
		FacesContext.getCurrentInstance().getExternalContext().getSessionMap().put("numeroBimestre", numeroBimestre);
	}
}
