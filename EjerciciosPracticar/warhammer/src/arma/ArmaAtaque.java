package arma;

import persoanjes.WarhammerPersonaje;

public class ArmaAtaque extends Arma implements IArmamentoAtaque{

    private int daño;

    public ArmaAtaque(String nombre) {
        super(nombre);
        daño=20;
    }

    public int getDaño() {
        return daño;
    }

    @Override
    public void atacar(WarhammerPersonaje victima) {

    }

    @Override
    public void atacar(WarhammerPersonaje victima, boolean esAtaqueEmperador) {

    }

}
