import java.util.Random;        //Importamos biblioteca random
public class Main {
    public static void main(String[] args) {
        Random r = new Random(); // Inicializar variable

        System.out.println("Hola, co!");

        for (int i = 1; i <= 5; i++) {      // Contador
          //  int RandomNum = (int)(Math.random() * 101); // 0 to 100
            System.out.println("i = " + r.nextInt(100));  // 2 instruciones en una print + numero aleatorio
        }
    }
}