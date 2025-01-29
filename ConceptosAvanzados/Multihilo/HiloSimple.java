package ConceptosAvanzados.Multihilo;

public class HiloSimple extends Thread{
	public void run() {
		try {
			Thread.sleep(1000);
			System.out.println("Hola desde el hilo!");
		} catch(InterruptedException e) { // Excepción para ver si se ha interrumpido el subproceso actual 
			e.printStackTrace();
		}
		System.out.println("Fin de la tarea");
	}
	
	public static void main(String[] args) {
		HiloSimple hilo = new HiloSimple();
		hilo.start(); // Se inicia el hilo
		
		try {
			hilo.join(); // Espera a que el hilo termine hasta que el segundo hilo termine (en este ejemplo solo hay 1 hilo)
		} catch(InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("El hilo ha terminado su ejecución");		
	}
}
