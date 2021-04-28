package br.com.fiap.tds.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "TB_NAC_SOBREMESA")
@SequenceGenerator(name = "sobremesa", sequenceName = "SQ_TB_NAC_SOBREMESA", allocationSize = 1)
public class Sobremesa {

	@Id
	@Column(name = "ID_SOBREMESA")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sobremesa")
	private int id;
	
	@Column(name = "DS_SOBREMESA", length = 30, nullable = false)
	private String descricao;
	
	@Column(name = "VL_SOBREMESA", precision = 5, scale = 2)
	private double valor;
	
	public Sobremesa() {}

	public Sobremesa(String descricao, double valor) {
		this.descricao = descricao;
		this.valor = valor;
	}
	
	public Sobremesa(int id, String descricao, double valor) {
		this.id = id;
		this.descricao = descricao;
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

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}
}
