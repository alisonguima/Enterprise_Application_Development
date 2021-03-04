package br.com.fiap.tds.bean;

public class Funcionario extends Pessoa {

	//Construtor � herdado? N�o
	
	public Funcionario() {}
	
	public Funcionario(String nome) {
		super(nome);
	}
	
	public Funcionario(String nome, int idade) {
		super(nome, idade);
	}
	
	public Funcionario(String nome, int idade, boolean deficiente) {
		super(nome, idade, deficiente);
	}
	
	// Sobrescrita -> mesmo m�todo na classe filha
	@Override
	public void cadastrar() {
		System.out.println("Cadastrando um funcion�rio...");
	}
	
}
