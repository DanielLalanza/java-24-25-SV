import java.util.Random;
import java.util.Scanner;

public class Main {
    static int MaxArray=100;
    static int NumeroUsaurio;
    static boolean encontrado = false;
    static int [] Array=new int[MaxArray];
    public static void main(String[] args) {
        Random r = new Random();
        for (int i = 0; i <MaxArray ; i++) {
           Array[i] = r.nextInt(100);
        }
        System.out.println("Escribe un número y te diré en que sposicion del array se encientra");
        Scanner sc = new Scanner(System.in);
        NumeroUsaurio=sc.nextInt();
        for (int i = 0; i < MaxArray; i++) {
            if (Array[i]==NumeroUsaurio){
                System.out.println("El Número está en la posición " + i);
                encontrado=true;
            }
        }
        if (encontrado==false){
            System.out.println("NO SE HA ENCONTRADO EL NÚMERO");
        }
    }
}
