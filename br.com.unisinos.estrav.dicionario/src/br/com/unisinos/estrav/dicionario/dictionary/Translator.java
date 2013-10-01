package br.com.unisinos.estrav.dicionario.dictionary;

import java.io.BufferedReader;

import br.com.unisinos.estrav.dicionario.collections.AvlTree;
import br.com.unisinos.estrav.dicionario.collections.LinkedList;
import br.com.unisinos.estrav.dicionario.utils.FileHandler;

/**
 * Classe respons�vel por todas as opera��es relacionadas a manuten��o e leitura
 * do dicion�rio.
 * 
 * @author Leonardo Fait�o
 * @author Vinicius Hiller
 * 
 */
public class Translator {

	private AvlTree<String> avlTree;

	/**
	 * Traduz uma �nica palavra. Este m�todo recebe como par�metro a palavra a
	 * ser traduzida e retorna a lista das poss�veis tradu��es para esta
	 * palavra.
	 */
	public LinkedList<String> translateWord(String word) {
		return null;
	}

	/**
	 * Insere uma nova defini��o no dicion�rio. Recebe como par�metro a palavra
	 * em ingl�s e lista de poss�veis tradu��es.
	 */
	public void insertWord(String word, LinkedList<String> definitions) {
		new Dictionary(word, definitions);
		// TODO Auto-generated method stub
	}

	/**
	 * Salva o arquivo de dicion�rio (dicion�rio.dat) com as respectivas
	 * defini��es baseado no conte�do da �rvore AVL
	 */
	public void saveDictionary(String filePath) {
		FileHandler.savaDictionaryFile(filePath,avlTree);
	}

	protected void carregaDicionario(String filePath) {
		BufferedReader bufferedReader = FileHandler.loadDictionaryFile(filePath);
		// TODO Auto-generated method stub
	}

}
