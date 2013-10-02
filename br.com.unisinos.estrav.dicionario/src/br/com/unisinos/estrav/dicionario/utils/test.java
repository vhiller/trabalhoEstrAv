package br.com.unisinos.estrav.dicionario.utils;

import java.io.IOException;

import br.com.unisinos.estrav.dicionario.dictionary.Translator;

public class test {

	public static void main(String[] args) {
		Translator translator = new Translator();
		try {
			translator.carregaDicionario("dictionary.dat");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("this = " + translator.translateWord("the"));
		System.out.println("name = " + translator.translateWord("name"));
		System.out.println("date = " + translator.translateWord("date"));
		System.out.println("love = " + translator.translateWord("love"));
		System.out.println("are = " + translator.translateWord("are"));
	}

}
