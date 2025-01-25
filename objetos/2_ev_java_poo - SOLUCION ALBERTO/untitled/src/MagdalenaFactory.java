import pojo.Magdalena;

public class MagdalenaFactory {
    int contador = 0;
    private Magdalena[] lstMagdalena = new Magdalena[4];

    public MagdalenaFactory(){
    }
    public MagdalenaFactory(Magdalena[] lstMagdalena){
        this.lstMagdalena = lstMagdalena;
    }

    public void addMagdalena(Magdalena miMagdalena){
        lstMagdalena[contador] = miMagdalena;
        contador++;
    }
    public void printMagdalena(){
        Magdalena magdalena;
        for (int i = 0; i < lstMagdalena.length; i++) {
            magdalena = lstMagdalena[i];
            System.out.println("Magdalena: [" + i + "]");
            System.out.println("Atributos: Sabor - " + magdalena.getSabor());
            System.out.println("Atributos: Color - " + magdalena.getColor());
        }
    }


}
