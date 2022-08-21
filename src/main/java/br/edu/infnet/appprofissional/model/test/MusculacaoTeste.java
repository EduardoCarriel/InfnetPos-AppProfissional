package br.edu.infnet.appprofissional.model.test;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.appprofissional.model.domain.Musculacao;

@Component
@Order(4)
public class MusculacaoTeste implements ApplicationRunner {

	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("## Musculação ##");
		
		Musculacao m1 = new Musculacao(1,"Treino para Resistência Muscular",6,100,true,false,true);
		new AppProfissional("Inclusão do Serviço " + m1.getDescricao() + "!").relatorio(m1);
		
		Musculacao m2 = new Musculacao();
		m2.setCodigo(2);
		m2.setDescricao("Treino para Hipertrofia Muscular");
		m2.setQuantidade(4);
		m2.setValorUnitario(150);
		m2.setDieta(true);
		m2.setAvaliacaoFisica(true);
		new AppProfissional("Inclusão do Serviço " + m2.getDescricao() + "!").relatorio(m2);
		
		Musculacao m3 = new Musculacao(3,"Treino de Força Muscular",12,200,true,true,true);
		new AppProfissional("Inclusão do Serviço " + m3.getDescricao() + "!").relatorio(m3);
	}
}