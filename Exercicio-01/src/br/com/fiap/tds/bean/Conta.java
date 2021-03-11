package br.com.fiap.tds.bean;

import java.util.Calendar;

import br.com.fiap.tds.exception.SaldoNegativoException;

public abstract class Conta {
	
	protected int agencia;
	protected int numero;
	protected Calendar dataAbertura;
	protected double saldo;
	
	public Conta() {}
	
	public Conta(int agencia, int numero, Calendar dataAbertura, double saldo) {
		this.agencia = agencia;
		this.numero = numero;
		this.dataAbertura = dataAbertura;
		this.saldo = saldo;
	}
	
	public void depositar (double valor) {
		saldo += valor;
	}
	
	public abstract void retirar (double valor) throws SaldoNegativoException;

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public Calendar getDataAbertura() {
		return dataAbertura;
	}

	public void setDataAbertura(Calendar dataAbertura) {
		this.dataAbertura = dataAbertura;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
}
