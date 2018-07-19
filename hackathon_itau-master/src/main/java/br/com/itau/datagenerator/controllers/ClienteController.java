package br.com.itau.datagenerator.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import br.com.itau.datagenerator.domain.model.Cliente;
import br.com.itau.datagenerator.domain.model.Movimento;
import br.com.itau.datagenerator.domain.repository.ClienteRepository;
import br.com.itau.datagenerator.domain.repository.MovimentoRepository;

@Controller
@RequestMapping("/cliente")
public class ClienteController {
	
	@Autowired
    private ClienteRepository repository;
	
	@Autowired
    private MovimentoRepository movRep;

	@RequestMapping("/listaClientes")
	public ModelAndView listaClientes() {
		ModelAndView mv = new ModelAndView("index");
		Iterable<Cliente> clientes = repository.findAll();
		mv.addObject("clientes", clientes);
		return mv;
		}
	
	@RequestMapping(value = "/{codigo}", method= RequestMethod.GET)
	public ModelAndView detalhesMovCliente(@PathVariable("codigo") int id) {
		Cliente cliente = repository.findById(id);
		ModelAndView mv = new ModelAndView("/Cliente/detalhesMovimento");
		mv.addObject("cliente", cliente);
		
		Iterable<Movimento> movimentos = movRep.findByIdCliente(cliente);
		mv.addObject("movimentos", movimentos);
		return mv;
	}
	
	
    public ClienteController(ClienteRepository repository) {
        this.repository = repository;
    }

}
