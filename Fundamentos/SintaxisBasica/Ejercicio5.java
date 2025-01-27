package Fundamentos.SintaxisBasica;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int num;
        do {
            System.out.println("Inserta un numero entre 1 y 7: ");
            num = teclado.nextInt();
            if (num <= 0 || num >7) {
                System.out.println("ERROR: El numero introducido no es valido");
            }
        } while (num <= 0 || num >7);

        
        if (num == 1) {
            System.out.println("Lunes");
        } else if (num == 2) {
            System.out.println("Martes");
        } else if (num == 3) {
            System.out.println("Miercoles");
        } else if (num == 4) {
            System.out.println("Jueves");
        } else if (num == 5) {
            System.out.println("Viernes");
        } else if (num == 6) {
            System.out.println("Sabado");
        } else if (num == 7) {
            System.out.println("Domingo");
        }

        teclado.close();
    }
}
