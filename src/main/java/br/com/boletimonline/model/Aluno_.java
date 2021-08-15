package br.com.boletimonline.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2021-08-14T20:12:23.871-0300")
@StaticMetamodel(Aluno.class)
public class Aluno_ {
	public static volatile SingularAttribute<Aluno, Long> id;
	public static volatile SingularAttribute<Aluno, Escola> escola;
	public static volatile SingularAttribute<Aluno, String> nomeAluno;
	public static volatile SingularAttribute<Aluno, String> dataNasc;
	public static volatile SingularAttribute<Aluno, Integer> numero;
}
