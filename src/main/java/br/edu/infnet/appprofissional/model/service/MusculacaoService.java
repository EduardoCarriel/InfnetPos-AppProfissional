package br.edu.infnet.appprofissional.model.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.appprofissional.AppImpressao;
import br.edu.infnet.appprofissional.model.domain.Musculacao;
import br.edu.infnet.appprofissional.model.repository.MusculacaoRepository;

@Service
public class MusculacaoService {
	@Autowired
	private MusculacaoRepository musculacaoRepository;
	
	public void incluir(Musculacao musculacao) {
		musculacaoRepository.save(musculacao);
		AppImpressao.relatorio("Inclusão de Musculacao!", musculacao);
	}
	
	public void excluir(Integer id) {
		musculacaoRepository.deleteById(id);
	}
	
	public Collection<Musculacao> obterLista() {
		return (Collection<Musculacao>) musculacaoRepository.findAll();
	}
}
