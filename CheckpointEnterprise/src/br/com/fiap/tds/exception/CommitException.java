package br.com.fiap.tds.exception;

@SuppressWarnings("serial")
public class CommitException extends Exception {

	public CommitException() {
		super("Erro ao realizar o commit");
	}
	
	public CommitException(String mensagem) {
		super(mensagem);
	}
}
