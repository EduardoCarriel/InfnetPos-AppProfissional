package br.edu.infnet.appprofissional.model.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.appprofissional.model.domain.Musculacao;
import br.edu.infnet.appprofissional.model.service.MusculacaoService;

@Component
@Order(3)
public class MusculacaoTeste implements ApplicationRunner {
	@Autowired
	private MusculacaoService musculacaoService;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("## Musculação ##");
		
		//Exemplo com construtor
		Musculacao m1 = new Musculacao(1,"Treino para Resistência Muscular",100,true,false,true);
		musculacaoService.incluir(m1);
		
		//Exemplo com métodos Setters
		Musculacao m2 = new Musculacao();
		m2.setCodigo(2);
		m2.setDescricao("Treino para Hipertrofia Muscular");
		m2.setValor(150);
		m2.setDieta(true);
		m2.setAvaliacaoFisica(true);
		musculacaoService.incluir(m2);
		
		Musculacao m3 = new Musculacao(3,"Treino de Força Muscular",200,true,true,true);
		musculacaoService.incluir(m3);
	}
}