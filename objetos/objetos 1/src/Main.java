import pojo.Magdalena;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Magdalena magdalena = new Magdalena("Chocolate", "Marrón",false,false);
            magdalena.hornear();
            magdalena.envolver();
            magdalena.anyadirPepitas();

        Magdalena[] listaMagdalenas = new Magdalena[10];    // Array tamaño fijo
            listaMagdalenas[1] = magdalena;
        ArrayList<Magdalena> lisaMagDin = new ArrayList();  // Array tamoño dinámico
    }
}