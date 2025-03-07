package arma.Ataque;

import arma.ArmaAtaque;
import arma.IArmamentoAtaque;

public class Martillo extends ArmaAtaque implements IArmamentoAtaque {
    protected final int vidaConsumida = 20;

    public Martillo(String nombre) {
        super(nombre);
    }

    public int getVidaConsumida() {
        return vidaConsumida;
    }

    @Override
    public String toString() {
        return "Martillo{" +
                "vidaConsumida=" + vidaConsumida +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}
