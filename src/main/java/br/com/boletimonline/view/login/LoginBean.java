package br.com.boletimonline.view.login;

import java.util.Optional;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import br.com.boletimonline.dao.jdbc.ProfessorDao;
import br.com.boletimonline.model.usuario.Professor;

@ManagedBean
@SessionScoped
public class LoginBean  {
	
	private String login, senha;
	
	public String logar() {
		
		Optional<Professor> optional = new ProfessorDao().loginProfessor(login, senha);
		
		if (optional.isPresent()){
			FacesContext.getCurrentInstance().getExternalContext().getSessionMap().put("usuario", optional.get());
			return "index.xhtml";		
				
			}else {
				FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_WARN, "Diário Online","Usuário ou senha incorretos"));
				return "";
				
			}
				
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
