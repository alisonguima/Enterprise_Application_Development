package br.com.fiap.tds.dao.exception;

@SuppressWarnings("serial")
public class EnderecoNotFoundException extends Exception {
	
	public EnderecoNotFoundException() {
		super("Endereço não encontrado");
	}
	
	public EnderecoNotFoundException(String mensagem) {
		super(mensagem);
	}
}
