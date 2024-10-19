import java.util.Random;
import java.util.Scanner;

public class Main {
    static int maxArray=100;
    static int numeroUsaurio;
    static boolean encontrado = false;
    static int [] Array=new int[maxArray];
    public static void main(String[] args) {
        Random r = new Random();
        for (int i = 0; i <maxArray ; i++) {
           Array[i] = r.nextInt(1000);
        }
        System.out.println("Escribe un número y te diré en que posicion del array se encientra");
        Scanner sc = new Scanner(System.in);
        numeroUsaurio=sc.nextInt();
        for (int i = 0; i < maxArray; i++) {
            if (Array[i]==numeroUsaurio){
                System.out.println("El Número está en la posición " + i);
                encontrado=true;
            }
        }
        if (!encontrado){
            System.out.println("NO SE HA ENCONTRADO EL NÚMERO");
        }
    }
}
