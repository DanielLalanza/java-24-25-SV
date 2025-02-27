package pojo;

public class IronMan extends SuperHero {
    public IronMan() {
        super("Iron Man", new BasicAttack("Iron Man dispara un rayo repulsor ⚡!", "Iron Man usa su rayo unibeam ☄️!"));
    }

    @Override
    public void defend() {
        System.out.println("Iron Man activa su escudo de energía 🛡️!");
    }
}

