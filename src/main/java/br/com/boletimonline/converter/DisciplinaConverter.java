package br.com.boletimonline.converter;

import java.util.ArrayList;
import java.util.List;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

import br.com.boletimonline.model.Disciplina;
import br.com.boletimonline.view.AdicionaConteudoBean;

@FacesConverter(value = "disciplinaConverter", forClass= AdicionaConteudoBean.class)
public class DisciplinaConverter implements Converter {
	private static List<br.com.boletimonline.model.Disciplina> disciplinas = new ArrayList<>();  
	
	@Override
	public Object getAsObject(FacesContext context, UIComponent component, String value) {
		if (value == null) {
		      return null;
		    }
		    
			for (Disciplina disciplina : disciplinas) {
				if(disciplina.getNomeMateria().equals(value)) {
					return disciplina;
				}
			}
		   return null; 
	}

	@Override
	public String getAsString(FacesContext context, UIComponent component, Object value) {
		if (value == null) {
			return null;
		}

		Disciplina disciplina = (Disciplina) value;
		disciplinas.add(disciplina);

		return disciplina.getNomeMateria();
	}

}
