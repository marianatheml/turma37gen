package com.primeiralista.atividade.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Atividade {
	
	@GetMapping("/atividade1")
	public String atividade1 () {
		return "Persistência e Orientação aos Detalhes";
	}
	
	@GetMapping("/atividade2")
	public String atividade2 () {
		return "Objetivo de Aprendizagem é entender bem os conceitos e funcionalidades do Spring-boot";
	}

}
