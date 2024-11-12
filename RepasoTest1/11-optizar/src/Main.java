public class Main {
    public static void main(String[] args) {
        int[] numeros = {4, 2, 9, 1, 5, 3};
        int objetivo = 5;

        boolean encontrado = false;
        for (int numero : numeros) {
            if (numero == objetivo) {
                encontrado = true;
                break; // Detener el bucle cuando se encuentra el número
            }
        }

        if (encontrado) {
            System.out.println("Número encontrado");
        } else {
            System.out.println("Número no encontrado");
        }
    }
}
