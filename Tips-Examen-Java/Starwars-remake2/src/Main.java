import java.util.Random;
import java.util.Scanner;

public class Main {
    static final int maxFilas = 10;
    static final int maxColumnas = 10;
    static char [][] tablero1 = new char[maxFilas][maxColumnas];
    static char [][] tablero2 = new char[maxFilas][maxColumnas];
    static int xYoda, yYoda, xVader, yVader;
    static Random r = new Random();
    static Scanner sc = new Scanner(System.in);
    static int vidaspj1 = 3;
    static int vidaspj2 = 3;
    static int xTemp;
    static int yTemp;
    static int numMovimientos;

    static void rellenarTableroLibre(char[][]tablero){
        for (int i = 0; i < maxColumnas; i++) {
            for (int j = 0; j < maxFilas; j++) {
                tablero[i][j]='.';
            }
        }
    }

    static void rellenarpj(char[][]tablero, int cantidad, char pj){
        int rx;
        int ry;
        for (int i = 0; i < cantidad; i++) {
            do {
                rx = r.nextInt(10);
                ry = r.nextInt(10);
            }while (tablero[rx][ry]!='.');
            tablero[rx][ry]=pj;
            if (pj=='Y'){
                xYoda=rx;
                yYoda=ry;
            } else if (pj=='V') {
                xVader=rx;
                yVader=ry;
            }
        }
    }

    static void imprimirTablero (char[][]tablero){
        for (int i = 0; i < maxColumnas; i++) {
            for (int j = 0; j < maxFilas; j++) {
                System.out.print(tablero[i][j]+"  ");
            }
            System.out.println();
        }
    }

    static void comprobarLimites(){
        if (xYoda>9){xYoda=xYoda-10;}
        if (yYoda>9){yYoda=yYoda-10;}
        if (xVader>9){xVader=xVader-10;}
        if (yVader>9){yVader=yVader-10;}

        if (xYoda<0){xYoda=xYoda+10;}
        if (yYoda<0){yYoda=yYoda+10;}
        if (xVader<0){xVader=xVader+10;}
        if (yVader<0){yVader=yVader+10;}
    }

    static void comporbarEnemigo(char[][]tablero, char pj){
        if (tablero==tablero1){
            switch (tablero[xYoda][yYoda]) {
                case 'M':
                    System.out.println("HAY UN MURO NO TE PUEDES MOVER");
                    xYoda=xTemp;
                    yYoda=yTemp;
                break;
                case 'D':
                    vidaspj1--;
                    System.out.println(pj+" HAS PERDIDO UNA VIDA, VIDAS RESTANTES:" + vidaspj1);
                break;
                case 'F':
                    System.out.println(pj+" HAS GANADO!!!");
                    System.exit(0);
                break;
                case 'P':
                    tablero[xYoda][yYoda]='.';
                    int rx;
                    int ry;
                    do {
                        rx = r.nextInt(10);
                        ry = r.nextInt(10);
                    } while (tablero[rx][ry]!='.');
                    tablero[xYoda][xYoda]='.';
                    xYoda=rx;
                    yYoda=ry;
                    tablero[xYoda][yYoda]='Y';
                break;
            }
        }

        if (tablero==tablero2){
            switch (tablero[xVader][yVader]) {
                case 'M':
                    System.out.println("HAY UN MURO NO TE PUEDES MOVER");
                    xVader=xTemp;
                    yVader=yTemp;
                    break;
                case 'D':
                    vidaspj2--;
                    System.out.println(pj+" HAS PERDIDO UNA VIDA, VIDAS RESTANTES:" + vidaspj2);
                    break;
                case 'F':
                    System.out.println(pj+" HAS GANADO!!!");
                    System.exit(0);
                    break;
                case 'P':
                    tablero[xVader][yVader]='.';
                    int rx;
                    int ry;
                    do {
                        rx = r.nextInt(10);
                        ry = r.nextInt(10);
                    } while (tablero[rx][ry]!='.');
                    tablero[xVader][xVader]='.';
                    xVader=rx;
                    yVader=ry;
                    tablero[xVader][yVader]='V';
                break;
            }
        }
    }

    static void realizarMovimiento(char[][]tablero, char pj, char enemigo){
        String entrada = sc.nextLine();
        String mov;
        if (entrada.length()==1){
            numMovimientos=1;
            mov=entrada;
        } else {
            numMovimientos=Integer.parseInt(String.valueOf(entrada.charAt(0)));
            mov = String.valueOf(entrada.charAt(1));
        }

        switch (mov){
            case "w", "W":
                if (tablero==tablero1){
                    tablero[xYoda][yYoda]='.';
                    xTemp=xYoda;
                    yTemp=yYoda;
                    xYoda= xYoda-numMovimientos;
                    comprobarLimites();
                    comporbarEnemigo(tablero, pj);
                    tablero[xYoda][yYoda]='Y';
                } else {
                    tablero[xVader][yVader]='.';
                    xTemp=xVader;
                    yTemp=yVader;
                    xVader= xVader-numMovimientos;
                    comprobarLimites();
                    comporbarEnemigo(tablero, pj);
                    tablero[xVader][yVader]='V';
                }
            break;
            case "A", "a":
                if (tablero==tablero1){
                    tablero[xYoda][yYoda]='.';
                    xTemp=xYoda;
                    yTemp=yYoda;
                    yYoda = yYoda-numMovimientos;
                    comprobarLimites();
                    comporbarEnemigo(tablero, pj);
                    tablero[xYoda][yYoda]='Y';
                } else {
                    tablero[xVader][yVader]='.';
                    xTemp=xVader;
                    yTemp=yVader;
                    yVader=yVader-numMovimientos;
                    comprobarLimites();
                    comporbarEnemigo(tablero, pj);
                    tablero[xVader][yVader]='V';
                }
            break;
            case "S", "s":
                if (tablero==tablero1){
                    tablero[xYoda][yYoda]='.';
                    xTemp=xYoda;
                    yTemp=yYoda;
                    xYoda=xYoda+numMovimientos;
                    comprobarLimites();
                    comporbarEnemigo(tablero, pj);
                    tablero[xYoda][yYoda]='Y';
                } else {
                    tablero[xVader][yVader]='.';
                    xTemp=xVader;
                    yTemp=yVader;
                    xYoda=xVader+numMovimientos;
                    comprobarLimites();
                    comporbarEnemigo(tablero, pj);
                    tablero[xVader][yVader]='V';
                }
            break;
            case "D", "d":
                if (tablero==tablero1){
                    tablero[xYoda][yYoda]='.';
                    xTemp=xYoda;
                    yTemp=yYoda;
                    yYoda=yYoda+numMovimientos;
                    comprobarLimites();
                    comporbarEnemigo(tablero, pj);
                    tablero[xYoda][yYoda]='Y';
                } else {
                    tablero[xVader][yVader]='.';
                    xTemp=xVader;
                    yTemp=yVader;
                    yYoda=yVader+numMovimientos;
                    comprobarLimites();
                    comporbarEnemigo(tablero, pj);
                    tablero[xVader][yVader]='V';
                }
                break;
            case "e", "E":
                if (tablero==tablero1){
                    tablero[xYoda][yYoda]='.';
                    xTemp=xYoda;
                    yTemp=yYoda;
                    xYoda=xYoda-numMovimientos;
                    yYoda=yYoda+numMovimientos;
                    comprobarLimites();
                    comporbarEnemigo(tablero, pj);
                    tablero[xYoda][yYoda]='Y';
                } else {
                    tablero[xVader][yVader]='.';
                    xTemp=xVader;
                    yTemp=yVader;
                    xVader=xVader-numMovimientos;
                    yVader=yVader+numMovimientos;
                    comprobarLimites();
                    comporbarEnemigo(tablero, pj);
                    tablero[xVader][yVader]='V';
                }
                break;
            case "Z", "z":
                if (tablero==tablero1){
                    tablero[xYoda][yYoda]='.';
                    xTemp=xYoda;
                    yTemp=yYoda;
                    yYoda=yYoda-numMovimientos;
                    xYoda=xYoda+numMovimientos;
                    comprobarLimites();
                    comporbarEnemigo(tablero, pj);
                    tablero[xYoda][yYoda]='Y';
                } else {
                    tablero[xVader][yVader]='.';
                    xTemp=xVader;
                    yTemp=yVader;
                    yVader=yVader-numMovimientos;
                    xVader=xVader+numMovimientos;
                    comprobarLimites();
                    comporbarEnemigo(tablero, pj);
                    tablero[xVader][yVader]='V';
                }
                break;
            case "Q", "q":
                if (tablero==tablero1){
                    tablero[xYoda][yYoda]='.';
                    xTemp=xYoda;
                    yTemp=yYoda;
                    xYoda=xYoda-numMovimientos;
                    yYoda=yYoda-numMovimientos;
                    comprobarLimites();
                    comporbarEnemigo(tablero, pj);
                    tablero[xYoda][yYoda]='Y';
                } else {
                    tablero[xVader][yVader]='.';
                    xTemp=xVader;
                    yTemp=yVader;
                    xVader=xVader+numMovimientos;
                    yVader=yVader-numMovimientos;
                    comprobarLimites();
                    comporbarEnemigo(tablero, pj);
                    tablero[xVader][yVader]='V';
                }
                break;
            case "C", "c":
                if (tablero==tablero1){
                    tablero[xYoda][yYoda]='.';
                    xTemp=xYoda;
                    yTemp=yYoda;
                    yYoda=yYoda+numMovimientos;
                    xYoda=xYoda+numMovimientos;
                    comprobarLimites();
                    comporbarEnemigo(tablero, pj);
                    tablero[xYoda][yYoda]='Y';
                } else {
                    tablero[xVader][yVader]='.';
                    xTemp=xVader;
                    yTemp=yVader;
                    yVader=yVader+numMovimientos;
                    xVader=xVader+numMovimientos;
                    comprobarLimites();
                    comporbarEnemigo(tablero, pj);
                    tablero[xVader][yVader]='V';
                }
            break;
        }
        enemigosSaltar(tablero, enemigo);
    }

    static void enemigosSaltar(char[][] tablero, char enemigo){
        for (int i = 0; i < maxFilas; i++) {
            for (int j = 0; j < maxColumnas; j++) {
                if (tablero[i][j]=='R'||tablero[i][j]=='D'){
                 tablero[i][j]='X';
                }
            }
        }
        rellenarpj(tablero, 5, enemigo);
        for (int i = 0; i < maxFilas; i++) {
            for (int j = 0; j < maxColumnas; j++) {
                if (tablero[i][j]=='X'){
                    tablero[i][j]='.';
                }
            }
        }
    }

    public static void main(String[] args) {
        tablero1[9][9]='F';
        tablero2[9][9]='F';
        rellenarTableroLibre(tablero1);
        rellenarTableroLibre(tablero2);
        rellenarpj(tablero1, 1, 'Y');
        rellenarpj(tablero2, 1, 'V');
        rellenarpj(tablero1, 5, 'D');
        rellenarpj(tablero2, 5, 'R');
        rellenarpj(tablero1, 5, 'M');
        rellenarpj(tablero2, 5, 'M');
        rellenarpj(tablero1,5,'P');
        rellenarpj(tablero2,5,'P');
        while (vidaspj1>0&&vidaspj2>0&&tablero1[9][9]!='Y'&&tablero2[9][9]!='V'){
            System.out.println("TABLERO 1");
            imprimirTablero(tablero1);
            System.out.println();
            realizarMovimiento(tablero1,'Y', 'D');
            imprimirTablero(tablero1);
            System.out.println("TABLERO 2");
            imprimirTablero(tablero2);
            System.out.println();
            realizarMovimiento(tablero2,'V', 'R');
            imprimirTablero(tablero1);
        }
    }
}