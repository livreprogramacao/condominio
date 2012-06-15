package br.com.livre.programacao.condominio.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/** Cadastro de Unidades
 * 
 * @author Fábio Santos Almeida
 *
 */
@Entity
@XmlRootElement
@Table(uniqueConstraints = @UniqueConstraint(columnNames = "unidade"))
public class Unidade implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 3340768097348482929L;

	@Id
	@GeneratedValue
	private Long id;

	@NotNull
	String bloco;

	@NotNull
	String unidade;

	@NotNull
	@Size(min = 1, max = 50)
	@Pattern(regexp = "[A-Za-z ]*", message = "o nome deve contém somente de letras e espaços")
	String nome;
	
	@NotNull
	@Size(min = 1, max = 1)
	@Pattern(regexp = "[AB]", message = "o tipo deve contém somente A ou B")
	String tipo;
	
	String fração;

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

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getBloco() {
		return bloco;
	}

	public void setBloco(String bloco) {
		this.bloco = bloco;
	}

	public String getUnidade() {
		return unidade;
	}

	public void setUnidade(String unidade) {
		this.unidade = unidade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getFração() {
		return fração;
	}

	public void setFração(String fração) {
		this.fração = fração;
	}

}