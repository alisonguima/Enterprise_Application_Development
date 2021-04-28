package br.com.fiap.tds.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "TB_NAC_ENDERECO")
@SequenceGenerator(name = "endereco", sequenceName = "SQ_TB_NAC_ENDERECO", allocationSize = 1)
public class Endereco {
	
	@Id
	@Column(name = "ID_ENDERECO")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "endereco")
	private int id;
	
	@Column(name = "DS_LOGRADOURO", length = 70, nullable = false)
	private String logradouro;
	
	@Column(name = "NR_ENDERECO", length = 5, nullable = false)
	private int numero;
	
	@Column(name = "DS_COMPLEMENTO", length = 20)
	private String complemento;
	
	@Column(name = "DS_REFERENCIA", length = 20)
	private String referencia;
		
	public Endereco() {}

	public Endereco(String logradouro, int numero, String complemento, String referencia) {
		this.logradouro = logradouro;
		this.numero = numero;
		this.complemento = complemento;
		this.referencia = referencia;
	}

	public Endereco(int id, String logradouro, int numero, String complemento, String referencia) {
		this.id = id;
		this.logradouro = logradouro;
		this.numero = numero;
		this.complemento = complemento;
		this.referencia = referencia;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public String getReferencia() {
		return referencia;
	}

	public void setReferencia(String referencia) {
		this.referencia = referencia;
	}
}
