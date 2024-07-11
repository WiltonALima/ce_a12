package br.com.ce.crud.persistence.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.ce.crud.domain.bean.CaixaDomain;
import br.com.ce.crud.domain.service.repository.CaixaRepository;
import br.com.ce.crud.persistence.service.amqp.CaixaAmqpRepository;

@Component
public class CaixaPersistenceService implements CaixaRepository {
	
	@Autowired
	CaixaAmqpRepository caixaAmqpRepository;
	
	@Override
	public List<CaixaDomain> listar() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CaixaDomain findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void save(CaixaDomain caixaDomain) {
		// TODO Auto-generated method stub
		
	}
	
}
