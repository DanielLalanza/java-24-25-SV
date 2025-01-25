package pojo;

public class Pedido {
    private int numProductos;
    private Producto[] lstProductos;

    public Pedido(int numProductos){
        this.numProductos = numProductos;
        lstProductos = new Producto[numProductos];
    }


    // GETTER AND SETTER
    public int getNumProductos() {
        return numProductos;
    }

    public void setNumProductos(int numProductos) {
        this.numProductos = numProductos;
    }
    //

    private int index = 0;
    public void agregarProducto(Producto miProducto, int cantidad){
        if (index<5){
            this.lstProductos[index] = miProducto;
            index++;
        } else {
            index = 0;
        }
    }

    public void imprimirTicket(Pedido pedido){
        System.out.println("Su ticket digital!!!");
        for (int i = 0; i < lstProductos.length; i++) {
            Producto miProducto = lstProductos[i];
            if (miProducto != null){
                System.out.println(lstProductos[i].toString());
            } else {
                System.out.println("HAS llegado al final de la lista");
            }
        }
    }


    @Override
    public String toString() {
        return "pedido{" +
                "numProductos=" + numProductos +
                '}';
    }
}
