import java.util.Random;

public class Main {
    static int filas = 10;
    static int columnas = 9;
    static int [][] tablero = new int[filas][columnas];
    public static void randomizarTablero(){
        Random random=new Random();
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                //int numAleatorio= random.nextInt(10)+10*(j+1); //10 - 19
                int numAleatorio = random.nextInt(10*(j+1),(10*(j+1)+10));
                tablero[i][j] = numAleatorio;
            }
        }
    }

    public static void ordenarBurbuja (){
        for (int columna = 0; columna < 9; columna++) {
            for (int i = 0; i < filas - 1; i++) {
                for (int j = i; j < filas; j++) {
                    if (tablero[i][columna] > tablero[j][columna]) {
                        int aux = tablero[i][columna];
                        tablero[i][columna] = tablero[j][columna];
                        tablero[j][columna] = aux;
                    }
                }
            }
        }
    }

    public static void imprimirTablero(){
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++){
                System.out.print(tablero[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        randomizarTablero();
        ordenarBurbuja();
        imprimirTablero();
                /*
        int cont = 0;
        do {
            for (int i = 0; i < filas -1; i++) {
                for (int j = 0; j < columnas; j++) {
                    if (tablero[i][j] > tablero[i + 1][j]) {
                        int aux;
                        aux = tablero[i][j];
                        tablero[i][j] = tablero[i + 1][j];
                        tablero[i + 1][j] = aux;
                    }
                }
            }
            cont++;
        }while (cont < filas);

                 */

        /*for (int j = 0; j < columnas; j++) {
            for (int i = 0; i < filas; i++) {
                for (int k = 0; k < filas - 1; k++) {
                    if(tablero[k][j] > tablero[k + 1][j]){
                        int aux = tablero[k][j];
                        tablero[k][j] = tablero[k + 1][j];
                        tablero[k + 1][j] = aux;
                    }
                }
            }

        }*/
       /* for (int i = 0; i < filas-1; i++) { // [0,0][1,0], [1,0][2,0]
            for (int j = 0; j < columnas; j++) {
                if (tablero[i][j]>tablero[i+1][j]){
                    int aux = tablero[i+1][j];
                    tablero[i][j] = tablero[i + 1][j];
                    tablero[i + 1][j] = aux;
                }
            }
        }*/

    }
}
