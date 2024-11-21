import java.util.Random;
import java.util.Scanner;

public class Main {
    static char [][] tablero1 = new char[10][10];
    static char [][] tablero2 = new char[10][10];
    static final char vacio = '.';
    static final char yoda = 'Y';
    static final char vader = 'V';
    static final char dmall = 'D';
    static final char r2d2 = 'R';
    static final char muro = 'M';
    static int vidaspj1 = 3;
    static int vidaspj2 = 3;
    static int posicionYodaFilas;
    static int posicionVaderFilas;
    static int posicionYodaColumnas;
    static int posicionVaderColumnas;
    static int [][] movimientos = new int[2][8];
    static int [] letras = {'w','a','s','d','q','e','z','c'};
    static Random r = new Random();
    static Scanner sc = new Scanner(System.in);

    static void mapearMovimietnos(){
        movimientos[0][0]= -1;
        movimientos[1][0]= 0;

        movimientos[0][1]= 0;
        movimientos[1][1]= -1;

        movimientos[0][2]= +1;
        movimientos[1][2]= 0;

        movimientos[0][3]= +1;
        movimientos[1][3]= 0;

        movimientos[0][4]= 0;
        movimientos[1][4]= 0;

        movimientos[0][5]= 0;
        movimientos[1][5]= 0;

        movimientos[0][6]= 0;
        movimientos[1][6]= 0;

        movimientos[0][7]= 0;
        movimientos[1][7]= 0;
    }

    static void rellenarTableroLibre(char[][] tablero){
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero.length; j++) {
                tablero[i][j]=vacio;
            }
        }
    }

    static void aniadirEntidades(char entidad, int cantidad, char[][]tablero){
        int randomFilas;
        int randomColumnas;
        for (int i = 0; i < cantidad; i++) {
            do {
                randomFilas = r.nextInt(10);
                randomColumnas = r.nextInt(10);
            }while (tablero[randomFilas][randomColumnas]!=vacio);
            tablero[randomFilas][randomColumnas]=entidad;
            switch (entidad){
                case yoda:
                    posicionYodaFilas = randomFilas;
                    posicionYodaColumnas = randomColumnas;
                    break;
                case vader:
                    posicionVaderFilas = randomFilas;
                    posicionVaderColumnas = randomColumnas;
                    break;
            }
        }
    }

    static void imprimirTablero(char[][]tablero){
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero.length; j++) {
                System.out.print(tablero[i][j]+"  ");
            }
            System.out.println();
        }
    }

    static void saltarEnemigos (char entidad, char[][]tablero){
        int randomFilas;
        int randomColumnas;
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero.length; j++) {
                if (tablero[i][j]==entidad) {
                    do {
                        randomFilas = r.nextInt(10);
                        randomColumnas = r.nextInt(10);
                    } while (tablero[randomFilas][randomColumnas] != vacio);
                    tablero[i][j]=vacio;
                    tablero[randomFilas][randomColumnas]=entidad;
                }
            }
        }
    }

    static void realizarMovimiento(char[][]tablero, char personaje){
        String movimiento = sc.nextLine();
        for (int i = 0; i < letras.length; i++) {
            if (movimiento.equals(String.valueOf(letras[i]))){
                        switch (personaje){
                    case yoda:
                        tablero[posicionYodaFilas][posicionYodaColumnas] = vacio;
                        tablero[posicionYodaFilas+movimientos[0][i]][posicionYodaColumnas + movimientos[1][i]] = personaje;
                        saltarEnemigos(dmall, tablero);
                        break;
                    case vader:
                        tablero[posicionVaderFilas][posicionVaderColumnas] = vacio;
                        tablero[posicionVaderFilas+movimientos[0][i]][posicionVaderColumnas + movimientos[1][i]] = personaje;
                        saltarEnemigos(r2d2, tablero);
                        break;
                }
            }
        }
    }

    public static void main(String[] args) {
        mapearMovimietnos();
        rellenarTableroLibre(tablero1);
        rellenarTableroLibre(tablero2);
        tablero1[9][9]='F';
        tablero2[9][9]='F';
        aniadirEntidades(yoda, 1, tablero1);
        aniadirEntidades(vader, 1, tablero2);
        aniadirEntidades(dmall, 10, tablero1);
        aniadirEntidades(r2d2, 10, tablero2);
        aniadirEntidades(muro, 10, tablero1);
        aniadirEntidades(muro, 10, tablero2);
        imprimirTablero(tablero1);
        System.out.println();
        imprimirTablero(tablero2);
        while (true){
            realizarMovimiento(tablero1, yoda);
            System.out.println();
            imprimirTablero(tablero1);
        }
    }
}