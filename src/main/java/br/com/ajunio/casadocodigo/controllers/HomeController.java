package br.com.ajunio.casadocodigo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@RequestMapping("/")
	public String index(){
		System.out.println("Entramos na home do site!");
		return "home";
	}
	
}
