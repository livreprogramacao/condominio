package br.com.livre.programacao.condominio.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/** Modelo de dados do agendamento de um evento dentro ( no salão/churrasqueira ) clube APASO.
 * 
 * @author Fábio Santos Almeida
 *
 */
@Entity
@XmlRootElement
@Table(name="EVENTO")
public class Evento implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -417482471350706310L;

	@Id
	@GeneratedValue
	private Long id;
	
	@NotNull
	String campoteste;
	
}
