package com.algaworks;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ContatosControle {
	
	private static final ArrayList<Contato> LISTA_CONTATOS = new ArrayList<>();
	
	static {
		LISTA_CONTATOS.add(new Contato("1", "Mario", "449846546"));
		LISTA_CONTATOS.add(new Contato("2", "Joao", "449846546"));
		LISTA_CONTATOS.add(new Contato("3", "Iury", "449846546"));
		LISTA_CONTATOS.add(new Contato("4", "Bianca", "449846546"));
		LISTA_CONTATOS.add(new Contato("5", "Jesus", "449846546"));
	}
	
	@GetMapping("/")
	public String index() {
		return "index";
	}
	
	@GetMapping("/contatos")
	public ModelAndView Listar() {
		ModelAndView  modelAndView = new ModelAndView("listar");
		
		modelAndView.addObject("contatos", LISTA_CONTATOS);
		
		return modelAndView;
	}
	
	
}
