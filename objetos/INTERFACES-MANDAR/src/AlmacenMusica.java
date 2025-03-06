import java.util.ArrayList;

public class AlmacenMusica implements IEstanteria{
    ArrayList<Cancion> lstCanciones;

    /*public AlmacenMusica(ArrayList<Cancion> lstCanciones) {
        this.lstCanciones = lstCanciones;
    }*/
    public AlmacenMusica(){
        this.lstCanciones = new ArrayList<Cancion>();
    }

    @Override
    public void addCancion(Cancion c) {
        if (c!=null) {
            lstCanciones.add(c);
            System.out.println("Cancion Añadida: " + c.toString());
        } else {
            System.out.println("La canción es null!!");
        }
    }

    @Override
    public void updateCancion(Cancion c, String titulo, String autor, String genero) {
        if (c!=null) {
            for (Cancion cancion : lstCanciones) {
                if (cancion.id == c.id) {
                    cancion.setTitulo(titulo);
                    cancion.setAutor(autor);
                    cancion.setGenero(genero);
                    break;
                }
            }
        }
    }

    @Override
    public void deleteCancion(Cancion c) {
        this.lstCanciones.remove(c);
    }

    @Override
    public void imprimir() {
        for (Cancion cancion : lstCanciones) {
            System.out.println(cancion.toString());
        }
    }
}
