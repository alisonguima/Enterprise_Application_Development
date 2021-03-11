package br.com.fiap.tds.main;

import br.com.fiap.tds.bean.Funcionario;
import br.com.fiap.tds.bean.Genero;

public class TesteEnum {

	public static void main(String[] args) {
		
		//Instanciar um Funcionario
		Funcionario funcionario = new Funcionario("Thaigo", 51, true);
		
		//Atribuir um valor para o genero do funcionário
		funcionario.setGenero(Genero.MASCULINO);
		
		//Validar se o gênero é feminino
		if (funcionario.getGenero() == Genero.FEMININO) {
			System.out.println("É uma colaboradora");
		}
		//Exibir o gênero
		System.out.println(funcionario.getGenero());
	}
}
