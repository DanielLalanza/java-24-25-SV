public class Pelicula {
    private String titulo;
    private int anio;
    public static int index;


    public Pelicula(String titulo, int anio) {
        this.titulo = titulo;
        this.anio = anio;
        index++;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public static int getIndex() {
        return index;
    }

    public static void setIndex(int index) {
        Pelicula.index = index;
    }

    @Override
    public String toString() {
        return "Pelicula{" +
                "titulo='" + titulo + '\'' +
                ", anio=" + anio +
                '}';
    }
}
