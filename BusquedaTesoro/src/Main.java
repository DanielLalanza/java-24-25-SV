import java.util.Random;
import java.util.Scanner;

public class Main {
static int MaxColumnas=10;
static int MaxFilas =10;
static char [][] tablero = new char[MaxColumnas][MaxFilas];
static char [][] tablaMinas = new char[MaxColumnas][MaxFilas];
static int rtx, rty, personajeX, personajeY, personajeXold, personajeYold, rmx, rmy, vidas;
static char Mina;
    public static void RellenarMinasLibres(){
        for (int i = 0; i < MaxFilas; i++) {
            for (int j = 0; j < MaxColumnas; j++) {
                tablaMinas[j][i] = '.';
            }
        }
    }
    public static void GenerarMinas (char Mina, int CantidadMinas){
        Random r = new Random();

        for (int i = 0; i < CantidadMinas; i++) {
            do {
                //tablaMinas[rmx][rmy]='.';
                rmx = r.nextInt(MaxFilas);
                rmy = r.nextInt(MaxColumnas);
            } while ((tablaMinas[personajeX][personajeY] == Mina && tablaMinas[rtx][rty] == Mina));
            tablaMinas[rmx][rmy] = 'M';
        }
        //tablaMinas[rmx][rmy] = Mina;
    }
    public static void ComprobarMina (char Mina){
        if (tablaMinas[personajeX][personajeY]==Mina){
            System.out.println("BOOM, Te has comido una mina");
            vidas--;
        }
    }
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
        System.out.println("Muevete con WASD para buscar el tesoro, se te avisará si te estás acercando o alejando, cuidado con las minas, VIDAS RESTANTES="+vidas);
    }

    public static void ImprimirMinas(){
        System.out.println();
        System.out.println();
        for (int i = 0; i < MaxFilas; i++) {
            for (int j = 0; j < MaxColumnas; j++) {
                System.out.print(tablaMinas[j][i] + "  ");
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
        personajeX=rx;
        personajeY=ry;
    }
    public static void RandomizarTesoro(){
        Random rand = new Random();
        do {
            rtx=rand.nextInt(MaxColumnas);
            rty=rand.nextInt(MaxFilas);
        } while (tablero[rtx][rty]!='.');
        //tablero[rtx][rty] = 'X';
    }
    public static void GuardarPosicionOld(){
        personajeXold = personajeX;
        personajeYold = personajeY;
    }
    public static void ComprobarDistancia(){
        int distanciaOld = Math.abs(personajeXold - rtx) + Math.abs(personajeYold-rty);
        int distancia = Math.abs(personajeX - rtx) + Math.abs(personajeY-rty);
        if (distancia<distanciaOld){
            System.out.println("Te estás ACERCANDO");
        } else {
            System.out.println("Te estás ALEJANDO");
        }
    }
    public static void main(String[] args) {
        vidas = 3;
        RellenarTableroLibres();
        RellenarMinasLibres();
        RandomizarPj('Y');
        RandomizarTesoro();
        GenerarMinas('M', 10);
        ImprimirTablero();
        ImprimirMinas();
        Scanner sc = new Scanner(System.in);
        do {
        String movimimiento = sc.nextLine();
        switch (movimimiento){
            case "W" :
                tablero[personajeX][personajeY] = '.';
                GuardarPosicionOld();
                personajeY--;
                tablero[personajeX][personajeY] = 'Y';
                ImprimirTablero();
                ComprobarMina('M');
                ComprobarDistancia();
                break;
            case "A" :
                tablero[personajeX][personajeY] = '.';
                GuardarPosicionOld();
                personajeX--;
                tablero[personajeX][personajeY] = 'Y';
                ImprimirTablero();
                ComprobarMina('M');
                ComprobarDistancia();
                break;
            case "S" :
                tablero[personajeX][personajeY] = '.';
                GuardarPosicionOld();
                personajeY++;
                tablero[personajeX][personajeY] = 'Y';
                ImprimirTablero();
                ComprobarMina('M');
                ComprobarDistancia();
                break;
            case "D" :
                tablero[personajeX][personajeY] = '.';
                GuardarPosicionOld();
                personajeX++;
                tablero[personajeX][personajeY] = 'Y';
                ImprimirTablero();
                ComprobarMina('M');
                ComprobarDistancia();
                break;
        }
        } while (!(personajeX == rtx && personajeY == rty));
        if (personajeX == rtx && personajeY == rty){
            System.out.println("HAS ENCONTRADO EL TESORO");
        }
    }


}