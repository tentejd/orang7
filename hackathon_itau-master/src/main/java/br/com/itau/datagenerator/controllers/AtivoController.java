package br.com.itau.datagenerator.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.itau.datagenerator.domain.model.*;
import br.com.itau.datagenerator.domain.repository.AtivoRepository;

@Controller
@RequestMapping("/ativo")
public class AtivoController extends BaseCrudController<Ativo, Integer> {

	@Autowired
	private AtivoRepository repository;

	@RequestMapping("/listaAtivos")
	public ModelAndView listaMovimentos() {
		ModelAndView mv = new ModelAndView("ativo");
		Iterable<Ativo> ativos = repository.findAll();
		mv.addObject("ativos", ativos);
		return mv;
	}
	
	

	public AtivoController(AtivoRepository repository) {
		this.repository = repository;
	}

	@Override
	protected CrudRepository<Ativo, Integer> getRepository() {
		return this.repository;
	}

}
