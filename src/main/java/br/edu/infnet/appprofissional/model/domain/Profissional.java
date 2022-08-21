package br.edu.infnet.appprofissional.model.domain;

import br.edu.infnet.appprofissional.interfaces.IPrinter;

public class Profissional implements IPrinter {
	private String nome;
	private String telefoneCelular;
	private String email;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefoneCelular() {
		return telefoneCelular;
	}

	public void setTelefoneCelular(String telefoneCelular) {
		this.telefoneCelular = telefoneCelular;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	@Override
	public String toString() {
		return nome + ";" + telefoneCelular + ";" + email;
	}

	@Override
	public void impressao() {
		System.out.println("# Profissional #");
		System.out.println(this);
	}
}
