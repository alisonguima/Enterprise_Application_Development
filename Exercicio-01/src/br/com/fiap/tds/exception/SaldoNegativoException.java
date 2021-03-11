package br.com.fiap.tds.exception;

@SuppressWarnings("serial")
public class SaldoNegativoException extends Exception {

	public SaldoNegativoException() {
		super("Seu saldo ficará negativo, saque não permitido!");
	}
	
	public SaldoNegativoException(String mensagem) {
		super(mensagem);
	}
	
	public SaldoNegativoException(double saldo) {
		super("Saldo insuficiente, limite máximo: " + saldo);
	}
	
	public SaldoNegativoException(double saldo, float taxa) {
		super("Saldo insuficiente, limite mázimo: " + (saldo - taxa) + ", taxa de retirada: " + taxa);
	}
}
