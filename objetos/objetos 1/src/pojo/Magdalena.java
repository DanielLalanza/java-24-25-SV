package pojo;
    // pojo ---> es Plain Old Java Object
public class Magdalena {
    // ATRIBUTOS
        String sabor;
        String color;
        Boolean envoltorio;
        Boolean pepitas;
    // CONSTRUCTOR
        // public Magdalena(){} // CONTRASEÑA VACIA
        public Magdalena(String sabor, String color, boolean pepitas, boolean envoltorio){
            System.out.println("Color " + this.color);
            System.out.println("Sabor " + this.sabor);
            System.out.println("Pepitas " + this.pepitas);
            System.out.println("Emboltorio " + this.envoltorio);
            this.sabor = sabor;
            this.color = color;
            this.pepitas = pepitas;
            this.envoltorio = envoltorio;
        }

        // METODO
        public void hornear(){
            System.out.println("Estoy horneando la magdalena con ");
            System.out.print("Color " + this.color);
            System.out.print(" Sabor " + this.sabor);
        }
        public void envolver(){
            System.out.println("Estoy embolviendo la magdalena");
            this.envoltorio=true;
            System.out.println("Envoltorio=" + envoltorio);
        }
        public void anyadirPepitas(){
            System.out.println("Estoy añadiendo pepitas");
            this.pepitas=true;
            System.out.println("Pepitas="+pepitas);
        }
}
