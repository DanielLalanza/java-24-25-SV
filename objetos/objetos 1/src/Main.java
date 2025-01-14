import pojo.Magdalena;
import pojo.MagdalenaFactory;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Magdalena[] listaMagdalenas = new Magdalena[10];
        listaMagdalenas[0] = MagdalenaFactory.crearMagdalena("chocolate", "marrón");
        listaMagdalenas[1] = MagdalenaFactory.crearMagdalena("chorizo", "rojo");
        listaMagdalenas[2] = MagdalenaFactory.crearMagdalena("menta", "verde");
        listaMagdalenas[3] = MagdalenaFactory.crearMagdalena("yogurt", "blanco");

        System.out.println(MagdalenaFactory.describirMagdalena(listaMagdalenas[0]));
        System.out.println(MagdalenaFactory.describirMagdalena(listaMagdalenas[1]));
        System.out.println(MagdalenaFactory.describirMagdalena(listaMagdalenas[2]));
        System.out.println(MagdalenaFactory.describirMagdalena(listaMagdalenas[3]));

        /*Magdalena magdalena = new Magdalena("Chocolate", "Marrón",false,false);
            magdalena.hornear();
            magdalena.envolver();
            magdalena.anyadirPepitas();

        Magdalena[] listaMagdalenas = new Magdalena[10];    // Array tamaño fijo
            listaMagdalenas[1] = magdalena;
        ArrayList<Magdalena> lisaMagDin = new ArrayList();  // Array tamoño dinámico

        MagdalenaFactory magdalenaFactory = new MagdalenaFactory();
        listaMagdalenas[1] = magdalenaFactory.addMagdalena("chorizo", "marrón");
        System.out.println(listaMagdalenas[1]);*/

    }

}