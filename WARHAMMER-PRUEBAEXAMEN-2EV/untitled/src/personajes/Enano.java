package personajes;

import armas.ArmaAtaque;
import armas.ArmaDefensa;
import armas.IArmaAtaque;

public class Enano extends WarhammerPersonaje{
    //private String nombre; (SUPER)
    private int riqueza;
    protected int nivel;
    private static int contEnanos;

    public Enano(String nombre, int riqueza) {
        super(nombre);
        this.riqueza = riqueza;
    }

    public static int getContDeEnanos(){
        return 0;
    }

    public void addArmaAtaque (ArmaAtaque arma){

    }

    public void addArmaDefensa (ArmaDefensa arma){

    }

    public String imprimirArmas(){
        return " ";
    };

    @Override
    public String toString() {
        return "Enano{" +
                "riqueza=" + riqueza +
                ", nivel=" + nivel +
                ", armas=" + armas +
                '}';
    }


    @Override
    public void atacar(WarhammerPersonaje victima) {

    }

    @Override
    public void defender(IArmaAtaque arma) {

    }
}
