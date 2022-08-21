package br.edu.infnet.appprofissional.model.domain;

public class Endereco {
	private int cep;
	private String logradouro;
	private int numero;
	private String bairro;
	private String cidade;
	private String estado;
	
	public Endereco(int cep, String logradouro, int numero, String bairro, String cidade, String estado) {
		this.cep = cep;
		this.logradouro = logradouro;
		this.numero = numero;
		this.bairro = bairro;
		this.cidade = cidade;
		this.estado = estado;
	}
	
	@Override
	public String toString() {
		return cep + ";" + logradouro + ";" + numero + ";" + bairro + ";" + cidade + ";" + estado;
	}
}
