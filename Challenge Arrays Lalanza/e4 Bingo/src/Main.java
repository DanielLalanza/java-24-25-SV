import java.util.Random;
import java.util.Arrays;

public class Main {
    public static int[][] matriz = new int[3][9];
    public static void rellenarMatriz(){
        Random r = new Random();
        for (int i = 0; i <3 ; i++) {
            for (int j = 0; j <9 ; j++) {
                int numRandom;
                do {
                    numRandom = r.nextInt(10 + (j*10), 19 + (j*10));
                } while (!(matriz[i][j] == matriz[i][j] || matriz[i][j] == matriz[i][j]));
                matriz[i][j] = numRandom;

            }
        }
    }

    public static void ordenarColumnas() {
        for (int j = 0; j < 9; j++) {
            int[] columna = new int[3];
            for (int i = 0; i < 3; i++) {
                columna[i] = matriz[i][j];
            }
            // Ordenamos la columna usando Arrays.sort
            Arrays.sort(columna);
            for (int i = 0; i < 3; i++) {
                matriz[i][j] = columna[i];
            }
        }
    }

    public static void imprimirMariz(){
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j <9; j++) {
                System.out.print(matriz[i][j]+"  ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        System.out.println("SIN ORDENAR");
        rellenarMatriz();
        imprimirMariz();
        System.out.println("ORDENADO");
        ordenarColumnas();
        imprimirMariz();

    }
}