package org.example.herencia;

public abstract class Reporte {             /// ABSTRACT PARA MANDAR OBLIGA A LOS HIJOS A HACER LO DE IMPRIMIR CADENA POR EJ
    //ATRIBUTOS                             /// PEEERO NO PUEDES CREAR CLASES PADRE SOLO TE DA PAUTAS
    protected String cadenaATransformar;
    //CONSTRUCTOR
    public Reporte(String cadena){
        this.cadenaATransformar = cadena;
    }
    //MÉTODOS

    public abstract void imprimirCadena();

    //GETTER/SETTER
}
