package arma;

import persoanjes.WarhammerPersonaje;

public interface IArmamentoAtaque{
    void atacar(WarhammerPersonaje victima);
    void atacar(WarhammerPersonaje victima, boolean esAtaqueEmperador);
}
