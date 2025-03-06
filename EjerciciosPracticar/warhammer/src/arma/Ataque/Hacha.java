package arma.Ataque;

import arma.ArmaAtaque;
import arma.IArmamentoAtaque;

public class Hacha extends ArmaAtaque implements IArmamentoAtaque {
    protected final int vidaConsumida = 20;

    public Hacha(String nombre) {
        super(nombre);
    }

    public int getVidaConsumida() {
        return vidaConsumida;
    }

    @Override
    public String toString() {
        return "Hacha{" +
                "vidaConsumida=" + vidaConsumida +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}
