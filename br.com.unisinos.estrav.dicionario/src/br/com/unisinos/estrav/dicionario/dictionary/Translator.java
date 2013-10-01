package br.com.unisinos.estrav.dicionario.dictionary;

import java.io.BufferedReader;

import br.com.unisinos.estrav.dicionario.collections.AvlTree;
import br.com.unisinos.estrav.dicionario.collections.LinkedList;
import br.com.unisinos.estrav.dicionario.utils.FileHandler;

/**
 * Classe responsável por todas as operações relacionadas a manutenção e leitura
 * do dicionário.
 * 
 * @author Leonardo Faitão
 * @author Vinicius Hiller
 * 
 */
public class Translator {

	private AvlTree<String> avlTree;

	/**
	 * Traduz uma única palavra. Este método recebe como parâmetro a palavra a
	 * ser traduzida e retorna a lista das possíveis traduções para esta
	 * palavra.
	 */
	public LinkedList<String> translateWord(String word) {
		return null;
	}

	/**
	 * Insere uma nova definição no dicionário. Recebe como parâmetro a palavra
	 * em inglês e lista de possíveis traduções.
	 */
	public void insertWord(String word, LinkedList<String> definitions) {
		new Dictionary(word, definitions);
		// TODO Auto-generated method stub
	}

	/**
	 * Salva o arquivo de dicionário (dicionário.dat) com as respectivas
	 * definições baseado no conteúdo da árvore AVL
	 */
	public void saveDictionary(String filePath) {
		FileHandler.savaDictionaryFile(filePath,avlTree);
	}

	protected void carregaDicionario(String filePath) {
		BufferedReader bufferedReader = FileHandler.loadDictionaryFile(filePath);
		// TODO Auto-generated method stub
	}

}
