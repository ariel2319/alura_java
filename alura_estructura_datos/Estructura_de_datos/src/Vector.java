import java.util.Arrays;

public class Vector {
 
    private int tamanioArray = 10;
    private Estudiante[] estudiantes = new Estudiante[tamanioArray];
    private int totalDeEstudiantes = 0;

    // MODIFICAR EL TAMAÑO DEL ARRAY
    // !en JAVA NO se puede cambiar el tamaño del array, pero si podemos copiar el
    // !contenido de un Array a otro nuevo con mayor capacidad
    private void guardarEspacio() {
        if (totalDeEstudiantes == estudiantes.length) {
            Estudiante[] estudiantesAux = new Estudiante[estudiantes.length * 2];
            for (int i = 0; i < estudiantes.length; i++) {
                estudiantesAux[i] = estudiantes[i];
            }
            this.estudiantes = estudiantesAux;
        }
    }

    // añadir estudiante a continuación del último
    public void adicionar(Estudiante estudiante) {
        this.guardarEspacio();
        this.estudiantes[totalDeEstudiantes] = estudiante;
        totalDeEstudiantes++;
    }

    // añadir estudiante en la posición que deseo
    public void agregarAlumno(int posicion, Estudiante estudiante) {
        this.guardarEspacio();
        if (!posicionValida(posicion)) {
            throw new IllegalArgumentException("posición Inválida, como eia..");
        }
        for (int i = totalDeEstudiantes; i >= posicion; i -= 1) {
            estudiantes[i + 1] = estudiantes[i];
        }
        estudiantes[posicion] = estudiante;
        totalDeEstudiantes++;
    }

    public void obtener(int posicion) {

    }

    public void remove(int posicion) {
        for (int i = posicion; i < this.totalDeEstudiantes; i++) {
            this.estudiantes[i] = this.estudiantes[i + 1];
        }
        totalDeEstudiantes--;
    }

    // existe el alumno?T or F..
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

    private boolean posicionValida(int posicion) {
        return posicion >= 0 && posicion <= totalDeEstudiantes;
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
