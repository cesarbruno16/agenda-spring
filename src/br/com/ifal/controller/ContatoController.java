package br.com.ifal.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
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
	public String novo(@Valid Contato contato, BindingResult result){
		if (result.hasFieldErrors("nome") | result.hasFieldErrors("email")){
			return "contato/novo";
		}		
		ContatoDAO.getInstance().addTarefa(contato);
		return "contato/lista";
	}
}
