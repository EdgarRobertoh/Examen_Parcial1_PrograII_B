public abstract class Postre {
    protected String nombre;
    protected String tamaño;
    protected double precio;

    public Postre(String nombre, String tamaño, double precio) {
        this.nombre = nombre;
        this.tamaño = tamaño;
        this.precio = precio;
    }

    public abstract void preparar();
    public abstract void servir();

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTamaño() {
        return tamaño;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}