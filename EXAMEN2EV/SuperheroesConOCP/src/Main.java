import pojo.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Lista de superhéroes sin super ataques
        List<SuperHero> heroes = new ArrayList<>();
        heroes.add(new IronMan());
        heroes.add(new SpiderMan());
        heroes.add(new Hulk());
        heroes.add(new Thor());
        heroes.add(new DoctorStrange());

        // Probamos ataques y defensas normales
        for (SuperHero hero : heroes) {
            hero.attack();
            hero.defend();
            System.out.println("-------------------");
        }

        // Lista de superhéroes con super ataques
        List<SuperAttack> superAttackHeroes = new ArrayList<>();
        superAttackHeroes.add(new ThorWithSuperAttack());
        superAttackHeroes.add(new DoctorStrangeWithSuperAttack());

        // Probamos los super ataques
        for (SuperAttack hero : superAttackHeroes) {
            hero.executeSuperAttack();
            System.out.println("-------------------");
        }
    }
}


