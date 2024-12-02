public class Ejercicio1 {
    public static void main(String[] args) {
        // Crear las tablas (arrays)
        int[] tablaEnteros = {10, 20, 30, 40, 50};
        double[] tablaDoubles = {1.1, 2.2, 3.3, 4.4, 5.5};
        boolean[] tablaBooleanos = {true, false, true, false, true};

        // Mostrar las referencias de las tablas
        System.out.println("Referencia de tablaEnteros: " + tablaEnteros.toString());
        System.out.println("Referencia de tablaDoubles: " + tablaDoubles.toString());
        System.out.println("Referencia de tablaBooleanos: " + tablaBooleanos.toString());

        // Mostrar los valores almacenados en cada tabla
        System.out.println("\nValores en tablaEnteros:");
        for (int valor : tablaEnteros) {
            System.out.println(valor);
        }

        System.out.println("\nValores en tablaDoubles:");
        for (double valor : tablaDoubles) {
            System.out.println(valor);
        }

        System.out.println("\nValores en tablaBooleanos:");
        for (boolean valor : tablaBooleanos) {
            System.out.println(valor);
        }
    }
}
