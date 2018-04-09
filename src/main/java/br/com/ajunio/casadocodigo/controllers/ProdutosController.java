package br.com.ajunio.casadocodigo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.ajunio.casadocodigo.daos.ProdutoDAO;
import br.com.ajunio.casadocodigo.models.Produto;
import br.com.ajunio.casadocodigo.models.TipoPreco;

@Controller
public class ProdutosController {
	
	@Autowired
	private ProdutoDAO produtoDAO;
	
	@RequestMapping("/products")
	public String produtos(){
		return null;
	}

	@RequestMapping("produtos/form")
	public ModelAndView form(){
	
		ModelAndView modelAndView = new ModelAndView("produtos/form");
		modelAndView.addObject("tipos",TipoPreco.values());
		return modelAndView;
	}
	
	@RequestMapping("/produtos")
	public String grava(Produto produto){
		produtoDAO.gravar(produto);
		return "";
	}
	
}
