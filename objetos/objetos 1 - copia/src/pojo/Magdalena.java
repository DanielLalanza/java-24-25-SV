package pojo;

public class Magdalena {
    // ATRIBUTOS
        String sabor;
        String color;
    // CONSTRUCTOR
        // public Magdalena(){} // CONTRASEÑA VACIA
        public Magdalena(String sabor, String color){
            this.sabor = sabor;
            this.color = color;
            System.out.println("Color " + this.color);
            System.out.println("Sabor " + this.sabor);
        }

        public void imprimirMagdalena(){
            System.out.println("La magdalena tiene el sabor "+ sabor+ " y color:"+color);
        }


        // METODO
        public String getSabor(){
            return sabor;
        }


        /*
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
        }*/

}
