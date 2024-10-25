package org.factoriaf5;

import org.factoriaf5.javalist.JavaListMetodos;

public class Main {
    public static void main(String[] args) {
        JavaListMetodos prueba = new JavaListMetodos();
        prueba.crearListaDias();
        String resultado = prueba.diaDeLaSemanaSolicitado(4);
        System.out.println("El 4 dia de la semana es el " + resultado);
    }
}