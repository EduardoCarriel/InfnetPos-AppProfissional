package br.edu.infnet.appservico.model.domain;

public class Estetica extends Servico {
	public int diasRetorno;
	public boolean facial;
	public boolean corporal;
	public boolean capilar;
	
	public Estetica() {
		this.tipoCobranca = EnumTipoCobranca.QUANTIDADE;
	}
	
	@Override
	public float calcularServico() {
		// TODO Auto-generated method stub
		return super.calcularServico();
	}
	
	@Override
	public String toString() {
		return diasRetorno + ";" + facial + ";" + corporal + ";" + capilar + ";" + super.toString();
	}
}
