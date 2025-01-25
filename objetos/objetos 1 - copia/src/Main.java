import pojo.Magdalena;
import pojo.MagdalenaFactory;
import pojo.Pedido;
import pojo.*;

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


        System.out.println(magdalena1.toString());




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



        // Crear productos
        Producto magdalena = new Producto("Magdalena de chocolate", 1.50, 10);
        Producto croissant = new Producto("Croissant", 1.20, 5);
        Producto galleta = new Producto("Galleta de avena", 0.80, 20);

        // Crear un pedido con capacidad para 5 productos
        Pedido pedido = new Pedido(5);
            pedido.agregarProducto(magdalena, 3);
            pedido.agregarProducto(croissant, 5);
            pedido.agregarProducto(galleta, 1);
            pedido.agregarProducto(galleta,20);
            pedido.agregarProducto(magdalena,33);
            pedido.imprimirTicket(pedido);

    }

}