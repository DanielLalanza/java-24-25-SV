package pojo;

public class Thor extends SuperHero {
    public Thor() {
        super("Thor", new BasicAttack("Thor lanza su martillo Mjolnir ⚒️!", "Thor invoca una tormenta eléctrica ⛈️!"));
    }

    @Override
    public void defend() {
        System.out.println("Thor bloquea con su martillo 🛡️!");
    }
}

