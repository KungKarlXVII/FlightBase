package se.lexicon.application;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import se.lexicon.ui.SystemUI;
//test
public class Main {

    public static void main(String[] args) {
    	
    	List<String> example = new ArrayList<>();
    	example.add("Ett");
    	example.add("Tv�");
    	example.add("Tre");
    	example.add("Fyra");
    	example.add("Fem");
    	example.add("Fem");
    	
    	
//    	for(String text : example) {
//    		if(text.equalsIgnoreCase("tv�")) example.remove(text);
//    	}
    	
    	Iterator<String> it = example.iterator();
    	while(it.hasNext()) {
    		String current = it.next();
    		if(current.equalsIgnoreCase("tv�")) it.remove();
    	}
    	
    	example.forEach(System.out::println);
    	
    	
//        SystemUI ui = new SystemUI();
//        ui.start();

    }
}
