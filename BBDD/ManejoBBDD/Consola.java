package BBDD.ManejoBBDD;

import java.util.Scanner;

public class Consola {
	public static final Scanner sc = new Scanner(System.in);
	
	public static String pedirTexto(String mensaje) {
		System.out.println(mensaje + ": ");
		return sc.nextLine();
	}
	
	public static void pf(String formato, Object... args) {
		System.out.printf(formato, args);
	}
	
	public static int pedirEntero(String mensaje) {
		boolean equivocado = true; // Para controlar el bucle do-while, al poner true nos aseguramos de que se ejecuta al menos una vez
		
		int entero = 0;
		
		do {
			String texto = pedirTexto(mensaje);
			
			try {
				entero = Integer.parseInt(texto);
				equivocado = false;				
			} catch (NumberFormatException e) {
				System.out.println("No es un numero valido");
			}
			
		} while (equivocado);
		
		return entero;
	}
}
