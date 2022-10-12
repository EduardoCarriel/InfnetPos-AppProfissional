package br.edu.infnet.appprofissional.model.domain;

import java.util.List;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import br.edu.infnet.appprofissional.exception.DiasRetornoInvalidoException;
import br.edu.infnet.appprofissional.exception.QuantidadeInvalidaException;
import br.edu.infnet.appprofissional.interfaces.IPrinter;

@Entity
@Table(name="TServico")
@Inheritance(strategy = InheritanceType.JOINED)
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
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private int codigo;
	private String descricao;
	protected EnumTipoCobranca tipoCobranca;
	private float valor;
	@ManyToMany(mappedBy = "servicos")
	private List<Profissional> profissionais;
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
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

	public void setTipoCobranca(EnumTipoCobranca tipoCobranca) {
		this.tipoCobranca = tipoCobranca;
	}

	public float getValor() {
		return valor;
	}

	public List<Profissional> getProfissionais() {
		return profissionais;
	}

	public void setProfissionais(List<Profissional> profissionais) {
		this.profissionais = profissionais;
	}

	public void setValor(float valor) {
		this.valor = valor;
	}
	
	abstract float calcularServico(Integer quantidadeContratada) throws DiasRetornoInvalidoException, QuantidadeInvalidaException;
	
	@Override
	public String toString() {
		return id + ";" + codigo + ";" + descricao + ";" + tipoCobranca + ";" + valor;
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
		Servico other = (Servico) obj;
		return codigo == other.codigo;
	}
}
