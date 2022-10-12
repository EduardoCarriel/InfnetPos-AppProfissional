package br.edu.infnet.appprofissional.model.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.appprofissional.model.domain.Profissional;

@Repository
public interface ProfissionalRepository extends CrudRepository<Profissional, Integer> {
	
	@Query("from Profissional p where p.usuario.id = :id")
	List<Profissional> obterLista(Integer id);
}
