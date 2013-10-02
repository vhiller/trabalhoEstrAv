package br.com.unisinos.estrav.dicionario.utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

import br.com.unisinos.estrav.dicionario.collections.AvlTree;


/**
 * Classe utilitária para escrita e leitura de arquivos.
 * 
 * @author Leonardo Faitão
 * @author Vinicius Hiller
 * 
 */
public class FileHandler {

	public static final String SEPARADOR = "#";
	private static File file; 
	
	/**
	 * Método que define o atributo file e retorna um leitor para este arquivo.
	 * @param path - caminho do arquivo
 	 * @return BufferedReader leitor do arquivo
	 */
	public static BufferedReader loadDictionaryFile(String path) {
		try {
			return new BufferedReader(new FileReader(new File(path)));
		} catch (FileNotFoundException e) {
			System.err.println("Arquivo não encontrado");
			e.printStackTrace();
		}
		return null;
	}

	/**
	 * Método que salva no arquivo o conteúdo atual da Árvore AVL.
	 * @param avlTree - árvore AVL
	 */
	public static void savaDictionaryFile(String path, AvlTree avlTree) {
		// TODO Auto-generated method stub
	}

}
