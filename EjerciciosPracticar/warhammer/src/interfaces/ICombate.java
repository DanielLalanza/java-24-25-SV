package interfaces;

import arma.ArmaAtaque;
import arma.ArmaDefensa;
import persoanjes.WarhammerPersonaje;

public interface ICombate {
    public void atacar(WarhammerPersonaje victima);
    public void defender(ArmaAtaque arma);

    void defender(ArmaAtaque arma, ArmaDefensa defensa);
}
