package br.edu.infnet.appprofissional.model.domain;

import java.util.Objects;

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
	
	private int id;
	private int codigo;
	private String descricao;
	protected EnumTipoCobranca tipoCobranca;
	private float quantidade;
	private float valorUnitario;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

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

	public EnumTipoCobranca getTipoCobranca() {
		return tipoCobranca;
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
		return id + ";" + codigo + ";" + descricao + ";" + tipoCobranca + ";" + valorUnitario + ";" + calcularServico();
	}

	@Override
	public int hashCode() {
		return Objects.hash(codigo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Servico other = (Servico) obj;
		return codigo == other.codigo;
	}
}
