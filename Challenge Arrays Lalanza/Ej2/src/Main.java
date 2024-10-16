import java.util.Arrays;
import java.util.Random;

public class Main {
    static int [][] array = new int[10][10];
    public static void generarMatriz(int tamañoX, int tamañoY){
        Random r = new Random();
        for (int i = 0; i <tamañoX ; i++) {
            for (int j = 0; j <tamañoY ; j++) {
                array[i][j]= r.nextInt(10);
            }
        }
    }
    public static void imprimirMatriz(int tamañoX, int tamañoY){
        for (int i = 0; i <tamañoX ; i++) {
            for (int j = 0; j <tamañoY ; j++) {
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        generarMatriz(10, 10);
        imprimirMatriz(10, 10);
    }
}