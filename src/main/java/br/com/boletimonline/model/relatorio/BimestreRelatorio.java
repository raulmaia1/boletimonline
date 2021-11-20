package br.com.boletimonline.model.relatorio;

import java.util.ArrayList;
import java.util.List;

import br.com.boletimonline.model.Bimestre;
import br.com.boletimonline.model.Disciplina;
import br.com.boletimonline.model.Turma;
import br.com.boletimonline.model.usuario.Aluno;
import br.com.boletimonline.model.usuario.Professor;

public class BimestreRelatorio {
	
	private List<Bimestre> bimestres = new ArrayList<>();
	private Double mediaUm = 0.0, mediaDois = 0.0, mediaTres = 0.0, mediaQuatro = 0.0;
	private Integer faltaUm = 0, faltaDois = 0, faltaTres = 0, faltaQuatro = 0;
	private Aluno aluno;
	private Professor professor;
	private Disciplina disciplina;
	private Turma turma;
	private Double quantNotasLancadas = 0.0;



	public void adicionaBimestre(Bimestre bimestre) {
		this.colocaMediasEFaltas(bimestre); 
		this.bimestres.add(bimestre);					
	}

	public void adicionaInformacoes(Bimestre bimestre) {
		this.aluno = bimestre.getAluno();
		this.professor = bimestre.getProfessor();
		this.turma = bimestre.getTurma();
		this.disciplina = bimestre.getDisciplina();
	}

	
	private void colocaMediasEFaltas(Bimestre bimestre) {
		switch (bimestre.getNumeroBimestre()) {
		case 1:
			this.mediaUm = bimestre.getNotaProva();
			this.faltaUm = bimestre.getQuantFaltas();
			if (mediaUm > 0) {
				quantNotasLancadas++;
			}
			break;
		case 2:
			this.mediaDois = bimestre.getNotaProva();
			this.faltaDois = bimestre.getQuantFaltas();
			if (mediaDois > 0) {
				quantNotasLancadas++;		
			}
			break;
		case 3:
			this.mediaTres = bimestre.getNotaProva();
			this.faltaTres = bimestre.getQuantFaltas();			
			if (mediaTres > 0) {
				quantNotasLancadas++;
			}
			break;
		case 4:
			this.mediaQuatro = bimestre.getNotaProva();
			this.faltaQuatro = bimestre.getQuantFaltas();					
			if (mediaQuatro > 0) {
				quantNotasLancadas++;
			}
			break;
		default:
			break;
		}
	}
	


	public Aluno getAluno() {
		return aluno;
	}

	public List<Bimestre> getBimestres() {
		return bimestres;
	}

	public Double getMediaUm() {
		return mediaUm;
	}

	public Double getMediaDois() {
		return mediaDois;
	}

	public Double getMediaTres() {
		return mediaTres;
	}

	public Double getMediaQuatro() {
		return mediaQuatro;
	}

	public Integer getFaltaUm() {
		return faltaUm;
	}

	public Integer getFaltaDois() {
		return faltaDois;
	}

	public Integer getFaltaTres() {
		return faltaTres;
	}

	public Integer getFaltaQuatro() {
		return faltaQuatro;
	}

	public Professor getProfessor() {
		return professor;
	}

	public Disciplina getDisciplina() {
		return disciplina;
	}

	public Turma getTurma() {
		return turma;
	}
	
	public Double getMediaFinal() {
		if(quantNotasLancadas == 0) {
			return 0.0;
		}
		return (mediaUm+mediaDois+mediaTres+mediaQuatro)/Double.valueOf(quantNotasLancadas);
	}
	
	public Integer getTotalFaltas() {
		return faltaUm+faltaDois+ faltaTres+faltaQuatro;
	}
	
	@Override
	public String toString() {
		return "BimestreRelatorio [bimestres=" + bimestres + ", mediaUm=" + mediaUm + ", mediaDois=" + mediaDois
				+ ", mediaTres=" + mediaTres + ", mediaQuatro=" + mediaQuatro + ", faltaUm=" + faltaUm + ", faltaDois="
				+ faltaDois + ", faltaTres=" + faltaTres + ", faltaQuatro=" + faltaQuatro + ", aluno=" + aluno
				+ ", professor=" + professor + ", disciplina=" + disciplina + ", turma=" + turma
				+ ", quantNotasLancadas=" + quantNotasLancadas + "]";
	}
	
}
