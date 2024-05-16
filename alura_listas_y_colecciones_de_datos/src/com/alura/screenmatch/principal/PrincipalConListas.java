package com.alura.screenmatch.principal;

import com.alura.screenmatch.modelos.Pelicula;
import com.alura.screenmatch.modelos.Serie;
import com.alura.screenmatch.modelos.Titulo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class PrincipalConListas {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Pelicula miPelicula = new Pelicula("Encanto", 2021);
        miPelicula.evalua(8);
        Pelicula otraPelicula = new Pelicula("Avatar", 2013);
        otraPelicula.evalua(9);
        var peliculaDeBruno = new Pelicula("El señor de los Anillos", 2001);
        peliculaDeBruno.evalua(10);
        Serie lost = new Serie("Lost", 2000);

        Pelicula p1 = miPelicula;

        List<Titulo> lista = new LinkedList<>();
        lista.add(miPelicula);
        lista.add(otraPelicula);
        lista.add(peliculaDeBruno);
        lista.add(lost);

        // mostrar "toString" de cada serie y película

        for (Titulo item : lista) {
            System.out.println(item.getNombre());
            // desde JAVA 14 puedo usar variables de referencia...
            if (item instanceof Pelicula pelicula && pelicula.getClasificacion() > 4) {
                System.out.println(pelicula.getClasificacion());
            }
            // otra forma de hacer lo mismo de arriba...
            // if (item instanceof Pelicula) {
            // Pelicula pelicula = (Pelicula) item;
            // System.out.println(pelicula.getClasificacion());
            // }
        }

        System.out.println("P1" + p1);

        if (miPelicula == p1) {
            System.out.println("son iguales");
        }

        // ORDENANDO LA LISTA

        ArrayList<String> listaDeArtistas = new ArrayList<>();
        listaDeArtistas.add("Penélope Cruz");
        listaDeArtistas.add("Antonio Banderas");
        listaDeArtistas.add("Ricado Darín");
        System.out.println("Lista de Artista NO ORDENADAS => " + listaDeArtistas);
        // ordenar la lista por nombre o de alguna forma..
        Collections.sort(listaDeArtistas);
        System.out.println("Lista de Artistas ORDENADAS => " + listaDeArtistas);

        System.out.println("Lista de Título NO ORDENADOS => " + lista);
        Collections.sort(lista);
        System.out.println("Lista de Títulos ORDENADOS => " + lista);

        lista.sort(Comparator.comparing(Titulo::getFechaDeLanzamiento));
        System.out.println("LISTA ORDENADA por fecha => " + lista);
    }
}
