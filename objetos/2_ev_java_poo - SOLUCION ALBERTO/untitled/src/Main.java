import pojo.Magdalena;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

            // MAGDALENA
        // EJERCICIO A TRAVÉS DE UN MAIN:
        // Código Java 12-01-2025
        Producto magdalena = new Producto("Magdalena de chocolate", 1.50, 10);
        Producto croissant = new Producto("Croissant", 1.20, 5);
        Producto galleta = new Producto("Galleta de avena", 0.80, 20);
        Producto palmerita = new Producto("Palmerita de avena", 1.80, 20);
        Producto chupachups = new Producto("Chupachups de fresa", 1.00, 20);
        System.out.println(magdalena.getNombre());
        magdalena.setStock(25);
            System.out.println(magdalena.toString());
            System.out.println(croissant.toString());
            System.out.println(galleta.toString());
        // Crear un pedido con capacidad para 5 productos
        Pedido pedido = new Pedido(5);
            pedido.agregarProducto(magdalena, 3);
            pedido.agregarProducto(croissant, 5);
            pedido.agregarProducto(galleta, 6);
            pedido.agregarProducto(magdalena, 12);
            pedido.agregarProducto(croissant, 5);
            pedido.imprimirTicket();



// Código Java 09-01-2025
        Magdalena magdalena1 = new Magdalena("Marrón", "Chocolate");
            // error-> magdalena.id = -5;
                magdalena1.setId(-5);
        Magdalena magdalena2 = new Magdalena("Marrón");

            Magdalena[] listaMagdalenas = new Magdalena[10];
                listaMagdalenas[0] = magdalena1;
                listaMagdalenas[1] = magdalena2;
            ArrayList<Magdalena> listaMagDinam
                    = new ArrayList<Magdalena>();

            magdalena1.hornear();
            MagdalenaFactory magdalenaFactory = new MagdalenaFactory();
                magdalenaFactory.addMagdalena(magdalena1);
                magdalenaFactory.addMagdalena(magdalena2);
                magdalenaFactory.addMagdalena(magdalena1);
                magdalenaFactory.addMagdalena(magdalena2);



                magdalenaFactory.printMagdalena();
            Magdalena lstMag[] = new Magdalena[4];
            MagdalenaFactory magdalenaFactory2 = new MagdalenaFactory(lstMag);




            /* magdalena.mezclar();
            magdalena.vender();
            magdalena.decorar();
            magdalena.establecerSabor();
            magdalena.amasar();
            magdalena.mojar();
            magdalena.anyadirPepitas();
            magdalena.comer();
            magdalena.envolver();
            magdalena.coger();*/




        Almacen almacen = new Almacen();
        almacen.agragarProductosInventario(croissant);
        almacen.agragarProductosInventario(palmerita);
        almacen.agragarProductosInventario(magdalena);
        almacen.agragarProductosInventario(galleta);
        almacen.agragarProductosInventario(chupachups);

        almacen.mostrarInventario();
        System.out.println();
        System.out.println("Ingresa un producto a buscar");
        System.out.println(almacen.buscarProducto(sc.nextLine()));

        }




    }
