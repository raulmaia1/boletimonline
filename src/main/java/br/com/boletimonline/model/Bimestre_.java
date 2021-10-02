package br.com.boletimonline.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2021-08-29T21:43:27.665-0300")
@StaticMetamodel(Bimestre.class)
public class Bimestre_ {
	public static volatile SingularAttribute<Bimestre, Long> id;
	public static volatile SingularAttribute<Bimestre, Integer> numeroBimestre;
	public static volatile SingularAttribute<Bimestre, Nota> notaAtividade;
	public static volatile SingularAttribute<Bimestre, Nota> notaProva;
	public static volatile SingularAttribute<Bimestre, String> quantFaltas;
	public static volatile SingularAttribute<Bimestre, Aluno> aluno;
}
