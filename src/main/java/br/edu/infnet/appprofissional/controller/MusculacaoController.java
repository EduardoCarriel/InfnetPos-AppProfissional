package br.edu.infnet.appprofissional.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MusculacaoController {
	
	@GetMapping(value = "/musculacao/lista")
	public String telaLista() {
		return "musculacao/lista";
	}
}
