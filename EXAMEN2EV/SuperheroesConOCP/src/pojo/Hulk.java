package pojo;

public class Hulk extends SuperHero {
    public Hulk() {
        super("Hulk", new BasicAttack("Hulk golpea con toda su fuerza 💪!", "Hulk aplasta el suelo y genera un terremoto 🌍!"));
    }

    @Override
    public void defend() {
        System.out.println("Hulk bloquea con su piel impenetrable 🦾!");
    }
}

