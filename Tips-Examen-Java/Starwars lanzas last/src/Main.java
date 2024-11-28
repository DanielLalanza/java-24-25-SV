import java.util.Random;
import java.util.Scanner;

public class Main {
    static char [][] tablero1 = new char[10][10];
    static char [][] tablero2 = new char[10][10];
    static int vidas1 = 3;
    static int vidas2 = 3;
    static Random r = new Random();
    static Scanner sc = new Scanner(System.in);
    static int xYoda;
    static int yYoda;
    static int xVader;
    static int yVader;

    static void inicializarTablero(char[][] tablero){
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero.length; j++) {
                tablero[i][j]='.';
            }
        }
    }

    static void imprimirTablero (char[][] tablero){
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero.length; j++) {
                System.out.print(tablero[i][j]+"  ");
            }
            System.out.println();
        }
    }

    static void rellenarEntidades(char entidad, int numeroEntidades, char[][]tablero){
        int rx;
        int ry;
        for (int i = 0; i < numeroEntidades; i++) {
            do {
                rx=r.nextInt(10);
                ry=r.nextInt(10);
            }while (tablero[rx][ry]!='.');
            tablero[rx][ry]=entidad;
            if (entidad=='Y'){
                xYoda = rx;
                yYoda = ry;
            }
            if (entidad=='V'){
                xVader = rx;
                yVader = ry;
            }
        }
    }

    static Boolean comprobarEnemigo(char[][]tablero, char enemigo, char pj, int filas, int columnas, int vidas){
        switch (tablero[filas][columnas]){
            case 'R','D':
                vidas--;
                System.out.println("Has perdido 1 vida "+ pj + " vidas restates:"+vidas);
                actualizaVidas(vidas,pj);
                return true;
            case 'M':
                System.out.println("No te puedes mover");
                return false;
            case 'F':
                System.out.println(pj + " HAS LLEGADO AL FINAL FELICIDADES");
                return true;
            case '.':
                return true;
            case 'P':
                System.out.println("TELETRANSPORTEEEE");
                if (tablero==tablero1){
                    tablero[xYoda][yYoda]='.';
                    rellenarEntidades(pj, 1, tablero);
                } else {
                    tablero[xVader][yVader]='.';
                    rellenarEntidades(pj, 1, tablero);
                }
        }
        return null;
    }

    static void tableroInfinito(){
        if (xVader>9){xVader-=10;}
        if (xYoda>9){xYoda-=10;}
        if (xVader<0){xVader+=10;}
        if (xYoda<0){xYoda+=10;}

        if (yVader>9){yVader-=10;}
        if (yYoda>9){yYoda-=10;}
        if (yVader<0){yVader+=10;}
        if (yYoda<0){yYoda+=10;}
    }

    static void actualizaVidas(int vidas, char pj){
        if(pj=='Y'){vidas1=vidas;}
        if (pj=='V'){vidas2=vidas;}
    }

    static void realizarMovimiento(char[][] tablero, char pj, char enemigo, int vidas){
        System.out.println("REALIZA TU MOVIMIENTO CON WASDQEZC");
        String movimiento = sc.nextLine();
        int numSalto=1;
        if (movimiento.length()==2){
            numSalto=Integer.parseInt(String.valueOf(movimiento.charAt(0)));
            movimiento=String.valueOf(movimiento.charAt(1));
        }
        if (tablero == tablero1) {
            switch (movimiento){
                case "w","W":
                    tablero[xYoda][yYoda]='.';
                    xYoda-=numSalto;
                    tableroInfinito();
                    if (comprobarEnemigo(tablero, enemigo, pj, xYoda, yYoda, vidas)==true){
                        tablero[xYoda][yYoda]=pj;
                    } else {
                        xYoda+=numSalto;
                        tableroInfinito();
                        tablero[xYoda][yYoda]=pj;
                    }
                    break;
                case "s","S":
                    tablero[xYoda][yYoda]='.';
                    xYoda+=numSalto;
                    tableroInfinito();
                    if (comprobarEnemigo(tablero, enemigo, pj, xYoda, yYoda, vidas)==true){
                        tablero[xYoda][yYoda]=pj;
                    } else {
                        xYoda-=numSalto;
                        tableroInfinito();
                        tablero[xYoda][yYoda]=pj;
                    }
                    break;
                case "A","a":
                    tablero[xYoda][yYoda]='.';
                    yYoda-=numSalto;
                    tableroInfinito();
                    if (comprobarEnemigo(tablero, enemigo, pj, xYoda, yYoda, vidas)==true){
                        tablero[xYoda][yYoda]=pj;
                    } else {
                        yYoda+=numSalto;
                        tableroInfinito();
                        tablero[xYoda][yYoda]=pj;
                    }
                    break;
                case "d","D":
                    tablero[xYoda][yYoda]='.';
                    yYoda+=numSalto;
                    tableroInfinito();
                    if (comprobarEnemigo(tablero, enemigo, pj, xYoda, yYoda, vidas)==true){
                        tablero[xYoda][yYoda]=pj;
                    } else {
                        yYoda-=numSalto;
                        tableroInfinito();
                        tablero[xYoda][yYoda]=pj;
                    }
                    break;
                case "q","Q":
                    tablero[xYoda][yYoda]='.';
                    xYoda-=numSalto;
                    yYoda-=numSalto;
                    tableroInfinito();
                    if (comprobarEnemigo(tablero, enemigo, pj, xYoda, yYoda, vidas)==true){
                        tablero[xYoda][yYoda]=pj;
                    } else {
                        xYoda+=numSalto;
                        yYoda-=numSalto;
                        tableroInfinito();
                        tablero[xYoda][yYoda]=pj;
                    }
                    break;
                case "C","c":
                    tablero[xYoda][yYoda]='.';
                    xYoda+=numSalto;
                    yYoda+=numSalto;
                    tableroInfinito();
                    if (comprobarEnemigo(tablero, enemigo, pj, xYoda, yYoda, vidas)==true){
                        tablero[xYoda][yYoda]=pj;
                    } else {
                        xYoda-=numSalto;
                        yYoda-=numSalto;
                        tableroInfinito();
                        tablero[xYoda][yYoda]=pj;
                    }
                    break;
                case "E","e":
                    tablero[xYoda][yYoda]='.';
                    xYoda-=numSalto;
                    yYoda+=numSalto;
                    tableroInfinito();
                    if (comprobarEnemigo(tablero, enemigo, pj, xYoda, yYoda, vidas)==true){
                        tablero[xYoda][yYoda]=pj;
                    } else {
                        xYoda+=numSalto;
                        yYoda-=numSalto;
                        tableroInfinito();
                        tablero[xYoda][yYoda]=pj;
                    }
                    break;
                case "z","Z":
                    tablero[xYoda][yYoda]='.';
                    xYoda+=numSalto;
                    yYoda-=numSalto;
                    tableroInfinito();
                    if (comprobarEnemigo(tablero, enemigo, pj, xYoda, yYoda, vidas)==true){
                        tablero[xYoda][yYoda]=pj;
                    } else {
                        xYoda-=numSalto;
                        yYoda+=numSalto;
                        tableroInfinito();
                        tablero[xYoda][yYoda]=pj;
                    }
                    break;
            }
        }

        else {
            switch (movimiento){
                case "w","W":
                    tablero[xVader][yVader]='.';
                    xVader-=numSalto;
                    tableroInfinito();
                    if (comprobarEnemigo(tablero, enemigo, pj, xVader, yVader, vidas)==true){
                        tablero[xVader][yVader]=pj;
                    } else {
                        xVader+=numSalto;
                        tableroInfinito();
                        tablero[xVader][yVader]=pj;
                    }
                    break;
                case "s","S":
                    tablero[xVader][yVader]='.';
                    xVader+=numSalto;
                    tableroInfinito();
                    if (comprobarEnemigo(tablero, enemigo, pj, xVader, yVader, vidas)==true){
                        tablero[xVader][yVader]=pj;
                    } else {
                        xVader-=numSalto;
                        tableroInfinito();
                        tablero[xVader][yVader]=pj;
                    }
                    break;
                case "A","a":
                    tablero[xVader][yVader]='.';
                    yVader-=numSalto;
                    tableroInfinito();
                    if (comprobarEnemigo(tablero, enemigo, pj, xVader, yVader, vidas)==true){
                        tablero[xVader][yVader]=pj;
                    } else {
                        yVader+=numSalto;
                        tableroInfinito();
                        tablero[xVader][yVader]=pj;
                    }
                    break;
                case "d","D":
                    tablero[xVader][yVader]='.';
                    yVader+=numSalto;
                    tableroInfinito();
                    if (comprobarEnemigo(tablero, enemigo, pj, xVader, yVader, vidas)==true){
                        tablero[xVader][yVader]=pj;
                    } else {
                        yVader-=numSalto;
                        tableroInfinito();
                        tablero[xVader][yVader]=pj;
                    }
                    break;
                case "q","Q":
                    tablero[xVader][yVader]='.';
                    xVader-=numSalto;
                    yVader-=numSalto;
                    tableroInfinito();
                    if (comprobarEnemigo(tablero, enemigo, pj, xVader, yVader, vidas)==true){
                        tablero[xVader][yVader]=pj;
                    } else {
                        xVader+=numSalto;
                        yVader-=numSalto;
                        tableroInfinito();
                        tablero[xVader][yVader]=pj;
                    }
                    break;
                case "C","c":
                    tablero[xVader][yVader]='.';
                    xVader+=numSalto;
                    yVader+=numSalto;
                    tableroInfinito();
                    if (comprobarEnemigo(tablero, enemigo, pj, xVader, yVader, vidas)==true){
                        tablero[xVader][yVader]=pj;
                    } else {
                        xVader-=numSalto;
                        yVader-=numSalto;
                        tableroInfinito();
                        tablero[xVader][yVader]=pj;
                    }
                    break;
                case "E","e":
                    tablero[xVader][yVader]='.';
                    xVader-=numSalto;
                    yVader+=numSalto;
                    tableroInfinito();
                    if (comprobarEnemigo(tablero, enemigo, pj, xVader, yVader, vidas)==true){
                        tablero[xVader][yVader]=pj;
                    } else {
                        xVader+=numSalto;
                        yVader-=numSalto;
                        tableroInfinito();
                        tablero[xVader][yVader]=pj;
                    }
                    break;
                case "z","Z":
                    tablero[xVader][yVader]='.';
                    xVader+=numSalto;
                    yVader-=numSalto;
                    tableroInfinito();
                    if (comprobarEnemigo(tablero, enemigo, pj, xVader, yVader, vidas)==true){
                        tablero[xVader][yVader]=pj;
                    } else {
                        xVader-=numSalto;
                        yVader+=numSalto;
                        tableroInfinito();
                        tablero[xVader][yVader]=pj;
                    }
                    break;
            }
        }
        saltarEnemigos(tablero, enemigo);
    }

    static void saltarEnemigos(char[][]tablero, char enemigo){
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero.length; j++) {
                if (tablero[i][j]==enemigo){
                    tablero[i][j]='X';
                }
            }
        }
        rellenarEntidades(enemigo,10,tablero);
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero.length; j++) {
                if (tablero[i][j]=='X'){
                    tablero[i][j]='.';
                }
            }
        }
    }

    public static void main(String[] args) {
        inicializarTablero(tablero1);
        inicializarTablero(tablero2);
        rellenarEntidades('Y',1,tablero1);
        rellenarEntidades('V', 1, tablero2);
        rellenarEntidades('M', 10, tablero1);
        rellenarEntidades('M', 10, tablero2);
        rellenarEntidades('D', 10, tablero1);
        rellenarEntidades('R', 10, tablero2);
        while (vidas1>0&&vidas2>0&&tablero1[9][9]!='Y'&&tablero2[9][9]!='V'){
            System.out.println("TABLERO1");
            imprimirTablero(tablero1);
            realizarMovimiento(tablero1, 'Y', 'D',vidas1);
            System.out.println("TABLERO1");
            imprimirTablero(tablero1);
            System.out.println();
            System.out.println("TABLERO2");
            imprimirTablero(tablero2);
            realizarMovimiento(tablero2, 'V', 'R',vidas2);
            System.out.println("TABLERO2");
            imprimirTablero(tablero2);
            System.out.println();
        }
    }
}