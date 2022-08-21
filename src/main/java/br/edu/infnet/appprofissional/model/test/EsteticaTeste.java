package br.edu.infnet.appprofissional.model.test;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.appprofissional.controller.EsteticaController;
import br.edu.infnet.appprofissional.model.domain.Estetica;

@Component
@Order(2)
public class EsteticaTeste implements ApplicationRunner {

	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("## Estética ##");
		
		Estetica e1 = new Estetica();
		e1.setCodigo(1);
		e1.setDescricao("Limpeza de pele");
		e1.setValor(70);
		e1.setDiasRetorno(20);
		e1.setFacial(true);
		EsteticaController.incluir(e1);
		
		Estetica e2 = new Estetica();
		e2.setCodigo(8);
		e2.setDescricao("Massagem completa");
		e2.setValor(220);
		e2.setCorporal(true);
		EsteticaController.incluir(e2);
		
		Estetica e3 = new Estetica();
		e3.setCodigo(17);
		e3.setDescricao("Corte e pintura com mechas");
		e3.setValor(550);
		e3.setCapilar(true);
		EsteticaController.incluir(e3);
	}
}