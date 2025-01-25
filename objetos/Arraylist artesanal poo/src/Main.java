public class Main {

    public static void main(String[] args) {

        Pelicula pelicula1 = new Pelicula("Matrix", 1999);
        Pelicula pelicula2 = new Pelicula("Matrix2", 2005);
        Pelicula pelicula3 = new Pelicula("Matrix3", 2010);
        Pelicula pelicula4 = new Pelicula("Matrix4", 2015);
        AlmacenPeliculas almacen = new AlmacenPeliculas();
        almacen.add(pelicula1);
        almacen.add(pelicula2);
        almacen.add(pelicula3);
        almacen.add(pelicula4);
        almacen.add(pelicula1);
        almacen.add(pelicula2);
        almacen.add(pelicula3);
        almacen.add(pelicula4);
        almacen.add(pelicula1);
        almacen.add(pelicula2);
        almacen.add(pelicula3);
        almacen.add(pelicula4);
        almacen.add(pelicula1);
        almacen.add(pelicula2);
        almacen.add(pelicula3);
        almacen.add(pelicula4);

        AlmacenPeliculas.imprimirArray();
    }
}