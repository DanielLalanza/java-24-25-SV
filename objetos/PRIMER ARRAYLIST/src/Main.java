import pojo.AlmacenMusica;
import pojo.Cancion;

public class Main {
    public static void main(String[] args) {
        // CREAMOS EL ALMACEN Y SE INICIALIZA ARRAYLIST (ALMACEN ESTÁTICO)
        new AlmacenMusica();
        Cancion cancion1 = new Cancion(1, "Cancion1");
        Cancion cancionBORRAR = new Cancion(0, "BORRADO?");
        AlmacenMusica.addCancion(cancionBORRAR);
        AlmacenMusica.addCancion(cancion1);
        AlmacenMusica.addCancion(cancion1);
        AlmacenMusica.addCancion(cancion1);
        AlmacenMusica.addCancion(cancion1);
        AlmacenMusica.deleteCancion("BORRADO?");
        System.out.println();
        AlmacenMusica.imprimirCanciones();
        //almacenMusica1.addCancionPrueba();
    }
}