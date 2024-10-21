import java.util.Random;
import java.util.Arrays;

public class Main {
    public static int[][] matriz = new int[3][9];
    public static String[][] matrizString = new String[3][9];
    // Rellenar la matriz siguiendo los parametros pedidos en el ejercicio
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

    // Ordenamos la matriz extrayendo cada columna y odenandola por separado con Arrays.short
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

    //Recorremos la matriz imprimiendo cada valor de forma ordenada
    public static void imprimirMariz(){
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j <9; j++) {
                System.out.print(matriz[i][j]+"  ");
            }
            System.out.println();
        }
    }

    public static void imprimirCadena(){
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j <9; j++) {
                System.out.print(matrizString[i][j]+"  ");
            }
            System.out.println();
        }
    }

    public static void tachar() {
        Random r = new Random();
        int rx;
        int ry;
        for (int i = 0; i < 12; i++) {
            do {
                rx = r.nextInt(0,3);
                ry = r.nextInt(0,9);
            } while (matriz[rx][ry] == -1);
            matriz[rx][ry]=-1;
        }
    }
    public static void cadenaTachado(){
        for (int i = 0; i <3; i++) {
            for (int j = 0; j <9; j++) {
                if (matriz[i][j] == -1){
                    matrizString[i][j]="XX";
                } else {
                matrizString[i][j]= String.valueOf(matriz[i][j]);}
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("SIN ORDENAR");
        rellenarMatriz();
        imprimirMariz();
        System.out.println("ORDENADO");
        ordenarColumnas();
        imprimirMariz();
        System.out.println("TACHADO");
        tachar();
        cadenaTachado();
        imprimirCadena();

    }
}