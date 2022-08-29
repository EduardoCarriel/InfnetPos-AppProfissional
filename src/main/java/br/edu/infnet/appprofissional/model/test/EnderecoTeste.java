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

import br.edu.infnet.appprofissional.controller.EnderecoController;
import br.edu.infnet.appprofissional.controller.ProfissionalController;
import br.edu.infnet.appprofissional.exception.CepInvalidoException;
import br.edu.infnet.appprofissional.exception.EnderecoInvalidoException;
import br.edu.infnet.appprofissional.exception.LogradouroInvalidoException;
import br.edu.infnet.appprofissional.exception.ProfissionalInvalidoException;
import br.edu.infnet.appprofissional.exception.ServicoInvalidoException;
import br.edu.infnet.appprofissional.model.domain.Endereco;
import br.edu.infnet.appprofissional.model.domain.Musculacao;
import br.edu.infnet.appprofissional.model.domain.Profissional;
import br.edu.infnet.appprofissional.model.domain.Servico;

@Component
@Order(3)
public class EnderecoTeste implements ApplicationRunner {

	@Override
	public void run(ApplicationArguments args) {
		String dir = "C:/dev/";
		String arq = "endereco.txt";
		
		System.out.println("## Endereço ##");
		try {
			try {
				FileReader fileReader = new FileReader(dir+arq);
				BufferedReader leitura = new BufferedReader(fileReader);
				
				String linha = leitura.readLine();
				while (linha != null) {
					
					String[] campos = linha.split(";");
					
					try {
						Endereco e1 = new Endereco(Integer.valueOf(campos[0]), campos[1], Integer.valueOf(campos[2]), campos[3], campos[4], campos[5]);
						EnderecoController.incluir(e1);			
					} catch (Exception e) {
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