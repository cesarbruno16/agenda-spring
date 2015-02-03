package br.com.ifal.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.ifal.core.Contato;
import br.com.ifal.dao.ContatoDAO;

@Controller
public class ContatoController {
	
	/*Mapamento do arquivo novo.jsp*/
	@RequestMapping("novoContato")
	public String form(){
		return "contato/novo";
	}
	
	@RequestMapping("adicionaContato")
	/*Recebe como parâmetro, além do objeto de Contato (que será validado),
	 * um objeto de BindingResult que servirá para verificar o erro e um objeto
	 * Model para que seja possível fazer a passagem do ArrayList<Contato> para a página lista.jsp*/
	public String novo(@Valid Contato contato, BindingResult result, Model model){
		if (result.hasFieldErrors("nome") | result.hasFieldErrors("email")){
			return "contato/novo";
		}		
		ContatoDAO.getInstance().addTarefa(contato);
		model.addAttribute("contatos", ContatoDAO.getInstance().getContatos());
		return "contato/lista";
	}
	
	@RequestMapping("listaContato")
	public String lista(Model model){
		/* Esse objeto do tipo model funcionará de maneira semelhante ao Map<>,
		 * quando for requisitado ${contatos}, o retorno é a lista de contatos*/
		model.addAttribute("contatos", ContatoDAO.getInstance().getContatos());
		return "contato/lista";
	}
}
