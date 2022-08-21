package br.edu.infnet.appprofissional.model.domain;

public class Musculacao extends Servico {
	private boolean personalTrainer;
	private boolean dieta;
	private boolean avaliacaoFisica;
	
	public Musculacao() {
		this.tipoCobranca = EnumTipoCobranca.MES;
	}
	
	public Musculacao(int codigo, String descricao, float valor, boolean personalTrainer, boolean dieta, boolean avaliacaoFisica) {
		this.tipoCobranca = EnumTipoCobranca.MES;
		this.setCodigo(codigo);
		this.setDescricao(descricao);
		this.setValor(valor);
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
	public float calcularServico(Integer quantidadeContratada) {
		float descontoPorcentagem = 0;
		
		if (this.tipoCobranca == Servico.EnumTipoCobranca.MES && quantidadeContratada >= 12) {
			descontoPorcentagem = 0.3f;
		}
		
		return this.getValor() - (this.getValor() * descontoPorcentagem);
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
