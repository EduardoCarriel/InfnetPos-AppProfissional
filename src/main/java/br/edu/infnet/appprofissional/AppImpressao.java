package br.edu.infnet.appprofissional;

import br.edu.infnet.appprofissional.interfaces.IPrinter;

public class AppImpressao {
	
	public static void relatorio(String mensagem, IPrinter printer) {
		System.out.println(mensagem);
		printer.impressao();
	}
}
