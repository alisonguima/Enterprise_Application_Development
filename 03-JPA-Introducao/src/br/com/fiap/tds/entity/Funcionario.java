package br.com.fiap.tds.entity;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="TB_FUNCIONARIO")
@SequenceGenerator(name = "FUNCIONARIO" ,sequenceName = "SQ_TB_FUNCIONARIO", allocationSize = 1)
public class Funcionario {

	@Id
	@Column(name="CD_FUNCIONARIO")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "FUNCIONARIO")
	private int codigo;
	
	@Column(name="NM_FUNCIONARIO", nullable = false, length = 100)
	private String nome;
	
	@Enumerated(EnumType.STRING)
	@Column(name="DS_TIPO_CONTRATO", nullable = false)
	private TipoContrato tipo;
	
	@Temporal(TemporalType.DATE)
	@Column(name="DT_CONTRATACAO", nullable = false)
	private Calendar dataContratacao;
	
	@Column(name="VL_SALARIO")
	private double salario;
	
	@Lob
	@Column(name="FL_FOTO")
	private byte[] foto;
	
	@Column(name="DS_CARGO", length = 50)
	private String cargo;
	
	@Column(name="ST_DEFICIENTE")
	private boolean deficiente;

	
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

	public TipoContrato getTipo() {
		return tipo;
	}

	public void setTipo(TipoContrato tipo) {
		this.tipo = tipo;
	}

	public Calendar getDataContratacao() {
		return dataContratacao;
	}

	public void setDataContratacao(Calendar dataContratacao) {
		this.dataContratacao = dataContratacao;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public byte[] getFoto() {
		return foto;
	}

	public void setFoto(byte[] foto) {
		this.foto = foto;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public boolean isDeficiente() {
		return deficiente;
	}

	public void setDeficiente(boolean deficiente) {
		this.deficiente = deficiente;
	}
}
