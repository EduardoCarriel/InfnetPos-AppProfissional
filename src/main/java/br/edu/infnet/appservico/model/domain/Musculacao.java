package br.edu.infnet.appservico.model.domain;

public class Musculacao extends Servico {
	public boolean personalTrainer;
	public boolean dieta;
	public boolean avaliacaoFisica;
	
	public Musculacao() {
		this.tipoCobranca = EnumTipoCobranca.MES;
	}
	
	@Override
	public float calcularServico() {
		float descontoPorcentagem = 0;
		
		if ( this.tipoCobranca == Servico.EnumTipoCobranca.MES && this.quantidade >= 6 && this.quantidade <= 12) {
			descontoPorcentagem = 0.2f;
		}
		
		if ( this.tipoCobranca == Servico.EnumTipoCobranca.MES && this.quantidade >= 12) {
			descontoPorcentagem = 0.4f;
		}
		
		return super.calcularServico() - (this.valor * descontoPorcentagem);
	}
	
	@Override
	public String toString() {
		return personalTrainer + ";" + dieta + ";" + avaliacaoFisica + ";" + super.toString();
	}
}
