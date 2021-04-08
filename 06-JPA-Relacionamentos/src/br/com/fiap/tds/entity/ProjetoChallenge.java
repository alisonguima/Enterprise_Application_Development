package br.com.fiap.tds.entity;

import java.util.Calendar;

import javax.persistence.*;

@Entity
@Table(name = "TB_PROJETO_CHALLENGE")
@SequenceGenerator(name = "projeto", sequenceName = "SQ_TB_PROJETO_CHALLENGE", allocationSize = 1)
public class ProjetoChallenge {

	@Id
	@GeneratedValue(generator = "projeto", strategy = GenerationType.SEQUENCE)
	@Column(name = "CD_PROJETO")
	private int codigo;
	
	@Column(name = "NM_PROJETO", length = 60, nullable = false)
	private String nome;
	
	@Column(name = "DS_PROJETO", length = 400)
	private String descricao;
	
	@Temporal(TemporalType.DATE)
	@Column(name = "DT_INICIO", nullable = false)
	private Calendar dataInicio;
	
	@Temporal(TemporalType.DATE)
	@Column(name = "DT_FIM", nullable = false)
	private Calendar dataFim;
	
	@Enumerated(EnumType.STRING)
	@Column(name = "DS_TIPO", length = 20)
	private TipoProjeto tipo;
	
	@Column(name = "VL_NOTA")
	private Float nota;
	
	//Mapear o relacionamento no 1 - 1 bidirecional
	//mappedBy -> sempre utilizado no bidirecional
	//Define o atributo que mapeia a relação no BD
	@OneToOne(mappedBy = "projeto")
	private GrupoChallenge grupo;
}
