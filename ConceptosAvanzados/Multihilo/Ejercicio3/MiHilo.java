package ConceptosAvanzados.Multihilo.Ejercicio3;

public class MiHilo extends Thread{
	private String mensaje;
	
	public MiHilo(String mensaje) {
		this.mensaje = mensaje;
	}
	
	@Override
	public void run() {
		try {
			Thread.sleep(1000);
			System.out.println(mensaje);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
