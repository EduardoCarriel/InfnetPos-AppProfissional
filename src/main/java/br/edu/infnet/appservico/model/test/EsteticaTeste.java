package br.edu.infnet.appservico.model.test;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.appservico.model.domain.Estetica;

@Component
@Order(2)
public class EsteticaTeste implements ApplicationRunner {

	@Override
	public void run(ApplicationArguments args) throws Exception {
		Estetica e1 = new Estetica();
		e1.codigo = 1;
		e1.descricao = "Limpeza de pele";
		e1.valor = 70;
		e1.diasRetorno = 20;
		e1.facial = true;
		System.out.println(e1);
		
		Estetica e2 = new Estetica();
		e2.codigo = 8;
		e2.descricao = "Massagem completa";
		e2.valor = 220;
		e2.corporal = true;
		System.out.println(e2);
		
		Estetica e3 = new Estetica();
		e3.codigo = 17;
		e3.descricao = "Corte e pintura com mechas";
		e3.valor = 550;
		e3.capilar = true;
		System.out.println(e3);
	}
}