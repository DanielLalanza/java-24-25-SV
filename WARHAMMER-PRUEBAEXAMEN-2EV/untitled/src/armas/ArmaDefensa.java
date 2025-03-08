package armas;

import personajes.WarhammerPersonaje;

public class ArmaDefensa extends Arma implements IArmaDefensa {
    public ArmaDefensa(String nombre) {
        super(nombre);
    }
    @Override
    public void defender(WarhammerPersonaje defendido, ArmaAtaque armaAtaque) {

    }
}
