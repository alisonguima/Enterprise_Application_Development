package br.com.fiap.dao;

import java.util.List;

import br.com.fiap.exception.CommitException;
import br.com.fiap.exception.EntityNotFoundException;

public interface GenericDAO<T,K> {

	void cadastrar(T entity);
	void alterar(T entity);
	void remover(K codigo) throws EntityNotFoundException;
	T pesquisar(K codigo);
	void salvar() throws CommitException;
	
	List<T> listar();
	
	//Listar que permite definir a primeira posi��o que ser� retornada e o m�ximo de resultados (pagina��o)
	List<T> listar(int primeiraPosicao, int maximoResultado);
	
}
