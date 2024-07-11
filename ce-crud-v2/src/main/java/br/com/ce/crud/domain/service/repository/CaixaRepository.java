package br.com.ce.crud.domain.service.repository;

import java.util.List;

import br.com.ce.crud.domain.bean.CaixaDomain;

public interface CaixaRepository {
	
	public List<CaixaDomain> listar();

	public CaixaDomain findById(Long id);

	public void save(CaixaDomain caixaDomain);
	
}