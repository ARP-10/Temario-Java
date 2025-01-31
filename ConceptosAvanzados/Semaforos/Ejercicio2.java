package ConceptosAvanzados.Semaforos;

import java.util.Scanner;
import java.util.concurrent.Semaphore;

public class Ejercicio2 extends Thread{
	private int idCoche;
	private static int totalCoches;
	private static final int MAX_COCHES_TUNEL = 1;
	private static Semaphore semaforo = new Semaphore(MAX_COCHES_TUNEL);
	
	public Ejercicio2(int idCoche) {
		this.idCoche = idCoche;
	}
	
	public void run() {
		try {
			int tiempoTunel = (int) (Math.random()* 3000 + 1000);
			System.out.println("El coche " + idCoche + " está esperando para poder entrar al túnel");
			semaforo.acquire();
			
			System.out.println("El coche " + idCoche + " está cruzando el túnel");
			Thread.sleep(tiempoTunel);
			
			System.out.println("El coche " + idCoche + " ha salido del túnel");
			semaforo.release();
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("-- Túnel peligroso --");
		System.out.println("Cuántos coches están esperando para entrar al túnel?");
		totalCoches = teclado.nextInt();
		Thread[] coches = new Thread[totalCoches];
		
		for (int i=0; i<coches.length; i++) {
			coches[i] = new Ejercicio2(i+1);
			coches[i].start();
		}
		
		
		for(Thread coche : coches) {
			try {
				coche.join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		teclado.close();
	}
}
