package br.edu.infnet.appprofissional.model.domain;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Set;

import br.edu.infnet.appprofissional.exception.EnderecoInvalidoException;
import br.edu.infnet.appprofissional.exception.ProfissionalInvalidoException;
import br.edu.infnet.appprofissional.exception.ServicoInvalidoException;
import br.edu.infnet.appprofissional.interfaces.IPrinter;

public class Profissional implements IPrinter {
	private int id;
	private int codigo;
	private LocalDateTime dataCadastro;
	private String nome;
	private String telefoneCelular;
	private String email;
	private Endereco endereco;
	private Set<Servico> servicos;
	
	public Profissional(Integer codigo, String nome, Endereco endereco, Set<Servico> servicos) throws EnderecoInvalidoException, ServicoInvalidoException, ProfissionalInvalidoException {
		if (codigo == null || codigo == 0) {
			throw new ProfissionalInvalidoException("Código do profissional é inválido.");
		}
		
		if (nome == null || nome.isEmpty()) {
			throw new ProfissionalInvalidoException("Não é possível inserir um novo profissional sem o nome.");
		}
		
		if (endereco == null) {
			throw new EnderecoInvalidoException("Não é possível inserir um novo profissional sem o endereço.");
		}
		
		if (servicos == null || servicos.size() < 1) {
			throw new ServicoInvalidoException("Não é possível inserir um novo profissional sem informar o serviço.");
		}
		
		this.codigo = codigo;
		this.nome = nome;
		this.dataCadastro = LocalDateTime.now();
		this.endereco = endereco;
		this.servicos = servicos;
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
	
	public Endereco getEndereco() {
		return endereco;
	}

	public Set<Servico> getServicos() {
		return servicos;
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
