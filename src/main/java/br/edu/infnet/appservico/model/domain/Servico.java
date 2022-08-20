package br.edu.infnet.appservico.model.domain;

public class Servico {
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
	
	public int codigo;
	public String descricao;
	protected EnumTipoCobranca tipoCobranca;
	public float quantidade;
	public float valor;
	
	public float calcularServico() {
		return quantidade * valor;
	}
	
	@Override
	public String toString() {
		return codigo + ";" + descricao + ";" + tipoCobranca + ";" + valor + ";" + calcularServico();
	}
}
