import java.util.Scanner;
public class Main {

    // Método para conjugar verbos en presente
    public static String conjugarEnPresente(String verbo, String pronombre) {
        String raizVerbal = verbo.substring(0, verbo.length() - 2);
        String sufijo = "";
        if (verbo.endsWith("ar")) {
            switch (pronombre) {
                case "yo": sufijo = "o"; break;
                case "tu": sufijo = "as"; break;
                case "el": sufijo = "a"; break;
                case "nosotros": sufijo = "amos"; break;
                case "vosotros": sufijo = "ais"; break;
                case "ellos": sufijo = "an"; break;
            }
        } else if (verbo.endsWith("er")) {
            switch (pronombre) {
                case "yo": sufijo = "o"; break;
                case "tu": sufijo = "es"; break;
                case "el": sufijo = "e"; break;
                case "nosotros": sufijo = "emos"; break;
                case "vosotros": sufijo = "eis"; break;
                case "ellos": sufijo = "en"; break;
            }
        } else if (verbo.endsWith("ir")) {
            switch (pronombre) {
                case "yo": sufijo = "o"; break;
                case "tu": sufijo = "es"; break;
                case "el": sufijo = "e"; break;
                case "nosotros": sufijo = "imos"; break;
                case "vosotros": sufijo = "is"; break;
                case "ellos": sufijo = "en"; break;
            }
        }
        return pronombre + " " + raizVerbal + sufijo;
    }

    // Método para conjugar verbos en pretérito
    public static String conjugarEnPretérito(String verbo, String pronombre) {
        String raizVerbal = verbo.substring(0, verbo.length() - 2);
        String sufijo = "";
        if (verbo.endsWith("ar")) {
            switch (pronombre) {
                case "yo": sufijo = "e"; break;
                case "tu": sufijo = "aste"; break;
                case "el": sufijo = "o"; break;
                case "nosotros": sufijo = "amos"; break;
                case "vosotros": sufijo = "asteis"; break;
                case "ellos": sufijo = "aron"; break;
            }
        } else if (verbo.endsWith("er") || verbo.endsWith("ir")) {
            switch (pronombre) {
                case "yo": sufijo = "i"; break;
                case "tu": sufijo = "iste"; break;
                case "el": sufijo = "io"; break;
                case "nosotros": sufijo = "imos"; break;
                case "vosotros": sufijo = "isteis"; break;
                case "ellos": sufijo = "ieron"; break;
            }
        }
        return pronombre + " " + raizVerbal + sufijo;
    }

    // Método para conjugar verbos en futuro
    public static String conjugarEnFuturo(String verbo, String pronombre) {
        String sufijo = "";
        if (verbo.endsWith("ar") || verbo.endsWith("er") || verbo.endsWith("ir")) {
            switch (pronombre) {
                case "yo": sufijo = "e"; break;
                case "tu": sufijo = "as"; break;
                case "el": sufijo = "a"; break;
                case "nosotros": sufijo = "emos"; break;
                case "vosotros": sufijo = "eis"; break;
                case "ellos": sufijo = "an"; break;
            }
        }
        return pronombre + " " + verbo + sufijo;
    }

    // Método principal que ejecuta el programa
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean esPrimeraEntrada = true;
        boolean esPrimerSalto = true;

        // Bucle principal para procesar múltiples verbos
        while (true) {
            String verboEntrada = sc.next();
            String tiempoVerbal = sc.next();

            if (tiempoVerbal.equals("T")) break;  // Termina si se ingresa 'T'
            if (!esPrimeraEntrada) {
                System.out.println();
            }
            esPrimeraEntrada = false;
            if (esPrimerSalto) {
                System.out.println();
                esPrimerSalto = false;
            }

            // Lista de personas para las conjugaciones
            String[] pronombres = {"yo", "tu", "el", "nosotros", "vosotros", "ellos"};
            for (String pronombre : pronombres) {
                switch (tiempoVerbal) {
                    case "A":
                        System.out.println(conjugarEnPresente(verboEntrada, pronombre));  // Conjugación en presente
                        break;
                    case "P":
                        System.out.println(conjugarEnPretérito(verboEntrada, pronombre));  // Conjugación en pretérito
                        break;
                    case "F":
                        System.out.println(conjugarEnFuturo(verboEntrada, pronombre));  // Conjugación en futuro
                        break;
                }
            }
        }
        sc.close();
    }
}
