package br.edu.infnet.appprofissional.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import br.edu.infnet.appprofissional.model.domain.*;
import br.edu.infnet.appprofissional.model.service.MusculacaoService;

@Controller
public class MusculacaoController {
	@Autowired
	private MusculacaoService musculacaoService;
	
	@GetMapping(value = "/musculacao")
	public String telaCadastro() {
		return "musculacao/cadastro";
	}
	
	@PostMapping(value = "/musculacao/incluir")
	public String inclusao(Musculacao musculacao) {
		musculacaoService.incluir(musculacao);
		return "redirect:/musculacao/lista";
	}
	
	@GetMapping(value = "/musculacao/lista")
	public String telaLista(Model model) {
		model.addAttribute("listagem", musculacaoService.obterLista());
		return "musculacao/lista";
	}
	
	@GetMapping(value = "/musculacao/{id}/excluir")
	public String exclusao(@PathVariable Integer id) {
		musculacaoService.excluir(id);
		return "redirect:/musculacao/lista";
	}
}
