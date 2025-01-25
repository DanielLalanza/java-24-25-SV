package pojo;

public class Magdalena {
    // ATRIBUTOS
        private int id;
        private String sabor;
        private String color;
    // CONSTRUCTOR
    // public Magdalena(){} // CONTRASEÑA VACÍA
    public void setId(int id){
        if(id<0){
            System.out.println("error ");
        }else{
            this.id = id;
        }
    }
    public Magdalena(String sabor, String color){
        System.out.println("Color" + color);
        System.out.println("Sabor" + sabor);
        this.sabor = sabor;
        this.color = color;
    }
    public Magdalena(String color){
        System.out.println("Sabor" + sabor);
        this.sabor = sabor;
    }
    // MÉTODO
    public void hornear(){
        System.out.println("Hornear la mag ");
        System.out.println(" de" + this.sabor);
        System.out.println("Estoy horneando!!");
    }

    public int getId() {
        return id;
    }
    public String getSabor() {
        return sabor;
    }
    public void setSabor(String sabor) {
        this.sabor = sabor;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
}
