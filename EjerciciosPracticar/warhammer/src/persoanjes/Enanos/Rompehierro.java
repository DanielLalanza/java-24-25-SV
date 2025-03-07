package persoanjes.Enanos;
import arma.ArmaAtaque;
import arma.ArmaDefensa;
import interfaces.ICombate;
import persoanjes.Enano;
import persoanjes.WarhammerPersonaje;

import java.util.ArrayList;

public class Rompehierro extends Enano implements ICombate {
    protected ArrayList<Enano> listaEnanos;

    public Rompehierro(String nombre, int riqueza) {
        super(nombre, riqueza);
    }

    public ArrayList<Enano> getListaEnanos() {
        return listaEnanos;
    }

    public void addEnano(Enano en) {
        listaEnanos.add(en);
    }

    @Override
    public void addArmaAtaque(ArmaAtaque Arma) {
        super.addArmaAtaque(Arma);
    }

    @Override
    public void addArmaDefensa(ArmaDefensa Arma) {
        super.addArmaDefensa(Arma);
    }

    @Override
    public void sumarEnergia() {
        super.sumarEnergia();
    }

    @Override
    public void atacar(WarhammerPersonaje victima) {
        super.atacar(victima);
    }

    @Override
    public void defender(ArmaAtaque arma) {
        super.defender(arma);
    }

    @Override
    public String toString() {
        return "Rompehierro{" +
                "listaEnanos=" + listaEnanos +
                ", riqueza=" + riqueza +
                ", armas=" + armas +
                '}';
    }
}
