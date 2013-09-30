package br.com.unisinos.estrav.dicionario.dictionary;

import br.com.unisinos.estrav.dicionario.collections.LinkedList;

public interface Translator {
	/**
	 * Traduz uma �nica palavra. Este m�todo recebe como par�metro a palavra a
	 * ser traduzida e retorna a lista das poss�veis tradu��es para esta
	 * palavra.
	 */
	public LinkedList traduzPalavra(String palavra);

	/**
	 * Insere uma nova defini��o no dicion�rio. Recebe como par�metro a palavra
	 * em ingl�s e lista de poss�veis tradu��es.
	 */
	public void insereTraducao(String palavra, LinkedList definicoes);

	/**
	 * Salva o arquivo de dicion�rio (dicion�rio.dat) com as respectivas
	 * defini��es baseado no conte�do da �rvore AVL
	 */
	public void salvaDicionario(String arq);
}
