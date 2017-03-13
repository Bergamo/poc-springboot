package br.com.cielo.poc.serviceImplemented;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.cielo.poc.model.EstabelecimentoComercial;
import br.com.cielo.poc.repository.EstabelecimentoComercialRespository;
import br.com.cielo.service.EstabelecimentoComercialService;

@Service
public class EstabelecimentoComercialImplemented implements EstabelecimentoComercialService{
	
	@Autowired
	private EstabelecimentoComercialRespository repository;
	
	public EstabelecimentoComercial findByCodigo(Long codigo) {
		return repository.findOne(codigo);
	}

	public Collection<EstabelecimentoComercial> findAll() {
		return (Collection<EstabelecimentoComercial>) repository.findAll();
	}

	public EstabelecimentoComercial create(EstabelecimentoComercial estabelecimento) {
		return repository.save(estabelecimento);
	}

	public EstabelecimentoComercial update(EstabelecimentoComercial estabelecimento) {
		return repository.save(estabelecimento);
	}

	public void delete(EstabelecimentoComercial estabelecimento) {
		repository.delete(estabelecimento);
	}
}
