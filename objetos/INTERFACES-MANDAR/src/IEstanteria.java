public interface IEstanteria {
    public void addCancion(Cancion c);
    public void updateCancion(Cancion c, String titulo, String autor, String genero);
    public void deleteCancion(Cancion c);
    public void imprimir();
}

