package br.org.generation.exercicios.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Atividade2Controller {
	
	@GetMapping("/atividade2")
	public String atv2(){
		return "Objetivos de aprendizagem para essa semana: "
				+ "\nAprender Spring Boot e a aplicação no projeto integrador;"
				+ "\nEntender o que são as API's";
	}

}
