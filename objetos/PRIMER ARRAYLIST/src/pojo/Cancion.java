package pojo;

public class Cancion {
    // Representa a una tabla de base de datos -> Entity
    // Representa a caso de uso -> DTO (DATA TRANSFER OBJECT)
    // POJO = SIMPLE ATRIBUTOS, CONSTRUCTOR, GETTER/SETTER Y TO_STRING

    private int id;
    private String titulo;

    public Cancion(int id, String titulo) {
        this.id = id;
        this.titulo = titulo;
    }

    @Override
    public String toString() {
        return "Cancion{" +
                "id=" + id +
                ", titulo='" + titulo + '\'' +
                '}';
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
}

