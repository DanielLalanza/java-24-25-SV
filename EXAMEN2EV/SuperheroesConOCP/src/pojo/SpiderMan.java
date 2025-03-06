package pojo;

public class SpiderMan extends SuperHero {
    public SpiderMan() {
        super("Spider-Man", new BasicAttack("Spider-Man lanza telarañas 🕸️!", "Spider-Man atrapa a los enemigos con una telaraña gigante 🕷️!"));
    }

    @Override
    public void defend() {
        System.out.println("Spider-Man esquiva ágilmente el ataque 🤸!");
    }
}

