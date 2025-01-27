package Fundamentos.Excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        try {
            System.out.println("Ingresa un numero del 1 al 10: ");
            int num = teclado.nextInt();

            while (num < 1 || num > 10) {
                System.out.println("Por favor introduce un numero entre 1 y 10");
                num = teclado.nextInt();
            }

            System.out.println("El numero introducido es " + num);
                        
        } catch (InputMismatchException e) {
            System.out.println("ERROR: El dato introducido no es un numero");
        } catch (Exception e) {
            System.out.println("ERROR: " + e.getMessage());
        } finally {
            System.out.println("Operacion finalizada");
            teclado.close();
        }        
    }
}
