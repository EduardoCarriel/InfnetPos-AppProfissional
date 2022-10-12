package br.edu.infnet.appprofissional.model.test;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.appprofissional.model.domain.Usuario;
import br.edu.infnet.appprofissional.model.service.UsuarioService;

@Component
@Order(6)
public class UsuarioTeste implements ApplicationRunner {
	@Autowired
	private UsuarioService usuarioService;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		String dir = "C:/dev/";
		String arq = "usuario.txt";
		
		System.out.println("## Usuário ##");
		try {
			try {
				FileReader fileReader = new FileReader(dir+arq);
				BufferedReader leitura = new BufferedReader(fileReader);
				
				String linha = leitura.readLine();
				while (linha != null) {
					
					String[] campos = linha.split(";");
					
					try {
						Usuario usuario = new Usuario(campos[0], campos[1], campos[2]);
						usuarioService.incluir(usuario);		
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