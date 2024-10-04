public class Simpson {
    //VISIBLE A NIVEL DE LA CALSE SIMPSON
    static char[][] tablero = new char[10][10];     //Array de arrays       //static pq lo de abajo es estatico
    //FIN

    // Software de gestión de venta empresarial
    public static void rellenarTablero(char pers){
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                tablero[i][j] = pers;
            }
        }
    }// rellenarTablero ('L');
    public static void main(String[] args) {
        System.out.printf("Hello and welcome!");
                                // int contador = 0;
        char personaje = '#';   //Definir como caracter (char) comillas 'simples'
        rellenarTablero(personaje);
                                // contador = 10
        rellenarTablero(contador);
    }
}