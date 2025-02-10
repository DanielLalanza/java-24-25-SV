public class Prenda {
    // Atributos
    private String tipo;
    private String color;
    private int peso;
    private String nivelSuciedad;

    // Constructor
    public Prenda(String tipo, String color, int peso, String nivelSuciedad) {
        this.tipo = tipo;
        this.color = color;
        this.peso = peso;
        this.nivelSuciedad = nivelSuciedad;
    }

    // Getters
    public String obtenerTipo() {
        return tipo;
    }

    public String obtenerColor() {
        return color;
    }

    public int obtenerPeso() {
        return peso;
    }

    public String obtenerNivelSuciedad() {
        return nivelSuciedad;
    }

    // Setters
    public void setSuciedad(String nuevoNivel) {
        this.nivelSuciedad = nuevoNivel;
    }

    // Para mostrar la prenda en un print
    @Override
    public String toString() {
        return "Prenda [tipo=" + tipo
                + ", color=" + color
                + ", peso=" + peso
                + ", nivelSuciedad=" + nivelSuciedad + "]";
    }
}
