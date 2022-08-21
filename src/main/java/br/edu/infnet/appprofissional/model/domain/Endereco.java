package br.edu.infnet.appprofissional.model.domain;

import br.edu.infnet.appprofissional.interfaces.IPrinter;

public class Endereco implements IPrinter {
	private int id;
	private int cep;
	private String logradouro;
	private int numero;
	private String bairro;
	private String cidade;
	private String estado;
	
	public Endereco() {}
	
	public Endereco(int cep, String logradouro, int numero, String bairro, String cidade, String estado) {
		this.cep = cep;
		this.logradouro = logradouro;
		this.numero = numero;
		this.bairro = bairro;
		this.cidade = cidade;
		this.estado = estado;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCep() {
		return cep;
	}

	public void setCep(int cep) {
		this.cep = cep;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	@Override
	public String toString() {
		return cep + ";" + logradouro + ";" + numero + ";" + bairro + ";" + cidade + ";" + estado;
	}

	@Override
	public void impressao() {
		System.out.println("# Endereço #");
		System.out.println(this);
	}
}
