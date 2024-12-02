public class Ejercicio2 {
    public static void main(String[] args) {
        // Crear una tabla (array) de 10 elementos del tipo deseado (int en este caso)
        int[] tablaOriginal = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};

        // Declarar diferentes variables que referencian la misma tabla
        int[] referencia1 = tablaOriginal;
        int[] referencia2 = tablaOriginal;
        int[] referencia3 = tablaOriginal;

        // Imprimir las referencias de cada variable para comprobar que son iguales
        System.out.println("Referencia de tablaOriginal: " + tablaOriginal);
        System.out.println("Referencia de referencia1: " + referencia1);
        System.out.println("Referencia de referencia2: " + referencia2);
        System.out.println("Referencia de referencia3: " + referencia3);

        // Comprobación adicional: modificar la tabla desde una de las referencias
        referencia1[0] = 999; // Cambiamos el primer elemento

        // Imprimir los valores de cada variable para verificar que apuntan al mismo array
        System.out.println("\nValores en tablaOriginal:");
        for (int valor : tablaOriginal) {
            System.out.println(valor);
        }

        System.out.println("\nValores en referencia1:");
        for (int valor : referencia1) {
            System.out.println(valor);
        }

        System.out.println("\nValores en referencia2:");
        for (int valor : referencia2) {
            System.out.println(valor);
        }

        System.out.println("\nValores en referencia3:");
        for (int valor : referencia3) {
            System.out.println(valor);
        }
    }
}
