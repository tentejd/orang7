package br.com.itau.datagenerator.domain.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.itau.datagenerator.domain.model.Cliente;
import br.com.itau.datagenerator.domain.model.Plataforma;


@Repository
public interface ClienteRepository extends CrudRepository<Cliente, Integer> {
	Cliente findById(int id);
	
	Iterable<Cliente> findByPlataforma(Plataforma plataforma);
}
