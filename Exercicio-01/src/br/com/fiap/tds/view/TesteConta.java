package br.com.fiap.tds.view;

import java.util.Calendar;
import java.util.GregorianCalendar;

import br.com.fiap.tds.bean.ContaCorrente;
import br.com.fiap.tds.bean.ContaPoupanca;
import br.com.fiap.tds.bean.TipoConta;
import br.com.fiap.tds.exception.SaldoNegativoException;

public class TesteConta {

	public static void main(String[] args) throws SaldoNegativoException {
		
		ContaCorrente cc = new ContaCorrente(1, 123, Calendar.getInstance(), 100, TipoConta.COMUM);
	
		ContaPoupanca cp = new ContaPoupanca(1, 123, new GregorianCalendar(2020, Calendar.APRIL, 1), 90 , 1);
	
		try {
			cc.retirar(50);
			cp.retirar(70);
			System.out.println("Saque realizado!");
		} catch (SaldoNegativoException e) {
			System.out.println(e.getMessage());
		}
	}
}
