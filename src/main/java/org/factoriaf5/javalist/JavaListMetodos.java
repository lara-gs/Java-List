package org.factoriaf5.javalist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class JavaListMetodos {

    public List<String> diasDeLaSemana = new ArrayList<>();


    public void crearListaDias() {
        diasDeLaSemana.add("Lunes");
        diasDeLaSemana.add("Martes");
        diasDeLaSemana.add("Miercoles");
        diasDeLaSemana.add("Jueves");
        diasDeLaSemana.add("Viernes");
        diasDeLaSemana.add("Sabado");
        diasDeLaSemana.add("Domingo");
    }

    public List<String> obtenerListaDias() {
        return diasDeLaSemana;
    }

    public int retornarLargoDeLaLista(){
        return diasDeLaSemana.size();
    }

    public void eliminarDiaDeLaSemana(){
        diasDeLaSemana.remove(0);
    }
    public String diaDeLaSemanaSolicitado(int numero){
        return diasDeLaSemana.get(numero);
    }
    
    public boolean diaDeLaSemanaExiste(String dia){
        return diasDeLaSemana.contains(dia);
    }
    public List<String> ordenarDiasAlfabeticamente(){
        Collections.sort(diasDeLaSemana);
        return diasDeLaSemana;
    }
    public void vaciarLista(){
        diasDeLaSemana.clear();
    }
}