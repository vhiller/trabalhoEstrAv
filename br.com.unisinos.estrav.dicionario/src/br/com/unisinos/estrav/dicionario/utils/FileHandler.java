package br.com.unisinos.estrav.dicionario.utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

import br.com.unisinos.estrav.dicionario.collections.AvlTree;


/**
 * Classe utilit�ria para escrita e leitura de arquivos.
 * 
 * @author Leonardo Fait�o
 * @author Vinicius Hiller
 * 
 */
public class FileHandler {

	public static final String SEPARADOR = "#";
	private static File file; 
	
	/**
	 * M�todo que define o atributo file e retorna um leitor para este arquivo.
	 * @param path - caminho do arquivo
 	 * @return BufferedReader leitor do arquivo
	 */
	public static BufferedReader loadDictionaryFile(String path) {
		try {
			return new BufferedReader(new FileReader(new File(path)));
		} catch (FileNotFoundException e) {
			System.err.println("Arquivo n�o encontrado");
			e.printStackTrace();
		}
		return null;
	}

	/**
	 * M�todo que salva no arquivo o conte�do atual da �rvore AVL.
	 * @param avlTree - �rvore AVL
	 */
	public static void savaDictionaryFile(String path, AvlTree avlTree) {
		// TODO Auto-generated method stub
	}

}
