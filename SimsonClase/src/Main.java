import java.util.Random;
import java.util.Scanner;

//DANIEL LALANZA HERNÁNDEZ
public class Main {

    public static  int maxFilas = 10;
    public static  int maxColumnas = 10;
    public static  char [][] tablero = new char[maxFilas][maxColumnas];
    public static int posicionBartX;
    public static int posicionBartY;
    public static int vidas = 5;
    public static  boolean fueraDeLimites;

    public static void rellenarTablero (char casilla){
        for (int i = 0; i <maxFilas ; i++) {
            for (int j = 0; j <maxColumnas ; j++) {
                tablero[i][j] = casilla;
            }
        }
    }

    public static void imprimirTablero(){
        for (int i = 0; i <maxFilas ; i++) {
            for (int j = 0; j <maxColumnas ; j++) {
                System.out.print(tablero[i][j]+ "  ");
            }
            System.out.println();
        }
    }

    public static void asignarCasillaLibre(char personaje, int numeroDePersonajes){
        Random r = new Random();
        int randomX;
        int randomY;
        for (int i = 0; i <numeroDePersonajes ; i++) {
            do {
                randomX = r.nextInt(10);
                randomY = r.nextInt(10);
            }while (!(tablero[randomX][randomY]=='L'));
            tablero[randomX][randomY] = personaje;
            if (personaje=='B'){
                posicionBartX = randomX;
                posicionBartY = randomY;
            }
        }
    }

    public static void comprobarLimites(){
        if (posicionBartX == 10 || posicionBartX==-1 || posicionBartY == 10 || posicionBartY == -1){
            posicionBartX++;
            System.out.println("Fuera de limites");
            fueraDeLimites = true;
        } else {
            fueraDeLimites = false;
        }
    }

    public static void main(String[] args) {
        //System.out.println("Hello world!");
        rellenarTablero('L');
        tablero[maxFilas-1][maxColumnas-1]='O';
        asignarCasillaLibre('H', 10);
        asignarCasillaLibre('B', 1);
        asignarCasillaLibre('M', 10);
        imprimirTablero();
        Scanner sc = new Scanner(System.in);
        do {
            String lectura = sc.nextLine();
            switch (lectura){
                case "W":
                    tablero[posicionBartX][posicionBartY] = 'L';
                    posicionBartX--;
                    if (fueraDeLimites==true) {

                        switch (tablero[posicionBartX][posicionBartY]) {
                            case 'H':
                                vidas--;
                                System.out.println("Te has chocado con homer vidas restantes:"+vidas);
                                break;
                            case 'M':
                                System.out.println("El muro te impide pasar");
                                posicionBartX++;
                                break;
                            case 'O':
                                System.out.println("VICTORIA");
                                break;
                        }
                    }
                    tablero[posicionBartX][posicionBartY]= 'B';
                    imprimirTablero();
                    break;

                case "S":
                    tablero[posicionBartX][posicionBartY] = 'L';
                    posicionBartX++;
                    if (posicionBartX == 10 || posicionBartX==-1 || posicionBartY == 10 || posicionBartY == -1){
                        posicionBartX--;
                        System.out.println("Fuera de limites");
                    }
                    else {
                        switch (tablero[posicionBartX][posicionBartY]) {
                            case 'H':
                                vidas--;
                                System.out.println("Te has chocado con homer vidas restantes:"+vidas);
                                break;
                            case 'M':
                                System.out.println("El muro te impide pasar");
                                posicionBartX--;
                                break;
                            case 'O':
                                System.out.println("VICTORIA");
                                break;
                        }
                    }
                    tablero[posicionBartX][posicionBartY]= 'B';
                    imprimirTablero();
                    break;

                case "A":
                    tablero[posicionBartX][posicionBartY] = 'L';
                    posicionBartY--;
                    if (posicionBartX == 10 || posicionBartX==-1 || posicionBartY == 10 || posicionBartY == -1){
                        posicionBartY++;
                        System.out.println("Fuera de limites");
                    }
                    else {
                        switch (tablero[posicionBartX][posicionBartY]) {
                            case 'H':
                                vidas--;
                                System.out.println("Te has chocado con homer vidas restantes:"+vidas);
                                break;
                            case 'M':
                                System.out.println("El muro te impide pasar");
                                posicionBartY++;
                                break;
                            case 'O':
                                System.out.println("VICTORIA");
                                break;
                        }
                    }
                    tablero[posicionBartX][posicionBartY]= 'B';
                    imprimirTablero();
                    break;

                case "D":
                    tablero[posicionBartX][posicionBartY] = 'L';
                    posicionBartY++;
                    if (posicionBartX == 10 || posicionBartX==-1 || posicionBartY == 10 || posicionBartY == -1){
                        posicionBartY--;
                        System.out.println("Fuera de limites");
                    }
                    else {
                        switch (tablero[posicionBartX][posicionBartY]) {
                            case 'H':
                                vidas--;
                                System.out.println("Te has chocado con homer vidas restantes:"+vidas);
                                break;
                            case 'M':
                                System.out.println("El muro te impide pasar");
                                posicionBartY--;
                                break;
                            case 'O':
                                System.out.println("VICTORIA");
                                break;
                        }
                    }
                    tablero[posicionBartX][posicionBartY]= 'B';
                    imprimirTablero();
                    break;

            }
        }while (!(vidas==0 || tablero[maxColumnas-1][maxFilas-1]=='B'));
        if (vidas==0){
            System.out.println("HAS MUERTO");
        }
    }
}