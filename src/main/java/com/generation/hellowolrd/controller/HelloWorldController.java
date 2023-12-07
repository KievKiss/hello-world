package com.generation.hellowolrd.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hl")
public class HelloWorldController {
	
	@GetMapping("helloworld")
	public String helloWold() {
		return "<body style=\"background-color: black; color: white;\">Hello World!</body>";
	}
	
	
	@GetMapping("bsm")
	public String bsm() {
	    return "BSM Generation Brazil:<br/>Persistência;<br/>"
	            + "Mentalidade de Crescimento;<br/>"
	            + "Responsabilidade Pessoal;<br/>"
	            + "Orientação ao Futuro;<br/>"
	            + "Proatividade;<br/>"
	            + "Comunicação;<br/>"
	            + "Trabalho em Equipe;<br/>"
	            + "Orientação ao Detalhe.";
	}


	
	@GetMapping("aprendizagem")
	public String aprendizagem() {
		return "Aprendizagem da semana:<br/>Persistência;<br/>"
	            + "Mentalidade de Crescimento;<br/>"
	            + "Responsabilidade Pessoal;<br/>"
	            + "Orientação ao Futuro;<br/>"
	            + "Proatividade;<br/>"
	            + "Comunicação;<br/>"
	            + "Trabalho em Equipe;<br/>"
	            + "Orientação ao Detalhe.";
	
	
}
