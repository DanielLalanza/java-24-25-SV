package arma.Defensa;

import arma.Arma;
import arma.ArmaAtaque;
import arma.ArmaDefensa;
import arma.IArmamentoDefensa;
import persoanjes.WarhammerPersonaje;

public class Armadura extends ArmaDefensa implements IArmamentoDefensa {
    private final int vidaDefendida=10;

    public Armadura(String nombre) {
        super(nombre);
    }

    @Override
    public void defender(WarhammerPersonaje personajeDefendido, ArmaAtaque aramaAtaque) {
        personajeDefendido.setEnergia(personajeDefendido.getENERGIA_MAX()-(aramaAtaque.getDaño()-vidaDefendida));
    }
}
