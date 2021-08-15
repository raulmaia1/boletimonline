package br.com.boletimonline.model;

import br.com.boletimonline.model.usuario.Professor;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2021-08-09T00:13:42.804-0300")
@StaticMetamodel(Disciplina.class)
public class Disciplina_ {
	public static volatile SingularAttribute<Disciplina, Long> id;
	public static volatile SingularAttribute<Disciplina, String> nomeMateria;
	public static volatile SingularAttribute<Disciplina, Professor> professor;
	public static volatile SingularAttribute<Disciplina, Bimestre> primeiro;
	public static volatile SingularAttribute<Disciplina, Bimestre> segundo;
	public static volatile SingularAttribute<Disciplina, Bimestre> terceiro;
	public static volatile SingularAttribute<Disciplina, Bimestre> quarto;
}
