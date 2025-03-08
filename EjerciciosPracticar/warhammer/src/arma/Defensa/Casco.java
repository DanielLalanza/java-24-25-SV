package arma.Defensa;

import arma.ArmaAtaque;
import arma.ArmaDefensa;
import arma.Ataque.Arco;
import arma.IArmamentoDefensa;
import persoanjes.WarhammerPersonaje;

public class Casco extends ArmaDefensa implements IArmamentoDefensa {
    private final int vidaDefendida=20;

    public Casco(String nombre) {
        super(nombre);
    }

    @Override
    public void defender(WarhammerPersonaje personajeDefendido, ArmaAtaque aramaAtaque) {
        if (aramaAtaque.getClass() == Arco.class) {
            personajeDefendido.setEnergia(personajeDefendido.getENERGIA_MAX() - (aramaAtaque.getDaño() - vidaDefendida));
        }else {personajeDefendido.setEnergia(personajeDefendido.getENERGIA_MAX() - aramaAtaque.getDaño());}
    }

    @Override
    public String toString() {
        return "Casco{" +
                "vidaDefendida=" + vidaDefendida +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}
