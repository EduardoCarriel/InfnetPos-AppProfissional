package br.edu.infnet.appprofissional.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import br.edu.infnet.appprofissional.model.domain.*;
import br.edu.infnet.appprofissional.model.service.UsuarioService;

@Controller
public class UsuarioController {
	@Autowired
	private UsuarioService usuarioService;
	
	@GetMapping(value = "/usuario")
	public String telaCadastro() {
		return "usuario/cadastro";
	}
	
	@PostMapping(value = "/usuario/incluir")
	public String incluir(Usuario usuario) {
		usuarioService.incluir(usuario);
		return "redirect:/usuario/lista";
	}
	
	@GetMapping(value = "/usuario/lista")
	public String telaLista(Model model) {
		model.addAttribute("listagem", usuarioService.obterLista());
		return "usuario/lista";
	}
	
	@GetMapping(value = "/usuario/{email}/excluir")
	public String excluir(@PathVariable String email) {
		//usuarioService.excluir(email);
		return "redirect:/usuario/lista";
	}
}
