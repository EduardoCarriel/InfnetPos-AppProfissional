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
public class EsteticaController {
	private static Map<Integer, Estetica> mapaEstetica = new HashMap<Integer, Estetica>();
	private static Integer id = 1;
	
	public static void incluir(Estetica estetica) {
		estetica.setId(id++);
		mapaEstetica.put(estetica.getId(), estetica);
		AppImpressao.relatorio("Inclusão do Serviço " + estetica.getDescricao() + "!", estetica);
	}
	
	public static void excluir(Integer id) {
		mapaEstetica.remove(id);
	}
	
	public static Collection<Estetica> obterLista() {
		return mapaEstetica.values();
	}
	
	@GetMapping(value = "/estetica/lista")
	public String telaLista(Model model) {
		model.addAttribute("listagem", obterLista());
		return "estetica/lista";
	}
	
	@GetMapping(value = "/estetica/{id}/excluir")
	public String exclusao(@PathVariable Integer id) {
		excluir(id);
		return "redirect:/estetica/lista";
	}
}
