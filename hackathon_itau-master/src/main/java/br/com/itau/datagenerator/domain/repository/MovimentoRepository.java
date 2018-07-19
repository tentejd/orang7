package br.com.itau.datagenerator.domain.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.itau.datagenerator.domain.model.Cliente;
import br.com.itau.datagenerator.domain.model.Movimento;

@Repository
public interface MovimentoRepository extends CrudRepository<Movimento, Integer>{
	Iterable<Movimento> findByIdCliente(Cliente idCliente);
}
