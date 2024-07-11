package br.com.ce.crud.persistence.amqp.entity;

import lombok.Data;

@Data
public class CaixaEntity {
	
	private Long id;
	private String nome;
	private Double saldoDezReais;
	private Double saldoVinteReais;
	private Double saldoCinquentaReais;
	private Double saldoCemReais;
	
}