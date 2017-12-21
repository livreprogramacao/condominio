package br.com.livre.programacao.condominio.model;
import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;


/** Modelo de dados para registrar ocorrências dos moradores do condominio.
 * 
 * @author Fábio Santos Almeida
 *
 */
@Entity
@XmlRootElement
@Table(name="OCORRENCIA")
public class Ocorrencia implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8387985162100626800L;
	
	@Id
	@GeneratedValue
	private Long id;

	@NotNull
	String campoteste;
	
}
