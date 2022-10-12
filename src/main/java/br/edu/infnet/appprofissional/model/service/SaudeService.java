package br.edu.infnet.appprofissional.model.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.appprofissional.AppImpressao;
import br.edu.infnet.appprofissional.model.domain.Saude;
import br.edu.infnet.appprofissional.model.repository.SaudeRepository;

@Service
public class SaudeService {
	@Autowired
	private SaudeRepository saudeRepository;
	
	public void incluir(Saude saude) {
		saudeRepository.save(saude);
		AppImpressao.relatorio("Inclusão de Saude!", saude);
	}
	
	public void excluir(Integer id) {
		saudeRepository.deleteById(id);
	}
	
	public Collection<Saude> obterLista() {
		return (Collection<Saude>) saudeRepository.findAll();
	}
}
