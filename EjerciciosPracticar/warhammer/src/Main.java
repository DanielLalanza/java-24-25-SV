import arma.Ataque.Arco;
import arma.Ataque.Hacha;
import arma.Ataque.Martillo;
import arma.Ataque.Rebanadora;
import arma.Defensa.Armadura;
import arma.Defensa.Casco;
import arma.Defensa.Escudo;
import persoanjes.Enanos.Martillador;
import persoanjes.PelesVerde.Goblin;
import persoanjes.WarhammerPersonaje;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        Goblin G1 = new Goblin("Manolo","Caceres");
        G1.setNivel(20);
        Goblin G2 = new Goblin("Mauricio","Cuenca");
        G2.setNivel(20);

        Martillador M1 = new Martillador("Frank", 1000);
        Martillador M2 = new Martillador("Francisco", 1000);

        Arco a1 = new Arco("A1");
        Hacha h1 = new Hacha("H1");
        Martillo m1 = new Martillo("M1");
        Rebanadora r1 = new Rebanadora("R1");
        Armadura ar1 = new Armadura("A1");
        Escudo es1 = new Escudo("E1");
        Casco c1 = new Casco("C1");
        G1.addArmaAtaque(a1);
        G2.addArmaAtaque(h1);
        M1.addArmaAtaque(m1);
        M2.addArmaAtaque(r1);
        G1.addArmaDefensa(ar1);
        G2.addArmaDefensa(ar1);
        M1.addArmaDefensa(c1);
        M2.addArmaDefensa(es1);


        System.out.println(G1);
        System.out.println("CONTADOR DE PERSONAJES: "+WarhammerPersonaje.getContPeronajes());
        System.out.println(WarhammerPersonaje.getLISTA_PERSONAJES());
    }
}