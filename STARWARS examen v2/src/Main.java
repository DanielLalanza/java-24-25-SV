import java.util.Random;
import java.util.Scanner;

public class Main {
    static char [][] tablero1 = new char[10][10];
    static char [][] tablero2 = new char[10][10];
    static int [] movimientosX = {0,0,+1,-1,-1,+1,-1,+1};
    static int [] movimientosY = {-1,+1,0,0,-1,-1,+1,+1};
    /** Arriba 		    0 -1
        Abajo 		    0 +1
        Derecha 	    +1 0
        Izquierda 	    -1 0
        Diagonal A-I 	-1 -1
        Diagonal A-D	+1 -1
        Diagonal Ab-I	-1 +1
        Diagonal Ab-D	+1 +1**/

    static int vidasPj1=3;
    static int vidasPj2=3;
    static int direccion=-1;
    static Random r = new Random();
    static Scanner sc = new Scanner(System.in);

    static final char libre = '.';
    static final char Yoda = 'Y';
    static final char Vader = 'V';
    static final char DarthMaul = 'D';
    static final char R2D2 = 'R';
    static final char muro = 'M';
    static final char meta = 'F';
    static final char poti = 'P';

    static int xVader;
    static int yVader;
    static int xYoda;
    static int yYoda;

    static int posicionX;
    static int posicionY;
    static int proximaX;
    static int proximaY;
    static int tpX;
    static int tpY;

    public static void main(String[] args) {
        rellenarTablero(libre,tablero1);
        rellenarTablero(libre,tablero2);
        tablero1[9][9]=meta;
        tablero2[9][9]=meta;


        randomPersonaje(Yoda, tablero1, 1);
        randomPersonaje(Vader, tablero2, 1);
        randomPersonaje(DarthMaul, tablero1, 5);
        randomPersonaje(R2D2, tablero2, 5);
        randomPersonaje(muro, tablero1, 5);
        randomPersonaje(muro, tablero2, 5);
        randomPersonaje(poti, tablero1, 5);
        randomPersonaje(poti, tablero2, 5);

        System.out.println("TABLERO 1");
        imprimirTablero(tablero1);
        System.out.println("TABLERO 2");
        imprimirTablero(tablero2);
        boolean finalizado=false;
        do {
            System.out.println("TABLERO1");
            AnalizarMovimiento(tablero1, Yoda);
            //System.out.println("TABLERO2");
            //AnalizarMovimiento(tablero2, Vader);
            if (vidasPj1==0 || vidasPj2==0 || tablero1[9][9]==Yoda || tablero2[9][9]==Vader){finalizado=true;}
        } while (!finalizado);
        if (vidasPj1==0){
            System.out.println("TE HAS QUEDADO SIN VIDAS P1");
        }
        if (vidasPj2==0){
            System.out.println("TE HAS QUEDADO SIN VIDAS P2");
        }
    }




    private static void rellenarTablero(char personaje, char[][] tablero){
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero.length; j++) {
                tablero[i][j]=personaje;
            }
        }
    }
    private static void imprimirTablero(char[][] tablero){
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero.length; j++) {
                System.out.print(tablero[i][j]+"  ");
            }
            System.out.println();
        }
    }

    private static boolean vereficarCasillaValida(char [][]tablero){
        if (tpX<10 && tpX>=0 && tpY<10 && tpY>=0){
            if (tablero[tpX][tpY]==libre){
                return true;
            } else return false;
        } else return false;
    }

    private static void randomPersonaje(char personaje, char[][] tablero, int numeroVeces){
        int rx;
        int ry;
        for (int i = 0; i < numeroVeces; i++) {
            do {
                rx = r.nextInt(10);
                ry = r.nextInt(10);
            } while (!(tablero[rx][ry]==libre));
            tablero[rx][ry]=personaje;
            if (personaje==Yoda){
                xYoda = rx;
                yYoda = ry;
            }
            if (personaje==Vader){
                xVader = rx;
                yVader = ry;
            }
        }
    }

    private static void AnalizarMovimiento(char[][]tablero, char personaje){
        if (personaje==Yoda){
            posicionX = xYoda;
            posicionY = yYoda;
        }
        if (personaje==Vader){
            posicionX = xVader;
            posicionY = yVader;
        }

        String movimiento = sc.nextLine();

        for (int i = 0; i < movimiento.length(); i++) {
            switch (movimiento.charAt(i)){
                case 'A':
                    direccion=0;
                break;
                case 'D':
                    direccion=1;
                break;
                case 'S':
                    direccion=2;
                break;
                case 'W':
                    direccion=3;
                break;
                case 'Q':
                    direccion=4;
                break;
                case 'Z':
                    direccion=5;
                break;
                case 'E':
                    direccion=6;
                break;
                case 'C':
                    direccion=7;
                break;
            }
            proximaX=posicionX+movimientosX[direccion];
            proximaY=posicionY+movimientosY[direccion];
            if (proximaX>9){
                proximaX=proximaX-10;
            } else if (proximaX<0) {
                proximaX=proximaX+10;
            } else if (proximaY>9) {
                proximaY=proximaY-10;
            } else if (proximaY<0) {
                proximaY=proximaY+10;
            }

            switch (tablero[proximaX][proximaY]){
                case muro:
                    System.out.println("NO TE PUEDES MOVER HAY UN MURO");
                break;
                case R2D2:
                        vidasPj2--;
                        realizarMovimiento(personaje,tablero);
                    System.out.println("HAS PERDIDO UNA VIDA P2");
                break;
                case DarthMaul:
                        vidasPj1--;
                        realizarMovimiento(personaje,tablero);
                    System.out.println("HAS PERDIDO UNA VIDA P1");
                break;
                case meta:
                    System.out.println("HAS GANADO!!!");
                break;
                case libre:
                    realizarMovimiento(personaje,tablero);
                break;
                case poti:
                    realizarMovimiento(personaje,tablero);
                    boolean b;
                    do {
                        System.out.println("Introduce coords");
                        tpX=sc.nextInt();
                        tpY=sc.nextInt();
                        b = vereficarCasillaValida(tablero);
                    } while (!b);
                    if (personaje==Yoda){
                        tablero[xYoda][yYoda]=libre;
                        xYoda=tpX;
                        yYoda=tpY;
                        tablero[xYoda][yYoda]=Yoda;
                        System.out.println();
                        System.out.println();
                        imprimirTablero(tablero);
                    }
                    if (personaje==Vader){
                        tablero[xVader][yVader]=libre;
                        xVader=tpX;
                        yVader=tpY;
                        tablero[xVader][yVader]=Vader;
                        System.out.println();
                        System.out.println();
                        imprimirTablero(tablero);
                    }
                break;
            }

        }

    }
    private static void realizarMovimiento (char personaje, char[][]tablero){
        tablero[posicionX][posicionY]=libre;
        tablero[proximaX][proximaY]=personaje;
        posicionX=proximaX;
        posicionY=proximaY;
        if (personaje==Yoda){
            xYoda = posicionX;
            yYoda = posicionY;
        }
        if (personaje==Vader){
            xVader = posicionX;
            yVader = posicionY;
        }
        System.out.println();
        System.out.println();
        imprimirTablero(tablero);
    }
}
