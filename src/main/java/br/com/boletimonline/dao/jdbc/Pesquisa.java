package br.com.boletimonline.dao.jdbc;

import java.util.Optional;

public interface Pesquisa<T> {
	
	public Optional<T> pesquisaPorID(Integer id);

}
