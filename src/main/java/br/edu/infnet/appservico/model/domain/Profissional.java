package br.edu.infnet.appservico.model.domain;

public class Profissional {
	private String nome;
	private int telefoneCelular;
	private String email;
	private Endereco endereco;
	
	public Profissional(String nome, int telefoneCelular, String email, Endereco endereco) {
		this.nome = nome;
		this.telefoneCelular = telefoneCelular;
		this.email = email;
		this.endereco = endereco;
	}
	
	@Override
	public String toString() {
		return nome + ";" + telefoneCelular + ";" + email + ";";
	}
}
