import java.util.Arrays;
import java.util.Random;

public class Main {
    static int[][] matriz = new int[3][9];
    static Random random = new Random();
    public static void main(String[] args) {
        rellenarTablero();
        ordenarTablero();
        imprimirMatriz();
    }

    private static void rellenarTablero(){
        for (int col = 0; col < matriz[0].length; col++) {
            int min = 10 + (col * 10); // valor mínimo para la columna actual
            int max = min + 9;     	// valor máximo para la columna actual

            for (int row = 0; row < matriz.length; row++) {
                matriz[row][col] = random.nextInt(max - min + 1) + min;
            }
        }
    }

    private static void ordenarTablero(){
        for (int i = 0; i < matriz.length; i++) {
            int [] arrayTemp = new int[3];
            for (int j = 0; j < 3; j++) {
                arrayTemp[j] = matriz[j][i];
            }
            Arrays.sort(arrayTemp);
            for (int j = 0; j < 3; j++) {
                 matriz[j][i]=arrayTemp[j];
            }
        }
    }

    private static void imprimirMatriz(){
        for (int row = 0; row < matriz.length; row++) {
            for (int col = 0; col < matriz[0].length; col++) {
                System.out.print(matriz[row][col] + "\t");
            }
            System.out.println();
        }
    }
}
