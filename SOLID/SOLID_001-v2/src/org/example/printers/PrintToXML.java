package org.example.printers;

import org.example.herencia.Reporte;

// public class PrintToXML extends Reporte implements Print {
public class PrintToXML extends Reporte  {
    private String cadenaEnHtml;
    public PrintToXML(String cadena){
        super(cadena);
    }

    @Override
    public void imprimirCadena() {
        System.out.println(super.cadenaATransformar);
    }

}
