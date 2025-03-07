package personajes;

import armas.ArmaAtaque;
import armas.ArmaDefensa;
import armas.IArmaAtaque;

public class PelVerde extends WarhammerPersonaje {
    //private String nombre;
    private String puebloNacimiento;
    private int nivel;
    static int contDePielesVerdes;

    public PelVerde (String nombre, String puebloNacimiento) {
        super(nombre);
        this.puebloNacimiento = puebloNacimiento;
    }

    public static int getContDePielesVerdes(){
        return 0;
    }

    public void addArmaAtaque (ArmaAtaque arma){

    }

    public void addArmaDefensa (ArmaDefensa arma){

    }

    public String imprimirArmas(){
      return " ";
    };

    @Override
    public String toString() {
        return "PelVerde{" +
                "puebloNacimiento='" + puebloNacimiento + '\'' +
                ", nivel=" + nivel +
                ", armas=" + armas +
                '}';
    }

    @Override
    public void atacar(WarhammerPersonaje victima) {

    }

    @Override
    public void defender(IArmaAtaque arma) {

    }
}
