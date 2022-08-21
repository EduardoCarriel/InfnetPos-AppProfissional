package br.edu.infnet.appprofissional.model.test;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.appprofissional.AppImpressao;
import br.edu.infnet.appprofissional.model.domain.Saude;

@Component
@Order(5)
public class SaudeTeste implements ApplicationRunner {

	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("## Saúde ##");
		
		Saude s1 = new Saude();
		s1.setCodigo(1);
		s1.setDescricao("Consulta para tratamento de cravos e espinhas");
		s1.setQuantidade(1);
		s1.setValorUnitario(300);
		s1.setEspecialidade("Dermatologista");
		s1.setRetornoProximoMes(true);
		AppImpressao.relatorio("Inclusão do Serviço " + s1.getDescricao() + "!", s1);
		
		Saude s2 = new Saude();
		s2.setCodigo(2);
		s2.setDescricao("Reabilitação após cirurgia de ombro");
		s2.setQuantidade(10);
		s2.setValorUnitario(150);
		s2.setEspecialidade("Fisioterapia");
		AppImpressao.relatorio("Inclusão do Serviço " + s2.getDescricao() + "!", s2);
		
		Saude s3 = new Saude();
		s3.setCodigo(3);
		s3.setDescricao("Acompanhamento Pediatra");
		s3.setQuantidade(1);
		s3.setValorUnitario(200);
		s3.setEspecialidade("Pediatria");
		s3.setIdadeMinima(0);
		s3.setIdadeMaxima(20);
		s3.setRetornoProximoMes(true);
		AppImpressao.relatorio("Inclusão do Serviço " + s3.getDescricao() + "!", s3);
	}
}