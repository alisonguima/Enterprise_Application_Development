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
@Table(name = "TB_ESTABELECIMENTO")
@SequenceGenerator(name = "estabelecimento", sequenceName = "SQ_ESTABELECIMENTO", allocationSize = 1)
public class Estabelecimento {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "estabelecimento")
	@Column(name = "cd_estabelecimento")
	private int codigo;
	@Column(name = "nm_estabelecimento", length = 70, nullable = false)
	private String estabelecimento;
	@Column(name = "nr_cnpj", length = 22, nullable = false)
	private String cnpj;
	@Column(name = "ds_tipo")
	@Enumerated(EnumType.STRING)
	private TipoEmpresa tipo;

	public Estabelecimento() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Estabelecimento(String estabelecimento, String cnpj, TipoEmpresa tipo) {
		super();
		this.estabelecimento = estabelecimento;
		this.cnpj = cnpj;
		this.tipo = tipo;
	}

	public Estabelecimento(int codigo, String estabelecimento, String cnpj, TipoEmpresa tipo) {
		super();
		this.codigo = codigo;
		this.estabelecimento = estabelecimento;
		this.cnpj = cnpj;
		this.tipo = tipo;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getEstabelecimento() {
		return estabelecimento;
	}

	public void setEstabelecimento(String estabelecimento) {
		this.estabelecimento = estabelecimento;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public TipoEmpresa getTipo() {
		return tipo;
	}

	public void setTipo(TipoEmpresa tipo) {
		this.tipo = tipo;
	}
}