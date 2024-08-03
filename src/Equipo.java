public class Equipo {
    private String tipo;
    private String estado;

    public Equipo(String tipo) {
        this.tipo = tipo;
        this.estado = "apagado";
    }

    public void encender() {
        estado = "encendido";
        System.out.println(tipo + " encendido");
    }

    public void apagar() {
        estado = "apagado";
        System.out.println(tipo + " apagado");
    }

    public void reparar() {
        System.out.println("Reparando " + tipo);
    }

    // Getters y setters
    // ...
}