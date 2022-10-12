package br.edu.infnet.appprofissional.model.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.appprofissional.model.domain.Profissional;

@Repository
public interface ProfissionalRepository extends CrudRepository<Profissional, Integer> {
}
