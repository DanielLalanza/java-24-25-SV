package org.example;

import org.example.herencia.Reporte;
import org.example.printers.PrintToHTML;
import org.example.printers.PrintToJSON;
import org.example.printers.PrintToXML;

import java.util.ArrayList;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Reporte printToJSON = new PrintToJSON("JSON");
        Reporte printToXML = new PrintToXML("XML");
        Reporte printToHTML = new PrintToHTML("HTML");

        ArrayList<Reporte> lst = new ArrayList<>();
        lst.add(printToJSON);
        lst.add(printToXML);
        lst.add(printToHTML);

        for (Reporte reporte : lst) {       /// A PESAR DE ACCEDER A UNA CLASE PADRE, SE EJECUTA EL imprimirCadena DEL HIJO
            reporte.imprimirCadena();       /// YA QUE EL HIJO LO SOBREESCRIBE AMBOS TIENEN QUE ESTAR IGUAL
        }


    }
}