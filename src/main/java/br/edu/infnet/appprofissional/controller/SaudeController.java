package br.edu.infnet.appprofissional.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import br.edu.infnet.appprofissional.model.domain.*;
import br.edu.infnet.appprofissional.model.service.SaudeService;

@Controller
public class SaudeController {
	@Autowired
	private SaudeService saudeService;
	
	@GetMapping(value = "/saude")
	public String telaCadastro() {
		return "saude/cadastro";
	}
	
	@PostMapping(value = "/saude/incluir")
	public String inclusao(Saude saude) {
		saudeService.incluir(saude);
		return "redirect:/saude/lista";
	}
	
	@GetMapping(value = "/saude/lista")
	public String telaLista(Model model) {
		model.addAttribute("listagem", saudeService.obterLista());
		return "saude/lista";
	}
	
	@GetMapping(value = "/saude/{id}/excluir")
	public String exclusao(@PathVariable Integer id) {
		saudeService.excluir(id);
		return "redirect:/saude/lista";
	}
}
