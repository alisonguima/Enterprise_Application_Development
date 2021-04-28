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
import br.com.fiap.tds.exception.CommitException;
import br.com.fiap.tds.singleton.EntityManagerFactorySingleton;

public class AtualizaDaoTeste {

	public static void main(String[] args) {

		EntityManager em = EntityManagerFactorySingleton.getInstance().createEntityManager();

		BebidaDao bebDao = new BebidaDaoImpl(em);
		Bebida beb = new Bebida();

		// Atualizando bebida
		beb = new Bebida(1, "Refrigerante", false, Marca.DOLLY, 5.20);
		try {
			bebDao.update(beb);
			bebDao.commit();
			System.out.println("Bebida atualizada!");
		} catch (CommitException e) {
			System.out.println(e.getMessage());
		}
		
		ClienteDao cliDao = new ClienteDaoImpl(em);
		Cliente cli = new Cliente();

		// Atualizando cliente
		cli = new Cliente(1 ,"Alison", 11987456321L, "987-654-321-12");
		try {
			cliDao.update(cli);
			cliDao.commit();
			System.out.println("Cliente atualizado!");
		} catch (CommitException e) {
			System.out.println(e.getMessage());
		}

		EnderecoDao endDao = new EnderecoDaoImpl(em);
		Endereco end = new Endereco();

		// Atualizando endereco
		end = new Endereco(1 ,"Avenida Paulista", 1444, null, null);
		try {
			endDao.update(end);
			endDao.commit();
			System.out.println("Endereco atualizado!");
		} catch (CommitException e) {
			System.out.println(e.getMessage());
		}
		
		PedidoDao pedDao = new PedidoDaoImpl(em);
		Pedido ped = new Pedido();

		// Atualizando pedido
		ped = new Pedido(1 ,40.65, false, FormaPagamento.CARTAO_DE_CREDITO);
		try {
			pedDao.update(ped);
			pedDao.commit();
			System.out.println("Pedido atualizado!");
		} catch (CommitException e) {
			System.out.println(e.getMessage());
		}
		
		PizzaDao pizDao = new PizzaDaoImpl(em);
		Pizza piz = new Pizza();

		// Atualizando pizza
		piz = new Pizza(1,"Mussarela", 30.50, "Mussarela e tomate");
		try {
			pizDao.update(piz);
			pizDao.commit();
			System.out.println("Pizza atualizada!");
		} catch (CommitException e) {
			System.out.println(e.getMessage());
		}
		
		SobremesaDao sobDao = new SobremesaDaoImpl(em);
		Sobremesa sob = new Sobremesa();

		// Atualizando sobremesa
		sob = new Sobremesa(1 ,"Mousse de chocolate", 6.50);
		try {
			sobDao.update(sob);
			sobDao.commit();
			System.out.println("Sobremesa atualizada!");
		} catch (CommitException e) {
			System.out.println(e.getMessage());
		}
		
	}
}
