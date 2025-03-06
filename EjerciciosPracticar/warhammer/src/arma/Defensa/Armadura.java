package arma.Defensa;

import arma.Arma;
import arma.ArmaAtaque;
import arma.ArmaDefensa;
import arma.IArmamentoDefensa;
import persoanjes.WarhammerPersonaje;

public class Armadura extends ArmaDefensa implements IArmamentoDefensa {
    private final int vidaDefendida=20;

    public Armadura(String nombre) {
        super(nombre);
    }

    @Override
    public void defender(WarhammerPersonaje personajeDefendido, ArmaAtaque aramaAtaque) {

    }
}
