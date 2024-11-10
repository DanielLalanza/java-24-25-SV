
import java.util.Random;

public class Main {
    static char[][] sopaDeLetras= new char[10][10];
    static String[] palabras={"PERA", "LIMON", "MANZANA", "KIWI"};
    static int [] movimientosX = {0, 0, 1, -1, -1, 1, -1, 1};
    static int [] movimientosY = {-1, 1, 0, 0, -1, -1, 1, 1};
    static Random r = new Random();
    static int direccion;
    static int inicioX;
    static int inicioY;
    static int contador;
    static boolean palabraImpresa = false;

    public static void main(String[] args) {
        rellenarArray('.');
        for (contador = 0; contador < palabras.length; contador++) {
            do {
                elegirDirección();
                elegirCasillaInicial();
                validarPalabra();
            } while (!palabraImpresa);
        }
        imprimirArray();
    }

    private static void rellenarArray(char caracter){
        for (int i = 0; i < sopaDeLetras.length; i++) {
            for (int j = 0; j < sopaDeLetras.length; j++) {
                sopaDeLetras[i][j]=caracter;
            }
        }
    }

    private static void imprimirArray(){
        for (int i = 0; i < sopaDeLetras.length; i++) {
            for (int j = 0; j < sopaDeLetras.length; j++) {
                System.out.print(sopaDeLetras[j][i]+"  ");
            }
            System.out.println();
        }
    }

    private static void elegirDirección(){
        direccion = r.nextInt(8);
    }

    private static void elegirCasillaInicial(){
        inicioX = r.nextInt(sopaDeLetras.length);
        inicioY = r.nextInt(sopaDeLetras.length);
    }

    private static void validarPalabra(){
        palabraImpresa=false;
        if (!(inicioX+palabras[contador].length()*movimientosX[direccion]>9 || inicioX+palabras[contador].length()*movimientosX[direccion]<0 || inicioY+palabras[contador].length()*movimientosY[direccion]>9 || inicioY+palabras[contador].length()*movimientosY[direccion]<0)){
            for (int i = 0; i < palabras[contador].length(); i++) {
                sopaDeLetras[inicioX+movimientosX[direccion]*i][inicioY+movimientosY[direccion]*i]=palabras[contador].charAt(i);
            }
            palabraImpresa=true;
        }
    }
}
