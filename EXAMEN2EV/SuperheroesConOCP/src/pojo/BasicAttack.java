package pojo;

// 📌 Implementación de un ataque normal (para los héroes sin super ataque)
public class BasicAttack implements SuperAttack {
    private final String attackMessage;
    private final String superAttackMessage;

    public BasicAttack(String attackMessage, String superAttackMessage) {
        this.attackMessage = attackMessage;
        this.superAttackMessage = superAttackMessage;
    }

    @Override
    public void execute() {
        System.out.println(attackMessage);
    }

    @Override
    public void executeSuperAttack() {
        System.out.println(superAttackMessage);
    }
}
