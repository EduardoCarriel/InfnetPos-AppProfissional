package br.edu.infnet.appprofissional.model.test;


import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.appprofissional.controller.UsuarioController;
import br.edu.infnet.appprofissional.model.domain.Usuario;

@Component
@Order(6)
public class UsuarioTeste implements ApplicationRunner {

	@Override
	public void run(ApplicationArguments args) throws Exception {
		Usuario usuario = new Usuario("Eduardo Donato Carriel", "eduardodonatocarriel@gmail.com", "senhateste123");
		UsuarioController.incluir(usuario);
	}
}