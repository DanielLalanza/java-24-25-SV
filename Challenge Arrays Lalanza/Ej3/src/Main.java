import com.sun.jdi.IntegerValue;

import java.util.Random;
import java.util.Scanner;

public class Main {
    // Array de 6 string
    static String [] array = new String[6];
    static Scanner sc = new Scanner(System.in);
    public static void generarMatriz(int tamañoX){
        Random r = new Random();
        for (int i = 0; i <tamañoX ; i++) {
            int numAle = r.nextInt(10);
            array[i] = String.valueOf(numAle);
        }
    }

    public static void comprobarNumeros (){
        for (int i = 0; i < 3; i++) {
            System.out.println("Dame 1 número");
            String numUsuario = String.valueOf(sc.nextInt());
            //String intento = String.valueOf(i);
            for (int j = 0; j < 6; j++) {
                //String arrayString = String.valueOf(array[j]);
                if (numUsuario == array[j]) {
                    array[j] = "XX";
                    System.out.println("GOD");
                }
                else{
                    System.out.println("AYUDA");
                }
            }

        }
    }


    public static void imprimirMatriz(int tamañoX){
        for (int i = 0; i <tamañoX ; i++) {
            System.out.println(array[i]);
        }
    }

    public static void main(String[] args) {
        generarMatriz(6);
        imprimirMatriz(6);
        comprobarNumeros();
        imprimirMatriz(6);
    }
}