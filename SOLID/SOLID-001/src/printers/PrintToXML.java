package printers;

import herencia.Reporte;
import interfaces.Print;

public class PrintToXML extends Reporte  {
    private String cadenaEnHTML;
    public PrintToXML(String cadena) {
        super(cadena);
    }
    void imprimirCadena(){
        System.out.println(super.cadenaATransformar);   // DEL PADRE
        System.out.println(this.cadenaEnHTML);          // DEL HIJO
    }
}
