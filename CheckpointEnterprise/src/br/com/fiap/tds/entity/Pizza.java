package br.com.fiap.tds.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "TB_NAC_PIZZA")
@SequenceGenerator(name = "pizza", sequenceName = "SQ_TB_NAC_PIZZA", allocationSize = 1)
public class Pizza {
	
	@Id
	@Column(name = "ID_PIZZA")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "pizza")
	private int id;
	
	@Column(name = "DS_SABOR", length = 30, nullable = false)
	private String sabor;
	
	@Column(name = "VL_PIZZA", precision = 4, scale = 2, nullable = false)
	private double valor;
	
	@Column(name = "DS_INGREDIENTES", length = 80)
	private String ingrediente;
	
	public Pizza() {}
	
	public Pizza(String sabor, double valor, String ingrediente) {
		this.sabor = sabor;
		this.valor = valor;
		this.ingrediente = ingrediente;
	}

	public Pizza(int id, String sabor, double valor, String ingrediente) {
		this.id = id;
		this.sabor = sabor;
		this.valor = valor;
		this.ingrediente = ingrediente;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSabor() {
		return sabor;
	}

	public void setSabor(String sabor) {
		this.sabor = sabor;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public String getIngrediente() {
		return ingrediente;
	}

	public void setIngrediente(String ingrediente) {
		this.ingrediente = ingrediente;
	}
}
