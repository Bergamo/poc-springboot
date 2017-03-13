package br.com.cielo.poc.repository;

import org.springframework.data.repository.CrudRepository;
import br.com.cielo.poc.model.Contato;

public interface ContatoRepository extends CrudRepository<Contato, Long>{

}
