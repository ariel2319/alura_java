package com.aluracursos.radioalura.principal;

import com.aluracursos.radioalura.modelos.Cancion;
import com.aluracursos.radioalura.modelos.MisFavoritos;
import com.aluracursos.radioalura.modelos.Podcast;

public class Principal {
    public static void main(String[] args) {

        Cancion miCancion = new Cancion();
        miCancion.setTitulo("Forever");
        miCancion.setArtista("Kiss");

        Podcast miPodcast = new Podcast();
        miPodcast.setPresentador("Grabiel Maldonado");
        miPodcast.setTitulo("El Podcast de Grabiell");

        for (int i = 0; i < 65; i++) {
            miCancion.meGusta();
        }
        for (int i = 0; i < 1234; i++) {
            miCancion.reproduce();
        }
        System.out.println("Total de Reproducciones: " + miCancion.getTotalReproducciones());
        System.out.println("Total de Me Gusta: " + miCancion.getTotalMeGusta());

        for (int i = 0; i < 6200; i++) {
            miPodcast.meGusta();
            miPodcast.reproduce();
            miPodcast.reproduce();
        }
        System.out.println("El podcast de " + miPodcast.getPresentador() + ": " + miPodcast.getTitulo() + ",\n posee " + miPodcast.getTotalMeGusta() + " me Gusta y " + miPodcast.getTotalReproducciones() + " reproducciones en la semana");

        MisFavoritos favoritos = new MisFavoritos();
        favoritos.adicione(miCancion);
        favoritos.adicione(miPodcast);
    }
}
