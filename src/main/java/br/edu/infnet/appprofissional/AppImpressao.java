package br.edu.infnet.appprofissional;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

import br.edu.infnet.appprofissional.controller.ProfissionalController;
import br.edu.infnet.appprofissional.exception.CepInvalidoException;
import br.edu.infnet.appprofissional.exception.EnderecoInvalidoException;
import br.edu.infnet.appprofissional.exception.LogradouroInvalidoException;
import br.edu.infnet.appprofissional.exception.ProfissionalInvalidoException;
import br.edu.infnet.appprofissional.exception.ServicoInvalidoException;
import br.edu.infnet.appprofissional.interfaces.IPrinter;
import br.edu.infnet.appprofissional.model.domain.Endereco;
import br.edu.infnet.appprofissional.model.domain.Musculacao;
import br.edu.infnet.appprofissional.model.domain.Profissional;
import br.edu.infnet.appprofissional.model.domain.Servico;

public class AppImpressao {
	
	public static void relatorio(String mensagem, IPrinter printer) {
		System.out.println(mensagem);
		printer.impressao();
	}
}
