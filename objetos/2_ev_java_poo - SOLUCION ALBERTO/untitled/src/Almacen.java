import java.util.Arrays;


public class Almacen{
   private Producto[] inventario = new Producto[5];
   private int index = 0;

    public void agragarProductosInventario(Producto miProducto){
        inventario[index] = miProducto;
        index ++;
   }


    public void mostrarInventario(){
        System.out.println("EL INVENTARIO ACTUAL ES:");
        for (int i = 0; i < inventario.length; i++) {
            System.out.println(inventario[i].toString());
        }
    }


    public Producto buscarProducto(String nombre){
        System.out.println("Buscando producto...");
        for (int i = 0; i < inventario.length; i++) {
            if (inventario[i].getNombre().equals(nombre)) {
                return inventario[i];
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return "Almacen{" +
                "inventario=" + Arrays.toString(inventario) +
                ", index=" + index +
                '}';
    }
}