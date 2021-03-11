package br.com.fiap.tds.bean;

public class Pessoa {

	/* Modificadores de acesso
	 * private -> Somente a classe;
	 * public -> Todas as classes conseguem acessar;
	 * protected -> Classe que pertence ao mesmo pacote e classes filhas;
	 * default (package) -> Somente a classe que pertence ao mesmo pacote. 
	 * */
	
	/* Tipos primitivos: byte, short, int, long, float, double, char, boolean
	 * Valor padrão: números = 0, boolean = false;
	 *
	 * Tipos de referência (Classes): String, Integer, Pessoa, Departamento
	 * Valor padrão: null;
	 **/
	
	// Atributos
	private String nome;
	private int idade;
	private boolean deficiente;
	private Genero genero;
	
	// Construtor
	public Pessoa() {}
	
	public Pessoa(String nome) {
		this.setNome(nome);
	}
	
	public Pessoa(String nome, int idade) {
		this.setNome(nome);
		this.setIdade(idade);
	}
	
	public Pessoa(String nome, int idade, boolean deficiente) {
		this.setNome(nome);
		this.setIdade(idade);
		this.setDeficiente(deficiente);
	}
	
	public Pessoa(String nome, int idade, boolean deficiente, Genero genero) {
		this.setNome(nome);
		this.setIdade(idade);
		this.setDeficiente(deficiente);
		this.setGenero(genero);
	}

	// Métodos
	@Override
	public String toString() {
		return nome + " " + idade + " " + deficiente;
	}
	
	public void cadastrar() {
		System.out.println("Cadastrando uma pessoa...");
	}
	
	//Sobrecarga -> mesmo método com parâmetros diferentes
	public void cadastrar(String nome) {
		System.out.println("Cadastrando o/a " + nome);
	}
	
	public void cadastrar(String nome, int idade) {
		System.out.println("Nome e idade cadastrado!");
	}
	
	public void cadastrar(String nome, int idade, boolean deficiente) {
		System.out.println("Nome e idade cadastrado!");
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}	
	
	public boolean isDeficiente() {
		return deficiente;
	}
	
	public void setDeficiente(boolean deficiente) {
		this.deficiente = deficiente;
	}

	public Genero getGenero() {
		return genero;
	}

	public void setGenero(Genero genero) {
		this.genero = genero;
	}

}