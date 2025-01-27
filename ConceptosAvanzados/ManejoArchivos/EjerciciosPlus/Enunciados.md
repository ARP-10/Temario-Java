
# Ejercicios de Java: Conceptos avanzados

## 1. Manejo de archivos

### Ejercicio 1: Copiar contenido de un archivo
Crea un programa que lea un archivo de texto llamado `entrada.txt` y escriba su contenido en un archivo llamado `salida.txt`. Usa las clases `BufferedReader` y `BufferedWriter`.

### Ejercicio 2: Contar palabras en un archivo
Escribe un programa que lea un archivo de texto y cuente el número total de palabras que contiene. Imprime el resultado en la consola.

### Ejercicio 3: Crear un registro de errores
Crea un programa que registre mensajes de error en un archivo llamado `errores.log`. Cada vez que ocurra un error en tu programa, escribe un mensaje en el archivo con una marca de tiempo.

### Ejercicio 4: Leer y mostrar líneas específicas
Escribe un programa que permita al usuario ingresar un número de línea y luego muestre esa línea específica de un archivo de texto.

---

## 2. Multithreading

### Ejercicio 5: Imprimir números y letras simultáneamente
Crea dos hilos. Uno debe imprimir los números del 1 al 10, y el otro debe imprimir las letras de la 'A' a la 'J'. Haz que ambos hilos se ejecuten simultáneamente.

### Ejercicio 6: Simulación de una cuenta bancaria
Implementa una cuenta bancaria compartida entre dos hilos: uno que deposite dinero y otro que lo retire. Usa `synchronized` para evitar problemas de concurrencia.

### Ejercicio 7: Temporizador con hilos
Crea un programa que use un hilo para actuar como temporizador, imprimiendo un mensaje cada segundo durante 10 segundos.

### Ejercicio 8: Productor y consumidor
Implementa el patrón de productor-consumidor usando hilos. El productor genera números aleatorios y los coloca en una lista compartida. El consumidor lee y elimina los números de la lista.

---

## 3. Librerías y herramientas comunes

### Ejercicio 9: Crear un proyecto Maven
1. Crea un proyecto Maven con el siguiente comando:
   ```bash
   mvn archetype:generate -DgroupId=com.ejemplo -DartifactId=proyecto-ejemplo -DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=false
   ```
2. Agrega la dependencia de JUnit en el archivo `pom.xml`:
   ```xml
   <dependency>
       <groupId>junit</groupId>
       <artifactId>junit</artifactId>
       <version>4.13.2</version>
       <scope>test</scope>
   </dependency>
   ```

### Ejercicio 10: Crear pruebas con JUnit
Escribe una clase `Calculadora` con un método `sumar(int a, int b)`. Luego, crea una prueba unitaria con JUnit para verificar que la suma de dos números es correcta.

### Ejercicio 11: Usar Lombok para simplificar clases
1. Crea una clase `Persona` con los atributos `nombre` y `edad`.
2. Usa las anotaciones de Lombok `@Getter`, `@Setter` y `@ToString` para simplificar el código.

### Ejercicio 12: Registrar tiempos de ejecución con JUnit
Usa la clase `@Before` y `@After` de JUnit para medir el tiempo de ejecución de una prueba unitaria.

---

¡Buena suerte resolviendo los ejercicios! Si necesitas ayuda con alguno de ellos, no dudes en preguntar.
