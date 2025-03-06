import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Creamos las 3 lavadoras por defecto
        Lavadora lav1 = new Lavadora("Rápido", 5, false);
        Lavadora lav2 = new Lavadora("Delicado", 3, false);
        Lavadora lav3 = new Lavadora("Intenso", 7, true);

        // Colección para tenerlas juntas
        List<Lavadora> listaLavadoras = new ArrayList<>();
        listaLavadoras.add(lav1);
        listaLavadoras.add(lav2);
        listaLavadoras.add(lav3);

        // Creamos 10 prendas iniciales
        List<Prenda> listaPrendas = new ArrayList<>();
        listaPrendas.add(new Prenda("Camisa", "Blanco", 1, "Baja"));
        listaPrendas.add(new Prenda("Pantalón", "Azul", 2, "Media"));
        listaPrendas.add(new Prenda("Calcetines", "Negro", 1, "Alta"));
        listaPrendas.add(new Prenda("Toalla", "Verde", 2, "Baja"));
        listaPrendas.add(new Prenda("Sábanas", "Blanco", 3, "Media"));
        listaPrendas.add(new Prenda("Falda", "Rojo", 2, "Baja"));
        listaPrendas.add(new Prenda("Short", "Gris", 1, "Alta"));
        listaPrendas.add(new Prenda("Chaqueta", "Negro", 2, "Media"));
        listaPrendas.add(new Prenda("Sudadera", "Azul", 2, "Media"));
        listaPrendas.add(new Prenda("Pijama", "Blanco", 2, "Baja"));

        Scanner sc = new Scanner(System.in);
        boolean salir = false;

        while (!salir) {
            System.out.println("\n======= MENÚ PRINCIPAL =======");
            System.out.println("1. Listar prendas disponibles");
            System.out.println("2. Añadir prenda nueva");
            System.out.println("3. Modificar nivel de suciedad de una prenda");
            System.out.println("4. Operar con lavadoras (abrir, meter prenda, lavar, etc.)");
            System.out.println("5. Salir");
            System.out.print("Elige una opción: ");
            int opcion = sc.nextInt();
            sc.nextLine(); // limpiar buffer

            switch (opcion) {
                case 1:
                    listarPrendas(listaPrendas);
                    break;
                case 2:
                    anadirPrenda(listaPrendas, sc);
                    break;
                case 3:
                    modificarSuciedad(listaPrendas, sc);
                    break;
                case 4:
                    submenuLavadoras(listaLavadoras, listaPrendas, sc);
                    break;
                case 5:
                    salir = true;
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción inválida. Intente de nuevo.");
            }
        }
        sc.close();
    }

    private static void listarPrendas(List<Prenda> listaPrendas) {
        if (listaPrendas.isEmpty()) {
            System.out.println("No hay prendas registradas.");
            return;
        }
        System.out.println("=== Prendas Disponibles ===");
        int i = 1;
        for (Prenda p : listaPrendas) {
            System.out.println(i + ". " + p);
            i++;
        }
    }

    private static void anadirPrenda(List<Prenda> listaPrendas, Scanner sc) {
        System.out.println("=== Añadir Prenda ===");
        System.out.print("Tipo: ");
        String tipo = sc.nextLine();
        System.out.print("Color: ");
        String color = sc.nextLine();
        System.out.print("Peso (entero): ");
        int peso = sc.nextInt();
        sc.nextLine();
        System.out.print("Nivel Suciedad (Baja/Media/Alta): ");
        String nivel = sc.nextLine();

        Prenda nueva = new Prenda(tipo, color, peso, nivel);
        listaPrendas.add(nueva);
        System.out.println("Prenda añadida correctamente.");
    }

    private static void modificarSuciedad(List<Prenda> listaPrendas, Scanner sc) {
        System.out.println("=== Modificar nivel de suciedad ===");
        if (listaPrendas.isEmpty()) {
            System.out.println("No hay prendas.");
            return;
        }
        listarPrendas(listaPrendas);
        System.out.print("Elige el número de prenda a modificar: ");
        int idx = sc.nextInt() - 1;
        sc.nextLine();
        if (idx < 0 || idx >= listaPrendas.size()) {
            System.out.println("Índice inválido.");
            return;
        }
        System.out.print("Nuevo nivel de suciedad (Baja/Media/Alta): ");
        String nuevoNivel = sc.nextLine();
        listaPrendas.get(idx).setSuciedad(nuevoNivel);
        System.out.println("Nivel de suciedad actualizado.");
    }

    private static void submenuLavadoras(List<Lavadora> listaLavadoras, List<Prenda> listaPrendas, Scanner sc) {
        boolean volver = false;
        while (!volver) {
            System.out.println("\n=== Submenú Lavadoras ===");
            System.out.println("1. Listar lavadoras");
            System.out.println("2. Abrir / Cerrar puerta");
            System.out.println("3. Abrir / Cerrar cajetil");
            System.out.println("4. Introducir detergente");
            System.out.println("5. Meter prenda en lavadora");
            System.out.println("6. Encender / Apagar lavadora");
            System.out.println("7. Iniciar / Finalizar lavado");
            System.out.println("8. Retirar ropa");
            System.out.println("9. Listar prendas dentro de la lavadora");
            System.out.println("10. Volver al menú principal");
            System.out.print("Opción: ");
            int op = sc.nextInt();
            sc.nextLine();

            switch (op) {
                case 1:
                    listarLavadoras(listaLavadoras);
                    break;
                case 2:
                    abrirCerrarPuerta(listaLavadoras, sc);
                    break;
                case 3:
                    abrirCerrarCajetil(listaLavadoras, sc);
                    break;
                case 4:
                    introducirDetergenteLavadora(listaLavadoras, sc);
                    break;
                case 5:
                    meterPrendaLavadora(listaLavadoras, listaPrendas, sc);
                    break;
                case 6:
                    encenderApagarLavadora(listaLavadoras, sc);
                    break;
                case 7:
                    iniciarFinalizarLavado(listaLavadoras, sc);
                    break;
                case 8:
                    retirarRopaLavadora(listaLavadoras, sc);
                    break;
                case 9:
                    listarPrendasDentroLavadora(listaLavadoras, sc);
                    break;
                case 10:
                    volver = true;
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        }
    }

    // Métodos auxiliares de Submenú Lavadoras:

    private static void listarLavadoras(List<Lavadora> listaLavadoras) {
        int i = 1;
        for (Lavadora lav : listaLavadoras) {
            System.out.println(i + ". Lavadora con plan: " + lav.getPlanDeLavado()
                    + ", capacidad: " + lav.getCapacidad()
                    + ", estado: " + lav.getEstado());
            i++;
        }
    }

    private static int elegirLavadora(List<Lavadora> listaLavadoras, Scanner sc) {
        listarLavadoras(listaLavadoras);
        System.out.print("Elige el número de lavadora: ");
        int index = sc.nextInt() - 1;
        sc.nextLine();
        if (index < 0 || index >= listaLavadoras.size()) {
            System.out.println("Índice inválido.");
            return -1;
        }
        return index;
    }

    private static void abrirCerrarPuerta(List<Lavadora> listaLavadoras, Scanner sc) {
        int idx = elegirLavadora(listaLavadoras, sc);
        if (idx == -1) return;
        Lavadora lav = listaLavadoras.get(idx);
        if (lav.isPuertaAbierta()) {
            System.out.println(lav.cerrarPuerta());
        } else {
            System.out.println(lav.abrirLavadora());
        }
    }

    private static void abrirCerrarCajetil(List<Lavadora> listaLavadoras, Scanner sc) {
        int idx = elegirLavadora(listaLavadoras, sc);
        if (idx == -1) return;
        Lavadora lav = listaLavadoras.get(idx);
        if (lav.isCajetilAbierto()) {
            System.out.println(lav.cerrarCajetil());
        } else {
            System.out.println(lav.abrirCajetil());
        }
    }

    private static void introducirDetergenteLavadora(List<Lavadora> listaLavadoras, Scanner sc) {
        int idx = elegirLavadora(listaLavadoras, sc);
        if (idx == -1) return;
        Lavadora lav = listaLavadoras.get(idx);
        System.out.print("Cantidad de detergente (entero): ");
        int cant = sc.nextInt();
        sc.nextLine();
        System.out.println(lav.introducirDetergente(cant));
    }

    private static void meterPrendaLavadora(List<Lavadora> listaLavadoras, List<Prenda> listaPrendas, Scanner sc) {
        int idxLav = elegirLavadora(listaLavadoras, sc);
        if (idxLav == -1) return;

        // Elegimos la prenda de la lista
        listarPrendas(listaPrendas);
        if (listaPrendas.isEmpty()) return;

        System.out.print("Elige prenda para meter (número): ");
        int idxPre = sc.nextInt() - 1;
        sc.nextLine();

        if (idxPre < 0 || idxPre >= listaPrendas.size()) {
            System.out.println("Índice de prenda inválido.");
            return;
        }

        Prenda prendaSeleccionada = listaPrendas.get(idxPre);
        // Se la damos a la lavadora
        Lavadora lav = listaLavadoras.get(idxLav);
        String resultado = lav.introducirPrenda(prendaSeleccionada);
        System.out.println(resultado);
    }

    private static void encenderApagarLavadora(List<Lavadora> listaLavadoras, Scanner sc) {
        int idx = elegirLavadora(listaLavadoras, sc);
        if (idx == -1) return;
        Lavadora lav = listaLavadoras.get(idx);
        if (lav.getEstado().equalsIgnoreCase("Apagada")) {
            System.out.println(lav.encender());
        } else {
            System.out.println(lav.apagar());
        }
    }

    private static void iniciarFinalizarLavado(List<Lavadora> listaLavadoras, Scanner sc) {
        int idx = elegirLavadora(listaLavadoras, sc);
        if (idx == -1) return;
        Lavadora lav = listaLavadoras.get(idx);

        if (!lav.isEnProcesoDeLavado()) {
            // Intentar iniciar
            System.out.println(lav.iniciarLavado());
        } else {
            // Finalizar
            System.out.println(lav.finalizarLavado());
        }
    }

    private static void retirarRopaLavadora(List<Lavadora> listaLavadoras, Scanner sc) {
        int idx = elegirLavadora(listaLavadoras, sc);
        if (idx == -1) return;
        Lavadora lav = listaLavadoras.get(idx);
        System.out.println(lav.retirarRopa());
    }

    private static void listarPrendasDentroLavadora(List<Lavadora> listaLavadoras, Scanner sc) {
        int idx = elegirLavadora(listaLavadoras, sc);
        if (idx == -1) return;
        Lavadora lav = listaLavadoras.get(idx);
        System.out.println(lav.listarPrendasDentro());
    }
}
