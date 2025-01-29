package ConceptosAvanzados.Multihilo;

public class HiloSimpleRunnable implements Runnable{
	public void run() {
		try {
			Thread.sleep(1000);
			System.out.println("Hola desde el hilo Runnable!");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		HiloSimpleRunnable tarea = new HiloSimpleRunnable();
		Thread hilo = new Thread(tarea);
		hilo.start(); // Se inicia el hilo
		try {
			hilo.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Programa finalizado");
	}
	
}
