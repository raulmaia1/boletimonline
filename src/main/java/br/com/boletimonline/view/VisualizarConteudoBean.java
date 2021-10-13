package br.com.boletimonline.view;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

import br.com.boletimonline.dao.jdbc.ConteudoProgramaticoDao;
import br.com.boletimonline.model.ConteudoProgramatico;
import br.com.boletimonline.model.Turma;
import br.com.boletimonline.model.usuario.Professor;
import br.com.boletimonline.relatorio.GeraRelatorio;

@ManagedBean
@ViewScoped
public class VisualizarConteudoBean implements Serializable{

	private static final long serialVersionUID = 1L;
	private Turma turmaSelecionada;
	private Professor professor;
	private String valorInicial, valorFinal;

	private List<ConteudoProgramatico> conteudos = new ArrayList<>();
	private List<Turma> turmas = new ArrayList<>();
	
	@PostConstruct
	private void init() {
		
		valorInicial = pegaDataInicioMes();
		valorFinal = pegaDataDeHoje();
		
		this.professor = (Professor) FacesContext.getCurrentInstance().getExternalContext().getSessionMap().get("usuario");
		this.conteudos.addAll(new ConteudoProgramaticoDao().pesquisaPorProfessor(professor));
	
		conteudos.forEach(conteudo -> turmas.add(conteudo.getTurma()));

	}
	
	public void pesquisaPorData() {
		conteudos.clear();
		conteudos.addAll(new ConteudoProgramaticoDao().pesquisaPorIntervaloData(valorInicial, valorFinal,turmaSelecionada));		
	}

	public void imprimir() {
		new GeraRelatorio().gera(conteudos, getHorasAulas());
		System.out.println("Ok");
	}
	
	public Turma getTurmaSelecionada() {
		return turmaSelecionada;
	}
	
	public List<Turma> getTurmas() {
		return turmas;
	}
	
	public void setTurmaSelecionada(Turma turmaSelecionada) {
		this.turmaSelecionada = turmaSelecionada;
	}
	
	public String getHorasAulas() {
		Integer horas = 0;
		for (ConteudoProgramatico cP : conteudos) {
			horas = horas + Integer.valueOf(cP.getQuantAulas());
		} 
		return horas.toString();
	}
	
	public List<ConteudoProgramatico> getConteudos() {
		return conteudos;
	}
	
	public void setValorInicial(String valorInicial) {
		this.valorInicial = valorInicial;
	}
	
	public String getValorInicial() {
		return valorInicial;
	}
	
	public void setValorFinal(String valorFinal) {
		this.valorFinal = valorFinal;
	}
	
	public String getValorFinal() {
		return valorFinal;
	}
	
	
	private String pegaDataInicioMes() {
		LocalDate hoje = LocalDate.now();
		
		String mes = verificaDataZeroEsquerda(hoje.getMonthValue());
		
		return "01/"+ mes +"/"+String.valueOf(hoje.getYear());
		
	}

	private String verificaDataZeroEsquerda(Integer numero) {
		String data;
		if ((numero < 10) && (String.valueOf(numero).length() == 1 ))  {
			data = "0"+ String.valueOf(numero);			
		}else {
			data = String.valueOf(numero);
		}
		return data;
	}
	
	private String pegaDataDeHoje() {
		LocalDate hoje = LocalDate.now();
		return verificaDataZeroEsquerda(hoje.getDayOfMonth())+"/"+ verificaDataZeroEsquerda(hoje.getMonthValue())+"/"+"2021";
	}
	
}
