package com.mitocode.lambda;

public class FunctionInterface {
	
	public double operar(double x, double y) {
		Operacion op =(n1,n2) ->(n1+n2);
		return op.calcularPromedio(x, y);
	}

	
	
	public static void main(String[] args) {

		FunctionInterface app = new FunctionInterface();
		double rpta = app.operar(8, 7);
		System.out.println(rpta);
				

	}

}
