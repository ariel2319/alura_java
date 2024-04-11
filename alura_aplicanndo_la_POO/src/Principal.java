import com.aluracursos.screenmatch.modelos.Pelicula;

public class Principal {
    public static void main(String[] args) {

        //Tipo de Dato "com.aluracursos.screenmatch.modelos.Pelicula", creamos una instancia del mismo, creando un espacio en memoria para ese objeto..
        Pelicula miPelicula = new Pelicula();

        //miPelicula.name = "Doom";
        miPelicula.setName("Doom");
        //miPelicula.fechaLanzamiento = 2005;
        miPelicula.setFechaLanzamiento(2005);
        //miPelicula.duracionEnMinutos = 105;
        miPelicula.setDuracionEnMinutos(105);
        //miPelicula.incluidoEnElPlan = true;
        miPelicula.setIncluidoEnElPlan(true);

        miPelicula.muestraFichaTecnica();
        miPelicula.evalua(10);
        miPelicula.evalua(8);
        miPelicula.evalua(9);
        System.out.println(miPelicula.getTotalEvaluaciones());
        System.out.println("Media = " + miPelicula.calculaMedia());


       /* com.aluracursos.screenmatch.modelos.Pelicula otraPelicula = new com.aluracursos.screenmatch.modelos.Pelicula();

        otraPelicula.name = "Matrix";
        otraPelicula.muestraFichaTecnica();

        //System.out.println("Otra com.aluracursos.screenmatch.modelos.Pelicula: " + otraPelicula.name);*/

    }
}
