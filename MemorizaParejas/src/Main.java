import java.util.Random;
import java.util.Scanner;

public class Main {
    public static int usuarioFila;
    public static int usuarioColumna;
    public static int usuarioFila2;
    public static int usuarioColumna2;
    public static int aciertos=0;
    public static int [][] tablero = new int[4][4];
    public static int [][] tableroUsuario = new int[4][4];
    private static void rellenarTableroLibres(){
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                tablero[i][j]=0;
            }
        }
    }
    private static void rellenarTableroUsuario(){
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                tableroUsuario[i][j]=0;
            }
        }
    }
    private static void rellenarTablero(){
        Random r = new Random();
        int rFila;
        int rColumna;
        for (int i = 1; i < 9; i++) {
            for (int j = 0; j <2 ; j++) {
                do {
                    rFila=r.nextInt(4);
                    rColumna=r.nextInt(4);
                } while (!(tablero[rFila][rColumna]==0));
                tablero[rFila][rColumna]=i;
            }
        }
    }
    private static void imprimirTablero (int[][] tableroUsado){
        System.out.println();
        System.out.println();
        System.out.println();
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(tableroUsado[i][j] + "  ");
            }
            System.out.println();
        }
    }

    public static void comporbar() throws InterruptedException{
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("Ingresa la coordenada de filas a seleccionar");
            usuarioFila= sc.nextInt();
            usuarioFila--;
            System.out.println("Ingresa la coordenada de columna a seleccionar");
            usuarioColumna = sc.nextInt();
            usuarioColumna--;
            if (usuarioFila>3 || usuarioColumna>3 ||usuarioFila<0 || usuarioColumna<0){
                System.out.println("Fuera de limites");
                continue;
            }
            if (tableroUsuario[usuarioFila][usuarioColumna]!=0){
                System.out.println("Esa casilla ya esta descubierta!!");
            } else {
                tableroUsuario[usuarioFila][usuarioColumna] = tablero[usuarioFila][usuarioColumna];
            }
            imprimirTablero(tableroUsuario);
            /////////////////
            System.out.println("Ingresa la coordenada de filas a seleccionar(2)");
            usuarioFila2= sc.nextInt();
            usuarioFila2--;
            System.out.println("Ingresa la coordenada de columna a seleccionar(2)");
            usuarioColumna2 = sc.nextInt();
            usuarioColumna2--;
            if (usuarioFila2>3 || usuarioColumna2>3 ||usuarioFila2<0 || usuarioColumna2<0){
                System.out.println("Fuera de limites");
                continue;
            }
            if (tableroUsuario[usuarioFila2][usuarioColumna2]!=0){
                System.out.println("Esa casilla ya esta descubierta!!");
            } else {
                tableroUsuario[usuarioFila2][usuarioColumna2] = tablero[usuarioFila2][usuarioColumna2];
            }

            imprimirTablero(tableroUsuario);
            Thread.sleep(5000);
            if (tablero[usuarioFila][usuarioColumna]==tablero[usuarioFila2][usuarioColumna2]){
                aciertos ++;
                System.out.println("Has acertado");
            } else {
                tableroUsuario[usuarioFila][usuarioColumna]=0;
                tableroUsuario[usuarioFila2][usuarioColumna2]=0;
                System.out.println("Vuelve a intentarlo");
            }
            imprimirTablero(tableroUsuario);
        } while (aciertos<8);
    }
    public static void main(String[] args) throws InterruptedException {
        rellenarTableroLibres();
        rellenarTablero();
        rellenarTableroUsuario();
        imprimirTablero(tablero);
        System.out.println();
        imprimirTablero(tableroUsuario);
        comporbar();
    }
}
