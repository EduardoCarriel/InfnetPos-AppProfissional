package br.edu.infnet.appprofissional.model.domain;

import br.edu.infnet.appprofissional.exception.CepInvalidoException;
import br.edu.infnet.appprofissional.exception.LogradouroInvalidoException;
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
	
	public Endereco(int cep, String logradouro, int numero, String bairro, String cidade, String estado) throws CepInvalidoException, LogradouroInvalidoException {
		if (cep == 0) {
			throw new CepInvalidoException("É obrigatório informar o CEP.");
		}
		
		if (logradouro.length() == 0) {
			throw new LogradouroInvalidoException("É obrigatório informar o Logradouro.");
		}
		
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

	public String getLogradouro() {
		return logradouro;
	}

	public int getNumero() {
		return numero;
	}

	public String getBairro() {
		return bairro;
	}

	public String getCidade() {
		return cidade;
	}

	public String getEstado() {
		return estado;
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
