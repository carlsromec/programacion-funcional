package com.mitocode.lambda;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Colletion {
	
	private List<String> lista;
	
	public void llenarLista() {
		
		lista = new ArrayList<String>();
		lista.add("mario");
		lista.add("carlos");
		lista.add("pablo");	
		lista.add("julio");
		lista.add("oliver");
	}
	
	public void usarForEach() {
	
		/*for(String element : lista) {
			System.out.println(element);
		}*/
		
		//lista.forEach(x ->System.out.println(x));
		
		lista.forEach(System.out::println);
	}
	
	public void usarRemoveIf() {
		/*Iterator<String> it = lista.iterator();
		while(it.hasNext()) {
			if(it.next().equalsIgnoreCase("mario")) {
				it.remove();
			}
		}*/
		
		lista.removeIf(x -> x.equalsIgnoreCase("mario"));
	}
	
	public void usarSort() {
		lista.sort((x,y) -> x.compareTo(y));
	}
	
	public static void main(String[] args) {
		
		Colletion app = new Colletion();
		app.llenarLista();
		app.usarRemoveIf();
		app.usarSort();
		app.usarForEach();
		
		
	}

}
