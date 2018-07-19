package br.com.itau.datagenerator.controllers;

import java.util.Comparator;

import br.com.itau.datagenerator.domain.model.*;

public class sortByIdAtivo implements Comparator<Movimento> {

	
	public int compare(Movimento a, Movimento b) {
		return a.getIdAtivo().getCodigo() - b.getIdAtivo().getCodigo();
	}


}
