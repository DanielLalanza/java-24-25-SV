import java.util.Scanner;
public class Main {
    static Scanner scanner = new Scanner(System.in);
    static String[] palabras = {"sol", "luna", "estrella", "cielo", "mar", "montaña", "río", "nube", "flor", "árbol"};
    static String[] respuestas = new String[10];
    static String entrada;
    static int contador;

    public static void main(String[] args) {
        mostrarYComprobarPalabras();
        System.out.println("¡Felicidades! Has memorizado todas las palabras correctamente.");
        scanner.close();
    }

    static void comprobarCorrecta (){
        // Verificar si la respuesta es correcta
        StringBuilder correctas = new StringBuilder();
        for (int j = 0; j <= contador; j++) {
            correctas.append(respuestas[j]).append(" ");
        }

        if (!entrada.equals(correctas.toString().trim())) {
            System.out.println("¡Incorrecto! La secuencia era: " + correctas.toString().trim());
            System.out.println("Intenta de nuevo desde el inicio.");
            contador = -1; // Reiniciar el juego
        } else {
            System.out.println("¡Correcto! Sigue a la siguiente palabra.\n");
        }
    }
    static void mostrarYComprobarPalabras(){
        // Mostrar palabras y pedir al usuario que repita las anteriores en orden
        for (contador = 0; contador < palabras.length; contador++) {
            System.out.println("Palabra a memorizar: " + palabras[contador]);
            respuestas[contador] = palabras[contador];

            System.out.print("Escribe todas las palabras memorizadas hasta ahora: ");
            entrada = scanner.nextLine();
            comprobarCorrecta();
        }
    }
}
