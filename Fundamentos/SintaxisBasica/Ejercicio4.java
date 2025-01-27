package Fundamentos.SintaxisBasica;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        // Formula: F=(C×1.8)+32
        Scanner teclado = new Scanner(System.in);

        System.out.println("Inserta los grados celsius: ");
        double celsius = teclado.nextDouble();
        double fahrenheit = (celsius * 1.8) + 32;

        System.out.println("La conversion de los grados celsius " + celsius + " a fahrenheit es: " + fahrenheit);
        
        teclado.close();
    }
}
