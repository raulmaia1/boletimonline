package br.com.boletimonline.model.usuario;

import br.com.boletimonline.model.DisciplinaTurma;
import br.com.boletimonline.model.Escola;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2021-08-21T22:29:33.079-0300")
@StaticMetamodel(Professor.class)
public class Professor_ extends Usuario_ {
	public static volatile ListAttribute<Professor, DisciplinaTurma> disciplinas_turma;
	public static volatile SingularAttribute<Professor, Escola> escola;
}
