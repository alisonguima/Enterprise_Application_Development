package br.com.fiap.tds.main;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.fiap.tds.entity.Endereco;
import br.com.fiap.tds.entity.TipoEndereco;

public class CadastroTeste {

	public static void main(String[] args) {
		
		//Obter uma fabrica e um entity manager
		EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("oracle");
		EntityManager em = fabrica.createEntityManager();
		
		//Instanciar um endereco sem o c�digo (Estado : novo - n�o gerenciado)
		Endereco end = new Endereco("11230904", "Rua Oscar Freire", 1234, true, TipoEndereco.COMERCIAL);
		
		//Coloca o endereco no contexto do entity manager (gerenciado)
		em.persist(end);
		
		//Iniciar uma transa��o
		em.getTransaction().begin();
		
		//Commit
		em.getTransaction().commit();
		
		System.out.println("Endere�o registrado!");
		
		end.setNumero(100);
		em.getTransaction().begin();
		em.getTransaction().commit();
		
		//Fechar 
		em.close();
		fabrica.close();
	}
}
