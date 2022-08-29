package br.edu.infnet.appprofissional.exception;

public class LogradouroInvalidoException extends Exception {

	private static final long serialVersionUID = 1L;
	
	public LogradouroInvalidoException(String mensagem) {
		super(mensagem);
	}
}