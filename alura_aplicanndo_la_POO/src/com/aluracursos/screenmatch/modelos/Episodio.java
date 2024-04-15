package com.aluracursos.screenmatch.modelos;

import com.aluracursos.screenmatch.calculos.Clasificacion;

public class Episodio implements Clasificacion {

    private int episodio;
    private String nombre;
    private String serie;
    private int totalVisualizaciones;

    public int getEpisodio() {
        return episodio;
    }

    public String getNombre() {
        return nombre;
    }

    public String getSerie() {
        return serie;
    }

    public void setEpisodio(int episodio) {
        this.episodio = episodio;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public int getTotalVisualizaciones() {
        return totalVisualizaciones;
    }

    public void setTotalVisualizaciones(int totalVisualizaciones) {
        this.totalVisualizaciones = totalVisualizaciones;
    }

    @Override
    public int getClasificacion() {
        if (totalVisualizaciones > 100) {
            return 5;
        } else {
            return 2;
        }
    }
}
