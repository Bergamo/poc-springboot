package br.com.cielo.poc.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import br.com.cielo.poc.model.Contato;
import br.com.cielo.service.ContatoService;

@RestController
public class ContatoController {
	@Autowired
	private ContatoService service;
	
	@RequestMapping(value = "/contatos/{codigo}", method = RequestMethod.GET)
	public Contato get(@PathVariable Long codigo){
		return service.findByCodigo(codigo);
	}

	@RequestMapping(value = "/contatos", method = RequestMethod.POST)
	public @ResponseBody Contato insert(@RequestBody Contato contato) {
		return service.create(contato);
	}

	@RequestMapping(value = "/contatos", method = RequestMethod.GET)
	public Collection<Contato> get() {
		return (Collection<Contato>)service.findAll();
	}
	
	@RequestMapping(value = "/contatos", method = RequestMethod.PUT)
	public @ResponseBody Contato update(@RequestBody Contato contato){
		return service.update(contato);
	}
	
	@RequestMapping(value = "/contatos/{codigo}", method = RequestMethod.DELETE)
	public void delete(@PathVariable Long codigo){
		Contato contato = service.findByCodigo(codigo); 
		service.delete(contato);
	}
}
