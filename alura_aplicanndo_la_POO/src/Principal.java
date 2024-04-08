public class Principal {
    public static void main(String[] args) {

        //Tipo de Dato "Pelicula", creamos una instancia del mismo, creando un espacio en memoria para ese objeto..
        Pelicula miPelicula = new Pelicula();

        miPelicula.name = "Doom";
        miPelicula.fechaLanzamiento = 2005;
        miPelicula.duracionEnMinutos = 105;
        miPelicula.incluidoEnElPlan = true;

        miPelicula.muestraFichaTecnica();
        miPelicula.evalua(10);
        miPelicula.evalua(12);
        System.out.println("Media = " + miPelicula.calculaMedia());



        Pelicula otraPelicula = new Pelicula();

        otraPelicula.name = "Matrix";
        otraPelicula.muestraFichaTecnica();

        //System.out.println("Otra Pelicula: " + otraPelicula.name);

    }
}
