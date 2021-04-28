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
import br.com.fiap.tds.entity.Pedido;
import br.com.fiap.tds.entity.Pizza;
import br.com.fiap.tds.entity.Sobremesa;
import br.com.fiap.tds.exception.EntityNotFoundException;
import br.com.fiap.tds.singleton.EntityManagerFactorySingleton;

public class PesquisaDaoTeste {

	public static void main(String[] args) {

		EntityManager em = EntityManagerFactorySingleton.getInstance().createEntityManager();

		BebidaDao bebDao = new BebidaDaoImpl(em);
		Bebida beb = new Bebida();

		// Buscando bebida
		try {
			beb = bebDao.search(1);
			System.out.println(beb.getDescricao() + " " + beb.getMarca());
		} catch (EntityNotFoundException e) {
			System.out.println("Bebida não encontrada!");

		}
		
		ClienteDao cliDao = new ClienteDaoImpl(em);
		Cliente cli = new Cliente();

		// Buscando cliente
		try {
			cli = cliDao.search(1);
			System.out.println(cli.getNome());
		} catch (EntityNotFoundException e) {
			System.out.println("Cliente não encontrado!");
		}
		
		EnderecoDao endDao = new EnderecoDaoImpl(em);
		Endereco end = new Endereco();

		// Buscando endereco
		try {
			end = endDao.search(1);
			System.out.println(end.getLogradouro() + " " + end.getNumero());
		} catch (EntityNotFoundException e) {
			System.out.println("Endereco não encontrado!");
		}
		
		PedidoDao pedDao = new PedidoDaoImpl(em);
		Pedido ped = new Pedido();
		
		// Buscando pedido
		try {
			ped = pedDao.search(1);
			System.out.println(ped.getValor() + " " + ped.getForma());
		} catch (EntityNotFoundException e) {
			System.out.println("Pedido não encontrado!");
		}
		
		PizzaDao pizDao = new PizzaDaoImpl(em);
		Pizza piz = new Pizza();

		// Buscando pizza
		try {
			piz = pizDao.search(1);
			System.out.println(piz.getSabor() + " " + piz.getValor());
		} catch (EntityNotFoundException e) {
			System.out.println("Pizza não encontrada!");
		}
		
		
		SobremesaDao sobDao = new SobremesaDaoImpl(em);
		Sobremesa sob = new Sobremesa("Mousse de maracujá", 6.50);

		// Buscando sobremesa
		try {
			sob = sobDao.search(1);
			System.out.println(sob.getDescricao() + " " + sob.getValor());
		} catch (EntityNotFoundException e) {
			System.out.println("Sobremesa não encontrada!");
		}
	}
}
