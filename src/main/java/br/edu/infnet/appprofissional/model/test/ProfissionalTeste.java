package br.edu.infnet.appprofissional.model.test;

import java.util.HashSet;
import java.util.Set;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.appprofissional.controller.ProfissionalController;
import br.edu.infnet.appprofissional.model.domain.Endereco;
import br.edu.infnet.appprofissional.model.domain.Estetica;
import br.edu.infnet.appprofissional.model.domain.Musculacao;
import br.edu.infnet.appprofissional.model.domain.Profissional;
import br.edu.infnet.appprofissional.model.domain.Saude;
import br.edu.infnet.appprofissional.model.domain.Servico;

@Component
@Order(1)
public class ProfissionalTeste implements ApplicationRunner {

	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("## Profissional ##");
		
		//############################### Profissional 1 ###############################
		
		Musculacao m1 = new Musculacao(1,"Treino para Resistência Muscular",100,false,true,true);
		Musculacao m2 = new Musculacao(2,"Treino para Hipertrofia Muscular",150,true,false,true);
		Musculacao m3 = new Musculacao(3,"Treino de Força Muscular",200,true,true,true);
		
		//List<Servico> listaServicoP1 = new ArrayList<Servico>();
		Set<Servico> listaServicoP1 = new HashSet<Servico>();
		
		listaServicoP1.add(m1);
		listaServicoP1.add(m2);
		listaServicoP1.add(m3);
		
		Endereco enderecoP1 = new Endereco(80330777, "Rua Teste01", 650, "Santa Quitéria", "Curitiba", "Paraná");
		
		Profissional p1 = new Profissional(enderecoP1);
		p1.setCodigo(1);
		p1.setNome("Eduardo Donato Carriel");
		p1.setEmail("testeemail1@gmail.com");
		p1.setTelefoneCelular("(41) 9 6666-7777");
		p1.setServicos(listaServicoP1);
		ProfissionalController.incluir(p1);
		
		//Forma 1 - Instânciar o objeto em uma variável e usar o método setEndereco
		//Endereco e1 = new Endereco(80330777, "Rua Teste01", 650, "Santa Quitéria", "Curitiba", "Paraná");
		//p1.setEndereco(e1);
		
		//Forma 2 - Utilizando o método setEndereco e instanciar diretamente
		//p1.setEndereco(new Endereco(80330777, "Rua Teste01", 650, "Santa Quitéria", "Curitiba", "Paraná"));
		
		//Forma 3 - Construtor com parametros iguais as propriedades da classe Endereco
		//Profissional p1 = new Profissional(80330777, "Rua Teste01", 650, "Santa Quitéria", "Curitiba", "Paraná");
		
		//Forma 4 - Construtor com parametro da classe Endereco
		//Endereco e1 = new Endereco(80330777, "Rua Teste01", 650, "Santa Quitéria", "Curitiba", "Paraná");
		//Profissional p1 = new Profissional(e1);
		
		//############################### Profissional 2 ###############################
		
		Saude s1 = new Saude();
		s1.setCodigo(1);
		s1.setDescricao("Consulta Prematuridade");
		s1.setValor(300);
		s1.setEspecialidade("Pediatria");
		s1.setRetornoProximoMes(true);
		
		Saude s2 = new Saude();
		s2.setCodigo(2);
		s2.setDescricao("Consulta Puericultura");
		s2.setValor(150);
		s2.setIdadeMinima(0);
		s2.setIdadeMaxima(1);
		s2.setEspecialidade("Pediatria");
		
		Saude s3 = new Saude();
		s3.setCodigo(3);
		s3.setDescricao("Consulta Obesidade");
		s3.setValor(200);
		s3.setEspecialidade("Pediatria");
		s3.setRetornoProximoMes(true);
		
		Set<Servico> listaServicoP2 = new HashSet<Servico>();
		
		listaServicoP2.add(s1);
		listaServicoP2.add(s2);
		listaServicoP2.add(s3);
		
		Endereco enderecoP2 = new Endereco(80330888, "Rua Teste02", 480, "Campo Comprido", "Curitiba", "Paraná");
		
		Profissional p2 = new Profissional(enderecoP2);
		p2.setCodigo(2);
		p2.setNome("Gleyse Kelly Garcia da Silva");
		p2.setEmail("testeemail2@gmail.com");
		p2.setTelefoneCelular("(41) 9 7777-8888");
		p2.setServicos(listaServicoP2);
		ProfissionalController.incluir(p2);
		
		//############################### Profissional 2 ###############################
		
		Estetica e1 = new Estetica();
		e1.setCodigo(1);
		e1.setDescricao("Limpeza de pele");
		e1.setValor(70);
		e1.setDiasRetorno(20);
		e1.setFacial(true);
		
		Estetica e2 = new Estetica();
		e2.setCodigo(8);
		e2.setDescricao("Massagem completa");
		e2.setValor(220);
		e2.setCorporal(true);
		
		Estetica e3 = new Estetica();
		e3.setCodigo(17);
		e3.setDescricao("Pintura com mechas");
		e3.setValor(550);
		e3.setCapilar(true);
		
		Set<Servico> listaServicoP3 = new HashSet<Servico>();
		
		listaServicoP3.add(e1);
		listaServicoP3.add(e2);
		listaServicoP3.add(e3);
		
		Endereco enderecoP3 = new Endereco(80330999, "Rua Teste03", 123, "Mercês", "Curitiba", "Paraná");
		
		Profissional p3 = new Profissional(enderecoP3);
		p3.setCodigo(3);
		p3.setNome("Beatriz Donato Carriel");
		p3.setEmail("testeemail3@gmail.com");
		p3.setTelefoneCelular("(41) 9 8888-9999");
		p3.setServicos(listaServicoP3);
		ProfissionalController.incluir(p3);
	}
}