package br.com.fiap.tds.dao.impl;

import javax.persistence.EntityManager;

import br.com.fiap.tds.dao.EnderecoDao;
import br.com.fiap.tds.dao.exception.CommitException;
import br.com.fiap.tds.dao.exception.EnderecoNotFoundException;
import br.com.fiap.tds.entity.Endereco;

public class EnderecoDaoImpl implements EnderecoDao{

	private EntityManager em;
	
	public EnderecoDaoImpl(EntityManager em) {
		this.em = em;
	}
	
	//Controller API - DAO - Banco
	
	@Override
	public void create(Endereco endereco) {
		em.persist(endereco);
		
	}

	@Override
	public Endereco search(int id) throws EnderecoNotFoundException {
		Endereco endereco = em.find(Endereco.class, id);
		if (endereco == null) {
			throw new EnderecoNotFoundException();
		}
		return endereco;
	}

	@Override
	public void update(Endereco endereco){
		em.merge(endereco);
	}

	@Override
	public void delete(int id) throws EnderecoNotFoundException {
		Endereco endereco = search(id);
		em.remove(endereco);
	}

	@Override
	public void commit() throws CommitException {
		try {
			em.getTransaction().begin();
			em.getTransaction().commit();			
		} catch (Exception e) {
			em.getTransaction().rollback();
			e.printStackTrace();
			throw new CommitException();
		}
	}

}
