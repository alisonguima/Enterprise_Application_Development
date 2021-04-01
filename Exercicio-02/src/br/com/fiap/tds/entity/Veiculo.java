package br.com.fiap.tds.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="T_VEICULO")
@SequenceGenerator(name="Veiculo", sequenceName = "SQ_T_VEICULO", allocationSize = 1)
public class Veiculo {
	
	@Id
	@Column(name="CD_VEICULO")
	private int codigo;
	
	@Column(name="DS_PLACA", length = 9, nullable = false)
	private String placa;
	
	@Column(name="DS_COR", length = 20, nullable = false)
	private String cor;
	
	@Column(name="NR_ANO")
	private int ano;
	
	public Veiculo() {}
	
	public Veiculo(int codigo, String placa, String cor, int ano) {
		this.codigo = codigo;
		this.placa = placa;
		this.cor = cor;
		this.ano = ano;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
}
