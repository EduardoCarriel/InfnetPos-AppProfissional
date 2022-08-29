package br.edu.infnet.appprofissional.model.test;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.appprofissional.controller.EsteticaController;
import br.edu.infnet.appprofissional.exception.DiasRetornoInvalidoException;
import br.edu.infnet.appprofissional.model.domain.Estetica;

@Component
@Order(2)
public class EsteticaTeste implements ApplicationRunner {

	@Override
	public void run(ApplicationArguments args) {
		System.out.println("## Estética ##");
		
		try {
			Estetica e1 = new Estetica();
			e1.setCodigo(1);
			e1.setDescricao("Limpeza de pele");
			e1.setValor(70);
			e1.setDiasRetorno(20);
			e1.setFacial(true);
			System.out.println("Cálculo do serviço:" + e1.calcularServico(1));
			EsteticaController.incluir(e1);			
		} catch (DiasRetornoInvalidoException e) {
			System.out.println("Ocorreu um problema: " + e.getMessage());
		}
		
		try {
			Estetica e2 = new Estetica();
			e2.setCodigo(8);
			e2.setDescricao("Massagem completa");
			e2.setValor(220);
			e2.setCorporal(true);
			System.out.println("Cálculo do serviço:" + e2.calcularServico(1));
			EsteticaController.incluir(e2);
		} catch (DiasRetornoInvalidoException e) {
			System.out.println("Ocorreu um problema: " + e.getMessage());
		}
		
		try {
			Estetica e3 = new Estetica();
			e3.setCodigo(17);
			e3.setDescricao("Corte e pintura com mechas");
			e3.setValor(550);
			e3.setCapilar(true);
			System.out.println("Cálculo do serviço:" + e3.calcularServico(1));
			EsteticaController.incluir(e3);
		} catch (DiasRetornoInvalidoException e) {
			System.out.println("Ocorreu um problema: " + e.getMessage());
		}
		
		try {
			Estetica e3 = new Estetica();
			e3.setCodigo(20);
			e3.setDescricao("Alisamento");
			e3.setValor(300);
			e3.setCapilar(true);
			System.out.println("Cálculo do serviço:" + e3.calcularServico(2));
			EsteticaController.incluir(e3);
		} catch (DiasRetornoInvalidoException e) {
			System.out.println("Ocorreu um problema: " + e.getMessage());
		}
	}
}