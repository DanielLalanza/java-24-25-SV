import java.util.Random;
import java.util.Scanner;

public class Main {
    public static int usuarioFila;
    public static int usuarioColumna;
    public static int usuarioFila2;
    public static int usuarioColumna2;
    public static int aciertos = 0;
    public static int[][] tablero = new int[4][4];
    public static int[][] tableroUsuario = new int[4][4];

    private static void rellenarTableroLibres() {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                tablero[i][j] = 0;
            }
        }
    }

    private static void rellenarTableroUsuario() {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                tableroUsuario[i][j] = 0;
            }
        }
    }

    private static void rellenarTablero() {
        Random r = new Random();
        int rFila;
        int rColumna;
        for (int i = 1; i < 9; i++) {
            for (int j = 0; j < 2; j++) {
                do {
                    rFila = r.nextInt(4);
                    rColumna = r.nextInt(4);
                } while (tablero[rFila][rColumna] != 0);
                tablero[rFila][rColumna] = i;
            }
        }
    }

    private static void imprimirTablero(int[][] tableroUsado) {
        System.out.println();
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(tableroUsado[i][j] + "  ");
            }
            System.out.println();
        }
    }

    public static void comprobar() throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Ingresa la coordenada de fila para la primera selección:");
            usuarioFila = sc.nextInt() - 1;
            System.out.println("Ingresa la coordenada de columna para la primera selección:");
            usuarioColumna = sc.nextInt() - 1;

            // Validación de límites y estado de casilla
            if (!esValido(usuarioFila, usuarioColumna) || tableroUsuario[usuarioFila][usuarioColumna] != 0) {
                System.out.println("Coordenadas no válidas o casilla ya descubierta.");
                continue;
            }
            tableroUsuario[usuarioFila][usuarioColumna] = tablero[usuarioFila][usuarioColumna];
            imprimirTablero(tableroUsuario);

            System.out.println("Ingresa la coordenada de fila para la segunda selección:");
            usuarioFila2 = sc.nextInt() - 1;
            System.out.println("Ingresa la coordenada de columna para la segunda selección:");
            usuarioColumna2 = sc.nextInt() - 1;

            // Validación de límites y estado de casilla
            if (!esValido(usuarioFila2, usuarioColumna2) || tableroUsuario[usuarioFila2][usuarioColumna2] != 0) {
                System.out.println("Coordenadas no válidas o casilla ya descubierta.");
                continue;
            }
            tableroUsuario[usuarioFila2][usuarioColumna2] = tablero[usuarioFila2][usuarioColumna2];
            imprimirTablero(tableroUsuario);

            // Esperar un momento antes de verificar
            Thread.sleep(2000);

            // Verificación de coincidencia
            if (tablero[usuarioFila][usuarioColumna] == tablero[usuarioFila2][usuarioColumna2]) {
                aciertos++;
                System.out.println("¡Has acertado!");
            } else {
                // Restablecer las casillas si no coinciden
                tableroUsuario[usuarioFila][usuarioColumna] = 0;
                tableroUsuario[usuarioFila2][usuarioColumna2] = 0;
                System.out.println("Vuelve a intentarlo");
            }
            imprimirTablero(tableroUsuario);

        } while (aciertos < 8);
        System.out.println("¡Felicidades! Has encontrado todos los pares.");
        sc.close();
    }

    private static boolean esValido(int fila, int columna) {
        return fila >= 0 && fila < 4 && columna >= 0 && columna < 4;
    }

    public static void main(String[] args) throws InterruptedException {
        rellenarTableroLibres();
        rellenarTablero();
        rellenarTableroUsuario();
        System.out.println("Tablero inicial MEMORIZALO RÁPIDO");
        imprimirTablero(tablero);
        Thread.sleep(5000);
        System.out.println();
        System.out.println();
        System.out.println("Tablero del jugador:");
        imprimirTablero(tableroUsuario);
        comprobar();
    }
}
