package br.com.livre.programacao.condominio.controller;

import java.util.logging.Logger;

import javax.annotation.PostConstruct;
import javax.ejb.Stateful;
import javax.enterprise.inject.Model;
import javax.enterprise.inject.Produces;
import javax.inject.Inject;
import javax.inject.Named;
import javax.persistence.EntityManager;

import br.com.livre.programacao.condominio.model.Mensagem;

@Stateful
@Model
public class CriarMensagem {

	@Inject Logger log;
	
	@Inject EntityManager em;

	private Mensagem newMensagem;
	
	@PostConstruct
	public void initNewMensagem() {
		newMensagem = new Mensagem();
	}
	
	@Produces
	@Named
	public Mensagem getInitNewMensagem() {
		return newMensagem;
	}
	
	public void enviar() {
		log.info("Enviar mensagem.");
		em.persist(newMensagem);
		initNewMensagem();
		log.info("Mensagem enviada com sucesso.");
	}

}
