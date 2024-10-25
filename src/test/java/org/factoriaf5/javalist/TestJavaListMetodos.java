package org.factoriaf5.javalist;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class TestJavaListMetodos {

    @Test
    public void testCrearListaDias() {
        JavaListMetodos javalist = new JavaListMetodos();
        javalist.crearListaDias();
        List<String> diasDeLaSemana = new ArrayList<>();
        diasDeLaSemana.add("Lunes");
        diasDeLaSemana.add("Martes");
        diasDeLaSemana.add("Miercoles");
        diasDeLaSemana.add("Jueves");
        diasDeLaSemana.add("Viernes");
        diasDeLaSemana.add("Sabado");
        diasDeLaSemana.add("Domingo");
        assertTrue(diasDeLaSemana.equals(javalist.diasDeLaSemana));
    }

    @Test
    public void testObtenerListaDias() {
        JavaListMetodos javalist = new JavaListMetodos();
        javalist.crearListaDias();
        javalist.obtenerListaDias();
        List<String> diasDeLaSemana = new ArrayList<>();
        diasDeLaSemana.add("Lunes");
        diasDeLaSemana.add("Martes");
        diasDeLaSemana.add("Miercoles");
        diasDeLaSemana.add("Jueves");
        diasDeLaSemana.add("Viernes");
        diasDeLaSemana.add("Sabado");
        diasDeLaSemana.add("Domingo");
        assertTrue(diasDeLaSemana.equals(javalist.diasDeLaSemana));
    }

    @Test
    public void testRetornarLargoDeLaLista() {
        JavaListMetodos javalist = new JavaListMetodos();
        javalist.crearListaDias();
        int largoLista = 7;
        int resultado = javalist.retornarLargoDeLaLista();
        assertEquals(largoLista, resultado);

    }

    @Test
    public void testEliminarDiaDeLaSemana() {
        JavaListMetodos javalist = new JavaListMetodos();
        javalist.crearListaDias();
        int largoLista = 6;
        javalist.eliminarDiaDeLaSemana();
        int resultado = javalist.retornarLargoDeLaLista();
        assertEquals(largoLista, resultado);
    }

    @Test
    public void testDiaDeLaSemanaSolicitado() {
        JavaListMetodos javalist = new JavaListMetodos();
        javalist.crearListaDias();
        String diaSemana = "Jueves";
        String resultado = javalist.diaDeLaSemanaSolicitado(3);
        assertEquals(diaSemana, resultado);
    }

    @Test
    public void testDiaDeLaSemanaExiste() {
        JavaListMetodos javalist = new JavaListMetodos();
        javalist.crearListaDias();
        boolean resultado = javalist.diaDeLaSemanaExiste("Jueves");
        assertTrue(resultado);
    }

    @Test
    public void testOrdenarDiasAlfabeticamente() {
        JavaListMetodos javalist = new JavaListMetodos();
        javalist.crearListaDias();
        javalist.obtenerListaDias();
        List<String> diasDeLaSemanaAlfabeticamente = new ArrayList<>();
        diasDeLaSemanaAlfabeticamente.add("Domingo");
        diasDeLaSemanaAlfabeticamente.add("Jueves");
        diasDeLaSemanaAlfabeticamente.add("Lunes");
        diasDeLaSemanaAlfabeticamente.add("Martes");
        diasDeLaSemanaAlfabeticamente.add("Miercoles");
        diasDeLaSemanaAlfabeticamente.add("Sabado");
        diasDeLaSemanaAlfabeticamente.add("Viernes");
        assertTrue(diasDeLaSemanaAlfabeticamente.equals(javalist.ordenarDiasAlfabeticamente()));

    }
    
    @Test
    public void testVaciarLista(){
        JavaListMetodos javalist = new JavaListMetodos();
        List<String> listaVacia = new ArrayList<>();
        javalist.crearListaDias();
        javalist.vaciarLista();
        assertTrue(listaVacia.equals(javalist.diasDeLaSemana));
    }

}
