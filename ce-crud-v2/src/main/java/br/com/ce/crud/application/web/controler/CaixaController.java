package br.com.ce.crud.application.web.controler;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.ce.crud.application.web.dto.Caixa;
import br.com.ce.crud.domain.bean.CaixaDomain;
import br.com.ce.crud.domain.service.CaixaService;

@RestController
@RequestMapping(value = "/caixa")
//@CrossOrigin(origins = "http://192.168.1.32:8081/#/caixas")
public class CaixaController {
	
	
	@Autowired
	private CaixaService caixaService;
	
//	@CrossOrigin(origins = "http://192.168.1.32:8081")
//	@CrossOrigin
	@GetMapping(value = "/listar", produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public List<Caixa> listar() {
		List<Caixa> list = new ArrayList<>();
		caixaService.listar().forEach(c -> list.add(converterToDto(c)));
		return list;
	}
	@PostMapping(value = "/salvar", consumes = MediaType.APPLICATION_JSON_VALUE)
	public void salvar(@RequestBody Caixa caixa) {
		caixaService.save(converter(caixa));
	}
	
	@GetMapping(value = "/{id}")
	public Caixa obterPorId(@PathVariable Long id) {
		return converterToDto(caixaService.findById(id));
	}
	
	private Caixa converterToDto(CaixaDomain c) {
		Caixa caixa = new  Caixa(); 
		BeanUtils.copyProperties(c, caixa);
		return caixa;
	}
	
	private CaixaDomain converter(Caixa c) {
		CaixaDomain caixaDomainaixa = new  CaixaDomain(); 
		BeanUtils.copyProperties(c, caixaDomainaixa);
		return caixaDomainaixa;
	}
	
	
}