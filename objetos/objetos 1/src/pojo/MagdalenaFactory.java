package pojo;

// pojo ---> es Plain Old Java Object
public class MagdalenaFactory{

    public static Magdalena crearMagdalena(String sabor, String color) {
        return new Magdalena(sabor, color);
    }

    public static String describirMagdalena(Magdalena magdalena) {
        return "Magdalena -> Sabor: " + magdalena.sabor + ", Color: " + magdalena.color;
    }



    /*// ATRIBUTOS
    String sabor;
    String color;
    // CONSTRUCTOR
    public MagdalenaFactory addMagdalena(String sabor, String color){
        this.sabor = sabor;
        this.color = color;
        return addMagdalena(sabor,color);
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }*/

}
