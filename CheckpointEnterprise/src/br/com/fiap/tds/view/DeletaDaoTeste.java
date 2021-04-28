package br.com.fiap.tds.view;

import javax.persistence.EntityManager;

import br.com.fiap.tds.dao.BebidaDao;
import br.com.fiap.tds.dao.ClienteDao;
import br.com.fiap.tds.dao.EnderecoDao;
import br.com.fiap.tds.dao.PedidoDao;
import br.com.fiap.tds.dao.PizzaDao;
import br.com.fiap.tds.dao.SobremesaDao;
import br.com.fiap.tds.dao.impl.BebidaDaoImpl;
import br.com.fiap.tds.dao.impl.ClienteDaoImpl;
import br.com.fiap.tds.dao.impl.EnderecoDaoImpl;
import br.com.fiap.tds.dao.impl.PedidoDaoImpl;
import br.com.fiap.tds.dao.impl.PizzaDaoImpl;
import br.com.fiap.tds.dao.impl.SobremesaDaoImpl;
import br.com.fiap.tds.exception.CommitException;
import br.com.fiap.tds.exception.EntityNotFoundException;
import br.com.fiap.tds.singleton.EntityManagerFactorySingleton;

public class DeletaDaoTeste {

	public static void main(String[] args) {

		EntityManager em = EntityManagerFactorySingleton.getInstance().createEntityManager();
		BebidaDao bebDao = new BebidaDaoImpl(em);

		// Removendo bebida
		try {
			bebDao.delete(1);
			bebDao.commit();
			System.out.println("Bebida removida!");
		} catch (EntityNotFoundException | CommitException e) {
			System.out.println("Bebida não encontrada!");
			e.printStackTrace();
		}

		ClienteDao cliDao = new ClienteDaoImpl(em);

		// Removendo cliente
		try {
			cliDao.delete(1);
			cliDao.commit();
			System.out.println("Cliente Removido!");
		} catch (EntityNotFoundException | CommitException e) {
			System.out.println("Cliente não encontrado!");
			e.printStackTrace();
		}

		EnderecoDao endDao = new EnderecoDaoImpl(em);

		// Removendo endereco

		try {
			endDao.delete(1);
			endDao.commit();
			System.out.println("Endereco Removido!");
		} catch (EntityNotFoundException | CommitException e) {
			System.out.println("Endereco não encontrado!");
			e.printStackTrace();
		}

		PedidoDao pedDao = new PedidoDaoImpl(em);

		// Removendo pedido
		try {
			pedDao.delete(1);
			pedDao.commit();
			System.out.println("Pedido Removido!");
		} catch (EntityNotFoundException | CommitException e) {
			System.out.println("Pedido não encontrado!");
			e.printStackTrace();
		}

		PizzaDao pizDao = new PizzaDaoImpl(em);

		// Removemndo pizza
		try {
			pizDao.delete(1);
			pizDao.commit();
			System.out.println("Pizza Removida!");
		} catch (EntityNotFoundException | CommitException e) {
			System.out.println("Pizza não encontrada!");
			e.printStackTrace();
		}

		SobremesaDao sobDao = new SobremesaDaoImpl(em);

		// Remover
		try {
			sobDao.delete(1);
			sobDao.commit();
			System.out.println("Sobremesa Removida!");
		} catch (EntityNotFoundException | CommitException e) {
			System.out.println("Sobremesa não encontrada!");
			e.printStackTrace();
		}
	}
}
