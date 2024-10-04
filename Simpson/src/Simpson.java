import java.util.Random;
public class Simpson {
    //VISIBLE A NIVEL DE LA CALSE SIMPSON
    static char[][] tablero = new char[10][10];     //Array de arrays       //static pq lo de abajo es estatico
    //FIN
    public static void rellenarTablero(char pers){
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                tablero[i][j] = pers;
            }
        }
    }

    public static void imprimirTablero()  {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print("["+tablero[i][j]+"]");
            }
            System.out.println("");
        }
    }

    public static void randomizarpj(char pers){
        Random r = new Random();
        for (int k = 0; k <10 ; k++) {
            int rx = r.nextInt(10);
            int ry = r.nextInt(10);
            for (int i = 0; i < 10; i++) {
                for (int j = 0; j < 10; j++) {
                    tablero[rx][ry] = pers ;
                }
            }
        }
    }

    public static void main(String[] args) {
        //System.out.printf("Hello and welcome!");
                                // int contador = 0;
        char personaje = '#';   //Definir como caracter (char) comillas 'simples'
        rellenarTablero(personaje);
        //imprimirTablero();

        personaje = 'H';
        randomizarpj(personaje);
       // rellenarTablero(personaje);
        imprimirTablero();
    }
}