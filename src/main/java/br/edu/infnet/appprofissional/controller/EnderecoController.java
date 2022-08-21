package br.edu.infnet.appprofissional.controller;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.edu.infnet.appprofissional.AppImpressao;
import br.edu.infnet.appprofissional.model.domain.*;

@Controller
public class EnderecoController {
	private static Map<Integer, Endereco> mapaEndereco = new HashMap<Integer, Endereco>();
	private static Integer id = 1;
	
	public static void incluir(Endereco endereco) {
		endereco.setId(id++);
		mapaEndereco.put(endereco.getId(), endereco);
		AppImpressao.relatorio("Inclusão do Endereço!", endereco);
	}
	
	public static void excluir(Integer id) {
		mapaEndereco.remove(id);
	}
	
	public static Collection<Endereco> obterLista() {
		return mapaEndereco.values();
	}
	
	@GetMapping(value = "/endereco/lista")
	public String telaLista(Model model) {
		model.addAttribute("listagem", obterLista());
		return "endereco/lista";
	}
	
	@GetMapping(value = "/endereco/{id}/excluir")
	public String exclusao(@PathVariable Integer id) {
		excluir(id);
		return "redirect:/endereco/lista";
	}
}
