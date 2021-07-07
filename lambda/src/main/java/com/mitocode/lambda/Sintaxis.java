package com.mitocode.lambda;

public class Sintaxis {
	
	public double probarsintaxis() {
		//Operacion operacion = (double x, double y ) -> (x + y)/2;
		//Operacion operacion = (double x, double y ) -> {return(x + y)/2;};
		Operacion operacion = (x, y ) -> {
			double a = 3.4;
			System.out.println(a);
			return (x+y)/2 + a;
			};
		
		//Operacion operacion= () -> 2;
		/*Operacion operacion = () ->{
			int x =2;
			int y = 3;
			return x+y;
		};*/
		
		return operacion.calcularPromedio(2,3);
	}

	public static void main(String[] args) {
		
		Sintaxis app = new Sintaxis();
		System.out.println(app.probarsintaxis());
		

	}

}
