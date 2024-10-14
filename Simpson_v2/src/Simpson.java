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
                System.out.print(tablero[i][j]+"  ");
            }
            System.out.println();
        }
    }

    public static void AsignarCasillaLibre(char pers, int repeticiones) {
        Random r = new Random();
        int rxh;
        int ryh;
        for (int k = 0; k < repeticiones; k++) {
            do {
                rxh = r.nextInt(MAX_FILA_TABLERO);
                ryh = r.nextInt(MAX_COLUMNA_TABLERO);
            }
            while (tablero[rxh][ryh]!='L');{
            }
            tablero[rxh][ryh] = pers;
        }
    }

/*    public static void randomizarBart(char pj) {
        Random r = new Random();
        int rxh;
        int ryh;
        do {
            rxh = r.nextInt(MAX_FILA_TABLERO);
            ryh = r.nextInt(MAX_COLUMNA_TABLERO);
        }
        while (tablero[rxh][ryh]!='L');{
        }
        tablero[rxh][ryh] = pj;
    }*/
    public static void main(String[] args) {
        char personaje = 'L';   //Definir como caracter (char) comillas 'simples'
        rellenarTablero(personaje);
        tablero[MAX_FILA_TABLERO-1][MAX_COLUMNA_TABLERO-1] = 'O';
        AsignarCasillaLibre('H', 10);
        AsignarCasillaLibre('B', 10);
        AsignarCasillaLibre('M', 10);
        imprimirTablero();
    }
}
//min 34
