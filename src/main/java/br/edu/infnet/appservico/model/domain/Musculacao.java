package br.edu.infnet.appservico.model.domain;

public class Musculacao extends Servico {
	private boolean personalTrainer;
	private boolean dieta;
	private boolean avaliacaoFisica;
	
	public Musculacao() {}
	
	public Musculacao(int codigo, String descricao, float quantidade, float valorUnitario, boolean personalTrainer, boolean dieta, boolean avaliacaoFisica) {
		this.tipoCobranca = EnumTipoCobranca.MES;
		this.setCodigo(codigo);
		this.setDescricao(descricao);
		this.setValorUnitario(valorUnitario);
		this.personalTrainer = personalTrainer;
		this.dieta = dieta;
		this.avaliacaoFisica = avaliacaoFisica;
	}
	
	public boolean isPersonalTrainer() {
		return personalTrainer;
	}

	public void setPersonalTrainer(boolean personalTrainer) {
		this.personalTrainer = personalTrainer;
	}

	public boolean isDieta() {
		return dieta;
	}

	public void setDieta(boolean dieta) {
		this.dieta = dieta;
	}

	public boolean isAvaliacaoFisica() {
		return avaliacaoFisica;
	}

	public void setAvaliacaoFisica(boolean avaliacaoFisica) {
		this.avaliacaoFisica = avaliacaoFisica;
	}

	@Override
	public float calcularServico() {
		float descontoPorcentagem = 0;
		
		if ( this.tipoCobranca == Servico.EnumTipoCobranca.MES && this.getQuantidade() >= 6 && this.getQuantidade() <= 12) {
			descontoPorcentagem = 0.2f;
		}
		
		if ( this.tipoCobranca == Servico.EnumTipoCobranca.MES && this.getQuantidade() >= 12) {
			descontoPorcentagem = 0.4f;
		}
		
		return super.calcularServico() - (this.getValorUnitario() * descontoPorcentagem);
	}
	
	@Override
	public String toString() {
		return personalTrainer + ";" + dieta + ";" + avaliacaoFisica + ";" + super.toString();
	}

	@Override
	public void impressao() {
		System.out.println("## Musculação ##");
		System.out.println(this);
	}
}
