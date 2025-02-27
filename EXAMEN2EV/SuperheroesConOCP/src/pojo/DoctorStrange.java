package pojo;

public class DoctorStrange extends SuperHero {
    public DoctorStrange() {
        super("Doctor Strange", new BasicAttack("Doctor Strange lanza un hechizo mágico 🔮!", "Doctor Strange abre un portal dimensional 🌌!"));
    }

    @Override
    public void defend() {
        System.out.println("Doctor Strange usa su escudo místico 🌀!");
    }
}

