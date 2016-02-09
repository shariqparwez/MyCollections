package com.training.maps;
import java.util.*;

public class Books {
	private HashMap<String, ArrayList<String>> booksList;
	public Books(){
		booksList = new HashMap<String, ArrayList<String>>();
		init();
		
	}
	public void init(){
		ArrayList<String> computerScience = new ArrayList<String>();
		computerScience.add("Python");
		computerScience.add("C Programming");
		computerScience.add("Java");
		
		ArrayList<String> science = new ArrayList<>();
		science.add("Biology");
		science.add("Chemistry");
		science.add("Physics");
		
		booksList.put("Computer", computerScience);
		booksList.put("Science", science);
	}
	
	public void printBooksList(){
		Set<Map.Entry<String, ArrayList<String>>> list = booksList.entrySet();
		for(Map.Entry<String, ArrayList<String>> words : list){
			System.out.println(words.getKey() + ":= " + words.getValue());
	}
		
	}
	
	public void printBooksList(String bookType){
		System.out.println(bookType + " books : " + booksList.get(bookType));
	}
	
}
