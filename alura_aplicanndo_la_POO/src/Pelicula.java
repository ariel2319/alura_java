//clase modelo => representa la estructura de un objeto...en este caso una peli..
public class Pelicula {
    String name;
    int fechaLanzamiento;
    int duracionEnMinutos;
    boolean incluidoEnElPlan;
    double sumaDeEvaluaciones;
    int totalEvaluaciones;


    //métodos
    void muestraFichaTecnica() {
        System.out.println("El nombre de la película es: " + name + ", fue lanzada en : " + fechaLanzamiento + ", con una duracion de :" + duracionEnMinutos + " min");
    }

    void evalua(double nota) {
        sumaDeEvaluaciones += nota;
        totalEvaluaciones++;
    }

    double calculaMedia() {
        return sumaDeEvaluaciones / totalEvaluaciones;
    }
}
