package persoanjes;

import arma.Arma;
import arma.ArmaAtaque;
import arma.ArmaDefensa;
import interfaces.ICombate;

import java.util.ArrayList;
import java.util.HashMap;

public abstract class WarhammerPersonaje implements ICombate {
    private String nombre;
    private int energia;
    protected HashMap <String, Arma> armas;
    protected static ArrayList <WarhammerPersonaje> LISTA_PERSONAJES=new ArrayList <>();;
    private static int contPeronajes;
    protected final int ENERGIA_MAX = 200;

    public WarhammerPersonaje(String nombre) {
        this.nombre = nombre;
        this.armas = new HashMap<>();
        contPeronajes++;
        LISTA_PERSONAJES.add(this);
    }

    public void sumarEnergia() {}
    public static void toNumPersonajes(){}
    public String imprimirArmas() {
        return ("");
    }


    @Override
    public String toString() {
        return "WarhammerPersonaje{" +
                "nombre='" + nombre + '\'' +
                ", energia=" + energia +
                ", armas=" + armas +
                ", ENERGIA_MAX=" + ENERGIA_MAX +
                '}';
    }

    public int getENERGIA_MAX() {
        return ENERGIA_MAX;
    }

    public void setEnergia(int energia) {
        this.energia = energia;
    }

    public static int getContPeronajes() {
        return contPeronajes;
    }

    public static ArrayList<WarhammerPersonaje> getLISTA_PERSONAJES() {
        return LISTA_PERSONAJES;
    }

    public HashMap<String, Arma> getArmas() {
        return armas;
    }

    @Override
    public void atacar(WarhammerPersonaje victima) {
        victima.defender(this.WarhammerPersonaje.armas(0), victima.armas.get(1));
    }

    @Override
    public void defender(ArmaAtaque arma, ArmaDefensa defensa) {

    }
}
