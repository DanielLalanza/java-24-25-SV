import LAVADORA.Lavadora;
public class Main {
    public static void main(String[] args) {
        // Instanciamos tres lavadoras con diferentes capacidades de carga y planes de lavado
        Lavadora lavadora1 = new Lavadora(7, "Centrifugar", true);
        Lavadora lavadora2 = new Lavadora(8, "Algodón", true);
        Lavadora lavadora3 = new Lavadora(7, "Delicado", true);

        // Proceso de lavado para la lavadora 1
        System.out.println("\nLavadora 1:");
        lavadora1.abrirPuerta();
        lavadora1.introducirRopa(5); // Carga de ropa dentro del límite
        lavadora1.cerrarPuerta();
        lavadora1.encender();
        lavadora1.definirPlanDeLavado("Rápido");
        lavadora1.abrirCajetil();
        lavadora1.introducirDetergente(1); // Se introduce suficiente detergente
        lavadora1.cerrarCajetil();
        lavadora1.iniciarLavado();
        lavadora1.establecerContadorLavadora(); // Comienza el contador de tiempo
        lavadora1.retirarRopa();
        lavadora1.apagar();

        // Proceso de lavado para la lavadora 2
        System.out.println("\nLavadora 2:");
        lavadora2.abrirPuerta();
        lavadora2.introducirRopa(6); // Carga de ropa dentro del límite
        lavadora2.cerrarPuerta();
        lavadora2.encender();
        lavadora2.definirPlanDeLavado("Algodón");
        lavadora2.abrirCajetil();
        lavadora2.introducirDetergente(1); // Se introduce suficiente detergente
        lavadora2.cerrarCajetil();
        lavadora2.iniciarLavado();
        lavadora2.establecerContadorLavadora(); // Comienza el contador de tiempo
        lavadora2.retirarRopa();
        lavadora2.apagar();

        // Proceso de lavado para la lavadora 3
        System.out.println("\nLavadora 3:");
        lavadora3.abrirPuerta();
        lavadora3.introducirRopa(8); // Carga de ropa excediendo la capacidad
        lavadora3.cerrarPuerta();
        lavadora3.encender();
        lavadora3.definirPlanDeLavado("Rápido");
        lavadora3.abrirCajetil();
        lavadora3.introducirDetergente(1); // Se introduce suficiente detergente
        lavadora3.cerrarCajetil();
        lavadora3.iniciarLavado();
        lavadora3.establecerContadorLavadora(); // Comienza el contador de tiempo
        lavadora3.retirarRopa();
        lavadora3.apagar();
    }
}
