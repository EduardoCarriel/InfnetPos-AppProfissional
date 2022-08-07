package br.edu.infnet.appservico.model.domain;

public class Saude extends Servico {
	public String especialidade;
	public int idadeMinima;
	public int idadeMaxima;
	public boolean retornoProximoMes;
	public int quantidadeSessao;
	
	@Override
	public String toString() {
		return especialidade + ";" + idadeMinima + ";" + idadeMaxima + ";" + retornoProximoMes + ";" + quantidadeSessao + ";" + super.toString();
	}
}
