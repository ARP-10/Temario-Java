package Fundamentos.Excepciones;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        try{
            System.out.println("Introduce el primer numero: ");
            int num1 = teclado.nextInt();

            System.out.println("Introduce el segundo numero: ");
            int num2 = teclado.nextInt();

            int resultado = num1 / num2; 
            System.out.println("El resultado de la division es: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("Error: No se puede dividir entre cero");
        } catch (Exception e) {
            System.out.println("Error " + e.getMessage());
        } finally {
            System.out.println("Operacion finalizada");
            teclado.close();
        }
    }
}
