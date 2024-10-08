import java.util.Random;
public class Simpson {
    //VISIBLE A NIVEL DE LA CALSE SIMPSON
    private static final int MAX_FILA_TABLERO = 10;
    private static final int MAX_COLUMNA_TABLERO = 10;
    static char[][] tablero = new char[MAX_FILA_TABLERO][MAX_COLUMNA_TABLERO];     //Array de arrays       //static pq lo de abajo es estatico
    //FIN
    public static void rellenarTablero(char pers){
        for (int i = 0; i < MAX_FILA_TABLERO; i++) {
            for (int j = 0; j < MAX_COLUMNA_TABLERO; j++) {
                tablero[i][j] = pers;
            }
        }
    }

    public static void imprimirTablero()  {
        for (int i = 0; i < MAX_FILA_TABLERO; i++) {
            for (int j = 0; j < MAX_COLUMNA_TABLERO; j++) {
                System.out.print("["+tablero[i][j]+"]");
            }
            System.out.println("");
        }
    }

    public static void randomizarpj(char pers) {
        Random r = new Random();
        for (int k = 0; k < 10; k++) {
            int rx = r.nextInt(MAX_FILA_TABLERO);
            int ry = r.nextInt(MAX_COLUMNA_TABLERO);
            //if (tablero[rx][ry] == pers) {
                for (int i = 0; i < MAX_FILA_TABLERO; i++) {
                    for (int j = 0; j < MAX_COLUMNA_TABLERO; j++) {
                        tablero[rx][ry] = pers;
                    }
                }
           // } else {
           //     k = k - 1;
        }
    }
   // }

    public static void main(String[] args) {
        //System.out.printf("Hello and welcome!");
        // int contador = 0;
        char personaje = 'L';   //Definir como caracter (char) comillas 'simples'
        rellenarTablero(personaje);
        //imprimirTablero();

        personaje = 'H';
        randomizarpj(personaje);
        // rellenarTablero(personaje);

        do {
            Random r = new Random();
            int rx = r.nextInt(MAX_FILA_TABLERO);
            int ry = r.nextInt(MAX_COLUMNA_TABLERO);
            tablero[rx][ry] = 'B';
        }while (){
        imprimirTablero();
    }
}
//min 34