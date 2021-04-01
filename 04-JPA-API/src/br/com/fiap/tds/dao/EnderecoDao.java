package br.com.fiap.tds.dao;

import br.com.fiap.tds.dao.exception.CommitException;
import br.com.fiap.tds.dao.exception.EnderecoNotFoundException;
import br.com.fiap.tds.entity.Endereco;

public interface EnderecoDao {
	
	//CRUD
	void create(Endereco endereco);
	
	Endereco search(int id) throws EnderecoNotFoundException;
	
	void update(Endereco endereco);
	
	void delete(int id) throws EnderecoNotFoundException;
	
	void commit() throws CommitException;
}
