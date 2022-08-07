package br.edu.infnet.appservico.model.domain;

public class Profissional {
	private String nome;
	private String telefoneCelular;
	private String email;
	
	@Override
	public String toString() {
		return nome + ";" + telefoneCelular + ";" + email;
	}

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
	
	
}
