package personajes;

import interfaces.ICombate;

public class Goblin extends PelVerde implements ICombate {
    public Goblin(String nombre, String puebloNacimiento) {
        super(nombre, puebloNacimiento);
    }
}
