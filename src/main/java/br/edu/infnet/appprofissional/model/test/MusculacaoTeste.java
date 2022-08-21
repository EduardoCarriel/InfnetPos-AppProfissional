package br.edu.infnet.appprofissional.model.test;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.appprofissional.AppImpressao;
import br.edu.infnet.appprofissional.model.domain.Musculacao;

@Component
@Order(4)
public class MusculacaoTeste implements ApplicationRunner {

	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("## Musculação ##");
		
		//Exemplo com construtor
		Musculacao m1 = new Musculacao(1,"Treino para Resistência Muscular",6,100,true,false,true);
		AppImpressao.relatorio("Inclusão do Serviço " + m1.getDescricao() + "!", m1);
		
		//Exemplo com métodos Setters
		Musculacao m2 = new Musculacao();
		m2.setCodigo(2);
		m2.setDescricao("Treino para Hipertrofia Muscular");
		m2.setQuantidade(4);
		m2.setValorUnitario(150);
		m2.setDieta(true);
		m2.setAvaliacaoFisica(true);
		AppImpressao.relatorio("Inclusão do Serviço " + m2.getDescricao() + "!", m2);
		
		Musculacao m3 = new Musculacao(3,"Treino de Força Muscular",12,200,true,true,true);
		AppImpressao.relatorio("Inclusão do Serviço " + m3.getDescricao() + "!", m3);
	}
}