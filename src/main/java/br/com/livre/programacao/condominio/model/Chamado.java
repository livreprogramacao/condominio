package br.com.livre.programacao.condominio.model;

import java.io.Serializable;

import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/** Modelo de dados de um chamado técnico para requerer a prestação de serviços de terceiros.
 * 
 * @author Fábio Santos Almeida
 *
 */
@Entity
@XmlRootElement
@Table(schema="CONDOMINIO", name="CHAMADO")
public class Chamado implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4456205896069581662L;
	
	@Id
	@GeneratedValue
	private Long id;
	
	@ManyToOne
    @JoinColumn(name="UNIDADE_FK")
	private Unidade unidade;
	
	@NotNull
	String campoteste;
	
}
