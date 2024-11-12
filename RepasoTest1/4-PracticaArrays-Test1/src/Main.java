import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] array = new int[10];

        rellenarAscendente(array);
        mostrarAscendente(array);

        mostrarInverso(array);

        rellenarPares(array);
        mostrarPares(array);

        mostrarDeDosEnDos(array);

        rellenarImpares(array);
        mostrarImpares(array);

        duplicarElementos(array);
        mostrarDuplicado(array);

        calcularSuma(array);

        encontrarMaxMin(array);
    }

    public static void rellenarAscendente(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }
    }

    public static void mostrarAscendente(int[] array) {
        System.out.println("Array en orden ascendente: " + Arrays.toString(array));
    }

    public static void mostrarInverso(int[] array) {
        System.out.print("Array en orden inverso: ");
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void rellenarPares(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = i * 2;
        }
    }

    public static void mostrarPares(int[] array) {
        System.out.println("Array con números pares: " + Arrays.toString(array));
    }

    public static void mostrarDeDosEnDos(int[] array) {
        System.out.print("Elementos de dos en dos: ");
        for (int i = 0; i < array.length; i += 2) {
            System.out.print("[" + array[i] + ", " + (i + 1 < array.length ? array[i + 1] : " ") + "] ");
        }
        System.out.println();
    }

    public static void rellenarImpares(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = i * 2 + 1;
        }
    }

    public static void mostrarImpares(int[] array) {
        System.out.println("Array con números impares: " + Arrays.toString(array));
    }

    public static void duplicarElementos(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] *= 2;
        }
    }

    public static void mostrarDuplicado(int[] array) {
        System.out.println("Array con cada elemento duplicado: " + Arrays.toString(array));
    }

    public static void calcularSuma(int[] array) {
        int suma = 0;
        for (int num : array) {
            suma += num;
        }
        System.out.println("Suma de todos los elementos: " + suma);
    }

    public static void encontrarMaxMin(int[] array) {
        int max = array[0];
        int min = array[0];
        for (int num : array) {
            if (num > max) max = num;
            if (num < min) min = num;
        }
        System.out.println("Valor máximo: " + max);
        System.out.println("Valor mínimo: " + min);
    }
}
