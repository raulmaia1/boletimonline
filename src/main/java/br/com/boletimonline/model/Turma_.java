package br.com.boletimonline.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2021-08-10T21:37:37.780-0300")
@StaticMetamodel(Turma.class)
public class Turma_ {
	public static volatile SingularAttribute<Turma, Long> id;
	public static volatile SingularAttribute<Turma, String> descricaoTurma;
	public static volatile SingularAttribute<Turma, String> turno;
	public static volatile SingularAttribute<Turma, String> ano;
	public static volatile ListAttribute<Turma, Aluno> alunos;
}
