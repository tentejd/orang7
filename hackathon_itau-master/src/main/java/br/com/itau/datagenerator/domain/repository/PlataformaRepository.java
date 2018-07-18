package br.com.itau.datagenerator.domain.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.itau.datagenerator.domain.model.*;


@Repository
public interface PlataformaRepository extends CrudRepository<Plataforma, Integer>{
	
	Plataforma findById(int id);

}
