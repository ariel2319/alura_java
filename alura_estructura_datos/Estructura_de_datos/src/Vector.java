import java.util.Arrays;

public class Vector {

    private Estudiante[] estudiantes = new Estudiante[100];
    private int totalDeEstudiantes = 0;

    public void adicionar(Estudiante estudiante) {
        this.estudiantes[totalDeEstudiantes] = estudiante;
        totalDeEstudiantes++;
    }

    public void obtener(int posicion) {

    }

    public void remove(int posicion) {

    }

    public boolean contener(Estudiante estudiante) {
        for (int i = 0; i < totalDeEstudiantes; i++) {
            if (estudiante.equals(estudiantes[i])) {
                return true;
            }
        }
        return false;
    }

    public String tamanio() {
        return "Cantidad de Estudiantes => " + totalDeEstudiantes;
    }

    private boolean posicionOcupadad(int posicion) {
        return posicion >= 0 && posicion < totalDeEstudiantes;
    }

    public Estudiante pegar(int posicion) {
        if (!posicionOcupadad(posicion)) {
        throw new IllegalArgumentException("posición inválida, como tu hermana");
        }
        return estudiantes[posicion];
    }

    public String toString() {
        return Arrays.toString(estudiantes);
    }

}
