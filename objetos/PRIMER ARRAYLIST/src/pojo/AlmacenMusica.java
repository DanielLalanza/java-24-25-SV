package pojo;
import java.util.ArrayList;

public class AlmacenMusica {
    /// INTERMEDIARIO
    // AÑADIR UNA PELÍCULA
    // ALMACÉN ESTÁTICO
    // LISTAS   (PENDIENTE CON ALBERTO)
    // ARRAYLIST (AHORA)
    // DEFINE EL ARRAYLIST PERO NO LO CREA
    private static ArrayList<Cancion> listaDeCanciones;
    // IKEA -> OPTIMIZACIÓN DE MEMORIA

    // BUILDER
    public AlmacenMusica() {
        // INICIALIZA EL ARRAYLIST
        this.listaDeCanciones = new ArrayList<>(); // nodo
    }

    public static void addCancion(Cancion cancion) {
        listaDeCanciones.add(cancion);
        System.out.println("CANCIÓN AÑADIDA"+cancion.toString());
    }

    public static void deleteCancion(String titulo){
        for (int i = 0; i < listaDeCanciones.size(); i++) {
            Cancion cancion = listaDeCanciones.get(i);
            if (cancion.getTitulo().equals(titulo)) {
                listaDeCanciones.remove(cancion);
                System.out.println("CANCIÓN ELIMINADA" + cancion.toString());
                break;
            }
        }
    }

    public static void imprimirCanciones() {
        for (Cancion cancion : listaDeCanciones
        ) {
            System.out.println(cancion.toString());
        }
    }


}
