import pojo.Magdalena;
import pojo.MagdalenaFactory;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        MagdalenaFactory factory = new MagdalenaFactory();
        Magdalena magdalena1 = new Magdalena("Chocoalate", "Marrón");
        Magdalena magdalena2 = new Magdalena("Chorizo", "Rojo");
        Magdalena magdalena3 = new Magdalena("Espinacas","Verde");
        Magdalena magdalena4 = new Magdalena("Menta","Azul");

        factory.crearMagdalena(magdalena1);
        factory.crearMagdalena(magdalena2);
        factory.crearMagdalena(magdalena3);
        factory.crearMagdalena(magdalena4);

        factory.printMagdalena();


        /*Magdalena[] listaMagdalenas = new Magdalena[10];
        listaMagdalenas[0] = MagdalenaFactory.crearMagdalena("chocolate", "marrón");
        listaMagdalenas[1] = MagdalenaFactory.crearMagdalena("chorizo", "rojo");
        listaMagdalenas[2] = MagdalenaFactory.crearMagdalena("menta", "verde");
        listaMagdalenas[3] = MagdalenaFactory.crearMagdalena("yogurt", "blanco");

        System.out.println(MagdalenaFactory.describirMagdalena(listaMagdalenas[0]));
        System.out.println(MagdalenaFactory.describirMagdalena(listaMagdalenas[1]));
        System.out.println(MagdalenaFactory.describirMagdalena(listaMagdalenas[2]));
        System.out.println(MagdalenaFactory.describirMagdalena(listaMagdalenas[3]));*/

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