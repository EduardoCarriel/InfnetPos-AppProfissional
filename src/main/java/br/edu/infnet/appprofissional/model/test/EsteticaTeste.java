package br.edu.infnet.appprofissional.model.test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.appprofissional.exception.DiasRetornoInvalidoException;
import br.edu.infnet.appprofissional.model.domain.Estetica;
import br.edu.infnet.appprofissional.model.service.EsteticaService;

@Component
@Order(4)
public class EsteticaTeste implements ApplicationRunner {
	@Autowired
	private EsteticaService esteticaService;
	
	@Override
	public void run(ApplicationArguments args) {
		String dir = "C:/dev/";
		String arq = "estetica.txt";
		
		System.out.println("## Estética ##");
		try {
			try {
				FileReader fileReader = new FileReader(dir+arq);
				BufferedReader leitura = new BufferedReader(fileReader);
				
				String linha = leitura.readLine();
				while (linha != null) {
					
					String[] campos = linha.split(";");
					
					try {
						Estetica e1 = new Estetica();
						e1.setCodigo(Integer.valueOf(campos[0]));
						e1.setDescricao(campos[1]);
						e1.setValor(Float.valueOf(campos[2]));
						e1.setDiasRetorno(Integer.valueOf(campos[3]));
						e1.setFacial(Boolean.valueOf(campos[4]));
						e1.setCorporal(Boolean.valueOf(campos[5]));
						e1.setCapilar(Boolean.valueOf(campos[6]));
						System.out.println("Cálculo do serviço:" + e1.calcularServico(1));
						esteticaService.incluir(e1);			
					} catch (DiasRetornoInvalidoException e) {
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