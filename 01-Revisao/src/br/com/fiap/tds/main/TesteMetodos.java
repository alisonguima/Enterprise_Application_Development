package br.com.fiap.tds.main;

import br.com.fiap.tds.bean.Funcionario;
import br.com.fiap.tds.bean.Pessoa;

public class TesteMetodos {

	public static void main(String[] args) {
		// Instanciar uma Pessoa
		Pessoa pessoa = new Pessoa();
		
		// Chamar o m�todo cadastrar()
		pessoa.cadastrar(); //Pessoa
		
		// Instanciar um Funcionario
		Funcionario funcionario = new Funcionario();
		
		// Chamar o m�todo cadastrar()
		funcionario.cadastrar(); // Funcionario
	
		Pessoa p = new Funcionario();
		p.cadastrar(); // Funcionario
		
		// Funcionario f = new Pessoa(); N�O compila, pois Pessoa n�o necessariamente ser� um funcionario
	}
}
