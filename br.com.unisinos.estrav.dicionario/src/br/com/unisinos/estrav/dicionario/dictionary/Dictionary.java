package br.com.unisinos.estrav.dicionario.dictionary;

import br.com.unisinos.estrav.dicionario.collections.LinkedList;

/**
 * Classe que representa cada palavra em inglês do dicionário e suas devidas
 * traduções.
 * 
 * @author Leonardo Faitão
 * @author Vinicius Hiller
 * 
 */
public class Dictionary {

	private String word;
	private LinkedList<String> definitions;


	public Dictionary(String word, LinkedList<String> definitions) {
		this.word = word;
		this.definitions = definitions;
	}
	/** Palavra em inglês. */
	public String getPalavra() {
		return word;
	}

	/** Palavra em inglês. */
	public void setPalavra(String palavra) {
		this.word = palavra;
	}

	/** Lista encadeada de traduções */
	public LinkedList<String> getDefinitions() {
		return definitions;
	}

	/** Lista encadeada de traduções */
	public void setDefinitions(LinkedList<String> definitions) {
		this.definitions = definitions;
	}

	@Override
	public String toString() {
		return word;
	}
}
