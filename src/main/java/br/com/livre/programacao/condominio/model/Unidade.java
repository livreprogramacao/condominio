package br.com.livre.programacao.condominio.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

import org.primefaces.examples.domain.Player;

/** Modelo de dados para gerenciar o cadastro de unidades do condominio.
 * 
 * @author Fábio Santos Almeida
 *
 */
@Entity
@XmlRootElement
@Table(name="UNIDADE", uniqueConstraints = @UniqueConstraint(columnNames = "unidade"))
public class Unidade implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 3340768097348482929L;

	@Id
	@GeneratedValue
	private Long id;

	@NotNull
	Integer bloco;

	@NotNull
	Integer unidade;

	@NotNull
	@Size(min = 1, max = 50)
	@Pattern(regexp = "[A-Za-z ]*", message = "o nome deve contém somente de letras e espaços")
	String nome;
	
	@NotNull
	@Size(min = 1, max = 1)
	@Pattern(regexp = "[AB]", message = "o tipo deve contém somente A ou B")
	String tipo;
	
	Double fracao;
	
	@Transient
	private List<Player> blocos = new ArrayList<Player>(10);

	public Unidade() {
		this.bloco = 0;
		this.tipo = "A";
		this.fracao = 1.304;
		
		for(Long x=0L; x<10; x++){
			blocos.add(new Player(""+x));
		}
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		Unidade other = (Unidade) obj;
		if (id == null) {
			if (other.id != null) {
				return false;
			}
		} else if (!id.equals(other.id)) {
			return false;
		}
		return true;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Unidade [");
		if (id != null) {
			builder.append("id=");
			builder.append(id);
			builder.append(", ");
		}
		if (bloco != null) {
			builder.append("bloco=");
			builder.append(bloco);
			builder.append(", ");
		}
		if (unidade != null) {
			builder.append("unidade=");
			builder.append(unidade);
			builder.append(", ");
		}
		if (nome != null) {
			builder.append("nome=");
			builder.append(nome);
			builder.append(", ");
		}
		if (tipo != null) {
			builder.append("tipo=");
			builder.append(tipo);
			builder.append(", ");
		}
		if (fracao != null) {
			builder.append("fracao=");
			builder.append(fracao);
			builder.append(", ");
		}
		builder.append("hashCode()=");
		builder.append(hashCode());
		builder.append(", ");
		if (super.toString() != null) {
			builder.append("toString()=");
			builder.append(super.toString());
		}
		builder.append("]");
		return builder.toString();
	}

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the bloco
	 */
	public Integer getBloco() {
		return bloco;
	}

	/**
	 * @param bloco the bloco to set
	 */
	public void setBloco(Integer bloco) {
		this.bloco = bloco;
	}

	/**
	 * @return the unidade
	 */
	public Integer getUnidade() {
		return unidade;
	}

	/**
	 * @param unidade the unidade to set
	 */
	public void setUnidade(Integer unidade) {
		this.unidade = unidade;
	}

	/**
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * @param nome the nome to set
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}

	/**
	 * @return the tipo
	 */
	public String getTipo() {
		return tipo;
	}

	/**
	 * @param tipo the tipo to set
	 */
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	/**
	 * @return the fracao
	 */
	public Double getFracao() {
		return fracao;
	}

	/**
	 * @param fracao the fracao to set
	 */
	public void setFracao(Double fracao) {
		this.fracao = fracao;
	}

	/**
	 * @return the blocos
	 */
	public List<Player> getBlocos() {
		return blocos;
	}

}