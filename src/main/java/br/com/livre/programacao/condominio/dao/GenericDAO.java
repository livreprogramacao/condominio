package br.com.livre.programacao.condominio.dao;

import java.util.List;
import java.util.logging.Logger;

import javax.inject.Inject;
import javax.persistence.EntityManager;

public class GenericDAO<T> {

	@Inject
	private Logger log;

	@Inject
	private EntityManager em;

	public void salvar(T pojo) {
		em.persist(pojo);
		log.info(pojo + " - concluida com sucesso!");
	}

	public void remover(T pojo) {
		em.remove(pojo);
		log.info(pojo + " - concluida com sucesso!");
	}

	public void atualizar(T pojo) {
		em.merge(pojo);
		log.info(pojo + " - concluida com sucesso!");
	}

	public T buscar(Long id) {
		// TODO Auto-generated method stub
//		log.info(pojo + " - concluida com sucesso!");
		return null;
	}

	public List<T> listar() {
		// TODO Auto-generated method stub
//		log.info(pojo + " - concluida com sucesso!");
		return null;
	}

}
