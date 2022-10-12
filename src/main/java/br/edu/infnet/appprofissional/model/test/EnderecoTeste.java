package br.edu.infnet.appprofissional.model.test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.appprofissional.model.domain.Endereco;
import br.edu.infnet.appprofissional.model.domain.Usuario;
import br.edu.infnet.appprofissional.model.service.EnderecoService;
import br.edu.infnet.appprofissional.model.service.UsuarioService;

@Component
@Order(1)
public class EnderecoTeste implements ApplicationRunner {
	@Autowired
	private EnderecoService enderecoService;
	@Autowired
	private UsuarioService usuarioService;
	
	@Override
	public void run(ApplicationArguments args) {
		String dir = "C:/dev/";
		String arq = "endereco.txt";
		
		Usuario usuario = new Usuario("Admin", "admin@admin.com", "123456");
		usuarioService.incluir(usuario);
		
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
						e1.setUsuario(usuario);
						enderecoService.incluir(e1);			
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