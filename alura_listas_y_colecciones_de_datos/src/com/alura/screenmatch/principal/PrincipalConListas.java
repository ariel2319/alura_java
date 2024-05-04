package com.alura.screenmatch.principal;

import com.alura.screenmatch.modelos.Pelicula;
import com.alura.screenmatch.modelos.Serie;
import com.alura.screenmatch.modelos.Titulo;

import java.util.ArrayList;

public class PrincipalConListas {
    public static void main(String[] args) {
        Pelicula miPelicula = new Pelicula("Encanto", 2021);
        miPelicula.evalua(8);
        Pelicula otraPelicula = new Pelicula("Encanto", 2021);
        otraPelicula.evalua(9);
        var peliculaDeBruno = new Pelicula("El señor de los Anillos", 2001);
        peliculaDeBruno.evalua(10);
        Serie lost = new Serie("Lost", 2000);

        Pelicula p1 = miPelicula;

        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(miPelicula);
        lista.add(otraPelicula);
        lista.add(peliculaDeBruno);
        lista.add(lost);

        // mostrar "toString" de cada serie y película

        for (Titulo item : lista) {
            System.out.println(item.getNombre());
            //desde JAVA 14 puedo usar variables de referencia...
            if (item instanceof Pelicula pelicula && pelicula.getClasificacion()>4) {
                System.out.println(pelicula.getClasificacion());
            }
            //otra forma de hacer lo mismo de arriba...
            // if (item instanceof Pelicula) {
            //     Pelicula pelicula = (Pelicula) item;
            //     System.out.println(pelicula.getClasificacion());
            // }
        }

        System.out.println("P1" + p1);

        if (miPelicula == otraPelicula) {
            System.out.println("son iguales");
        } else {
            System.out.println("distintas");
        }


    }
}
