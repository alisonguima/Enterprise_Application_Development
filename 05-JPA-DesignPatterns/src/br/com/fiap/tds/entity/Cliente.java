package br.com.fiap.tds.entity;

import javax.persistence.*;

@Entity
@Table(name="TB_CLIENTE")
@SequenceGenerator(name = "cli", sequenceName = "SQ_TB_CLIENTE", allocationSize = 1)
public class Cliente {

	@Id
	@Column(name = "CD_CLIENTE")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "cli")
	private int codigo;
	
	@Column(name = "NM_CLIENTE", length = 50, nullable = false)
	private String nome;
	
	@Column(name = "NR_CPF", length = 22)
	private String cpf;
	
	@Column(name = "ST_ATIVO")
	private boolean ativo;

	public Cliente() {}
	
	public Cliente(String nome, String cpf, boolean ativo) {
		this.nome = nome;
		this.cpf = cpf;
		this.ativo = ativo;
	}
	
	public Cliente(int codigo, String nome, String cpf, boolean ativo) {
		this.codigo = codigo;
		this.nome = nome;
		this.cpf = cpf;
		this.ativo = ativo;
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

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public boolean isAtivo() {
		return ativo;
	}

	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}
}
