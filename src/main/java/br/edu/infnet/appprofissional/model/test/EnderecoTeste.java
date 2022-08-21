package br.edu.infnet.appprofissional.model.test;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.appprofissional.AppImpressao;
import br.edu.infnet.appprofissional.model.domain.Endereco;

@Component
@Order(3)
public class EnderecoTeste implements ApplicationRunner {

	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("## Endereço ##");
		
		Endereco e1 = new Endereco(80330777, "Rua Teste01", 650, "Santa Quitéria", "Curitiba", "Paraná");
		AppImpressao.relatorio("Inclusão do Endereço!", e1);

		Endereco e2 = new Endereco(80330888, "Rua Teste02", 480, "Campo Comprido", "Curitiba", "Paraná");
		AppImpressao.relatorio("Inclusão do Endereço!", e2);

		Endereco e3 = new Endereco(80330999, "Rua Teste03", 123, "Mercês", "Curitiba", "Paraná");
		AppImpressao.relatorio("Inclusão do Endereço!", e3);
	}
}