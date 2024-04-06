import java.util.Scanner;

public class Lectura {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Escribe el nombre de tu película favorita");
        String pelicula = teclado.nextLine();
        System.out.println("Ahora escribe la fecha de lanzamiento");
        int fechaDeLanzamiento = teclado.nextInt();
        System.out.println("Por último dinos que nota le das a esta Pelicula");
        double nota = teclado.nextDouble();

        System.out.println("Película Favorita: " + pelicula + "\nFecha de lanzamiento: " + fechaDeLanzamiento + "\nNota: " + nota + "\n");
    }
}
