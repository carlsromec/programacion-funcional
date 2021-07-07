package com.mitocode.Stream;

import java.util.ArrayList;
import java.util.List;

public class StreamApp {

    private List<String> lista;
    private  List<String> numero;

    public StreamApp(){
        lista = new ArrayList<>();
        lista.add("manuel");
        lista.add("carlos");
        lista.add("luis");
        lista.add("eder");

        numero = new ArrayList<>();
        numero.add("1");
        numero.add("3");
        numero.add("2");
    }

    public void filtrar(){
        lista.stream().filter(x -> x.startsWith("m")).forEach(System.out::println);
    }

    public void ordenar(){
        lista.stream().sorted((x,y)->y.compareTo(x)).forEach(System.out::println);
    }

    public void transformar(){
        //lista.stream().map(String::toUpperCase).forEach(System.out::println);
        /*for (String x : numero){
            int num= Integer.parseInt(x) + 1;
            System.out.println(num);
        }*/
        numero.stream().map(x->Integer.parseInt(x) + 1).forEach(System.out::println);
    }

    public  void limitar(){
        lista.stream().limit(2).forEach(System.out::println);
    }

    public void contar(){
        long x = lista.stream().count();
        System.out.println(x);
    }

    public static void main(String[] args){
        StreamApp app= new StreamApp();
        app.filtrar();
        app.ordenar();
        app.transformar();
        app.limitar();
        app.contar();
    }
}
