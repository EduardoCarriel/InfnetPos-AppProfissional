package br.edu.infnet.appservico.model.test;

import br.edu.infnet.appservico.model.domain.Servico;

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
