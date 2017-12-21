package br.com.livre.programacao.condominio.controller;

import java.util.logging.Logger;

import javax.annotation.PostConstruct;
import javax.ejb.Stateful;
import javax.enterprise.inject.Model;
import javax.enterprise.inject.Produces;
import javax.inject.Inject;
import javax.inject.Named;
import javax.persistence.EntityManager;

import br.com.livre.programacao.condominio.model.Chamado;

@Stateful
@Model
public class AbrirChamado {
	
	@Inject Logger log;
	
	@Inject EntityManager em;
	
	private Chamado newChamado;
	
	@PostConstruct 
	public void initNewChamado() {
		newChamado = new Chamado();
	}
	
	@Produces
	@Named
	public Chamado getNewChamado() {
		return newChamado;
	}
	
	public void abrir() throws Exception {
		log.info("Abrir chamado.");
		em.persist(newChamado);
		initNewChamado();
		log.info("O chamado foi aberto com sucesso.");
	}

}
