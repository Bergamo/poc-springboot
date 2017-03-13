package br.com.cielo.poc.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import br.com.cielo.poc.model.EstabelecimentoComercial;
import br.com.cielo.service.EstabelecimentoComercialService;

@RestController
public class EstabelecimentoComercialController {
	
	@Autowired
	private EstabelecimentoComercialService service;
	
	@RequestMapping(value = "/estabelecimentos/{codigo}", method = RequestMethod.GET)
	public EstabelecimentoComercial get(@PathVariable Long codigo){
		return service.findByCodigo(codigo);
	}

	@RequestMapping(value = "/estabelecimentos", method = RequestMethod.POST)
	public @ResponseBody EstabelecimentoComercial insert(@RequestBody EstabelecimentoComercial estabelecimento) {
		return service.create(estabelecimento);
	}

	@RequestMapping(value = "/estabelecimentos", method = RequestMethod.GET)
	public Collection<EstabelecimentoComercial> get() {
		return (Collection<EstabelecimentoComercial>)service.findAll();
	}
	
	@RequestMapping(value = "/estabelecimentos", method = RequestMethod.PUT)
	public @ResponseBody EstabelecimentoComercial update(@RequestBody EstabelecimentoComercial estabelecimento){
		return service.update(estabelecimento);
	}
	
	@RequestMapping(value = "/estabelecimentos/{codigo}", method = RequestMethod.DELETE)
	public void delete(@PathVariable Long codigo){
		EstabelecimentoComercial estabelecimento = service.findByCodigo(codigo); 
		service.delete(estabelecimento);
	}
}
