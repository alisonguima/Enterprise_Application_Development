package br.com.fiap.tds.bean;

import java.text.SimpleDateFormat;
import java.util.Calendar;

import br.com.fiap.tds.exception.SaldoNegativoException;

public class ContaPoupanca extends Conta implements ContaInvestimento {

	
	public static final float RENDIMENTO = 0.015f;
	
	private float taxa;
	
	public ContaPoupanca() {}
	
	public ContaPoupanca(int agencia, int numero, Calendar dataAbertura, double saldo, float taxa) {
		super(agencia, numero, dataAbertura, saldo);
		this.taxa = taxa;
	}
	
	@Override
	public String toString() {
		SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/YYYY");
		return "Agência: " + agencia + "\nConta: " + numero + "\nData de Abertura: " + formatador.format(dataAbertura.getTime()) + "\nSaldo: " + saldo + "\nTaxa: " + taxa;
	}
	
	@Override
	public void retirar (double valor) throws SaldoNegativoException{
		
		if (saldo < valor + taxa) {
			throw new SaldoNegativoException(saldo, taxa);
		}
		
		saldo =- (valor + taxa);
	}
	
	@Override
	public double calculaRetornoInvestimento() {
		return saldo * ContaPoupanca.RENDIMENTO;
	}

	public float getTaxa() {
		return taxa;
	}

	public void setTaxa(float taxa) {
		this.taxa = taxa;
	}
}
