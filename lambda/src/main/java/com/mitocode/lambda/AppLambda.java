package com.mitocode.lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class AppLambda {
	
	public void ordenar() {
		List<String> lista = new ArrayList<String>();
		lista.add("Mitocode");
		lista.add("Code");
		lista.add("Mito");
		
		//imperativo
		/*Collections.sort(lista, new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				return o1.compareTo(o2);
			}
		});*/
		
		//lamba declarativo
		Collections.sort(lista,(String o1, String o2)-> o1.compareTo(o2));
		
		for(String elemento : lista) {
			System.out.println(elemento);
		}
	}
	
	public void calcular() {
		//imperativo
		/*Operacion opp = new Operacion() {
			
			@Override
			public double calcularPromedio(double p1, double p2) {
				
				return (p1+p2)/2;
			}
		};
		
		System.out.println(opp.calcularPromedio(5, 8));*/
		
		//declarativo lambda
		
		Operacion operacion = (x,y) -> (x+y)/2;
		
		System.out.println(operacion.calcularPromedio(6, 9));
		
	}
	

	public static void main(String[] args) {
		
		AppLambda app = new AppLambda();
		app.ordenar();
		app.calcular();
		
	}

}
