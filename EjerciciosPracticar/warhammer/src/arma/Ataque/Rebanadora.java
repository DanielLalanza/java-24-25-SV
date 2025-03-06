package arma.Ataque;

import arma.ArmaAtaque;
import arma.IArmamentoAtaque;

public class Rebanadora extends ArmaAtaque implements IArmamentoAtaque {
    protected final int vidaConsumida = 20;

    public Rebanadora(String nombre) {
        super(nombre);
    }

    public int getVidaConsumida() {
        return vidaConsumida;
    }

    @Override
    public String toString() {
        return "Rebanadora{" +
                "vidaConsumida=" + vidaConsumida +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}