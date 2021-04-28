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
import br.com.fiap.tds.entity.Bebida;
import br.com.fiap.tds.entity.Cliente;
import br.com.fiap.tds.entity.Endereco;
import br.com.fiap.tds.entity.FormaPagamento;
import br.com.fiap.tds.entity.Marca;
import br.com.fiap.tds.entity.Pedido;
import br.com.fiap.tds.entity.Pizza;
import br.com.fiap.tds.entity.Sobremesa;
import br.com.fiap.tds.singleton.EntityManagerFactorySingleton;

public class CadastroDaoTeste {

	public static void main(String[] args) {

		EntityManager em = EntityManagerFactorySingleton.getInstance().createEntityManager();
		
		BebidaDao bebDao = new BebidaDaoImpl(em);
		Bebida beb = new Bebida("Refrigerante", false, Marca.COCA_COLA, 9.50);

		// Cadastrando uma bebida
		try {
			bebDao.create(beb);
			bebDao.commit();
			System.out.println("Bebida cadastrada!");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		ClienteDao cliDao = new ClienteDaoImpl(em);
		Cliente cli = new Cliente("Eduardo", 11912345678L, "123-321-456-78");

		// Cadastrando um cliente
		try {
			cliDao.create(cli);
			cliDao.commit();
			System.out.println("Cliente cadastrado!");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		EnderecoDao endDao = new EnderecoDaoImpl(em);
		Endereco end = new Endereco("Avenida Lins de Vasconcelos", 1222, null, null);
		
		// Cadastrando um endereco
		try {
			endDao.create(end);
			endDao.commit();
			System.out.println("Endereco cadastrada!");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		PedidoDao pedDao = new PedidoDaoImpl(em);
		Pedido ped = new Pedido(35.65, true, FormaPagamento.VALE_REFEICAO);
		
		// Cadastrando um pedido
		try {
			pedDao.create(ped);
			pedDao.commit();
			System.out.println("Pedido cadastrada!");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		PizzaDao pizDao = new PizzaDaoImpl(em);
		Pizza piz = new Pizza("Frango c/ Catupiry", 32.50, "Frango, Caturipy e Mussarela");

		// Cadastrando uma pizza
		try {
			pizDao.create(piz);
			pizDao.commit();
			System.out.println("Pizza cadastrada!");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		SobremesaDao sobDao = new SobremesaDaoImpl(em);
		Sobremesa sob = new Sobremesa("Mousse de maracujá", 6.50);

		// Cadastrar
		try {
			sobDao.create(sob);
			sobDao.commit();
			System.out.println("Sobremesa cadastrada!");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}
}
