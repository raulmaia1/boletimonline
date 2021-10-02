package br.com.boletimonline.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2021-08-29T21:43:27.574-0300")
@StaticMetamodel(AlunoBoletim.class)
public class AlunoBoletim_ {
	public static volatile SingularAttribute<AlunoBoletim, Long> id;
	public static volatile SingularAttribute<AlunoBoletim, Aluno> aluno;
	public static volatile SingularAttribute<AlunoBoletim, Turma> turma;
	public static volatile SingularAttribute<AlunoBoletim, Disciplina> disciplina;
	public static volatile SingularAttribute<AlunoBoletim, Bimestre> bimestreSelecionado;
}
