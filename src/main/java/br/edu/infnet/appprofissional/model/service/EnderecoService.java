package br.edu.infnet.appprofissional.model.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.appprofissional.AppImpressao;
import br.edu.infnet.appprofissional.model.domain.Endereco;
import br.edu.infnet.appprofissional.model.domain.Usuario;
import br.edu.infnet.appprofissional.model.repository.EnderecoRepository;

@Service
public class EnderecoService {
	@Autowired
	private EnderecoRepository enderecoRepository;
	
	public void incluir(Endereco endereco) {
		enderecoRepository.save(endereco);
		AppImpressao.relatorio("Inclusão do Endereço!", endereco);
	}
	
	public void excluir(Integer id) {
		enderecoRepository.deleteById(id);
	}
	
	public Collection<Endereco> obterLista() {
		return (Collection<Endereco>) enderecoRepository.findAll();
	}
	
	public Collection<Endereco> obterLista(Usuario usuario) {
		return (Collection<Endereco>) enderecoRepository.obterLista(usuario.getId());
	}
}
