package com.mitocode.lambda;

public interface PersonaB {
	
	default public void hablar() {
		System.out.println("persona hablar - personaB");
	}

}
