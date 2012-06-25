package br.com.livre.programacao.condominio.model;

import java.io.Serializable;

public class Bloco implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -5974660675250600509L;
	
	Long id = -1L;
	String nome = "indefinido";
	
	public Bloco() {}
	
	public Bloco(Long id, String nome) {
		this.id = id;
		this.nome = nome;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Bloco [");
		if (id != null) {
			builder.append("id=");
			builder.append(id);
			builder.append(", ");
		}
		if (nome != null) {
			builder.append("nome=");
			builder.append(nome);
			builder.append(", ");
		}
		if (getId() != null) {
			builder.append("getId()=");
			builder.append(getId());
			builder.append(", ");
		}
		if (getNome() != null) {
			builder.append("getBloco()=");
			builder.append(getNome());
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
}
