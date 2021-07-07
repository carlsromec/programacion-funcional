package com.mitocode.lambda;

public interface PersonaA {
	
	public void caminar();
	
	default public void hablar() {
		System.out.println("persona hablar - personaA");
	}

}
