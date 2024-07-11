package br.com.ce.crud.domain.service;

import java.util.List;

import org.hibernate.annotations.Comment;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.ObjectUtils;

import br.com.ce.crud.domain.bean.CaixaDomain;
import br.com.ce.crud.domain.service.repository.CaixaRepository;

@Component
public class CaixaService {
	
	@Autowired
	CaixaRepository caixaRepository;
	
	public List<CaixaDomain> listar() {
		return caixaRepository.listar();
	}

	public CaixaDomain findById(Long id) {
		return caixaRepository.findById(id);
	}

	public void save(CaixaDomain converter) {
		caixaRepository.save(converter);
		
	}
	
}
