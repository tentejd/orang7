package br.com.itau.datagenerator.controllers;

import br.com.itau.datagenerator.domain.model.Cliente;
import br.com.itau.datagenerator.domain.model.Plataforma;
import br.com.itau.datagenerator.domain.repository.ClienteRepository;
import br.com.itau.datagenerator.domain.repository.PlataformaRepository;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/cliente")
public class ClienteController extends BaseCrudController<Cliente, Integer> {
	@Autowired
    private ClienteRepository repository;
	
	private PlataformaRepository platRep;    

	@RequestMapping("/listaClientes")
	public ModelAndView listaClientes() {
		ModelAndView mv = new ModelAndView("index");
		Iterable<Cliente> clientes = repository.findAll();
		mv.addObject("clientes", clientes);
		return mv;
		}
	
	@RequestMapping(value = "/{id}", method= RequestMethod.GET)
	public ModelAndView detalhesPlataforma(@PathVariable("id") int id) {
		Plataforma plataforma = platRep.findById(id);
		ModelAndView mv = new ModelAndView("evento/detalhesPlataforma");
		mv.addObject("plataforma", plataforma);
		
		Iterable<Cliente> clientes = repository.findByPlataforma(plataforma);
		mv.addObject("clientes", clientes);
		return mv;
	}
	
    public ClienteController(ClienteRepository repository) {
        this.repository = repository;
    }

    @Override
    protected CrudRepository<Cliente, Integer> getRepository() {
        return this.repository;
    }
}
