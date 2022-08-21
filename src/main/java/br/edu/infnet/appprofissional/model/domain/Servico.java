package br.edu.infnet.appprofissional.model.domain;

import br.edu.infnet.appprofissional.interfaces.IPrinter;

public abstract class Servico implements IPrinter {
	public enum EnumTipoCobranca {
		QUANTIDADE("Quantidade"),
		HORA("Hora"),
		DIA("Dia"),
		MES("Mês"),
		ANO("Ano");
		
		private String value;
		
		EnumTipoCobranca(final String value) {
			this.value = value;
		}
		
		public String getValue() {
	        return value;
	    }
		
		@Override
	    public String toString() {
	        return this.getValue();
	    }
	}
	
	private int codigo;
	private String descricao;
	protected EnumTipoCobranca tipoCobranca;
	private float quantidade;
	private float valorUnitario;
	
	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public float getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(float quantidade) {
		this.quantidade = quantidade;
	}

	public float getValorUnitario() {
		return valorUnitario;
	}

	public void setValorUnitario(float valorUnitario) {
		this.valorUnitario = valorUnitario;
	}
	
	abstract float calcularServico();
	
	@Override
	public String toString() {
		return codigo + ";" + descricao + ";" + tipoCobranca + ";" + valorUnitario + ";" + calcularServico();
	}
}
