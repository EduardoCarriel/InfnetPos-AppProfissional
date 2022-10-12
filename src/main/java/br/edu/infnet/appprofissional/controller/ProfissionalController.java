package br.edu.infnet.appprofissional.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

import br.edu.infnet.appprofissional.model.domain.*;
import br.edu.infnet.appprofissional.model.service.ProfissionalService;

@Controller
public class ProfissionalController {
	@Autowired
	private ProfissionalService profissionalService;
	
	@GetMapping(value = "/profissional")
	public String telaCadastro() {
		return "profissional/cadastro";
	}
	
	@PostMapping(value = "/profissional/incluir")
	public String inclusao(Profissional profissional, @SessionAttribute("user") Usuario usuario) {
		profissional.setUsuario(usuario);
		profissionalService.incluir(profissional);
		return "redirect:/profissional/lista";
	}
	
	@GetMapping(value = "/profissional/lista")
	public String telaLista(Model model, @SessionAttribute("user") Usuario usuario) {
		model.addAttribute("listagem", profissionalService.obterLista(usuario));
		return "profissional/lista";
	}
	
	@GetMapping(value = "/profissional/{id}/excluir")
	public String exclusao(@PathVariable Integer id) {
		profissionalService.excluir(id);
		return "redirect:/profissional/lista";
	}
}
