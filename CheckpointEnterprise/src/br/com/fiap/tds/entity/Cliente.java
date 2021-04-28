package br.com.fiap.tds.entity;

import java.util.Calendar;

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
@Table(name = "TB_NAC_CLIENTE")
@SequenceGenerator(name = "cliente", sequenceName = "SQ_TB_NAC_CLIENTE", allocationSize = 1)
public class Cliente {
	
	@Id
	@Column(name = "ID_CLIENTE")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "cliente")
	private int id;
	
	@Column(name = "NM_CLIENTE", length = 50, nullable = false)
	private String nome;
	
	@Column(name = "NR_TELEFONE", length = 11, nullable = false)
	private long telefone;
	
	@Column(name = "NR_CPF", length = 15, nullable = false)
	private String cpf;
	
	@Column(name = "DT_CADASTRO", updatable = false)
	@Temporal(TemporalType.DATE)
	@CreationTimestamp
	private Calendar date;
	
	public Cliente() {}

	
	public Cliente(String nome, long telefone, String cpf) {
		this.nome = nome;
		this.telefone = telefone;
		this.cpf = cpf;
	}


	public Cliente(int id, String nome, long telefone, String cpf) {
		super();
		this.id = id;
		this.nome = nome;
		this.telefone = telefone;
		this.cpf = cpf;
	}


	public Cliente(int id, String nome, long telefone, String cpf, Calendar date) {
		this.id = id;
		this.nome = nome;
		this.telefone = telefone;
		this.cpf = cpf;
		this.date = date;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public long getTelefone() {
		return telefone;
	}

	public void setTelefone(long telefone) {
		this.telefone = telefone;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Calendar getDate() {
		return date;
	}

	public void setDate(Calendar date) {
		this.date = date;
	}
}
