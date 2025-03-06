package arma.Ataque;

import arma.ArmaAtaque;
import arma.IArmamentoAtaque;
import persoanjes.WarhammerPersonaje;

public class Arco extends ArmaAtaque implements IArmamentoAtaque {
    protected final int vidaConsumida = 20;

    public Arco(String nombre) {
        super(nombre);
    }

    public int getVidaConsumida() {
        return vidaConsumida;
    }

    @Override
    public void atacar(WarhammerPersonaje victima) {
        super.atacar(victima);
    }

    @Override
    public void atacar(WarhammerPersonaje victima, boolean esAtaqueEmperador) {
        super.atacar(victima, esAtaqueEmperador);
    }

    @Override
    public String toString() {
        return "Arco{" +
                "vidaConsumida=" + vidaConsumida +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}
