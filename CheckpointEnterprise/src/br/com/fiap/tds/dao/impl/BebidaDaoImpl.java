package br.com.fiap.tds.dao.impl;

import javax.persistence.EntityManager;

import br.com.fiap.tds.dao.BebidaDao;
import br.com.fiap.tds.entity.Bebida;

public class BebidaDaoImpl extends GenericDaoImpl<Bebida, Integer> implements BebidaDao{

	public BebidaDaoImpl(EntityManager em) {
		super(em);
	}
}
