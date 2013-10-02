package br.com.unisinos.estrav.dicionario.dictionary;

import java.io.BufferedReader;
import java.io.IOException;

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

	private AvlTree avlTree = new AvlTree();

	/**
	 * Traduz uma �nica palavra. Este m�todo recebe como par�metro a palavra a
	 * ser traduzida e retorna a lista das poss�veis tradu��es para esta
	 * palavra.
	 */
	public LinkedList<String> translateWord(String word) {
		return avlTree.search(word).getKey().getDefinitions();
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
		FileHandler.savaDictionaryFile(filePath, avlTree);
	}

	public void carregaDicionario(String filePath) throws IOException {
		BufferedReader bufferedReader = FileHandler
				.loadDictionaryFile(filePath);
		String line;
		while ((line = bufferedReader.readLine()) != null) {
			String[] split = line.split(FileHandler.SEPARADOR);
			String word = split[0];
			LinkedList<String> definitions = new LinkedList<>();
			for (int i = 1; i < split.length; i++) {
				definitions.addLast(split[i]);
			}
			avlTree.insert(new Dictionary(word, definitions));
		}
	}

}
