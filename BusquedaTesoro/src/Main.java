import java.util.Random;

public class Main {
static int MaxColumnas=10;
static int MaxFilas =10;
static char [][] tablero = new char[MaxColumnas][MaxFilas];
static int rtx, rty, personajeX, personajeY;
    public static void RellenarTableroLibres(){
        for (int i = 0; i < MaxFilas; i++) {
            for (int j = 0; j < MaxColumnas; j++) {
                tablero[j][i] = '.';
            }
        }
    }
    public static void ImprimirTablero(){
        System.out.println();
        System.out.println();
        for (int i = 0; i < MaxFilas; i++) {
            for (int j = 0; j < MaxColumnas; j++) {
                System.out.print(tablero[j][i] + "  ");
            }
            System.out.println();
        }
    }
    public static void RandomizarPj(char pj){
        Random rand = new Random();
        int rx;
        int ry;
        do {
            rx=rand.nextInt(MaxColumnas);
            ry=rand.nextInt(MaxFilas);
        } while (tablero[rx][ry]!='.');
        tablero[rx][ry] = pj;
    }
    public static void RandomizarTesoro(){
        Random rand = new Random();
        int rtx=-1;
        int rty=-1;
        do {
            rtx=rand.nextInt(MaxColumnas);
            rty=rand.nextInt(MaxFilas);
        } while (tablero[rtx][rty]!='.');
    }

    public static void main(String[] args) {
        RellenarTableroLibres();
        RandomizarPj('Y');
        RandomizarTesoro();
        ImprimirTablero();

        do {

        } while (personajeX = rtx || personajeY = rty);
    }


}