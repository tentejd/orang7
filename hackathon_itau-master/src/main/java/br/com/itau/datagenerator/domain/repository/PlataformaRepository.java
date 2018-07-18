package br.com.itau.datagenerator.domain.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.dobarco.models.Convidado;
import com.dobarco.models.Evento;

import br.com.itau.datagenerator.domain.model.Cliente;
import br.com.itau.datagenerator.domain.model.Plataforma;

@Repository
public interface PlataformaRepository extends CrudRepository<Plataforma, Integer>{
	
	Iterable<Plataforma> findByCliente(Cliente cliente);

}
