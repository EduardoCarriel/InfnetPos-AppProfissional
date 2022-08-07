package br.edu.infnet.appservico.model.test;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.appservico.model.domain.Profissional;

@Component
@Order(1)
public class ProfissionalTeste implements ApplicationRunner {

	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("## Profissional ##");
		
		Profissional p1 = new Profissional();
		p1.setNome("Eduardo Donato Carriel");
		p1.setEmail("testeemail1@gmail.com");
		p1.setTelefoneCelular("(41) 9 6666-7777");
		System.out.println(p1);
		
		Profissional p2 = new Profissional();
		p2.setNome("Gleyse Kelly Garcia da Silva");
		p2.setEmail("testeemail2@gmail.com");
		p2.setTelefoneCelular("(41) 9 7777-8888");
		System.out.println(p2);
		
		Profissional p3 = new Profissional();
		p3.setNome("Beatriz Donato Carriel");
		p3.setEmail("testeemail3@gmail.com");
		p3.setTelefoneCelular("(41) 9 8888-9999");
		System.out.println(p3);
	}
}