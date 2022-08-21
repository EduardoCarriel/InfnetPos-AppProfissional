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
public class SaudeController {
	private static Map<Integer, Saude> mapaSaude = new HashMap<Integer, Saude>();
	private static Integer id = 1;
	
	public static void incluir(Saude saude) {
		saude.setId(id++);
		mapaSaude.put(saude.getId(), saude);
		AppImpressao.relatorio("Inclusão do Serviço " + saude.getDescricao() + "!", saude);
	}
	
	public static void excluir(Integer id) {
		mapaSaude.remove(id);
	}
	
	public static Collection<Saude> obterLista() {
		return mapaSaude.values();
	}
	
	@GetMapping(value = "/saude/lista")
	public String telaLista(Model model) {
		model.addAttribute("listagem", obterLista());
		return "saude/lista";
	}
	
	@GetMapping(value = "/saude/{id}/excluir")
	public String exclusao(@PathVariable Integer id) {
		excluir(id);
		return "redirect:/saude/lista";
	}
}
