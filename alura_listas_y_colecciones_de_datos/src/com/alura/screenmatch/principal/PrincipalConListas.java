package com.alura.screenmatch.principal;

import com.alura.screenmatch.modelos.Pelicula;
import com.alura.screenmatch.modelos.Serie;
import com.alura.screenmatch.modelos.Titulo;

import java.util.ArrayList;

public class PrincipalConListas {
    public static void main(String[] args) {
        Pelicula miPelicula = new Pelicula("Encanto", 2021);
        miPelicula.evalua(8);
        Pelicula otraPelicula = new Pelicula("Avatar", 2013);
        otraPelicula.evalua(9);
        var peliculaDeBruno = new Pelicula("El señor de los Anillos", 2001);
        peliculaDeBruno.evalua(10);
        Serie lost = new Serie("Lost", 2000);

        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(miPelicula);
        lista.add(otraPelicula);
        lista.add(peliculaDeBruno);
        lista.add(lost);

        //mostrar "toString" de cada serie y película

        for (Titulo item : lista) {
            System.out.println(item);
            System.out.println(item.g);
        }


    }
}
