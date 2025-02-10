public class Cancion {
    int id;
    String titulo;
    String autor;
    String genero;
    static int idIndex=0;

    public Cancion(String titulo, String autor, String genero) {
        this.id = idIndex;
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
        idIndex++;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }


    public static int getIdIndex() {
        return idIndex;
    }

    public static void setIdIndex(int idIndex) {
        Cancion.idIndex = idIndex;
    }

    @Override
    public String toString() {
        return "Cancion{" +
                "id=" + id +
                ", titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", genero='" + genero + '\'' +
                '}';
    }
}
