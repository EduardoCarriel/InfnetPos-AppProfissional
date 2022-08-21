package br.edu.infnet.appprofissional.model.test;

import br.edu.infnet.appprofissional.model.domain.Servico;

public class AppServico {
	private String mensagem;
	
	public AppServico(String mensagem) {
		this.mensagem = mensagem;
	}
	
	public void relatorio(Servico servico) {
		System.out.println(mensagem);
		servico.impressao();
	}
}
