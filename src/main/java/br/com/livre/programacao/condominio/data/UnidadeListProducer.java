package br.com.livre.programacao.condominio.data;

import br.com.livre.programacao.condominio.model.Unidade;
import java.util.List;
import java.util.logging.Logger;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.enterprise.event.Observes;
import javax.enterprise.event.Reception;

import javax.enterprise.inject.Produces;
import javax.inject.Inject;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

@RequestScoped
public class UnidadeListProducer {

	@Inject
	private Logger log;

	@Inject
	private EntityManager em;

	private List<Unidade> unidades;

	@Produces
	@Named
	public List<Unidade> getUnidades() {
		return unidades;
	}

	public void onUnidadeListChanged(@Observes(notifyObserver = Reception.IF_EXISTS) final Unidade unidade) {
		log.info("A unidade " + unidade.getUnidade() + " foi modificada... Atualizando lista de unidades.");
		retrieveAllUnidadesOrderedByUnidade();
	}

	@PostConstruct
	public void retrieveAllUnidadesOrderedByUnidade() {
		log.info("Atualizando a lista de unidades...");
		CriteriaBuilder cb = em.getCriteriaBuilder();
		CriteriaQuery<Unidade> criteria = cb.createQuery(Unidade.class);
		Root<Unidade> member = criteria.from(Unidade.class);
		// Swap criteria statements if you would like to try out type-safe
		// criteria queries, a new
		// feature in JPA 2.0
		// criteria.select(member).orderBy(cb.asc(member.get(Unidade_.name)));
		criteria.select(member).orderBy(cb.asc(member.get("unidade")));
		unidades = em.createQuery(criteria).getResultList();
		log.info( "Existem " + unidades.size() + " cadastradas atualmente...");
	}
}
