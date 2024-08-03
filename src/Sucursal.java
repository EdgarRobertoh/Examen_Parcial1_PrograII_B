import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/**
 * Representa una sucursal de la cadena de restaurantes de postres.
 */
public final class Sucursal {
    private final String nombre;
    private final String direccion;
    private final List<Empleado> empleados;
    private final List<Ingrediente> ingredientes;
    private final List<Equipo> equipos;
    private final List<Postre> especialidades;

    private Sucursal(Builder builder) {
        this.nombre = builder.nombre;
        this.direccion = builder.direccion;
        this.empleados = new ArrayList<>(builder.empleados);
        this.ingredientes = new ArrayList<>(builder.ingredientes);
        this.equipos = new ArrayList<>(builder.equipos);
        this.especialidades = new ArrayList<>(builder.especialidades);
    }

    public void agregarEmpleado(Empleado empleado) {
        if (empleado != null) {
            empleados.add(empleado);
        }
    }

    public void agregarIngrediente(Ingrediente ingrediente) {
        if (ingrediente != null) {
            ingredientes.add(ingrediente);
        }
    }

    public void agregarEquipo(Equipo equipo) {
        if (equipo != null) {
            equipos.add(equipo);
        }
    }

    public void agregarEspecialidad(Postre postre) {
        if (postre != null) {
            especialidades.add(postre);
        }
    }

    public void removerEmpleado(Empleado empleado) {
        empleados.remove(empleado);
    }

    public void removerIngrediente(Ingrediente ingrediente) {
        ingredientes.remove(ingrediente);
    }

    public void removerEquipo(Equipo equipo) {
        equipos.remove(equipo);
    }

    public void removerEspecialidad(Postre postre) {
        especialidades.remove(postre);
    }

    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public List<Empleado> getEmpleados() {
        return Collections.unmodifiableList(empleados);
    }

    public List<Ingrediente> getIngredientes() {
        return Collections.unmodifiableList(ingredientes);
    }

    public List<Equipo> getEquipos() {
        return Collections.unmodifiableList(equipos);
    }

    public List<Postre> getEspecialidades() {
        return Collections.unmodifiableList(especialidades);
    }

    public int getNumeroEmpleados() {
        return empleados.size();
    }

    public int getNumeroIngredientes() {
        return ingredientes.size();
    }

    public int getNumeroEquipos() {
        return equipos.size();
    }

    public int getNumeroEspecialidades() {
        return especialidades.size();
    }

    public boolean estaVacia() {
        return empleados.isEmpty() && ingredientes.isEmpty() && equipos.isEmpty() && especialidades.isEmpty();
    }

    @Override
    public String toString() {
        return "Sucursal{" +
                "nombre='" + nombre + '\'' +
                ", direccion='" + direccion + '\'' +
                ", empleados=" + empleados.size() +
                ", ingredientes=" + ingredientes.size() +
                ", equipos=" + equipos.size() +
                ", especialidades=" + especialidades.size() +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Sucursal sucursal = (Sucursal) o;
        return Objects.equals(nombre, sucursal.nombre) &&
                Objects.equals(direccion, sucursal.direccion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, direccion);
    }

    /**
     * Builder para la clase Sucursal.
     */
    public static class Builder {
        private final String nombre;
        private final String direccion;
        private List<Empleado> empleados = new ArrayList<>();
        private List<Ingrediente> ingredientes = new ArrayList<>();
        private List<Equipo> equipos = new ArrayList<>();
        private List<Postre> especialidades = new ArrayList<>();

        public Builder(String nombre, String direccion) {
            this.nombre = nombre;
            this.direccion = direccion;
        }

        public Builder empleados(List<Empleado> empleados) {
            this.empleados = empleados;
            return this;
        }

        public Builder ingredientes(List<Ingrediente> ingredientes) {
            this.ingredientes = ingredientes;
            return this;
        }

        public Builder equipos(List<Equipo> equipos) {
            this.equipos = equipos;
            return this;
        }

        public Builder especialidades(List<Postre> especialidades) {
            this.especialidades = especialidades;
            return this;
        }

        public Sucursal build() {
            return new Sucursal(this);
        }
    }
}