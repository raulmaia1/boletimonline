package br.com.boletimonline.model;

import br.com.boletimonline.model.usuario.Professor;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2021-08-21T22:31:16.173-0300")
@StaticMetamodel(DisciplinaTurma.class)
public class DisciplinaTurma_ {
	public static volatile SingularAttribute<DisciplinaTurma, Long> id;
	public static volatile SingularAttribute<DisciplinaTurma, Turma> turma;
	public static volatile ListAttribute<DisciplinaTurma, Disciplina> disciplinas;
	public static volatile SingularAttribute<DisciplinaTurma, Professor> professor;
}
