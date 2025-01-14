package pojo;

// pojo ---> es Plain Old Java Object
public class MagdalenaFactory{
    Magdalena[] listaMagdalenas = new Magdalena[4];
    int contador = 0;
    public void crearMagdalena(Magdalena miMagdalena) {
        listaMagdalenas[contador] = miMagdalena;
        contador++;
    }

    public void printMagdalena(){
        Magdalena magdalena;
        for (int i = 0; i < listaMagdalenas.length; i++) {
            magdalena = listaMagdalenas[i];
            System.out.println("Magdalena: ["+(i+1)+"]");
            System.out.println("Atributos: Sabor - " + magdalena.getSabor());
        }
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
