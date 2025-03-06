package persoanjes.PelesVerde;

import arma.ArmaAtaque;
import arma.ArmaDefensa;
import interfaces.ICombate;
import persoanjes.PelVerde;
import persoanjes.WarhammerPersonaje;

public class Goblin extends PelVerde implements ICombate {

    public Goblin(String nombre, String puebloNacimiento) {
        super(nombre, puebloNacimiento);
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
        return "Goblin{" +
                "nivel=" + nivel +
                ", armas=" + armas  + ", Pueblo de nacimiento=" + super.getPuebloNacimiento()+
                ", Energia Máxima=" + super.getENERGIA_MAX() +
                "} ";
    }
}
