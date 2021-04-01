package br.com.fiap.tds.exception;

@SuppressWarnings("serial")
public class EntityNotFoundException extends Exception {
	public EntityNotFoundException() {
		super("Entidade não encontrada");
	}

	public EntityNotFoundException(String mensagem) {
		super(mensagem);
	}
}
