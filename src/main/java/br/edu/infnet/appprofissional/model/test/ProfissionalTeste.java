package br.edu.infnet.appprofissional.model.test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.appprofissional.controller.ProfissionalController;
import br.edu.infnet.appprofissional.exception.CepInvalidoException;
import br.edu.infnet.appprofissional.exception.EnderecoInvalidoException;
import br.edu.infnet.appprofissional.exception.LogradouroInvalidoException;
import br.edu.infnet.appprofissional.exception.ProfissionalInvalidoException;
import br.edu.infnet.appprofissional.exception.ServicoInvalidoException;
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
		String dir = "C:/dev/";
		String arq = "profissional.txt";
		
		System.out.println("## Profissional ##");
		try {
			try {
				FileReader fileReader = new FileReader(dir+arq);
				BufferedReader leitura = new BufferedReader(fileReader);
				
				Musculacao m1 = new Musculacao(1,"Treino para Resistência Muscular",100,false,true,true);
				Musculacao m2 = new Musculacao(2,"Treino para Hipertrofia Muscular",150,true,false,true);
				Musculacao m3 = new Musculacao(3,"Treino de Força Muscular",200,true,true,true);
				
				String linha = leitura.readLine();
				while (linha != null) {
					
					String[] campos = linha.split(";");
					
					try {
						Set<Servico> listaServicoP1 = new HashSet<Servico>();
						listaServicoP1.add(m1);
						listaServicoP1.add(m2);
						listaServicoP1.add(m3);
						
						Endereco enderecoP1 = new Endereco(80330777, "Rua Teste01", 650, "Santa Quitéria", "Curitiba", "Paraná");
						
						Profissional p1 = new Profissional(Integer.valueOf(campos[0]), campos[1], enderecoP1, listaServicoP1);
						p1.setEmail(campos[2]);
						p1.setTelefoneCelular(campos[3]);
						ProfissionalController.incluir(p1);
					} catch (EnderecoInvalidoException | ProfissionalInvalidoException | ServicoInvalidoException | LogradouroInvalidoException | CepInvalidoException e) {
						System.out.println("Ocorreu um problema: " + e.getMessage());
					}
					
					linha = leitura.readLine();
				}
				
				leitura.close();
				fileReader.close();
			} catch (IOException e) {
				System.out.println("Ocoreu um erro na leitura do arquivo: " + e.getMessage());
			}
		} finally {
			System.out.println("Leitura do arquivo finalizada.");
		}
	}
}