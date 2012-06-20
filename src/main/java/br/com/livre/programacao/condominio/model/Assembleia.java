package br.com.livre.programacao.condominio.model;
import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;


/** Modelo de dados para a realização de uma assembleia virtual.
 * 
 * @author Fábio Santos Almeida
 *
 */
@Entity
@XmlRootElement
@Table(name="ASSEMBLEIA")
public class Assembleia implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1671541731744580506L;

	@Id
	@GeneratedValue
	private Long id;
	
	@NotNull
	String campoteste;
	
}
