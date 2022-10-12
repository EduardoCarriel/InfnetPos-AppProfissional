package br.edu.infnet.appprofissional.model.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.appprofissional.AppImpressao;
import br.edu.infnet.appprofissional.model.domain.Estetica;
import br.edu.infnet.appprofissional.model.repository.EsteticaRepository;

@Service
public class EsteticaService {
	@Autowired
	private EsteticaRepository esteticaRepository;
	
	public void incluir(Estetica estetica) {
		esteticaRepository.save(estetica);
		AppImpressao.relatorio("Inclusão de Estetica!", estetica);
	}
	
	public void excluir(Integer id) {
		esteticaRepository.deleteById(id);
	}
	
	public Collection<Estetica> obterLista() {
		return (Collection<Estetica>) esteticaRepository.findAll();
	}
}
