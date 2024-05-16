public class Estudiante {

    private String nombre;

    public Estudiante(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public boolean equals(Object obj) {
        Estudiante otro = (Estudiante) obj;
        return otro.getNombre().equals(this.nombre);
    }

    @Override
    public String toString() {
        return "Estudiante => " + nombre;
    }
}
