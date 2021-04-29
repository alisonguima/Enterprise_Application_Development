package br.com.fiap.tds.view;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;

import br.com.fiap.tds.dao.SistemaDao;
import br.com.fiap.tds.dao.impl.SistemaDaoImpl;
import br.com.fiap.tds.exception.CommitException;
import br.com.fiap.tds.singleton.EntityManagerFactorySingleton;
import br.com.fiap.tds.entity.CasoTeste;
import br.com.fiap.tds.entity.ItemTeste;
import br.com.fiap.tds.entity.Sistema;
import br.com.fiap.tds.entity.Usuario;

public class Cadastro {

	//Cadastrar todas as entidades relacionadas
	public static void main(String[] args) {
		//Instanciar um sistema
		Sistema sistema = new Sistema("Portal Fiap");
		
		//Instanciar dois casos de teste
		CasoTeste caso1 = new CasoTeste("Challenge", "M�dulo de entrega da challenge");
		CasoTeste caso2 = new CasoTeste("Boletim", "�rea de notas dos alunos");
		
		//Adicionar os casos de teste no sistema
		sistema.addCasoTeste(caso1);
		sistema.addCasoTeste(caso2);
		
		//Instanciar 3 itens de teste
		ItemTeste item1 = new ItemTeste("Upload de arquivo de 100mb com sucesso");
		ItemTeste item2 = new ItemTeste("N�o permitir subir arquivo com 0 kb");
		
		ItemTeste item3 = new ItemTeste("Publica��o das notas ap�s o prof confirmar com o token");
		
		//Adicionar 2 itens no primeiro caso e 1 item no segundo
		caso1.addItemTeste(item1);
		caso1.addItemTeste(item2);
		
		caso2.addItemTeste(item3);
		
		//Instanciar 2 usu�rios
		Usuario usuario1 = new Usuario("Kelly");
		Usuario usuario2 = new Usuario("Gabriel");
		
		//Criar uma lista de usu�rio e adicion�-los na lista
		List<Usuario> usuarios = new ArrayList<>();
		usuarios.add(usuario1);
		usuarios.add(usuario2);
		
		//Setar em dois itens a lista de usu�rio
		item1.setUsuarios(usuarios);
		item3.setUsuarios(usuarios);
		
		//Obter um entity manager
		EntityManager em = EntityManagerFactorySingleton.getInstance().createEntityManager();
		
		//Instanciar um SistemaDao
		SistemaDao dao = new SistemaDaoImpl(em);
		
		try {
			//Cadastrar o sistema
			dao.create(sistema);
			dao.commit();
			System.out.println("Sucesso!");
		} catch (CommitException e) {
			System.out.println(e.getMessage());
		}
		
		//Fechar
		em.close();
		EntityManagerFactorySingleton.getInstance().close();
		
	}//main
	
}//classe