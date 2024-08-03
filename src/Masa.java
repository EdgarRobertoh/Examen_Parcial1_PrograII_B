public class Masa implements Ingrediente {
    private String tipo;
    private double cantidad;

    public Masa(String tipo, double cantidad) {
        this.tipo = tipo;
        this.cantidad = cantidad;
    }

    @Override
    public String obtenerNombre() {
        return "Masa " + tipo;
    }

    @Override
    public double obtenerCantidad() {
        return cantidad;
    }

    // Getters y setters
    // ...
}