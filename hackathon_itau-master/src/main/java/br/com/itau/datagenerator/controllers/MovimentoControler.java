package br.com.itau.datagenerator.controllers;

import java.util.ArrayList;
import java.util.Collections;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.itau.datagenerator.domain.model.Movimento;
import br.com.itau.datagenerator.domain.repository.MovimentoRepository;

@Controller
@RequestMapping("/movimento")
public class MovimentoControler extends BaseCrudController<Movimento, Integer> {
	
	@Autowired
    private MovimentoRepository repository;
	
	@RequestMapping("/listaMovimentos")
	public ModelAndView listaMovimentos() {
		ModelAndView mv = new ModelAndView("movimento");
		Iterable<Movimento> movimentos = repository.findAll();
		mv.addObject("movimentos", movimentos);
		return mv;
		}
	
	  public MovimentoControler(MovimentoRepository repository) {
	        this.repository =  repository;
	    }

	@Override
	protected CrudRepository<Movimento, Integer> getRepository() {
		return this.repository;
	}

}
