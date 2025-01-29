package ConceptosAvanzados.Multihilo.Ejercicio3;

public class VariosHilos extends Thread{
	private int numero;
	
	public VariosHilos(int numero) {
		this.numero = numero;
	}
	
	public void run() {
		System.out.println("Tarea " + numero + " iniciada");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Tarea " + numero + " eliminada"); // Cada vez que un hilo termina su ejecución
	}
	
	public static void main(String[] args) {
		VariosHilos[] hilos = new VariosHilos[5];
		
		for (int i=0; i<5; i++) {
			hilos[i] = new VariosHilos(i);
			hilos[i].start(); // Iniciar cada hilo
		}
		
		// Esperar a que todos los hilos terminen
		for (int i=0; i<5; i++) {
			try {
				hilos[i].join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Todos los hilos han terminado");
	}
}
