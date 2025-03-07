package arma.Defensa;

import arma.ArmaAtaque;
import arma.ArmaDefensa;
import arma.IArmamentoDefensa;
import persoanjes.WarhammerPersonaje;

public class Escudo extends ArmaDefensa implements IArmamentoDefensa {
    private final int vidaDefendida=20;

    public Escudo(String nombre) {
        super(nombre);
    }

    @Override
    public void defender(WarhammerPersonaje personajeDefendido, ArmaAtaque aramaAtaque) {

    }

    @Override
    public String toString() {
        return "Escudo{" +
                "vidaDefendida=" + vidaDefendida +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}
