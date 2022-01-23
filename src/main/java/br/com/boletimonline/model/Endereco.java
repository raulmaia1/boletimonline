package br.com.boletimonline.model;

public class Endereco {
	
	private Integer id;
	private String logradouro, numero, bairro,cidade;

	public String getBairro() {
		return bairro;
	}
	
	public String getCidade() {
		return cidade;
	}
	
	public String getLogradouro() {
		return logradouro;
	}
	
	public String getNumero() {
		return numero;
	}
	
	public Integer getId() {
		return id;
	}
	
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	
	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}
	
	public void setNumero(String numero) {
		this.numero = numero;
	}
	
	
}
