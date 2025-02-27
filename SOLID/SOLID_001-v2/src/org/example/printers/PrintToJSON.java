package org.example.printers;

import org.example.herencia.Reporte;
import org.example.interfaces.Print;

public class PrintToJSON extends Reporte {
    private String cadenaEnJSON;
    public PrintToJSON(String cadena){
        super(cadena);
    }

    @Override
    public void imprimirCadena() {
        System.out.println(super.cadenaATransformar);
    }

}
