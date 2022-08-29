package br.edu.infnet.appprofissional.exception;

public class CepInvalidoException extends Exception {

	private static final long serialVersionUID = 1L;
	
	public CepInvalidoException(String mensagem) {
		super(mensagem);
	}
}
