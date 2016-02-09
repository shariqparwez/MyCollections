package com.training.maps;

public class TranslateApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TranslateService translate = new TranslateService();
		
		System.out.println(translate.findEnglishWord("ek"));
		
		translate.printWords();
	}

}
