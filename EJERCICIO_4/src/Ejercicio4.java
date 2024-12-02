import java.util.Random;

public class Ejercicio4 {
    public static void main(String[] args) {
        // Crear una tabla (array) de longitud 10
        int[] tabla = new int[10];

        // Instancia de la clase Random para generar números aleatorios
        Random random = new Random();

        // Inicializar la tabla con números aleatorios entre 1 y 100
        int suma = 0; // Variable para almacenar la suma de los números

        System.out.println("Números generados en la tabla:");
        for (int i = 0; i < tabla.length; i++) {
            tabla[i] = random.nextInt(100) + 1; // Genera un número entre 1 y 100
            suma += tabla[i]; // Acumula el valor en la suma
            System.out.println("tabla[" + i + "] = " + tabla[i]);
        }

        // Mostrar la suma de todos los números
        System.out.println("\nLa suma de todos los números en la tabla es: " + suma);
    }
}
