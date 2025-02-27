package pojo;

public abstract class SuperHero {
    protected String name;
    protected SuperAttack attackStrategy;

    public SuperHero(String name, SuperAttack attackStrategy) {
        this.name = name;
        this.attackStrategy = attackStrategy;
    }

    public void attack() {
        attackStrategy.execute();
    }

    public abstract void defend();
}

