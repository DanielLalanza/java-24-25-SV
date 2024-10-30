import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Main {
    private static String entrada;
    static List<String> resultado = new ArrayList<>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        do {
            entrada = sc.nextLine();
            for (int i = 0; i < entrada.length()  ; i--) {
                char digitoActual = entrada.charAt(i);
                for (int j = 0; j < digitoActual; j++) {
                    switch (i){
                        case :
                            resultado.add("H");
                            break;
                        case 1:
                    }
                }
            }
        }while (!entrada.equals("0"));
    }
}