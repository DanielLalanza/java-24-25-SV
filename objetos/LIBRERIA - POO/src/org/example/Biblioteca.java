package org.example;
public class Biblioteca {
    private static final int CAPACIDAD = 10;
    private static Libro[] libros = new Libro[CAPACIDAD];
    private static int contadorLibros = 0;

    public static void agregarLibro(Libro libro){
        if(contadorLibros < CAPACIDAD){
            libros[contadorLibros] = libro;
            contadorLibros++;
            System.out.println("CON ESPACIO");
        }else{
            System.out.println("SIN ESPACIO");
        }
    }
    public static void listarLibros(){
        // For normal
        // Foreach para Objetos
        for (Libro libro:libros
        ) {
            if (libro != null) {
                System.out.println(libro.toString());
            }
        }
        /*for (int i = 0; i < contadorLibros; i++) {
          Libro libro = libros[i];
        }*/
    }
    public static Libro buscarLibro(String titulo){
        for (Libro libro: libros) {
            if(libro.getTitulo().equals(titulo)){
                return libro;
            }
        }
        return null;
    }
    public static void prestarLibro(String titulo){
        Libro libro = Biblioteca.buscarLibro(titulo);
        if (libro!= null && libro.isDisponible()) {
            libro.setDisponible(false);
            System.out.println("Prestamos el libro " + titulo);
        } else {
            System.out.println("LIBRO NO DISPONIBLE");
        }
    }
    public static void devolverLibro(String titulo){
        Libro libro = Biblioteca.buscarLibro(titulo);
        if (libro!= null && libro.isDisponible()) {
            libro.setDisponible(true);
            System.out.println("Devolvemos el libro " + titulo);
        } else {
            System.out.println("ESE LIBRO YA ESTABA EN LA LIBRERIA");
        }
    }
}
