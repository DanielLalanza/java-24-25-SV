package armas;

import personajes.WarhammerPersonaje;

public interface IArmaAtaque {
    void atacar(WarhammerPersonaje victima);
    void atacar(WarhammerPersonaje victima, boolean esAtaqueEmperador);
}
