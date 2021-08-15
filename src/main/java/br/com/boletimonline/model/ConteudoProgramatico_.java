package br.com.boletimonline.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2021-08-08T12:34:03.506-0300")
@StaticMetamodel(ConteudoProgramatico.class)
public class ConteudoProgramatico_ {
	public static volatile SingularAttribute<ConteudoProgramatico, Long> id;
	public static volatile SingularAttribute<ConteudoProgramatico, String> data;
	public static volatile SingularAttribute<ConteudoProgramatico, String> conteudo;
	public static volatile SingularAttribute<ConteudoProgramatico, String> quantAulas;
	public static volatile SingularAttribute<ConteudoProgramatico, ConteudoProgramatico> disciplina;
	public static volatile SingularAttribute<ConteudoProgramatico, Turma> turma;
}
