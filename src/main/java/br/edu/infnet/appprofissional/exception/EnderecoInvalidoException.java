package br.edu.infnet.appprofissional.exception;

public class EnderecoInvalidoException extends Exception {

	private static final long serialVersionUID = 1L;
	
	public EnderecoInvalidoException(String mensagem) {
		super(mensagem);
	}
}
