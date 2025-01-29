package ConceptosAvanzados.Multihilo;

public class Ejercicio4 extends Thread{
	private static int contador = 0; // Variable compartida
	
	public void run() {
		for (int i=0; i<100000; i++) {
			incrementar();
			
			// Mostrar el estado del contador cada 1000 incrementos
            if (i % 1000 == 0) {
                System.out.println(Thread.currentThread().getName() + " ha incrementado el contador. Valor actual: " + contador);
            }
            
            try {
                // Simulamos que el hilo hace un pequeño trabajo, para poder ver la ejecución en paralelo
                Thread.sleep(1);  // 1 ms de pausa
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
		}
	}
	
	// Método sincronizado 
	private synchronized void incrementar() {
		contador++;
	}
	
	public static void main(String[] args) {
		Ejercicio4 hilo1 = new Ejercicio4();
		Ejercicio4 hilo2 = new Ejercicio4();
		
		hilo1.start();
		hilo2.start();
		
		try {
			hilo1.join();
			hilo2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("Valor final del contador: " + contador);
	}
	
}
