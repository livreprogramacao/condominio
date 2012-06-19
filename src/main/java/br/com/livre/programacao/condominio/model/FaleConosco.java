package br.com.livre.programacao.condominio.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/** Modelo de dados para registrar o contato com o corpo diretivo do condominio atraves do fale conosco.
 * 
 * @author Fábio Santos Almeida
 *
 */
@Entity
@XmlRootElement
@Table(schema="CONDOMINIO", name="CORPO_DIRETIVO")
public class FaleConosco implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8826854509673094161L;
	
	@Id
	@GeneratedValue
	private Long id;

	@NotNull
	String campoteste;
	
}
