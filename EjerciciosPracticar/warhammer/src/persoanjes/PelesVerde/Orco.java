package persoanjes.PelesVerde;

import arma.ArmaAtaque;
import arma.ArmaDefensa;
import interfaces.ICombate;
import persoanjes.PelVerde;
import persoanjes.WarhammerPersonaje;

import java.util.ArrayList;

public class Orco extends PelVerde implements ICombate {
    ArrayList<Goblin> listaGoblin;


    public Orco(String nombre, String puebloNacimiento) {
        super(nombre, puebloNacimiento);
    }

    public ArrayList<Goblin> getListaGoblin() {
        return listaGoblin;
    }

    public void addGoblin(Goblin goblin) {
        listaGoblin.add(goblin);
    }

    @Override
    public void addArmaAtaque(ArmaAtaque arma) {
        super.addArmaAtaque(arma);
    }

    @Override
    public void addArmaDefensa(ArmaDefensa arma) {
        super.addArmaDefensa(arma);
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
        return "Orco{" +
                "nivel=" + nivel +
                ", armas=" + armas +
                '}';
    }
}
