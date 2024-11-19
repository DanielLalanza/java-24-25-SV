import java.util.Random;

public class Main {
    ///Sopa de Letras///
    static String palabras[] ={
            "helada",
            "mesa",
            "patata"
    };
    static char sopaLetas [][] = new char[10][10];
    static char sopaLetasCopia [][] = new char[10][10];
    static char[] letras = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M',
            'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};

    static Random r = new Random();
    static void rellenarMatriz(){
        for (int i = 0; i < sopaLetas.length; i++) {
            for (int j = 0; j < sopaLetas.length; j++) {
                int numAle = r.nextInt(26);
                sopaLetas[i][j] = letras[numAle];
            }
        }
    }
    static void rellenarMatrizCopia(){
        for (int i = 0; i < sopaLetasCopia.length; i++) {
            for (int j = 0; j < sopaLetasCopia.length; j++) {
                sopaLetasCopia[i][j] = '0';
            }
        }
    }
    static void imprimirMatriz(){
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(sopaLetas[i][j]+"  ");
            }
            System.out.println();
        }
    }
    static void imprimirMatrizAleatoria(){
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(sopaLetasCopia[i][j]+"  ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        rellenarMatriz();
        imprimirMatriz();
        System.out.println();
        rellenarMatrizCopia();
        imprimirMatrizAleatoria();

        for (int i = 0; i < palabras.length; i++) {
                // Cuantas palabras hay en el array?
            // 1º) Busccar posicion libre
            int filaAl = 0;
            int colAl = 0;
            do {
                filaAl = r.nextInt(10);
                colAl = r.nextInt(10);
            }while (sopaLetasCopia[filaAl][colAl]!='0');
            //
            // 2º No superar limites;
            if (colAl + (palabras[i].length()-1)>=10){   // IMPORTANTE TENER EN CUENTA
                i--;
            }else {
                boolean isLibre = true;
                int max = colAl + (palabras[i].length()-1);
                for (int j = colAl; j <= max; j++) {
                    if (sopaLetasCopia[filaAl][j]!='0'){
                        isLibre=false;
                        break;
                    }
                }
                if (isLibre){
                    int contador=0;
                    for (int j = colAl; j <= max; j++) {
                        sopaLetas[filaAl][j] = palabras[i].charAt(contador);
                        sopaLetasCopia[filaAl][j] = palabras[i].charAt(contador);
                        contador++;
                    }
                }
            }
        }
        System.out.println();
        imprimirMatriz();
        System.out.println();
        imprimirMatrizAleatoria();
    }
}