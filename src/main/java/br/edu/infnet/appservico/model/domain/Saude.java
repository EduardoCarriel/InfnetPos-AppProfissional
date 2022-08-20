package br.edu.infnet.appservico.model.domain;

public class Saude extends Servico {
	public String especialidade;
	public int idadeMinima;
	public int idadeMaxima;
	public boolean retornoProximoMes;
	
	public Saude() {
		this.tipoCobranca = EnumTipoCobranca.QUANTIDADE;
	}
	
	@Override
	public String toString() {
		return especialidade + ";" + idadeMinima + ";" + idadeMaxima + ";" + retornoProximoMes + ";" + super.toString();
	}
}
