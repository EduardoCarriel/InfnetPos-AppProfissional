package br.edu.infnet.appprofissional.model.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.appprofissional.model.domain.Usuario;

@Repository
public interface UsuarioRepository extends CrudRepository<Usuario, Integer> {
	
	@Query("from Usuario u where u.email = :email")
	Usuario obterUsuario(String email);
	
	@Query("from Usuario u where u.email = :email and u.senha = :senha")
	Usuario obterUsuario(String email, String senha);
}
