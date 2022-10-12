package br.edu.infnet.appprofissional.model.test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.appprofissional.model.domain.Saude;
import br.edu.infnet.appprofissional.model.service.SaudeService;

@Component
@Order(6)
public class SaudeTeste implements ApplicationRunner {
	@Autowired
	private SaudeService saudeService;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		String dir = "C:/dev/";
		String arq = "saude.txt";
		
		System.out.println("## Saúde ##");
		try {
			try {
				FileReader fileReader = new FileReader(dir+arq);
				BufferedReader leitura = new BufferedReader(fileReader);
				
				String linha = leitura.readLine();
				while (linha != null) {
					
					String[] campos = linha.split(";");
					
					try {
						Saude s1 = new Saude();
						s1.setCodigo(Integer.valueOf(campos[0]));
						s1.setDescricao(campos[1]);
						s1.setValor(Float.valueOf(campos[2]));
						s1.setEspecialidade(campos[3]);
						s1.setIdadeMinima(Integer.valueOf(campos[4]));
						s1.setIdadeMaxima(Integer.valueOf(campos[5]));
						s1.setRetornoProximoMes(Boolean.valueOf(campos[6]));
						saudeService.incluir(s1);		
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