package com.mitocode.lambda;

public class Scopes {
	private static double atributo1;
	private double atributo2;
	
	public double probarLocalVariable() {
		final double n3 = 3;
		
		/*Operacion op = new Operacion() {
			
			@Override
			public double calcularPromedio(double p1, double p2) {
				
				return p1 +p2 + n3;
			}
		};*/
		
		Operacion op =(x,y) ->{
			return x+y+n3;
		};
		
		return op.calcularPromedio(1, 1);
	}
	
	public double probarAtributosStaticVariable() {
		Operacion op = (x,y)->{
			atributo1=x+y;
			atributo2=atributo1;
			return atributo2;
		};
		return op.calcularPromedio(2, 5);
	}
	public static void main(String[] args) {
		Scopes app = new Scopes();
		System.out.println(app.probarAtributosStaticVariable());
		

	}

}
