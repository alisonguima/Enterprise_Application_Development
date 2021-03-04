package br.com.fiap.tds.main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import br.com.fiap.tds.bean.Funcionario;

public class TesteColecao {
	
	public static void main(String[] args) {
		//Criar uma lista de funcionario
		List <Funcionario> lista = new ArrayList<Funcionario>();
		
		//Adicionar dois funcionarios na lista
		lista.add(new Funcionario("Cleiton", 20));
		
		Funcionario func = new Funcionario("Alison", 18, true);
		lista.add(func);
	
		//Foreach
		for (Funcionario f : lista) {
			System.out.println(f);
		}
		
		System.out.println("------------------------");
		
		//Exibir os funcionários da lista
		for (int i = 0; i < lista.size(); i++) {
			System.out.println(lista.get(i));
		}
		
		System.out.println("------------------------");
		
		//Mapa
		Map <String, Funcionario> mapa = new HashMap <String, Funcionario>();
		
		//Adicionar dois funcionários no mapa
		mapa.put("f1", new Funcionario("Vinicius", 19));
		mapa.put("f2", new Funcionario("Gabriel", 21));
		
		//Recuperar o funcionário através da chave
		func = mapa.get("f1");
		System.out.println(func);
		
		func = mapa.get("f2");
		System.out.println(func);
	}
}
