package br.edu.infnet.appservico.model.test;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.appservico.model.domain.Musculacao;

@Component
@Order(4)
public class MusculacaoTeste implements ApplicationRunner {

	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("## Musculação ##");
		
		Musculacao m1 = new Musculacao();
		m1.codigo = 1;
		m1.descricao = "Treino para Resistência Muscular";
		m1.valor = 100;
		m1.personalTrainer = true;
		m1.avaliacaoFisica = true;
		System.out.println(m1);
		
		Musculacao m2 = new Musculacao();
		m2.codigo = 2;
		m2.descricao = "Treino para Hipertrofia Muscular";
		m2.valor = 150;
		m2.dieta = true;
		m2.avaliacaoFisica = true;
		System.out.println(m2);
		
		Musculacao m3 = new Musculacao();
		m3.codigo = 3;
		m3.descricao = "Treino de Força Muscular";
		m3.valor = 200;
		m3.personalTrainer = true;
		m3.dieta = true;
		m3.avaliacaoFisica = true;
		System.out.println(m3);
	}
}