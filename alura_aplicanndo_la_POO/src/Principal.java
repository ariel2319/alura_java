import com.aluracursos.screenmatch.calculos.CalculadoraDeTiempo;
import com.aluracursos.screenmatch.calculos.FiltroRecomendacion;
import com.aluracursos.screenmatch.modelos.Episodio;
import com.aluracursos.screenmatch.modelos.Pelicula;
import com.aluracursos.screenmatch.modelos.Serie;

public class Principal {
    public static void main(String[] args) {

        //Tipo de Dato "com.aluracursos.screenmatch.modelos.Pelicula", creamos una instancia del mismo, creando un espacio en memoria para ese objeto..
        Pelicula miPelicula = new Pelicula();
        miPelicula.setName("Doom");
        miPelicula.setFechaLanzamiento(2005);
        miPelicula.setDuracionEnMinutos(105);
        miPelicula.setIncluidoEnElPlan(true);

        miPelicula.muestraFichaTecnica();
        miPelicula.evalua(10);
        miPelicula.evalua(8);
        miPelicula.evalua(9);
        System.out.println(miPelicula.getTotalEvaluaciones());
        System.out.println("Media = " + miPelicula.calculaMedia());


        Serie casaDragon = new Serie();
        casaDragon.setName("La Casa del Dragon");
        casaDragon.setFechaLanzamiento(2022);
        casaDragon.setTemporadas(1);
        casaDragon.setMinutosPorEpisodio(50);
        casaDragon.setEpisodiosPorTemporada(10);
        casaDragon.muestraFichaTecnica();
        System.out.println("Duración de la Serie en minutos: " + casaDragon.getDuracionEnMinutos());

        Pelicula otraPelicula = new Pelicula();
        otraPelicula.setName("Matrix");
        otraPelicula.setFechaLanzamiento(1998);
        otraPelicula.setDuracionEnMinutos(169);

        CalculadoraDeTiempo calculador = new CalculadoraDeTiempo();
        calculador.incluye(miPelicula);
        calculador.incluye(casaDragon);
        calculador.incluye(otraPelicula);
        System.out.println("Tiempo necesario tu lista de títulos => " + calculador.getTiempoTotal() + "min");

        FiltroRecomendacion filtroRecomendacion = new FiltroRecomendacion();
        System.out.printf(miPelicula.getName()+ " => ");
        filtroRecomendacion.filtro(miPelicula);

        Episodio episodio = new Episodio();
        episodio.setEpisodio(1);
        episodio.setNombre("La casa Targaryen");
        episodio.setSerie(casaDragon.getName());
        episodio.setTotalVisualizaciones(1);

        filtroRecomendacion.filtro(episodio);
    }
}
