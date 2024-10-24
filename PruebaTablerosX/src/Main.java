import java.util.Random;
import java.util.Scanner;

public class Main {
    // DEFINIR TABLEROS Y DIMENSIONES
    static int numFilas = 10;
    static int numColumnas = 10;
    public static int [][] tableroAleatorio = new int[numFilas][numColumnas];
    public static String [][] tableroUsuario = new String[numFilas][numColumnas];

    // VARIABLES ESTATICAS QUE SE UTILIZARAN MAS TARDE
    public static int numUsuario;
    public static int numIntentos=10;
    public static int aciertos=0;

    // LLENAMOS LA MATRIZ CON LAS DIMENSIONES DEFINIDAS 10x10 CON NUMEROS ALEATORIOS DEL 10 AL 99
    private static void generarMatrizAleatoria(){
        Random r = new Random();
        for (int i = 0; i <numFilas; i++) {
            for (int j = 0; j <numColumnas ; j++) {
                tableroAleatorio[i][j]=r.nextInt(10,99);
            }
        }
    }

    // LLENAMOS EL TABLERO DEL USUARIO CON CASILLAS "OCULTAS" ("XX")
    private static void generarTableroUsuario(){
        for (int i = 0; i <numFilas; i++) {
            for (int j = 0; j <numColumnas ; j++) {
                tableroUsuario[i][j]="XX";
            }
        }
    }

    // MUESTRA CON PANTALLA EL TABLERO DEL USUARIO ORIGINALMENTE LLENO DE XX Y SE IRÁ REVELANDO SEGUN EL USUARIO ACIERTE NÚMEROS
    private static  void imprimirTableroUsuario(){
        for (int i = 0; i <numFilas; i++) {
            for (int j = 0; j <numColumnas ; j++) {
                System.out.print(tableroUsuario[i][j] + " ");
            }
            System.out.println();
        }
    }

    // NOS MUESTRA EL TABLERO GENERADO ALEAORIO (UTILIADO PARA TESTEAR EL FUNCIONAMIENTO DEL PROGRAMA)
    private static  void imprimirTableroAleatorio(){
        for (int i = 0; i <numFilas; i++) {
            for (int j = 0; j <numColumnas ; j++) {
                System.out.print(tableroAleatorio[i][j] + " ");
            }
            System.out.println();
        }
    }

    // PEDIMOS 1 NUMERO ENTERO AL USUARIO
    private static void pedirNumeroUsuario(){
        System.out.println("DAME UN NÚMERO DEL 10 AL 99");
        do {
            Scanner sc = new Scanner(System.in);
            numUsuario=sc.nextInt();
            if (numUsuario<10 || numUsuario>99){
                System.out.println("El número no se ajusta a los parametros exigido");
            }
        } while (numUsuario<10 || numUsuario>99);
    }

    // COMPROBAMOS SI COINCIDE
    private static void comprobarCoincidencia(){
        for (int i = 0; i <numFilas; i++) {
            for (int j = 0; j <numColumnas ; j++) {
             if (numUsuario==tableroAleatorio[i][j]){
                 tableroUsuario[i][j] = String.valueOf(numUsuario);     // REMPLAZAMOS LAS XX DEL TABLERO USUARIO POR EL VALOR ACERTADO
                 tableroAleatorio[i][j]=-1;     // REMPLAZAMOS LA POSICION DEL TABLERO ALEATORIO POR UN NUMERO NO VALIDO PARA NO ACERTAR 2 VECES EL MISMO NÚMERO
                 aciertos++;                    // SUMAMOS 1 ACIERTO
             }

            }
        }
    }



    public static void main(String[] args) {
        generarMatrizAleatoria();
        generarTableroUsuario();
        System.out.println("=====================================");
        System.out.println("Este es el tablero aleatorio");
        imprimirTableroAleatorio();
        System.out.println("=====================================");
        System.out.println("Este es el tablero del usuario");
        imprimirTableroUsuario();
        System.out.println("=====================================");

        for (int i = 0; i < numIntentos; i++) {
            pedirNumeroUsuario();
            comprobarCoincidencia();
            System.out.println("Aciertos:"+aciertos);
            imprimirTableroUsuario();
            System.out.println("=====================================");
        }

        System.out.println("TE HAS QUEDADO SIN INTENTOS, ACIERTOS FINALES:"+aciertos);



    }
}