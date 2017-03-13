package br.com.cielo.service;

import java.util.Collection;
import br.com.cielo.poc.model.EstabelecimentoComercial;

public interface EstabelecimentoComercialService {
	
	public EstabelecimentoComercial findByCodigo(Long codigo);
	
	public Collection<EstabelecimentoComercial> findAll();
	
	public EstabelecimentoComercial create (EstabelecimentoComercial estabelecimento);
	
	public EstabelecimentoComercial update (EstabelecimentoComercial estabelecimento);
	
	public void delete(EstabelecimentoComercial estabelecimento);

}
