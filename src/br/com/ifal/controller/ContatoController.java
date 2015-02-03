package br.com.ifal.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.ifal.core.Contato;
import br.com.ifal.dao.ContatoDAO;

@Controller
public class ContatoController {
	
	@RequestMapping("novoContato")
	public String form(){
		return "contato/novo";
	}
	
	@RequestMapping("adicionaContato")
	public String novo(Contato contato){
		ContatoDAO.getInstance().addTarefa(contato);
		return "contato/lista";
	}
}
