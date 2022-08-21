package br.edu.infnet.appprofissional.model.domain;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Set;

import br.edu.infnet.appprofissional.interfaces.IPrinter;

public class Profissional implements IPrinter {
	private int id;
	private int codigo;
	private LocalDateTime dataCadastro;
	private String nome;
	private String telefoneCelular;
	private String email;
	private Endereco endereco;
	//private List<Servico> servicos;
	private Set<Servico> servicos;
	
	public Profissional(Endereco endereco) {
		this.dataCadastro = LocalDateTime.now();
		this.endereco = endereco;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public LocalDateTime getDataCadastro() {
		return dataCadastro;
	}
	
	public String getDataCadastroFormatada() {
		return dataCadastro.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"));
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
	
	public Set<Servico> getServicos() {
		return servicos;
	}

	public void setServicos(Set<Servico> servicos) {
		this.servicos = servicos;
	}

	@Override
	public String toString() {
		return codigo + ";" + dataCadastro.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss")) + ";" + nome + ";" + telefoneCelular + ";" + email + ";" + endereco;
	}

	@Override
	public void impressao() {
		System.out.println("# Profissional #");
		System.out.println(this);
	}
}
