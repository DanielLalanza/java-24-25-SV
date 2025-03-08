package armas;

import personajes.WarhammerPersonaje;

public class ArmaAtaque extends Arma implements IArmaAtaque {
    public ArmaAtaque(String nombre) {
        super(nombre);
    }

    @Override
    public void atacar(WarhammerPersonaje victima) {

    }

    @Override
    public void atacar(WarhammerPersonaje victima, boolean esAtaqueEmperador) {

    }
    // IMPLEMENTA NOMBRE ARMA

}
