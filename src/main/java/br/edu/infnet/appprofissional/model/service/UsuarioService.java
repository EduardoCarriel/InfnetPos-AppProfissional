package br.edu.infnet.appprofissional.model.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.appprofissional.AppImpressao;
import br.edu.infnet.appprofissional.model.domain.Usuario;
import br.edu.infnet.appprofissional.model.repository.UsuarioRepository;

@Service
public class UsuarioService {
	@Autowired
	private UsuarioRepository usuarioRepository;
	
	public Usuario validar(String email, String senha) {
		Usuario usuario = usuarioRepository.obterUsuario(email, senha);
		
		if (usuario != null && senha.equals(usuario.getSenha())) {
			return usuario;
		}
		return null;
	}
	
	public void incluir(Usuario usuario) {
		usuarioRepository.save(usuario);
		AppImpressao.relatorio("Inclusão do usuário " + usuario.getNome() + "!", usuario);
	}
	
	public void excluir(Integer id) {
		usuarioRepository.deleteById(id);
	}
	
	public Collection<Usuario> obterLista() {
		return (Collection<Usuario>) usuarioRepository.findAll();
	}
}
