package br.com.unisinos.estrav.dicionario.dictionary;

import br.com.unisinos.estrav.dicionario.collections.LinkedList;

/**
 * Classe que representa cada palavra em ingl�s do dicion�rio e suas devidas
 * tradu��es.
 * 
 * @author Leonardo Fait�o
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
	/** Palavra em ingl�s. */
	public String getPalavra() {
		return word;
	}

	/** Palavra em ingl�s. */
	public void setPalavra(String palavra) {
		this.word = palavra;
	}

	/** Lista encadeada de tradu��es */
	public LinkedList<String> getDefinitions() {
		return definitions;
	}

	/** Lista encadeada de tradu��es */
	public void setDefinitions(LinkedList<String> definitions) {
		this.definitions = definitions;
	}

	@Override
	public String toString() {
		return word;
	}
}
