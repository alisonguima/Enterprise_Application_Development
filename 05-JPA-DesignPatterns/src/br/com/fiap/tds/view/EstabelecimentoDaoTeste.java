package br.com.fiap.tds.view;

import javax.persistence.EntityManager;

import br.com.fiap.tds.dao.EstabelecimentoDao;
import br.com.fiap.tds.dao.impl.EstabelecimentoDaoImpl;
import br.com.fiap.tds.entity.Estabelecimento;
import br.com.fiap.tds.entity.Tipo;
import br.com.fiap.tds.exception.CommitException;
import br.com.fiap.tds.exception.EntityNotFoundException;
import br.com.fiap.tds.singleton.EntityManagerFactorySingleton;

public class EstabelecimentoDaoTeste {
	
	public static void main(String[] args) {
		
		//Obter um EntityManager
		EntityManager em = EntityManagerFactorySingleton.getInstance().createEntityManager();
		
		//Obter um Dao do Estabelecimento
		EstabelecimentoDao dao = new EstabelecimentoDaoImpl(em);
		
		//Instanciar um estabelecimento e cadastrar-lo
		Estabelecimento est = new Estabelecimento("FIAP", "23.124.7544-0001/98", Tipo.MATRIZ);
		
		try {
			dao.create(est);
			dao.commit();
			System.out.println("Estabelecimento cadastrado!");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		
		//Pesquisar pelo código e exibir dados
		try {
			est = dao.search(1);
			System.out.println(est.getNome() + " " + est.getCnpj());
		} catch (EntityNotFoundException e) {
			System.out.println("Estabelecimento não encotrado!");
		}
		
		//Atualizar
		est = new Estabelecimento(1, "Plusoft", "12.993.342-0001/89", Tipo.FILIAL);
		try {
			dao.update(est);
			dao.commit();
			System.out.println("Estabelecimento atualizado");
		} catch (CommitException e) {
			System.out.println();
		}
		
		//Remover
		try {
			dao.update(est);
			dao.commit();
			System.out.println("Estabelecimento atualizado!");
		} catch (CommitException e) {
			System.out.println(e.getMessage());
		}
		
		//Fechar
		em.close();
		EntityManagerFactorySingleton.getInstance().close();
	}
}
