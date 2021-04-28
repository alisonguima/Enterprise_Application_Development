package br.com.fiap.tds.dao.impl;

import javax.persistence.EntityManager;

import br.com.fiap.tds.dao.SobremesaDao;
import br.com.fiap.tds.entity.Sobremesa;

public class SobremesaDaoImpl extends GenericDaoImpl<Sobremesa, Integer> implements SobremesaDao{

	public SobremesaDaoImpl(EntityManager em) {
		super(em);
	}

}
