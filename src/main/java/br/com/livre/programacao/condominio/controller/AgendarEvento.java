package br.com.livre.programacao.condominio.controller;

import java.util.logging.Logger;

import javax.annotation.PostConstruct;
import javax.ejb.Stateful;
import javax.ejb.Stateless;
import javax.enterprise.inject.Model;
import javax.enterprise.inject.Produces;
import javax.inject.Inject;
import javax.inject.Named;
import javax.persistence.EntityManager;

import br.com.livre.programacao.condominio.model.Evento;

@Stateful
@Model
public class AgendarEvento {

	@Inject Logger log;
	
	@Inject EntityManager em;

	private Evento newEvento;
	
	@PostConstruct 
	public void initNewEvento() {
		newEvento = new Evento();
	}
	
	@Produces
	@Named
	public Evento getNewEvento() {
		return newEvento;
	}
	
	public void agendar() throws Exception {
		log.info("Agendar evento.");
		em.persist(newEvento);
		initNewEvento();
		log.info("Evento agendado com sucesso.");
	}

}
