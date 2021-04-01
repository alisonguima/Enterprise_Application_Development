package br.com.fiap.tds.exception;

@SuppressWarnings("serial")
public class EntityNotFoundException extends Exception {
	public EntityNotFoundException() {
		super("Entidade n�o encontrada");
	}

	public EntityNotFoundException(String mensagem) {
		super(mensagem);
	}
}
