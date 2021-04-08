package br.com.fiap.tds.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "TB_GRUPO_CHALLENGE")
@SequenceGenerator(name = "grupo", sequenceName = "SQ_TB_GRUPO_CHALLENGE", allocationSize = 1)
public class GrupoChallenge {
	
	@Id
	@GeneratedValue(generator = "grupo", strategy = GenerationType.SEQUENCE)
	@Column(name = "CD_GRUPO")
	private int codigo;
	
	@Column(name = "NM_GRUPO", nullable = false, length =  50)
	private String nome;
	
	//Mapear o relacionamento no 1 - 1 bidirecional
	@OneToOne
	@JoinColumn(name = "CD_PROJETO", nullable = false)
	private ProjetoChallenge projeto;
}
