package br.edu.infnet.appprofissional.model.service;

import org.springframework.stereotype.Service;
import br.edu.infnet.appprofissional.AppImpressao;
import br.edu.infnet.appprofissional.model.domain.app.Projeto;

@Service
public class AppService {
	private Projeto projeto;
	
	public void incluir(Projeto projeto) {
		this.projeto = projeto;
		
		AppImpressao.relatorio("Exibição do Projeto" + projeto.getNome() + "!", projeto);
	}
	
	public Projeto obterProjeto() {
		return this.projeto;
	}
}
