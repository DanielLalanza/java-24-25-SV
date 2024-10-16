import java.util.Random;

public class Main {
    public static Random r = new Random();

    public static int generarNumerosAleatorios(int semilla){
        int numAle = r.nextInt(semilla);            // LA SEMILLA LA PROPORCIONA EL USUARIO ES LA LONGITUD MAXIMA DE LOS NUMEROS
        return numAle;                              // HAY QUE UTILIZAR RETURN PARA QUE DEVUELVA EL RESULTADO DEL CODIGO
    }

    public static void main(String[] args) {

        int [] array = new int[10];
        // Array de 10 dimensiones de numeros aleatorios
        // Llenar array de aleatorios
        for (int i = 0; i < array.length; i++) {        // array.length Para recorrer toda la longitud
            array[i]= r.nextInt(100);
        }
        // Imprimir array
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+", ");
        }
    }
}