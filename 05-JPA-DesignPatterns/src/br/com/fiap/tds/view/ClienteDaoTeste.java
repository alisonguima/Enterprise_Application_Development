package br.com.fiap.tds.view;

import javax.persistence.EntityManager;

import br.com.fiap.tds.dao.GenericDao;
import br.com.fiap.tds.dao.impl.GenericDaoImpl;
import br.com.fiap.tds.entity.Cliente;
import br.com.fiap.tds.exception.CommitException;
import br.com.fiap.tds.exception.EntityNotFoundException;
import br.com.fiap.tds.singleton.EntityManagerFactorySingleton;

public class ClienteDaoTeste {
	
	public static void main(String[] args) {
		
		//Obter um EntityManager
		EntityManager em = EntityManagerFactorySingleton.getInstance().createEntityManager();
		
		//Obter uma inst�ncia de GenericDao para o Cliente
		//Definir uma classe an�nima e obter a inst�ncia
		GenericDao<Cliente, Integer> dao = new GenericDaoImpl<Cliente, Integer>(em) {};
		
		//Cadastrar
		Cliente cliente = new Cliente("Marcus", "123.123.321-23", true);
		try {
			dao.create(cliente);
			dao.commit();
			System.out.println("Cliente cadastrado!");
		} catch (CommitException e) {
			System.out.println(e.getMessage());
		}
		
		//Pesquisar
		try {
			cliente = dao.search(1);
			System.out.println(cliente.getNome() + " " + cliente.getCpf());
		} catch (EntityNotFoundException e) {
			System.out.println(e.getMessage());
		}
				
		//Fechar
		em.close();
		EntityManagerFactorySingleton.getInstance().close();
	}

}
