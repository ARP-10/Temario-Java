package Fundamentos.Excepciones;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        try {
            System.out.println("Introduce un numero para calcular su raiz cuadrada: ");
            double num = teclado.nextDouble();
            if(num < 0) {
                throw new IllegalArgumentException("El numero introducido no puede ser negativo");
            }
            double raiz = Math.sqrt(num);
            System.out.println("La raiz cuadrada de " + num + " es: " + raiz);

        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("Operacion finalizada");
            teclado.close();
        }
    }
}
