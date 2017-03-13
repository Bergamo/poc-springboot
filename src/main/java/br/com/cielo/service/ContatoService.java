package br.com.cielo.service;

import java.util.Collection;
import br.com.cielo.poc.model.Contato;


public interface ContatoService {
	
	public Contato findByCodigo(Long codigo);
	
	public Collection<Contato> findAll();
	
	public Contato create (Contato contato);
	
	public Contato update (Contato contato);
	
	public void delete(Contato contato);
}
