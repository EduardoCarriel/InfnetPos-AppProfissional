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
public class ProfissionalController {
	private static Map<Integer, Profissional> mapaProfissional = new HashMap<Integer, Profissional>();
	private static Integer id = 1;
	
	public static void incluir(Profissional profissional) {
		profissional.setId(id++);
		mapaProfissional.put(profissional.getId(), profissional);
		AppImpressao.relatorio("Inclusão do Profissional " + profissional.getNome() + "!", profissional);
	}
	
	public static void excluir(Integer id) {
		mapaProfissional.remove(id);
	}
	
	public static Collection<Profissional> obterLista() {
		return mapaProfissional.values();
	}
	
	@GetMapping(value = "/profissional/lista")
	public String telaLista(Model model) {
		model.addAttribute("listagem", obterLista());
		return "profissional/lista";
	}
	
	@GetMapping(value = "/profissional/{id}/excluir")
	public String exclusao(@PathVariable Integer id) {
		excluir(id);
		return "redirect:/profissional/lista";
	}
}
