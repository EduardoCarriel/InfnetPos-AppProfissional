package br.edu.infnet.appservico.model.domain;

public class Estetica extends Servico {
	public int diasRetorno;
	public boolean facial;
	public boolean corporal;
	public boolean capilar;
	
	@Override
	public String toString() {
		return diasRetorno + ";" + facial + ";" + corporal + ";" + capilar + ";" + super.toString();
	}
}
