package com.aluracursos.screenmatch.modelos;

//clase modelo => representa la estructura de un objeto...en este caso una peli..
public class Pelicula {
    private String name;
    private int fechaLanzamiento;
    private int duracionEnMinutos;
    private boolean incluidoEnElPlan;
    private double sumaDeEvaluaciones;
    private int totalEvaluaciones;

    //creo un método "setter" para colocar datos y "getter" para obtener datos..

    public String getName() {
        return name;
    }

    public void setName(String name) {
        //this es para indicar que es el atributo de esta clase..
        //y el segundo "name" es el parámetro q recibe el método
        this.name = name;
    }

    public void setFechaLanzamiento(int fechaLanzamiento) {
        this.fechaLanzamiento = fechaLanzamiento;
    }

    public void setDuracionEnMinutos(int duracionEnMinutos) {
        this.duracionEnMinutos = duracionEnMinutos;
    }

    public void setIncluidoEnElPlan(boolean incluidoEnElPlan) {
        this.incluidoEnElPlan = incluidoEnElPlan;
    }

    //creo un método que me de el valor de la variable o atributo que está privada..
    public int getTotalEvaluaciones() {
        return totalEvaluaciones;
    }

    //métodos
    public void muestraFichaTecnica() {
        System.out.println("El nombre de la película es: " + name + ", fue lanzada en : " + fechaLanzamiento + ", con una duracion de :" + duracionEnMinutos + " min");
    }

    public void evalua(double nota) {
        sumaDeEvaluaciones += nota;
        totalEvaluaciones++;
    }

    public double calculaMedia() {
        return sumaDeEvaluaciones / totalEvaluaciones;
    }
}
