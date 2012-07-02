package br.com.livre.programacao.condominio.controller;

import java.util.logging.Logger;

import javax.annotation.PostConstruct;
import javax.ejb.Stateful;
import javax.enterprise.event.Event;
import javax.enterprise.inject.Model;
import javax.enterprise.inject.Produces;
import javax.inject.Inject;
import javax.inject.Named;

import br.com.livre.programacao.condominio.model.Unidade;
import br.com.livre.programacao.condominio.repository.CondominoRepository;

@Stateful
@Model
public class GerirUnidade {

	@Inject
	private Logger log;

//	@Inject
//	private EntityManager em;

	@Inject
	private Event<Unidade> unidadeEventSrc;

	private Unidade newUnidade;
	
	private CondominoRepository repository;
	
	@PostConstruct
	public void initNewUnidade() {
		newUnidade = new Unidade();
		
	}

	@Produces
	@Named
	public Unidade getNewUnidade() {
		return newUnidade;
	}

	public void incluir() throws Exception {
		log.info("Incluir unidade: " + newUnidade);
		repository.salvar(newUnidade);
		unidadeEventSrc.fire(newUnidade);
		initNewUnidade();
		log.info("Unidade incluida com sucesso.");
	}

}
