package br.com.livre.programacao.condominio.controller;

import java.util.logging.Logger;

import javax.annotation.PostConstruct;
import javax.ejb.Stateful;
import javax.enterprise.inject.Model;
import javax.enterprise.inject.Produces;
import javax.inject.Inject;
import javax.inject.Named;
import javax.persistence.EntityManager;

import br.com.livre.programacao.condominio.model.Assembleia;

@Stateful
@Model
public class ConvocarAssembleia {
	
	@Inject Logger log;
	
	@Inject EntityManager em;

	private Assembleia newAssembleia;
	
	@PostConstruct
	public void initNewAssembleia() {
		newAssembleia = new Assembleia();
	}

	@Produces
	@Named
	public Assembleia getNewAssembleia() {
		return newAssembleia;
	}
	
	public void convocar() throws Exception {
		log.info("Convocar assembleia.");
		em.persist(newAssembleia);
		initNewAssembleia();
		log.info("Assembleia convocada com sucesso.");
	}

}
