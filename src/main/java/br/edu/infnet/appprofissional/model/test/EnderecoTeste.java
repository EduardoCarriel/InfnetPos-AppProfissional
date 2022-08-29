package br.edu.infnet.appprofissional.model.test;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.appprofissional.controller.EnderecoController;
import br.edu.infnet.appprofissional.model.domain.Endereco;

@Component
@Order(3)
public class EnderecoTeste implements ApplicationRunner {

	@Override
	public void run(ApplicationArguments args) {
		System.out.println("## Endereço ##");
		
		
		try {
			Endereco e1 = new Endereco(80330777, "Rua Teste01", 650, "Santa Quitéria", "Curitiba", "Paraná");
			EnderecoController.incluir(e1);			
		} catch (Exception e) {
			System.out.println("Ocorreu um problema: " + e.getMessage());
		}
		
		try {			
			Endereco e2 = new Endereco(80330888, "Rua Teste02", 480, "Campo Comprido", "Curitiba", "Paraná");
			EnderecoController.incluir(e2);
		} catch (Exception e) {
			System.out.println("Ocorreu um problema: " + e.getMessage());
		}
		
		try {
			Endereco e3 = new Endereco(80330999, "Rua Teste03", 123, "Mercês", "Curitiba", "Paraná");
			EnderecoController.incluir(e3);
		} catch (Exception e) {
			System.out.println("Ocorreu um problema: " + e.getMessage());
		}
	}
}