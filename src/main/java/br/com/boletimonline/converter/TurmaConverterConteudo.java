package br.com.boletimonline.converter;

import java.util.ArrayList;
import java.util.List;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

import br.com.boletimonline.model.Turma;

@FacesConverter(value = "turmaConverterConteudo")
public class TurmaConverterConteudo implements Converter {
	private static List<Turma> turmas = new ArrayList<>();

	@Override
	public Object getAsObject(FacesContext context, UIComponent component, String value) {
		if (value == null) {
			return null;
		}

		for (Turma turma : turmas) {
			if (turma.getDescricaoTurma().equals(value)) {
				return turma;
			}
		}
		return null;
	}

	@Override
	public String getAsString(FacesContext context, UIComponent component, Object value) {
		if (value == null) {
			return null;
		}

		Turma turma = (Turma) value;
		turmas.add(turma);

		return turma.getDescricaoTurma();
	}

}
