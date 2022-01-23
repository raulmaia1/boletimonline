package br.com.boletimonline.model.usuario;

import br.com.boletimonline.model.Escola;

public class Professor extends Usuario {
	
//	private List<DisciplinaTurma> disciplinas_turma = new ArrayList<>();
	private Escola escola;
	
//	public void adicionaDisciplina_Turma(DisciplinaTurma disciplina_turma) {
//		 this.disciplinas_turma.add(disciplina_turma);
//	}
//	
//	public List<Disciplina> getDisciplinas() {
//		List<Disciplina> list = new ArrayList<>();
//		
//		for (DisciplinaTurma disciplinaTurma : disciplinas_turma) {
//			list.addAll(disciplinaTurma.getDisciplinas());
//		}
//		
//		return list;
//	}
		
//	public String getNomeDisciplinas() {
//		
//		List<Disciplina> disciplinas = getDisciplinas();
//		
//		String disciplina = "";
//		
//		for (int i = 0; i < disciplinas.size() ; i++) {
//			disciplina += disciplinas.get(i).getNomeMateria();			
//			
//			if(i < disciplinas.size()-1) {
//				disciplina += ", ";
//			}
//		
//		}
//		return disciplina;		
//	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((super.getId() == null) ? 0 : super.getId().hashCode());
		result = prime * result + ((super.getNome() == null) ? 0 : super.getNome().hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Professor other = (Professor) obj;
		if (super.getId() == null) {
			if (other.getId() != null)
				return false;
		} else if (!super.getId().equals(other.getId()))
			return false;
		if (super.getNome() == null) {
			if (super.getNome() != null)
				return false;
		} else if (!super.getNome().equals(other.getNome()))
			return false;
		return true;
	}
	
//	public List<DisciplinaTurma> getDisciplinasTurmas() {
//		return disciplinas_turma;
//	}

	public void setEscola(Escola escola) {
		this.escola = escola;
	}
	
	public Escola getEscola() {
		return escola;
	}

	@Override
	public String toString() {
		return "Professor [getAcesso()=" + getAcesso() + ", getNome()=" + getNome() + ", getLogin()=" + getLogin()
				+ ", getId()=" + getId() + "]";
	}
	
	
	
}