package br.edu.infnet.appprofissional.model.domain;

public class Saude extends Servico {
	private String especialidade;
	private int idadeMinima;
	private int idadeMaxima;
	private boolean retornoProximoMes;
	
	public Saude() {
		this.tipoCobranca = EnumTipoCobranca.QUANTIDADE;
	}
	
	
	
	public String getEspecialidade() {
		return especialidade;
	}



	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}



	public int getIdadeMinima() {
		return idadeMinima;
	}



	public void setIdadeMinima(int idadeMinima) {
		this.idadeMinima = idadeMinima;
	}



	public int getIdadeMaxima() {
		return idadeMaxima;
	}



	public void setIdadeMaxima(int idadeMaxima) {
		this.idadeMaxima = idadeMaxima;
	}



	public boolean isRetornoProximoMes() {
		return retornoProximoMes;
	}



	public void setRetornoProximoMes(boolean retornoProximoMes) {
		this.retornoProximoMes = retornoProximoMes;
	}



	@Override
	public String toString() {
		return especialidade + ";" + idadeMinima + ";" + idadeMaxima + ";" + retornoProximoMes + ";" + super.toString();
	}

	@Override
	public void impressao() {
		System.out.println("## Saúde ##");
		System.out.println(this);
	}
}
