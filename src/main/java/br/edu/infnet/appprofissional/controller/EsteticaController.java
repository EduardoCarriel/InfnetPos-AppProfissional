package br.edu.infnet.appprofissional.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import br.edu.infnet.appprofissional.model.domain.*;
import br.edu.infnet.appprofissional.model.service.EsteticaService;

@Controller
public class EsteticaController {
	@Autowired
	private EsteticaService esteticaService;
	
	@GetMapping(value = "/estetica")
	public String telaCadastro() {
		return "estetica/cadastro";
	}
	
	@PostMapping(value = "/estetica/incluir")
	public String inclusao(Estetica estetica) {
		esteticaService.incluir(estetica);
		return "redirect:/estetica/lista";
	}
	
	@GetMapping(value = "/estetica/lista")
	public String telaLista(Model model) {
		model.addAttribute("listagem", esteticaService.obterLista());
		return "estetica/lista";
	}
	
	@GetMapping(value = "/estetica/{id}/excluir")
	public String exclusao(@PathVariable Integer id) {
		esteticaService.excluir(id);
		return "redirect:/estetica/lista";
	}
}
