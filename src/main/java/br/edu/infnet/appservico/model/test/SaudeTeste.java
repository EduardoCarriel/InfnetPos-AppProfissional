package br.edu.infnet.appservico.model.test;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.appservico.model.domain.Saude;

@Component
@Order(5)
public class SaudeTeste implements ApplicationRunner {

	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("## Saúde ##");
		
		Saude s1 = new Saude();
		s1.codigo = 1;
		s1.descricao = "Consulta para tratamento de cravos e espinhas";
		s1.valor = 300;
		s1.especialidade = "Dermatologista";
		s1.retornoProximoMes = true;
		System.out.println(s1);
		
		Saude s2 = new Saude();
		s2.codigo = 2;
		s2.descricao = "Reabilitação após cirurgia de ombro";
		s2.valor = 150;
		s2.especialidade = "Fisioterapia";
		System.out.println(s2);
		
		Saude s3 = new Saude();
		s3.codigo = 3;
		s3.descricao = "Acompanhamento Pediatra";
		s3.valor = 200;
		s3.especialidade = "Dermatologista";
		s3.idadeMinima = 0;
		s3.idadeMaxima = 3;
		s3.retornoProximoMes = true;
		System.out.println(s3);
	}
}