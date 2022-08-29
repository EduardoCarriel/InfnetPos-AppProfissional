package br.edu.infnet.appprofissional.exception;

public class ServicoInvalidoException extends Exception {

	private static final long serialVersionUID = 1L;
	
	public ServicoInvalidoException(String mensagem) {
		super(mensagem);
	}
}
