package br.edu.infnet.appprofissional.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

import br.edu.infnet.appprofissional.model.domain.*;
import br.edu.infnet.appprofissional.model.service.EnderecoService;

@Controller
public class EnderecoController {
	@Autowired
	private EnderecoService enderecoServico;
	
	@GetMapping(value = "/endereco")
	public String telaCadastro() {
		return "endereco/cadastro";
	}
	
	@PostMapping(value = "/endereco/incluir")
	public String inclusao(Endereco endereco, @SessionAttribute("user") Usuario usuario) {
		endereco.setUsuario(usuario);
		enderecoServico.incluir(endereco);
		return "redirect:/endereco/lista";
	}
	
	@GetMapping(value = "/endereco/lista")
	public String telaLista(Model model, @SessionAttribute("user") Usuario usuario) {
		model.addAttribute("listagem", enderecoServico.obterLista(usuario));
		return "endereco/lista";
	}
	
	@GetMapping(value = "/endereco/{id}/excluir")
	public String exclusao(@PathVariable Integer id) {
		enderecoServico.excluir(id);
		return "redirect:/endereco/lista";
	}
}
