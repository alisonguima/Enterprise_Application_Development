package br.com.fiap.tds.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "TB_NAC_BEBIDA")
@SequenceGenerator(name = "bebida", sequenceName = "SQ_TB_NAC_BEBIDA", allocationSize = 1)
public class Bebida {
	
	@Id
	@Column(name = "ID_BEBIDA")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "bebida")
	private int id;
	
	@Column(name = "DS_BEBIDA", nullable = false, length = 30)
	private String descricao;
	
	@Column(name = "ST_ALCOOL", nullable = false)
	private boolean alcoolica;
	
	@Column(name = "DS_MARCA", length = 20)
	@Enumerated(EnumType.STRING)
	private Marca marca;
	
	@Column(name = "VL_BEBIDA", nullable = false, precision = 5, scale = 2)
	private double valor;
	
	public Bebida() {}

	public Bebida(String descricao, boolean alcoolica, Marca marca, double valor) {
		this.descricao = descricao;
		this.alcoolica = alcoolica;
		this.marca = marca;
		this.valor = valor;
	}
	
	public Bebida(int id, String descricao, boolean alcoolica, Marca marca, double valor) {
		this.id = id;
		this.descricao = descricao;
		this.alcoolica = alcoolica;
		this.marca = marca;
		this.valor = valor;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public boolean isAlcoolica() {
		return alcoolica;
	}

	public void setAlcoolica(boolean alcoolica) {
		this.alcoolica = alcoolica;
	}

	public Marca getMarca() {
		return marca;
	}

	public void setMarca(Marca marca) {
		this.marca = marca;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}
}
