package br.com.fiap.tds.exception;

@SuppressWarnings("serial")
public class SaldoNegativoException extends Exception {

	public SaldoNegativoException() {
		super("Seu saldo ficar� negativo, saque n�o permitido!");
	}
	
	public SaldoNegativoException(String mensagem) {
		super(mensagem);
	}
	
	public SaldoNegativoException(double saldo) {
		super("Saldo insuficiente, limite m�ximo: " + saldo);
	}
	
	public SaldoNegativoException(double saldo, float taxa) {
		super("Saldo insuficiente, limite m�zimo: " + (saldo - taxa) + ", taxa de retirada: " + taxa);
	}
}
