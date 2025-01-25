package LAVADORA;

public class Lavadora {
    private int capacidad;
    private String planDeLavado;
    private boolean llena;
    private String estado;
    private int contadorTiempoLavado;
    private String estadoLavado;
    private String puerta;
    private int revolucionesPorMinuto;
    private int temperaturaAgua;
    private String cajetil;
    private int capacidadCajetil;
    private String tamborLavadora;
    private String detergente;
    private boolean enProcesoDeLavado;
    private boolean detergenteSuficiente;

    // Constructor
    public Lavadora(int capacidad, String planDeLavado, boolean detergenteSuficiente) {
        // CARGAMOS VALORES POR DEFECTO Y PARAMETROS
        this.capacidad = capacidad;
        this.planDeLavado = planDeLavado;
        this.puerta = "Cerrado";
        this.estado = "Apagado";
        this.estadoLavado = "Sin lavar";
        this.revolucionesPorMinuto = 0;
        this.temperaturaAgua = 0;
        this.cajetil = "Cerrado";
        this.capacidadCajetil = 0;
        this.tamborLavadora = "Inactivo";
        this.detergenteSuficiente = true;
        this.enProcesoDeLavado = false;
    }

    // Getter and setter
    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public String getPlanDeLavado() {
        return planDeLavado;
    }

    public void setPlanDeLavado(String planDeLavado) {
        this.planDeLavado = planDeLavado;
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

    public String getPuerta() {
        return puerta;
    }

    public void setPuerta(String puerta) {
        this.puerta = puerta;
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

    public String getCajetil() {
        return cajetil;
    }

    public void setCajetil(String cajetil) {
        this.cajetil = cajetil;
    }

    public int getCapacidadCajetil() {
        return capacidadCajetil;
    }

    public void setCapacidadCajetil(int capacidadCajetil) {
        this.capacidadCajetil = capacidadCajetil;
    }

    public String getTamborLavadora() {
        return tamborLavadora;
    }

    public void setTamborLavadora(String tamborLavadora) {
        this.tamborLavadora = tamborLavadora;
    }

    public String getDetergente() {
        return detergente;
    }

    public void setDetergente(String detergente) {
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

    // Metodo para abrir la puerta
    public void abrirPuerta() {
        if (enProcesoDeLavado) {
            System.out.println("No se puede abrir la puerta mientras se está lavando.");
        } else {
            puerta = "Abierto";
            System.out.println("Puerta abierta");
        }
    }

    // Metodo para introducir ropa
    public void introducirRopa(int kilos) {
        if (kilos > capacidad) {
            System.out.println("Exceso de carga. No se puede cargar más de " + capacidad + " kg.");
        } else if(puerta.equals("Abierto")) {
            System.out.println("NO SE PUEDE INTRODUCIR ROPA SI LA PUERTA ESTÁ CERRADA");
        } else {
            llena = true;
            System.out.println("Ropa cargada: " + kilos + " kg.");
        }
    }

    // Metodo para cerrar la puerta
    public void cerrarPuerta() {
        puerta = "Cerrado";
        System.out.println("Puerta cerrada");
    }

    // Metodo para encender la lavadora
    public void encender() {
        estado = "Encendido";
        System.out.println("Lavadora encendida");
    }

    // Metodo para definir el plan de lavado
    public void definirPlanDeLavado(String plan) {
        planDeLavado = plan;
        if (plan.equals("Rápido")) {
            revolucionesPorMinuto = 800;
            temperaturaAgua = 30;
            contadorTiempoLavado = 30; // minutos
        } else if (plan.equals("Algodón")) {
            revolucionesPorMinuto = 600;
            temperaturaAgua = 40;
            contadorTiempoLavado = 60; // minutos
        }
        estado = "En uso";
        System.out.println("Plan de lavado definido: " + planDeLavado);
    }

    // Metodo para abrir el cajetil
    public void abrirCajetil() {
        cajetil = "Abierto";
        System.out.println("Cajetil abierto");
    }

    // Metodo para introducir detergente
    public void introducirDetergente(int cantidad) {
        if (cantidad <= capacidadCajetil) {
            detergente = "Suficiente";
            System.out.println("Detergente introducido: " + cantidad + " litros.");
        } else {
            detergente = "Insuficiente";
            System.out.println("Se necesita más detergente.");
            detergenteSuficiente = false;
        }
    }

    // Metodo para cerrar el cajetil
    public void cerrarCajetil() {
        cajetil = "Cerrado";
        System.out.println("Cajetil cerrado");
    }

    // Metodo para iniciar el lavado
    public void iniciarLavado() {
        if (!detergenteSuficiente) {
            System.out.println("No se puede iniciar el lavado, no hay suficiente detergente.");
        } else {
            estadoLavado = "Lavando ropa...";
            estado = "En uso";
            enProcesoDeLavado = true; // Empieza el proceso de lavado
            System.out.println(estadoLavado);
        }
    }

    // Metodo para establecer el contador de lavado
    public void establecerContadorLavadora() {
        if (enProcesoDeLavado) {
            while (contadorTiempoLavado > 0) {
                System.out.println("Tiempo restante: " + contadorTiempoLavado + " minutos");
                contadorTiempoLavado--;
                try {
                    Thread.sleep(1000); // Simula el paso del tiempo por cada minuto
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            finalizarLavado();
        } else {
            System.out.println("El lavado no ha comenzado.");
        }
    }

    // Metodo para finalizar el lavado
    public void finalizarLavado() {
        enProcesoDeLavado = false;
        estado = "Lavado finalizado";
        revolucionesPorMinuto = 0;
        tamborLavadora = "Inactivo";
        System.out.println(estado);
    }

    // Metodo para retirar la ropa
    public void retirarRopa() {
        llena = false;
        System.out.println("Ropa retirada.");
    }

    // Metodo para apagar la lavadora
    public void apagar() {
        estado = "Apagado";
        System.out.println("Lavadora apagada.");
    }
}
