package persoanjes;

import arma.Arma;
import arma.ArmaAtaque;
import arma.ArmaDefensa;
import interfaces.ICombate;

import java.util.HashMap;

public class PelVerde extends WarhammerPersonaje implements ICombate {
    //private String nombre;
    private String puebloNacimiento;
    protected int nivel;
    private static int contPelesVerdes;
    // ¿COMO INSTANCIO EL HASMAP?


    public PelVerde(String nombre, String puebloNacimiento) {
        super(nombre);
        this.puebloNacimiento = puebloNacimiento;
    }

    public void addArmaAtaque(ArmaAtaque arma){
        armas.put(arma.getNombre(), arma);
    }
    public void addArmaDefensa(ArmaDefensa arma){
        armas.put(arma.getNombre(), arma);
    }

    @Override
    public String toString() {
        return "PelVerde{" +
                "puebloNacimiento='" + puebloNacimiento + '\'' +
                ", nivel=" + nivel +
                ", armas=" + armas +
                ", ENERGIA_MAX=" + ENERGIA_MAX +
                '}';
    }

    @Override
    public void atacar(WarhammerPersonaje victima) {

    }

    @Override
    public void defender(ArmaAtaque arma) {

    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public String getPuebloNacimiento() {
        return puebloNacimiento;
    }


}
