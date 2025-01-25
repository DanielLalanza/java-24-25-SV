public class AlmacenPeliculas {
    static Pelicula[] peliculas = new Pelicula[0]; // Comienza con un array vacío
    private int size = 0;
    public void add(Pelicula pelicula) {
        Pelicula[] nuevoArray = new Pelicula[size+1];
        // Copiamos las películas existentes al nuevo array
        for (int i = 0; i < size; i++) {
            nuevoArray[i] = peliculas[i];
        }

        // Agregamos la película al final
        nuevoArray[size] = pelicula;

        // Referenciamos el array nuevo y actualizamos 'size'
        peliculas = nuevoArray;
        size++;
    }

    public static void imprimirArray(){
        for (int i = 0; i < peliculas.length; i++) {
            System.out.println(peliculas[i].toString());
        }
    }

}
