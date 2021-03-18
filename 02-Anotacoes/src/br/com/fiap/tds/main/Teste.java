package br.com.fiap.tds.main;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

import br.com.fiap.tds.annotation.Coluna;
import br.com.fiap.tds.bean.Carro;

public class Teste {

	public static void main(String[] args) {
		//Instanciar um Carro
		Carro carro = new Carro();
		
		//API de reflection -> obtem a estrutura da classe
		//Obter o nome da classe
		String nome = carro.getClass().getName();
		System.out.println(nome);
		
		//Obter os m�todos da classe
		System.out.println("M�todos:");
		Method[] metodos = carro.getClass().getDeclaredMethods();
		//Exibir o nome dos m�todos
		for (Method m : metodos) {
			System.out.println(m.getName());
		}
		
		//Obter os atributos da classe
		System.out.println("Atributos:");
		Field[] atributos = carro.getClass().getDeclaredFields();
		//Exibir o nome e o tipo de dado
		for (Field f : atributos) {
			System.out.println(f.getName() + " " + f.getType());
			//Obter a anota��o @Coluna
			Coluna a = f.getAnnotation(Coluna.class);
			//Exibir as configura��es
			System.out.println(a.nome() + " Tipo: " + a.tipo() + 
					" Tamanho: " + a.tamanho() + " Pk: " + a.pk());
		}
		
		
	}//main
	
}//classe