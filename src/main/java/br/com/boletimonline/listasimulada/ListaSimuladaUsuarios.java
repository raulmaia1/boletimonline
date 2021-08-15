package br.com.boletimonline.listasimulada;

import java.util.ArrayList;
import java.util.List;

import br.com.boletimonline.model.usuario.Usuario;

public class ListaSimuladaUsuarios {

	
	public static List<Usuario> getUsuarios() {
		List<Usuario> usuarios = new ArrayList<>();
		usuarios.add(ListaSimuladaTurmas.getProfessoraFernanda());
		usuarios.add(ListaSimuladaTurmas.getProfessoraFranciscaDaSilva());
		usuarios.add(ListaSimuladaTurmas.getLidianeAlmeidadaSilva());
		usuarios.add(ListaSimuladaTurmas.getProfessoraIvaniaAlmeidaDaSilva());

		return usuarios;
	}
	
	
	
}
