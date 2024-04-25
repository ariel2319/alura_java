package com.aluracursos.radioalura.modelos;

public class Podcast extends Audio {
    private String presentador;
    private String descrpcion;

    @Override
    public int getClasificacion() {
        if (getTotalReproducciones() >= 2000) {
            return 9;
        } else {
            return 2;
        }

    }

    public String getPresentador() {
        return presentador;
    }

    public void setPresentador(String presentador) {
        this.presentador = presentador;
    }

    public String getDescrpcion() {
        return descrpcion;
    }

    public void setDescrpcion(String descrpcion) {
        this.descrpcion = descrpcion;
    }
}
