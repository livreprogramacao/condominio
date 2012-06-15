package br.com.livre.programacao.condominio.jsr299;

import javax.ejb.Local;

@Local
public interface Translator {

	public String translate(String sentence);

}
