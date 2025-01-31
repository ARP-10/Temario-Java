1. **Crea una aplicación que permita controlar el bebedero de una perrera**

   Dicho bebedero sólo pueden beber a la vez tres perros. Debéis controlar que sólo accedan tres perros a la vez, indicar cuánta agua bebe cada perro, dependiendo del tiempo que esté en el bebedero (tiempo aleatorio sacado con un Random) y cuánta agua beben todos los perros de la perrera. 

   Debe de mostrar el resultado cuando terminan de ejecutarse todos los hilos.

	## Procedimiento
	
	1. **Identificar los atributos**
	2. **Esquematizar el main**
	   - Tener en cuenta que primero pasa el main por consola y después el run()
	3. **Completar el run() añadiendo las pausas con el semáforo**
	
2. **Túnel**
	Crea un programa en Java en el que tres coches comparten un solo túnel estrecho, de manera que solo un coche puede pasar a la vez. Cada coche necesita entre 1 y 3 segundos para cruzar el túnel.

	Requisitos:
	- Usa semáforos para controlar el acceso al túnel.
	
	- Cada coche debe imprimir un mensaje cuando empieza a cruzar el túnel y otro mensaje cuando termina de cruzarlo.
	
	- Simula la duración del cruce del túnel con un Thread.sleep en un tiempo aleatorio entre 1 y 3 segundos.
		
3. **Cuenta bancaria**
	Debes de realizar una aplicación para que los usuarios puedan ingresar y retirar dinero de una cuenta común. Tu decides cuantos usuarios quieres tener.