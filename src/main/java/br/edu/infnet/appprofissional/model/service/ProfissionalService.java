package br.edu.infnet.appprofissional.model.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.appprofissional.AppImpressao;
import br.edu.infnet.appprofissional.model.domain.Profissional;
import br.edu.infnet.appprofissional.model.repository.ProfissionalRepository;

@Service
public class ProfissionalService {
	@Autowired
	private ProfissionalRepository profissionalRepository;
	
	public void incluir(Profissional profissional) {
		profissionalRepository.save(profissional);
		AppImpressao.relatorio("Inclusão do Profissional!", profissional);
	}
	
	public void excluir(Integer id) {
		profissionalRepository.deleteById(id);
	}
	
	public Collection<Profissional> obterLista() {
		return (Collection<Profissional>) profissionalRepository.findAll();
	}
}
