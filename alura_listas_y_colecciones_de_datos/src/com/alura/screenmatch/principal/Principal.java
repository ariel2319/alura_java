package com.alura.screenmatch.principal;

import com.alura.screenmatch.calculos.CalculadoraDeTiempo;
import com.alura.screenmatch.calculos.FiltroRecomendacion;
import com.alura.screenmatch.modelos.Episodio;
import com.alura.screenmatch.modelos.Pelicula;
import com.alura.screenmatch.modelos.Serie;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        Pelicula miPelicula = new Pelicula("Encanto", 2021);
        miPelicula.setDuracionEnMinutos(180);
        System.out.println("Duración de la película: " + miPelicula.getDuracionEnMinutos());

        miPelicula.muestraFichaTecnica();
        miPelicula.evalua(8);
        miPelicula.evalua(5);
        miPelicula.evalua(10);
        System.out.println("Total de evaluaciones: " + miPelicula.getTotalDeEvaluaciones());
        System.out.println(miPelicula.calculaMediaEvaluaciones());


        Serie lost = new Serie("Lost", 2000);
        lost.muestraFichaTecnica();
        lost.setTemporadas(10);
        lost.setEpisodiosPorTemporada(10);
        lost.setMinutosPorEpisodio(50);
        System.out.println("Duracion de la serie: " + lost.getDuracionEnMinutos());

        Pelicula otraPelicula = new Pelicula("Avatar", 2013);
        otraPelicula.setDuracionEnMinutos(200);

        CalculadoraDeTiempo calculadora = new CalculadoraDeTiempo();
        calculadora.incluido(miPelicula);
        calculadora.incluido(otraPelicula);
        calculadora.incluido(lost);
        System.out.println(calculadora.getTiempoTotal());

        FiltroRecomendacion filtro = new FiltroRecomendacion();
        filtro.filtra(miPelicula);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(lost);
        episodio.setTotalVisualizaciones(300);
        filtro.filtra(episodio);

        var peliculaDeBruno = new Pelicula("El señor de los Anillos", 2001);
        //podemos usar VAR en vez del tipo de OBJETO, como Pelicula en este caso..esto NO significa que podamos cambiar el valor del mismo...
        //peliculaDeBruno.setNombre("El señor de los Anillos");
        peliculaDeBruno.setDuracionEnMinutos(180);

        ArrayList<Pelicula> listaDePelicula = new ArrayList<>();
        listaDePelicula.add(miPelicula);
        listaDePelicula.add(otraPelicula);
        listaDePelicula.add(peliculaDeBruno);

        System.out.println("Tamaño de la LISTA => " + listaDePelicula.size() );
        System.out.println("La primer película es => " + listaDePelicula.get(0).getNombre() + " y la 2da es => " + listaDePelicula.get(1).getNombre());

         // System.out.println("lista de pelis => " + listaDePelicula);
        // System.out.println(listaDePelicula.get(0).toString());
        System.out.println("Lista de PELIS (forEach)");
        //dos opciones para imprimir con forEACH...
        listaDePelicula.forEach(pelis -> System.out.println(pelis));
        //Method Reference "::println"....
        listaDePelicula.forEach(System.out::println);


    }
}