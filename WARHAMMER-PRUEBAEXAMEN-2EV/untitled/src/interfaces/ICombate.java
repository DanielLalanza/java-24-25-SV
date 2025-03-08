package interfaces;

import armas.IArmaAtaque;
import personajes.WarhammerPersonaje;

public interface ICombate {
    void atacar (WarhammerPersonaje victima);
    void defender(IArmaAtaque arma);
}
