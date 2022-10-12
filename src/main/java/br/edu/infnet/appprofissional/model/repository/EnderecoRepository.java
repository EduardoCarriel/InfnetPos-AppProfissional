package br.edu.infnet.appprofissional.model.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.appprofissional.model.domain.Endereco;

@Repository
public interface EnderecoRepository extends CrudRepository<Endereco, Integer> {
	
	@Query("from Endereco e where e.usuario.id = :id")
	List<Endereco> obterLista(Integer id);
}
