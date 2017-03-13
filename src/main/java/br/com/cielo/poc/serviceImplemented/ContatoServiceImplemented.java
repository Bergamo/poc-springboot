package br.com.cielo.poc.serviceImplemented;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.com.cielo.poc.model.Contato;
import br.com.cielo.poc.repository.ContatoRepository;
import br.com.cielo.service.ContatoService;

@Service
public class ContatoServiceImplemented implements ContatoService{
	
	@Autowired
	private ContatoRepository repository;
	
	public Contato findByCodigo(Long codigo) {
		return repository.findOne(codigo);
	}

	public Collection<Contato> findAll() {
		return (Collection<Contato>)repository.findAll();
	}

	public Contato create(Contato contato) {
		return repository.save(contato);
	}

	public Contato update(Contato contato) {
		return repository.save(contato);
	}

	public void delete(Contato contato) {
		repository.delete(contato);
	}
}
