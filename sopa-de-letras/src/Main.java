import java.util.Random;

public class Main {
    public static char [][] SopaDeLetras = new char[10][10];
    public static String [] Palabras = {"patata","tractor","linux","avion","tomate" };
    static Random r = new Random();
    static String direccion;
    static int casillaX;
    static int casillaY;
    static int contador;

    public static void main(String[] args) {
        int numPalabras=Palabras.length;
        arrayVacio();
        for (contador = 0; contador < numPalabras; contador++) {

            do {
                casillaX = r.nextInt(SopaDeLetras.length);
                casillaY = r.nextInt(SopaDeLetras.length);
                direcciónAleatoria();
            } while (!comprobarValidez());
            adjuntarPalabra();

        }
        imprimirArray();
    }

    public static void arrayVacio(){
        for (int i = 0; i < SopaDeLetras.length ; i++) {
            for (int j = 0; j < SopaDeLetras.length; j++) {
                SopaDeLetras[i][j]='.';
            }
        }
    }

    private static void imprimirArray(){
        for (int i = 0; i < SopaDeLetras.length ; i++) {
            for (int j = 0; j < SopaDeLetras.length; j++) {
                System.out.print(SopaDeLetras[i][j]+"  ");
            }
            System.out.println();
        }
    }

    private static void direcciónAleatoria(){
        int direccionNum = r.nextInt(4)+1;

        switch (direccionNum){
            case 1: direccion="Derecha";
            break;
            case 2: direccion="Izquierda";
            break;
            case 3: direccion="Arriba";
            break;
            case 4: direccion="Abajo";
            break;
        }
    }
    private static boolean comprobarValidez(){
        switch (direccion){
            case "Derecha":
                if (casillaX+Palabras[contador].length()>10){
                    return false;
                }
            break;
            case "Izquierda":
                if (casillaX-Palabras[contador].length()< 0){
                    return false;
                }
            break;
            case "Arriba":
                if (casillaY-Palabras[contador].length()<0){
                    return false;
                }
            break;
            case "Abajo":
                if (casillaY+Palabras[contador].length()>10){
                    return false;
                }
            break;
        }
        return true;
    }

    private static void adjuntarPalabra(){
        switch (direccion){
            case "Arriba":
                for (int i = 0; i <Palabras[contador].length() ; i++) {
                    SopaDeLetras[casillaX][casillaY]=Palabras[contador].charAt(i);
                    casillaY--;
                }
            break;
            case "Abajo":
                for (int i = 0; i <Palabras[contador].length() ; i++) {
                    SopaDeLetras[casillaX][casillaY]=Palabras[contador].charAt(i);
                    casillaY++;
                }
            break;
            case "Derecha":
                for (int i = 0; i <Palabras[contador].length() ; i++) {
                    SopaDeLetras[casillaX][casillaY]=Palabras[contador].charAt(i);
                    casillaX++;
                }
            break;
            case "Izquierda":
                for (int i = 0; i <Palabras[contador].length() ; i++) {
                    SopaDeLetras[casillaX][casillaY]=Palabras[contador].charAt(i);
                    casillaX--;
                }
            break;
        }
    }
}

