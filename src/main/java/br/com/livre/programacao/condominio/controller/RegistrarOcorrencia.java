package br.com.livre.programacao.condominio.controller;

import java.util.logging.Logger;

import javax.annotation.PostConstruct;
import javax.ejb.Stateful;
import javax.enterprise.inject.Model;
import javax.enterprise.inject.Produces;
import javax.inject.Inject;
import javax.inject.Named;
import javax.persistence.EntityManager;

import br.com.livre.programacao.condominio.model.Ocorrencia;

@Stateful
@Model
public class RegistrarOcorrencia {

	@Inject Logger log;
	
	@Inject EntityManager em;

	private Ocorrencia newOcorrencia;
	
	@PostConstruct
	public void initNewOcorrencia() {
		newOcorrencia = new Ocorrencia();
	}
	
	@Produces
	@Named
	public Ocorrencia getInitNewOcorrencia() {
		return newOcorrencia;
	}
	
	public void registrar() {
		log.info("Registrar ocorrencia...");
		em.persist(newOcorrencia);
		initNewOcorrencia();
		log.info("Ocorrencia registrada com sucesso.");
	}
	
}
