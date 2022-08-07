package br.edu.infnet.appservico.model.domain;

public class Servico {
	public int codigo;
	public String descricao;
	public float valor;
	
	@Override
	public String toString() {
		return codigo + ";" + descricao + ";" + valor;
	}
	
	
}
