package br.com.livre.programacao.condominio.jsr299;

import java.util.ArrayList;
import java.util.List;

public class SentenceParser {

	public List<String> parse(String text) {
		String[] matches = text.split(" ", 0);
		List<String> sentences = new ArrayList<String>(10);
		
		for (String match : matches) {
			sentences.add(match);
		}
		
		return sentences;
	}

}
