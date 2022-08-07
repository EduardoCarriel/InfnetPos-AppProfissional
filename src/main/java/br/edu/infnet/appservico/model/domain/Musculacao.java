package br.edu.infnet.appservico.model.domain;

public class Musculacao extends Servico {
	public boolean personalTrainer;
	public boolean dieta;
	public boolean avaliacaoFisica;
	
	@Override
	public String toString() {
		return personalTrainer + ";" + dieta + ";" + avaliacaoFisica + ";" + super.toString();
	}
}
