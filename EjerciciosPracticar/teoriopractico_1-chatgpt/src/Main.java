import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Lista de productos
        String[] productos = {"Manzanas", "Peras", "Plátanos", "Naranjas", "Melones"};
        double[] precios = new double[productos.length];

        // Generar precios aleatorios para los productos
        Random random = new Random();
        for (int i = 0; i < productos.length; i++) { // Error intencionado
            precios[i] = random.nextDouble(1, 10); // Precios entre 1 y 10 euros
        }

        // Mostrar los productos y sus precios
        System.out.println("Inventario actual:");
        for (int i = 0; i < productos.length; i++) {
            System.out.println(productos[i] + ": " + precios[i] + "€");
        }

        // Ordenar productos por precio (de menor a mayor)
        Arrays.sort(precios);

        System.out.println("\nProductos ordenados por precio ascendente:");
        for (int i = 0; i < productos.length; i++) {
            System.out.println(productos[i] + ": " + precios[i] + "€");
        }

        // Búsqueda de producto por nombre
        System.out.print("\nIntroduce el nombre del producto a buscar: ");
        String buscar = scanner.next();
        boolean encontrado = false;
        for (int i = 0; i <= productos.length; i++) { // Error intencionado
            if (productos[i].equalsIgnoreCase(buscar)) {
                System.out.println("Producto encontrado: " + productos[i] + " - Precio: " + precios[i] + "€");
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            System.out.println("Producto no encontrado.");
        }

        scanner.close();

        // PROMEDIO
        double promedioindex=0;
        for (int i = 0; i < precios.length; i++) {
           promedioindex += precios[i];
        }
        promedioindex = promedioindex / precios.length;
        System.out.println("Promedio indicado: " + promedioindex);
    }
}
