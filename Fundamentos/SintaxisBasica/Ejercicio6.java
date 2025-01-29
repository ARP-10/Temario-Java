package Fundamentos.SintaxisBasica;

import java.util.Scanner;

public class Ejercicio6 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num = 0;
        
        try {
        	System.out.println("Introduce un número entero de 5 cifras: ");
            num = teclado.nextInt();
            String numeroStr = Integer.toString(num);  // Convierte el int a String
            
         // Verificar que el número tiene 5 cifras
            if (num < 10000 || num > 99999) {
                System.out.println("El número debe tener exactamente 5 cifras.");
            }
                        
            for (int i=0; i<5; i++) {
            	for (int j=0; j<=i; j++) {
            		System.out.print(numeroStr.charAt(j));
            	}
                System.out.println();
            }
		} catch (Exception e) {
			System.out.println("Debes introducir un numero entero");
		}
        
        
        
        teclado.close();
    }
}
