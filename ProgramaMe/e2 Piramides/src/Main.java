import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static int numBloques;
    static boolean finalizado = false;
    public static void pedirNum(){
        numBloques = sc.nextInt();
    }
    private static void calcularPisos(int numBloques){
        int longitud=1;
        int bloquesColocados=0;
        int numPisos=0;
        do {
            bloquesColocados = bloquesColocados + longitud*longitud;
            longitud = longitud+2;
            numPisos ++;
        } while (numBloques>bloquesColocados);
        if (numBloques == 0){
            finalizado = true;
        }else {
            System.out.println(/*"Puedes construir "+*/numPisos/*+" pisos"*/);
        }
    }
    public static void main(String[] args) {
        do {
            pedirNum();
            calcularPisos(numBloques);
        }while (!finalizado);
    }
}