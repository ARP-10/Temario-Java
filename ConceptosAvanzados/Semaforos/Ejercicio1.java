package ConceptosAvanzados.Semaforos;

import java.util.Scanner;
import java.util.concurrent.Semaphore;

public class Ejercicio1 extends Thread {
	private int idPerro;
	private static int totalPerros;
	private static final int MAX_PERROS_BEBEDERO = 3;
	private static Semaphore semaforo = new Semaphore(MAX_PERROS_BEBEDERO);
	
	public Ejercicio1 (int idPerro) {
		this.idPerro = idPerro;
	}
	
	public void run() {
		try {
			int tiempo = (int) (Math.random() * 1000 + 100);
			System.out.println("El perro " + idPerro + " está esperando para poder beber");
			semaforo.acquire();
			
			System.out.println("El perro " + idPerro + " está bebiendo");
			Thread.sleep(tiempo);
			
			System.out.println("El perro " + idPerro + " ha terminado de beber");
			semaforo.release();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Cuántos perros hay en la perrera?");
		totalPerros = teclado.nextInt();
		Thread[] perros = new Thread[totalPerros];
		
		for (int i=0; i<perros.length; i++) {
			perros[i] = new Ejercicio1(i+1);
			perros[i].start();
		}
		
		for(Thread perro: perros) {
			try {
				perro.join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
