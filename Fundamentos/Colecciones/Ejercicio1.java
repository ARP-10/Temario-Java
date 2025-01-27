package Fundamentos.Colecciones;

import java.util.ArrayList;

public class Ejercicio1 {
    public static void main(String[] args) {
        // Crear lista
        ArrayList<String> listaPersonas = new ArrayList<>();
        
        // Insertar nombre
        listaPersonas.add("Alejandra");
        listaPersonas.add("Benjamin");
        listaPersonas.add("Kronk");

        System.out.println("Lista: " + listaPersonas);

        // Eliminar nombre
        listaPersonas.remove("Kronk");

        // Mostrar lista
        System.out.println("Lista: " + listaPersonas);
    }
}
