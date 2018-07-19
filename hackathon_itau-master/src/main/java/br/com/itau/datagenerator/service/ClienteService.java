package br.com.itau.datagenerator.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.itau.datagenerator.domain.model.*;
import br.com.itau.datagenerator.domain.repository.ClienteRepository;

@Service("employeeService")
public class ClienteService {
	@Autowired
    private static ClienteRepository repository;

	public static List<Cliente> getAllClientes() {
		return (List<Cliente>) repository.findAll();
	}
	
	public Cliente getClienteByCodigo(int codigo) {
		return repository.findByCodigo(codigo);
	}
}
