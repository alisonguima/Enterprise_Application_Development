package br.com.fiap.tds.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.CreationTimestamp;

@Entity
@Table(name = "TB_ESTABELECIMENTO")
@SequenceGenerator(name = "fornecedor", sequenceName = "SQ_FORNECEDOR", allocationSize = 1)
public class Fornecedor {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "fornecedor")
	@Column(name = "cd_fornecedor")
	private int codigo;
	@Column(name = "nm_fornecedor", length = 60, nullable = false)
	private String nome;
	@Column(name = "dt_cadastro", updatable = false)
	@Temporal(TemporalType.TIMESTAMP)
	@CreationTimestamp
	private Date dataCadastro;

	public Fornecedor() {
	}

	public Fornecedor(String nome) {
		super();
		this.nome = nome;
	}

	public Fornecedor(int codigo, String nome) {
		super();
		this.codigo = codigo;
		this.nome = nome;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Date getDataCadastro() {
		return dataCadastro;
	}

	public void setDataCadastro(Date dataCadastro) {
		this.dataCadastro = dataCadastro;
	}
}