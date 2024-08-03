public class Cheesecake extends Postre {
    private String tipoQueso;

    public Cheesecake(String nombre, String tamaño, double precio, String tipoQueso) {
        super(nombre, tamaño, precio);
        this.tipoQueso = tipoQueso;
    }

    @Override
    public void preparar() {
        System.out.println("Preparando cheesecake de " + tipoQueso);
    }

    @Override
    public void servir() {
        System.out.println("Sirviendo cheesecake " + nombre);
    }


    public String getTipoQueso() {
        return tipoQueso;
    }

    public void setTipoQueso(String tipoQueso) {
        this.tipoQueso = tipoQueso;
    }
}