package br.com.fiap.tds.bean;

import java.text.SimpleDateFormat;
import java.util.Calendar;

import br.com.fiap.tds.exception.SaldoNegativoException;

public class ContaCorrente extends Conta {
	
	protected TipoConta conta;
	
	public ContaCorrente() {}
	
	public ContaCorrente(int agencia, int numero, Calendar dataAbertura, double saldo, TipoConta conta) {
		super(agencia, numero, dataAbertura, saldo);
		this.conta = conta;
	}
	
	@Override
	public String toString() {
		SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/YYYY");
		
		String desc = null;
		
		if (conta == TipoConta.COMUM) {
			desc = "Comum";
		} else if (conta == TipoConta.ESPECIAL) {
			desc = "Especial";
		} else if (conta == TipoConta.PREMIUM) {
			desc = "Premium";
		}
		return "Agência: " + agencia + "\nConta: " + numero + "\nData de abertura: " + formatador.format(dataAbertura.getTime()) + "\nSaldo: " + saldo + "\nDescrição da conta: " + desc;
	}
	
	@Override
	public void retirar (double valor) throws SaldoNegativoException  {
		
		if (conta == TipoConta.COMUM && (saldo - valor) < 0) {
			throw new SaldoNegativoException();
		}
		saldo -= valor;	
	}
}
