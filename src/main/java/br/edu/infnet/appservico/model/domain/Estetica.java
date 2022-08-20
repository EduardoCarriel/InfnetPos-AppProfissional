package br.edu.infnet.appservico.model.domain;

public class Estetica extends Servico {
	private int diasRetorno;
	private boolean facial;
	private boolean corporal;
	private boolean capilar;
	
	public Estetica() {
		this.tipoCobranca = EnumTipoCobranca.QUANTIDADE;
	}
	
	
	
	public int getDiasRetorno() {
		return diasRetorno;
	}



	public void setDiasRetorno(int diasRetorno) {
		this.diasRetorno = diasRetorno;
	}



	public boolean isFacial() {
		return facial;
	}



	public void setFacial(boolean facial) {
		this.facial = facial;
	}



	public boolean isCorporal() {
		return corporal;
	}



	public void setCorporal(boolean corporal) {
		this.corporal = corporal;
	}



	public boolean isCapilar() {
		return capilar;
	}



	public void setCapilar(boolean capilar) {
		this.capilar = capilar;
	}



	@Override
	public float calcularServico() {
		return super.calcularServico();
	}
	
	@Override
	public String toString() {
		return diasRetorno + ";" + facial + ";" + corporal + ";" + capilar + ";" + super.toString();
	}

	@Override
	public void impressao() {
		System.out.println("## Estética ##");
		System.out.println(this);
	}
}
