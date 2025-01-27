package Fundamentos.SintaxisBasica;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        boolean encendido = true;

        while (encendido) {
            System.out.println("Calculadora encendida");
            System.out.println("Escoge la operacion que deseas realizar: ");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Apagar calculadora");

            int operacion = teclado.nextInt();

            switch (operacion) {
                case 1:
                    System.out.println("Inserta el primer numero: ");
                    double num1suma = teclado.nextDouble();
                    System.out.println("Inserta el segundo numero: ");
                    double num2suma = teclado.nextDouble();
                    double suma = num1suma + num2suma;
                    System.out.println("La suma de ambos numeros es: " + suma);
                    break;

                case 2:
                    System.out.println("Inserta el primer numero: ");
                    double num1resta = teclado.nextDouble();
                    System.out.println("Inserta el segundo numero: ");
                    double num2resta = teclado.nextDouble();
                    double resta = num1resta - num2resta;
                    System.out.println("La resta de ambos numeros es: " + resta);
                    break;

                case 3:
                    System.out.println("Inserta el primer numero: ");
                    double num1multi = teclado.nextDouble();
                    System.out.println("Inserta el segundo numero: ");
                    Double num2multi = teclado.nextDouble();
                    double multi = num1multi * num2multi;
                    System.out.println("La multiplicacion de ambos numeros es: " + multi);
                    break;

                case 4:
                    System.out.println("Inserta el primer numero: ");
                    double num1div = teclado.nextDouble();
                    double num2div;
                    do {
                        System.out.println("Inserta el segundo numero: ");
                        num2div = teclado.nextDouble();
                        if (num2div == 0) {
                            System.out.println("ERROR: El numero introducido no es valido");
                        }
                    } while (num2div == 0);
                    
                    double div = num1div / num2div;
                    System.out.println("La division de ambos numeros es: " + div);
                    break;

                case 5:
                    System.out.println("Apagando calculadora...");
                    encendido = false;
                    break;
            
                default:
                    break;
            }
            
        }

        teclado.close();
    }
}
