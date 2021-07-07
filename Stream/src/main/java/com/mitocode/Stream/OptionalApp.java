package com.mitocode.Stream;

public class OptionalApp {

    public void probar(String valor){
        System.out.println(valor.contains("mito"));
    }

    public void orElse(String valor){

    }
    public void orElseThrow(String valor){

    }

    public void isPresent(String valor){

    }


     public static void main(String[] args) {
        OptionalApp app = new OptionalApp();
        app.probar(null);

    }
}
