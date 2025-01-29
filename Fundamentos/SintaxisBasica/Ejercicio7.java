package Fundamentos.SintaxisBasica;

import java.util.Scanner;

public class Ejercicio7 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int num = 0;
		
		try {
			System.out.println("Introduce un numero de 5 cifras: ");
			num = teclado.nextInt();
			String numeroStr = Integer.toString(num);
			
			if(num < 1000 || num > 99999) {
				System.out.println("El numero introducido debe ser de 5 cifras");
			}
			
			for (int i=0; i<5; i++) {
				for (int j=4-i; j<5; j++) {
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
