package br.com.fiap.tds.entity;

import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.CreationTimestamp;

@Entity
@Table(name = "TB_ENDERECO")
@SequenceGenerator(name = "ENDERECO", sequenceName = "SQ_TB_ENDERECO", allocationSize = 1)
public class Endereco {

	@Id
	@Column(name = "CD_ENDERECO")
	@GeneratedValue(generator = "ENDERECO", strategy = GenerationType.SEQUENCE)
	private int codigo;
	
	@Column(name = "NR_CEP", length = 8 , nullable = false)
	private String cep;
	
	@Column(name = "DS_LOGRADOURO", length = 50, nullable = false)
	private String logradouro;
	
	@Column(name = "NR_ENDERECO")
	private int numero;
	
	@Column(name = "ST_ATIVO")
	private boolean ativo;
	
	@Enumerated(EnumType.STRING)
	@Column(name = "DS_TIPO_ENDERECO", length = 50)
	private TipoEndereco tipoEndereco;
	
	@CreationTimestamp//Cadastrar a data de forma automática
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DT_CADASTRO", updatable = false)
	private Calendar dataCadastro;
	
	@Override
	public String toString() {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		return "Codigo: " + codigo + "\nCEP: " + cep + "\nLogradouro: " + logradouro + "\nNumero: "
				+ numero + "\nAtivo: " + ativo + "\nTipo de Endereco: " + tipoEndereco + "\nData de Cadastro: "
		+ sdf.format(dataCadastro.getTime());
	}

	public Endereco() {}
	
	public Endereco(String cep, String logradouro, int numero, boolean ativo, TipoEndereco tipoEndereco) {
		this.cep = cep;
		this.logradouro = logradouro;
		this.numero = numero;
		this.ativo = ativo;
		this.tipoEndereco = tipoEndereco;
	}

	public Endereco(int codigo, String cep, String logradouro, int numero, boolean ativo, TipoEndereco tipoEndereco) {
		this.codigo = codigo;
		this.cep = cep;
		this.logradouro = logradouro;
		this.numero = numero;
		this.ativo = ativo;
		this.tipoEndereco = tipoEndereco;
	}

	//Método que é executado automaticamente antes de cadastrar
	@PrePersist
	public void executar() {
		System.out.println("Cadastrando um endereco...");
	}
	
	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
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

	public boolean isAtivo() {
		return ativo;
	}

	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}

	public TipoEndereco getTipoEndereco() {
		return tipoEndereco;
	}

	public void setTipoEndereco(TipoEndereco tipoEndereco) {
		this.tipoEndereco = tipoEndereco;
	}

	public Calendar getDataCadastro() {
		return dataCadastro;
	}

	public void setDataCadastro(Calendar dataCadastro) {
		this.dataCadastro = dataCadastro;
	}
}
