package br.edu.infnet.appprofissional.model.domain;

import br.edu.infnet.appprofissional.exception.QuantidadeInvalidaException;

public class Saude extends Servico {
	private String especialidade;
	private int idadeMinima;
	private int idadeMaxima;
	private boolean retornoProximoMes;
	
	public Saude() {
		this.setTipoCobranca(EnumTipoCobranca.QUANTIDADE);
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

	@Override
	public float calcularServico(Integer quantidadeContratada) throws QuantidadeInvalidaException {
		float valorDesconto = 0;
		
		if (quantidadeContratada > 4) {
			throw new QuantidadeInvalidaException("Não é permitido informar a quantidade maior do que 4.");
		}
		
		if (idadeMaxima <= 50 && !retornoProximoMes) {
			valorDesconto = this.getValor() * 0.1f;
		}
		
		return quantidadeContratada * (this.getValor() - valorDesconto);
	}
}
