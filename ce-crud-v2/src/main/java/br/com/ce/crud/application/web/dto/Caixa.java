package br.com.ce.crud.application.web.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode
public class Caixa {
	
	private Long id;
	private String nome;
	private Double saldoDezReais;
	private Double saldoVinteReais;
	private Double saldoCinquentaReais;
	private Double saldoCemReais;
	
	
}