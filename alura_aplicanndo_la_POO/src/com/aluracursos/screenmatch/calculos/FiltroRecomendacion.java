package com.aluracursos.screenmatch.calculos;

public class FiltroRecomendacion {
    public void filtro(Clasificacion clasificacion) {
        if (clasificacion.getClasificacion() >= 4) {
            System.out.println("Buena evaluación pa");
        } else if (clasificacion.getClasificacion() == 2) {
            System.out.println("Poca popularidad");
        } else {
            System.out.println("Colocalo en tu lista de ver más tarde");
        }
    }
}
