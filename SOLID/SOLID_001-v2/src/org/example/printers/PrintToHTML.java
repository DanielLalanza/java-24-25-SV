package org.example.printers;

import org.example.herencia.Reporte;
import org.example.interfaces.Print;

public class PrintToHTML extends Reporte {
    private String cadenaEnHTML;
    public PrintToHTML(String cadena) {
        super(cadena);
    }

    @Override
    public void imprimirCadena() {
        System.out.println(super.cadenaATransformar);
    }

}
