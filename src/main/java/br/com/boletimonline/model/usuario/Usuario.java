package br.com.boletimonline.model.usuario;

public abstract class Usuario {

	private Integer id;

	private String nome, login, acesso;
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setLogin(String login) {
		this.login = login;
	}
	
	public void setAcesso(String acesso) {
		this.acesso = acesso;
	}
	
	public String getAcesso() {
		return acesso;
	}
	
	public String getNome() {
		return nome;
	}
	
	public String getLogin() {
		return login;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((acesso == null) ? 0 : acesso.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((login == null) ? 0 : login.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Usuario other = (Usuario) obj;
		if (acesso == null) {
			if (other.acesso != null)
				return false;
		} else if (!acesso.equals(other.acesso))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (login == null) {
			if (other.login != null)
				return false;
		} else if (!login.equals(other.login))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}
	
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
}
