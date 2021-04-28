package br.com.fiap.tds.entity;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.CreationTimestamp;

@Entity
@Table(name = "TB_NAC_PEDIDO")
@SequenceGenerator(name = "pedido", sequenceName = "SQ_TB_NAC_PEDIDO", allocationSize = 1)
public class Pedido {

	@Id
	@Column(name = "ID_PEDIDO")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "pedido")
	private int id;
	
	@Column(name = "VL_PEDIDO", nullable = false, precision = 8, scale = 2)
	private double valor;
	
	@Column(name = "ST_ENTREGA", nullable = false)
	private boolean statusEntrega;
	
	@Column(name = "DS_PAGAMENTO", nullable = false, length = 20)
	@Enumerated(EnumType.STRING)
	private FormaPagamento forma;
	
	@Column(name = "DT_PEDIDO", updatable = false)
	@Temporal(TemporalType.DATE)
	@CreationTimestamp
	private Calendar data;
	
	public Pedido() {}
	
	public Pedido(double valor, boolean statusEntrega, FormaPagamento forma) {
		this.valor = valor;
		this.statusEntrega = statusEntrega;
		this.forma = forma;
	}

	public Pedido(int id, double valor, boolean statusEntrega, FormaPagamento forma) {
		super();
		this.id = id;
		this.valor = valor;
		this.statusEntrega = statusEntrega;
		this.forma = forma;
	}

	public Pedido(int id, double valor, boolean statusEntrega, FormaPagamento forma, Calendar data) {
		super();
		this.id = id;
		this.valor = valor;
		this.statusEntrega = statusEntrega;
		this.forma = forma;
		this.data = data;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public boolean isStatusEntrega() {
		return statusEntrega;
	}

	public void setStatusEntrega(boolean statusEntrega) {
		this.statusEntrega = statusEntrega;
	}

	public FormaPagamento getForma() {
		return forma;
	}

	public void setForma(FormaPagamento forma) {
		this.forma = forma;
	}

	public Calendar getData() {
		return data;
	}

	public void setData(Calendar data) {
		this.data = data;
	}
}
