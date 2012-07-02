package br.com.livre.programacao.condominio.repository;

import java.util.List;

import br.com.livre.programacao.condominio.model.Unidade;

public interface CondominoRepository {
	void salvar(Unidade unidade);
	Unidade buscar(Long id);
    List<Unidade> listar();
}
