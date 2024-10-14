import java.util.Random;
import java.util.Scanner;

public class Simpson {
    //VISIBLE A NIVEL DE LA CALSE SIMPSON
    private static final int MAX_FILA_TABLERO = 10;
    private static final int MAX_COLUMNA_TABLERO = 10;
    static char[][] tablero = new char[MAX_FILA_TABLERO][MAX_COLUMNA_TABLERO];     //Array de arrays       //static pq lo de abajo es estatico
    private static int filaBart;
    private static int columnaBart;
    //FIN
    public static void rellenarTablero(char pers){
        System.out.println();
        System.out.println();
        System.out.println();
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
        int rx = -1;
        int ry = -1;
        for (int k = 0; k < repeticiones; k++) {
            do {
                rx = r.nextInt(MAX_FILA_TABLERO);
                ry = r.nextInt(MAX_COLUMNA_TABLERO);
            }
            while (tablero[rx][ry]!='L');{
            }
            tablero[rx][ry] = pers;
        }
        if (pers == 'B'){
            filaBart = rx;
            columnaBart = ry;
        }
    }

    public static void main(String[] args) {
        char personaje = 'L';   //Definir como caracter (char) comillas 'simples'
        rellenarTablero(personaje);
        tablero[MAX_FILA_TABLERO-1][MAX_COLUMNA_TABLERO-1] = 'O';
        AsignarCasillaLibre('H', 10);
        AsignarCasillaLibre('B', 1);
        AsignarCasillaLibre('M', 10);
        imprimirTablero();
        System.out.println("Muevete con WASD");

        // DESPLAZAMIENTO
        int vidas = 3;
        do {
            Scanner sc = new Scanner(System.in);
            String desplazamiento  = sc.nextLine();
            switch (desplazamiento){
                    case "W":
                        if ((filaBart-1) >= 0) {
                            filaBart = filaBart-1;
                            switch (tablero[filaBart][columnaBart]) {
                                case 'M':
                                    System.out.println("El muro no deja desplazarte");
                                    filaBart++;
                                    break;
                                case 'H':
                                    vidas = vidas-1;
                                    System.out.println("Has perdido 1 vida, vidas restantes: " + vidas);
                                    tablero[filaBart+1][columnaBart] = 'L';
                                    tablero[filaBart][columnaBart] = 'B';
                                    imprimirTablero();
                                    break;
                                case 'L':
                                    tablero[filaBart+1][columnaBart] = 'L';
                                    tablero[filaBart][columnaBart] = 'B';
                                    imprimirTablero();
                                    break;
                                case 'O':
                                    tablero[filaBart+1][columnaBart] = 'L';
                                    tablero[filaBart][columnaBart] = 'B';
                                    imprimirTablero();
                                    System.out.println("VICTORIA!!!");
                                    System.exit(0);
                                    break;
                            }
                        }else {
                            System.out.println("FUERA DE FIMITES");
                        }
                        break;
                    case "A":
                        if ((columnaBart-1) >= 0) {
                            columnaBart = columnaBart-1;
                            switch (tablero[filaBart][columnaBart]) {
                                case 'M':
                                    System.out.println("El muro no deja desplazarte");
                                    columnaBart++;
                                    break;
                                case 'H':
                                    vidas = vidas-1;
                                    System.out.println("Has perdido 1 vida, vidas restantes: " + vidas);
                                    tablero[filaBart][columnaBart+1] = 'L';
                                    tablero[filaBart][columnaBart] = 'B';
                                    imprimirTablero();
                                    break;
                                case 'L':
                                    tablero[filaBart][columnaBart+1] = 'L';
                                    tablero[filaBart][columnaBart] = 'B';
                                    imprimirTablero();
                                    break;
                                case 'O':
                                    tablero[filaBart][columnaBart+1] = 'L';
                                    tablero[filaBart][columnaBart] = 'B';
                                    imprimirTablero();
                                    System.out.println("VICTORIA!!!");
                                    System.exit(0);
                                    break;
                            }
                        }else {
                            System.out.println("FUERA DE FIMITES");
                        }
                        break;
                    case "S":
                        if ((filaBart+1) <= 9) {
                            filaBart = filaBart+1;
                            switch (tablero[filaBart][columnaBart]) {
                                case 'M':
                                    System.out.println("El muro no deja desplazarte");
                                    filaBart--;
                                    break;
                                case 'H':
                                    vidas = vidas-1;
                                    System.out.println("Has perdido 1 vida, vidas restantes: " + vidas);
                                    tablero[filaBart-1][columnaBart] = 'L';
                                    tablero[filaBart][columnaBart] = 'B';
                                    imprimirTablero();
                                    break;
                                case 'L':
                                    tablero[filaBart-1][columnaBart] = 'L';
                                    tablero[filaBart][columnaBart] = 'B';
                                    imprimirTablero();
                                    break;
                                case 'O':
                                    tablero[filaBart-1][columnaBart] = 'L';
                                    tablero[filaBart][columnaBart] = 'B';
                                    imprimirTablero();
                                    System.out.println("VICTORIA!!!");
                                    System.exit(0);
                                    break;
                            }
                        }else {
                            System.out.println("FUERA DE FIMITES");
                        }
                        break;
                    case "D":
                        if ((columnaBart+1) <= 9) {
                            columnaBart = columnaBart+1;
                            switch (tablero[filaBart][columnaBart]) {
                                case 'M':
                                    System.out.println("El muro no deja desplazarte");
                                    columnaBart--;
                                    break;
                                case 'H':
                                    vidas = vidas-1;
                                    System.out.println("Has perdido 1 vida, vidas restantes: " + vidas);
                                    tablero[filaBart][columnaBart-1] = 'L';
                                    tablero[filaBart][columnaBart] = 'B';
                                    imprimirTablero();
                                    break;
                                case 'L':
                                    tablero[filaBart][columnaBart-1] = 'L';
                                    tablero[filaBart][columnaBart] = 'B';
                                    imprimirTablero();
                                    break;
                                case 'O':
                                    tablero[filaBart][columnaBart-1] = 'L';
                                    tablero[filaBart][columnaBart] = 'B';
                                    imprimirTablero();
                                    System.out.println("VICTORIA!!!");
                                    System.exit(0);
                                    break;
                            }
                        }else {
                            System.out.println("FUERA DE FIMITES");
                        }
            }
        } while (vidas>0 || tablero[filaBart][columnaBart] == tablero[MAX_FILA_TABLERO-1][MAX_COLUMNA_TABLERO-1]);
        if (vidas==0){
            System.out.println("HAS MUERTO");
        }
    }
}

