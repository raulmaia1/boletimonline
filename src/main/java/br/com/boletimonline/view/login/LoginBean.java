package br.com.boletimonline.view.login;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import br.com.boletimonline.listasimulada.ListaSimuladaUsuarios;
import br.com.boletimonline.model.usuario.Usuario;

@ManagedBean
@SessionScoped
public class LoginBean  {
	
	private String login, senha;
	
	public String logar() {
		
		for (Usuario usuario : ListaSimuladaUsuarios.getUsuarios()) {
			if (usuario.getLogin().equals(login) && (usuario.getAcesso().equals(senha))) {
				FacesContext.getCurrentInstance().getExternalContext().getSessionMap().put("usuario", usuario);
				
				return "index.xhtml";
			}
		}
		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_WARN, "Diário Online","Usuário ou senha incorretos"));

		return "";
		
	}
	
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	
	public String getLogin() {
		return login;
	}
	
	public void setLogin(String login) {
		this.login = login;
	}
	
	public String getSenha() {
		return senha;
	}
	
}
