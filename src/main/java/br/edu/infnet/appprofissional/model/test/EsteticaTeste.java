package br.edu.infnet.appprofissional.model.test;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.appprofissional.AppImpressao;
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
		e1.setQuantidade(1);
		e1.setValorUnitario(70);
		e1.setDiasRetorno(20);
		e1.setFacial(true);
		AppImpressao.relatorio("Inclusão do Serviço " + e1.getDescricao() + "!", e1);
		
		Estetica e2 = new Estetica();
		e2.setCodigo(8);
		e2.setDescricao("Massagem completa");
		e2.setQuantidade(1);
		e2.setValorUnitario(220);
		e2.setCorporal(true);
		AppImpressao.relatorio("Inclusão do Serviço " + e2.getDescricao() + "!", e2);
		
		Estetica e3 = new Estetica();
		e3.setCodigo(17);
		e3.setDescricao("Corte e pintura com mechas");
		e3.setQuantidade(1);
		e3.setValorUnitario(550);
		e3.setCapilar(true);
		AppImpressao.relatorio("Inclusão do Serviço " + e3.getDescricao() + "!", e3);
	}
}