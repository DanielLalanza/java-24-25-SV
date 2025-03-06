package persoanjes;
import arma.ArmaAtaque;
import arma.ArmaDefensa;
import interfaces.ICombate;

public class Enano extends WarhammerPersonaje implements ICombate {
    //private String nombre;
    protected int riqueza;
    private int nivel;
    private static int contadorEnanos;

    public Enano(String nombre, int riqueza) {
        super(nombre);
        this.riqueza = riqueza;
    }

    private static int getContadorEnanos() {
        return 0;
    }

    public void addArmaAtaque(ArmaAtaque arma){
        armas.put(arma.getNombre(), arma);
    }
    public void addArmaDefensa(ArmaDefensa arma){
        armas.put(arma.getNombre(), arma);
    }
    public String imprimirArmas(){
        return "";
    }



    @Override
    public String toString() {
        return "Enano{" +
                "riqueza=" + riqueza +
                ", nivel=" + nivel +
                ", armas=" + armas +
                ", ENERGIA_MAX=" + ENERGIA_MAX +
                '}';
    }

    @Override
    public void atacar(WarhammerPersonaje victima) {

    }

    @Override
    public void defender(ArmaAtaque arma) {

    }

    public void setRiqueza(int riqueza) {
        this.riqueza = riqueza;
    }
}
