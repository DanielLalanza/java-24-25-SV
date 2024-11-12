import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce un número entero positivo: ");
        int n = scanner.nextInt();
        int suma = 0;

        // Código ineficiente para sumar números pares
        for (int i = 2; i <= n; i += 2) {       // Recorrer (Solo pares)
                suma += i;
        }
            System.out.println("La suma de los números pares de 1 a " + n + " es: " + suma);
            scanner.close();
    }
}

