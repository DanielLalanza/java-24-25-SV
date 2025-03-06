package interfaces;

import arma.ArmaAtaque;
import persoanjes.WarhammerPersonaje;

public interface ICombate {
    public void atacar(WarhammerPersonaje victima);
    public void defender(ArmaAtaque arma);
}
