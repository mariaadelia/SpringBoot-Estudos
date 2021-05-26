package br.org.generation.exercicios.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Atividade1Controller {
	
	@GetMapping("/atividade1")
	public String atv1() {
		
		return "Habilidades e Mentalidades usadas nessa atividade: "
				+ "\n\tPersistência; \n\tOrientação ao futuro; \n\tAtenção ao detalhe.";
	}

}
