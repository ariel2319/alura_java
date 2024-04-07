public class Principal {
    public static void main(String[] args) {

        //Tipo de Dato "Pelicula", creamos una instancia del mismo, creando un espacio en memoria para ese objeto..
        Pelicula miPelicula = new Pelicula();

        miPelicula.name = "Doom";
        miPelicula.fechaLanzamiento = 2005;
        miPelicula.duracionEnMinutos = 105;
        miPelicula.incluidoEnElPlan = true;

        System.out.println("Mi Pelicula: " + miPelicula.name + ", fue lanzada en : " + miPelicula.fechaLanzamiento + ", con una duracion de :" + miPelicula.duracionEnMinutos + "min");



        Pelicula otraPelicula = new Pelicula();

        otraPelicula.name = "Matrix";
        System.out.println("Otra Pelicula: " + otraPelicula.name);

    }
}
