package br.com.boletimonline.model.usuario;

import br.com.boletimonline.model.DisciplinaTurma;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2021-08-14T20:27:35.380-0300")
@StaticMetamodel(Professor.class)
public class Professor_ extends Usuario_ {
	public static volatile ListAttribute<Professor, DisciplinaTurma> disciplinas_turma;
}
