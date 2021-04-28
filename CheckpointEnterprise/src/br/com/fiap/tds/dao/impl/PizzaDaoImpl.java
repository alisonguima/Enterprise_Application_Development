package br.com.fiap.tds.dao.impl;

import javax.persistence.EntityManager;

import br.com.fiap.tds.dao.PizzaDao;
import br.com.fiap.tds.entity.Pizza;

public class PizzaDaoImpl extends GenericDaoImpl<Pizza, Integer> implements PizzaDao{

	public PizzaDaoImpl(EntityManager em) {
		super(em);
		}

}
