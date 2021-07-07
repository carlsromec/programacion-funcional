package com.mitocode.lambda;

public class DefaultMethod implements PersonaA, PersonaB{
	
	@Override
	public void caminar() {
		
		System.out.println("hola code");
		
	}
	
	@Override
	public void hablar() {
		//PersonaB.super.hablar();
		System.out.println("subcribete code");
	}

	public static void main(String[] args) {
		
		DefaultMethod app = new DefaultMethod();
		app.hablar();
		
	}

	

}
