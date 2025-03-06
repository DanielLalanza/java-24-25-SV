import java.util.ArrayList;
import java.util.List;

public class Lavadora {
    // Atributos
    private String planDeLavado;
    private int capacidad;
    private boolean llena;
    private String estado;
    private int contadorTiempoLavado;
    private String estadoLavado;
    private boolean puertaAbierta;
    private String pantalla;
    private int revolucionesPorMinuto;
    private int temperaturaAgua;
    private boolean cajetilAbierto;
    private int capacidadCajetil;
    private boolean detergente;
    private boolean enProcesoDeLavado;
    private boolean detergenteSuficiente;

    // Para almacenar las prendas que están dentro
    private List<Prenda> prendasDentro;

    // Constructor
    public Lavadora(String planDeLavado, int capacidad, boolean detergente) {
        this.planDeLavado = planDeLavado;
        this.capacidad = capacidad;
        this.detergente = detergente;
        this.llena = false;
        this.estado = "Apagada";
        this.estadoLavado = "N/A";
        this.puertaAbierta = false;
        this.cajetilAbierto = false;
        this.capacidadCajetil = 100; // valor de ejemplo
        this.detergenteSuficiente = detergente;
        this.prendasDentro = new ArrayList<>();
        this.enProcesoDeLavado = false;
    }

    // Métodos

    public String abrirLavadora() {
        this.puertaAbierta = true;
        return "Puerta abierta";
    }

    public String cerrarPuerta() {
        this.puertaAbierta = false;
        return "Puerta cerrada";
    }

    public String abrirCajetil() {
        this.cajetilAbierto = true;
        return "Cajetil abierto";
    }

    public String cerrarCajetil() {
        this.cajetilAbierto = false;
        return "Cajetil cerrado";
    }

    public String introducirDetergente(int cantidad) {
        // Ejemplo muy simplificado
        if (this.cajetilAbierto) {
            if (cantidad > 0) {
                this.detergenteSuficiente = true;
                return "Detergente introducido correctamente";
            } else {
                return "Cantidad de detergente insuficiente";
            }
        } else {
            return "El cajetil está cerrado, no se puede introducir detergente";
        }
    }

    public String introducirPrenda(Prenda nuevaPrenda) {
        if (!puertaAbierta) {
            return "ERROR: La puerta está cerrada. Ábrala antes de introducir prendas.";
        }
        // A modo de ejemplo, "capacidad" interpretada como número máximo de prendas
        if (prendasDentro.size() >= capacidad) {
            return "ERROR: La lavadora ya está llena. No caben más prendas.";
        }
        // Agregamos la prenda
        prendasDentro.add(nuevaPrenda);
        // Revisamos si ya llegó al límite
        if (prendasDentro.size() == capacidad) {
            llena = true;
        }
        return "Prenda añadida: " + nuevaPrenda.toString();
    }

    public String encender() {
        this.estado = "Encendida";
        return "Lavadora encendida";
    }

    public String apagar() {
        this.estado = "Apagada";
        this.enProcesoDeLavado = false;
        return "Lavadora apagada";
    }

    public String iniciarLavado() {
        if (!detergenteSuficiente) {
            return "ERROR: No hay detergente suficiente para lavar.";
        }
        if (prendasDentro.isEmpty()) {
            return "No hay prendas dentro de la lavadora. Operación abortada.";
        }
        if (!puertaAbierta) {
            this.enProcesoDeLavado = true;
            this.estadoLavado = "Lavando en plan: " + this.planDeLavado;
            return "Lavado iniciado con plan: " + this.planDeLavado;
        } else {
            return "ERROR: La puerta está abierta, no se puede iniciar el lavado.";
        }
    }

    public String finalizarLavado() {
        if (enProcesoDeLavado) {
            this.enProcesoDeLavado = false;
            this.estadoLavado = "Finalizado";
            return "El ciclo de lavado ha finalizado.";
        } else {
            return "No estaba en proceso de lavado.";
        }
    }

    public String retirarRopa() {
        if (!puertaAbierta) {
            return "ERROR: La puerta debe estar abierta para retirar la ropa.";
        }
        if (prendasDentro.isEmpty()) {
            return "No hay prendas que retirar.";
        }
        // Devolvemos la lista de prendas que se retiran
        StringBuilder sb = new StringBuilder("Retirando prendas:\n");
        for (Prenda p : prendasDentro) {
            sb.append(" - ").append(p.toString()).append("\n");
        }
        prendasDentro.clear();
        llena = false;
        return sb.toString();
    }

    // Método auxiliar para saber qué prendas están dentro
    public String listarPrendasDentro() {
        if (prendasDentro.isEmpty()) {
            return "La lavadora está vacía.";
        }
        StringBuilder sb = new StringBuilder("Prendas dentro de la lavadora:\n");
        for (Prenda p : prendasDentro) {
            sb.append(" - ").append(p.toString()).append("\n");
        }
        return sb.toString();
    }

    // GETTER AND SETTER
    public String getPlanDeLavado() {
        return planDeLavado;
    }
    public void setPlanDeLavado(String planDeLavado) {
        this.planDeLavado = planDeLavado;
    }
    public int getCapacidad() {
        return capacidad;
    }
    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }
    public boolean isLlena() {
        return llena;
    }
    public void setLlena(boolean llena) {
        this.llena = llena;
    }
    public String getEstado() {
        return estado;
    }
    public void setEstado(String estado) {
        this.estado = estado;
    }
    public int getContadorTiempoLavado() {
        return contadorTiempoLavado;
    }
    public void setContadorTiempoLavado(int contadorTiempoLavado) {
        this.contadorTiempoLavado = contadorTiempoLavado;
    }
    public String getEstadoLavado() {
        return estadoLavado;
    }
    public void setEstadoLavado(String estadoLavado) {
        this.estadoLavado = estadoLavado;
    }
    public boolean isPuertaAbierta() {
        return puertaAbierta;
    }
    public void setPuertaAbierta(boolean puertaAbierta) {
        this.puertaAbierta = puertaAbierta;
    }
    public String getPantalla() {
        return pantalla;
    }
    public void setPantalla(String pantalla) {
        this.pantalla = pantalla;
    }
    public int getRevolucionesPorMinuto() {
        return revolucionesPorMinuto;
    }
    public void setRevolucionesPorMinuto(int revolucionesPorMinuto) {
        this.revolucionesPorMinuto = revolucionesPorMinuto;
    }
    public int getTemperaturaAgua() {
        return temperaturaAgua;
    }
    public void setTemperaturaAgua(int temperaturaAgua) {
        this.temperaturaAgua = temperaturaAgua;
    }
    public boolean isCajetilAbierto() {
        return cajetilAbierto;
    }
    public void setCajetilAbierto(boolean cajetilAbierto) {
        this.cajetilAbierto = cajetilAbierto;
    }
    public int getCapacidadCajetil() {
        return capacidadCajetil;
    }
    public void setCapacidadCajetil(int capacidadCajetil) {
        this.capacidadCajetil = capacidadCajetil;
    }
    public boolean isDetergente() {
        return detergente;
    }
    public void setDetergente(boolean detergente) {
        this.detergente = detergente;
    }
    public boolean isEnProcesoDeLavado() {
        return enProcesoDeLavado;
    }
    public void setEnProcesoDeLavado(boolean enProcesoDeLavado) {
        this.enProcesoDeLavado = enProcesoDeLavado;
    }
    public boolean isDetergenteSuficiente() {
        return detergenteSuficiente;
    }
    public void setDetergenteSuficiente(boolean detergenteSuficiente) {
        this.detergenteSuficiente = detergenteSuficiente;
    }
}
