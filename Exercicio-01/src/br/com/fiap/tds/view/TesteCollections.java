package br.com.fiap.tds.view;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import br.com.fiap.tds.bean.ContaCorrente;
import br.com.fiap.tds.bean.TipoConta;

public class TesteCollections {
	
	public static void main(String[] args) {
		
		List<ContaCorrente> lista = new ArrayList<>();
		
		lista.add(new ContaCorrente(1, 241, Calendar.getInstance(), 188, TipoConta.COMUM));
		lista.add(new ContaCorrente(1, 223, Calendar.getInstance(), 782, TipoConta.PREMIUM));
		lista.add(new ContaCorrente(1, 523, Calendar.getInstance(), 67, TipoConta.ESPECIAL));
	
		for (ContaCorrente c : lista) {
			System.out.println(c.getSaldo());
		}
		
		lista.forEach(c -> System.out.println(c.getSaldo()));
		
	}
}
