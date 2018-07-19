package br.com.itau.datagenerator.domain.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import br.com.itau.datagenerator.domain.model.*;

@Repository
public interface AtivoRepository extends CrudRepository<Ativo, Integer> {

	@Query("Select a from Ativo a inner join Movimento m on a.codigo = m.idAtivo.codigo where m.idCliente.codigo = :idCliente")
	public List<Ativo> listarAtivos(@Param("idCliente") Integer idCliente);
	
}
