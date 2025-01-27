package Fundamentos.SintaxisBasica;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        // Formula area circulo: area = Pi * r2

        Scanner teclado = new Scanner(System.in);

        double pi = Math.PI;

        System.out.println("Inserta el radio del circulo: ");

        double radio = teclado.nextDouble();

        double area = pi * (radio * radio);

        System.out.println("El area del circulo es: " + area);


        teclado.close();
    }
}