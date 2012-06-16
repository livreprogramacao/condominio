package br.com.livre.programacao.condominio.controller;

import java.util.logging.Logger;

import javax.annotation.PostConstruct;
import javax.ejb.Stateful;
import javax.enterprise.event.Event;
import javax.enterprise.inject.Model;
import javax.enterprise.inject.Produces;
import javax.inject.Inject;
import javax.inject.Named;
import javax.persistence.EntityManager;

import br.com.livre.programacao.condominio.model.Unidade;

@Stateful
@Model
public class GerirUnidade {

	@Inject
	private Logger log;

	@Inject
	private EntityManager em;

	@Inject
	private Event<Unidade> unidadeEventSrc;

	private Unidade newUnidade;

	@PostConstruct
	public void initNewUnidade() {
		newUnidade = new Unidade();
		newUnidade.setBloco("0");
	}

	@Produces
	@Named
	public Unidade getNewUnidade() {
		return newUnidade;
	}

	public void incluir() throws Exception {
		log.info("Incluindo a unidade " + newUnidade.getUnidade());
		em.persist(newUnidade);
		unidadeEventSrc.fire(newUnidade);
		initNewUnidade();
	}
}
