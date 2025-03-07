package persoanjes.Enanos;

import arma.ArmaAtaque;
import arma.ArmaDefensa;
import interfaces.ICombate;
import persoanjes.Enano;
import persoanjes.WarhammerPersonaje;

import java.util.ArrayList;

public class Martillador extends Enano implements ICombate {

    public Martillador(String nombre, int riqueza) {
        super(nombre, riqueza);
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
        return "Martillador{" +
                ", riqueza=" + riqueza +
                ", armas=" + armas +
                ", ENERGIA_MAX=" + ENERGIA_MAX +
                '}';
    }
}