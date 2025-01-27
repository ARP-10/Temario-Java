package Fundamentos.Colecciones;

import java.util.HashMap;

public class Ejercicio2 {
    public static void main(String[] args) {
        HashMap<String, Integer> mapa = new HashMap<>();

        mapa.put("Alejandra", 7);
        mapa.put("Benjandra", 3);
        mapa.put("Kronk", 10);

        System.out.println("Lista: " + mapa);

        System.out.println("Nota de Alejandra: " + mapa.get("Alejandra"));
    }
}
