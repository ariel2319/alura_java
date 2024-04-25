package com.aluracursos.radioalura.modelos;

public class Audio {
    private String titulo;
    private int totalReproducciones;
    private int totalMeGusta;
    private int clasificacion;

    public void meGusta() {
        this.totalMeGusta++;
    }

    public void reproduce() {
        this.totalReproducciones++;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getTotalReproducciones() {
        return totalReproducciones;
    }

    public int getTotalMeGusta() {
        return totalMeGusta;
    }

    public int getClasificacion() {
        return clasificacion;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setTotalReproducciones(int totalReproducciones) {
        this.totalReproducciones = totalReproducciones;
    }

    public void setTotalMeGusta(int totalMeGusta) {
        this.totalMeGusta = totalMeGusta;
    }

    public void setClasificacion(int clasificacion) {
        this.clasificacion = clasificacion;
    }
}
