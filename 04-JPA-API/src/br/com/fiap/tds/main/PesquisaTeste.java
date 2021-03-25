package br.com.fiap.tds.main;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.fiap.tds.entity.Endereco;

public class PesquisaTeste {

	public static void main(String[] args) {
		
		//Obter a fabrica e o entity manager
		EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("oracle");
		EntityManager em = fabrica.createEntityManager();
		
		//Pesquisar o endereco de codigo
		Endereco end = em.find(Endereco.class, 2);
		
		//Exibir os dados do endereco
		System.out.println(end);
		
		end.setLogradouro("Avenida Paulista");
		em.getTransaction().begin();
		em.getTransaction().commit();
		
		//Fechar
		em.close();
		fabrica.close();
	}
	
}
