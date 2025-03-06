package arma;

import persoanjes.WarhammerPersonaje;

public class ArmaDefensa extends Arma implements IArmamentoDefensa{

    public ArmaDefensa(String nombre) {
        super(nombre);
    }

    @Override
    public void defender(WarhammerPersonaje personajeDefendido, ArmaAtaque aramaAtaque) {

    }
}
