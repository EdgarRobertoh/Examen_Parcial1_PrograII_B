public class Crepa extends Postre {
    private String tipoMasa;

    public Crepa(String nombre, String tamaño, double precio, String tipoMasa) {
        super(nombre, tamaño, precio);
        this.tipoMasa = tipoMasa;
    }

    @Override
    public void preparar() {
        System.out.println("Preparando crepa de " + tipoMasa);
    }

    @Override
    public void servir() {
        System.out.println("Sirviendo crepa " + nombre);
    }

    public String getTipoMasa() {
        return tipoMasa;
    }

    public void setTipoMasa(String tipoMasa) {
        this.tipoMasa = tipoMasa;
    }
}