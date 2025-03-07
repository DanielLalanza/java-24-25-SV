package personajes;

import armas.Arma;
import armas.IArmaAtaque;
import interfaces.ICombate;

import java.util.HashMap;

public abstract class WarhammerPersonaje implements ICombate {
    private String nombre;
    private int energia;
    protected HashMap<String, Arma> armas;
    private static int contPersonajes;
    private static final int EnergiaMax = 200;

    public WarhammerPersonaje(String nombre) {
        this.nombre = nombre;
    }
    public void sumarEnergia(){

    }
    public static void toNumPersonajes(){
        // SOUT O RETURN INT?
    }
    public String imprimirArmas(){
        return ("");
    }

    @Override
    public String toString() {
        return "WarhammerPersonaje{" +
                "nombre='" + nombre + '\'' +
                ", energia=" + energia +
                ", armas=" + armas +
                '}';
    }

    @Override
    abstract void atacar(WarhammerPersonaje victima){

    }
    @Override
    abstract void defender(IArmaAtaque arma){

    }
}
