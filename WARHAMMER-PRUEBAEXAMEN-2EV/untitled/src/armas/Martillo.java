package armas;

public class Martillo {
    private final int vidaConsumida;

    public Martillo(int vidaConsumida) {
        this.vidaConsumida = vidaConsumida;
    }

    public int getVidaConsumida() {
        return vidaConsumida;
    }

    @Override
    public String toString() {
        return "Martillo{" +
                "vidaConsumida=" + vidaConsumida +
                '}';
    }
}
