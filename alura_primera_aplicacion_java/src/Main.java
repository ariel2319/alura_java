public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to Stream Match");

        System.out.println("Film: Matrix");

        int fechaDeLanzamiento = 1999;
        boolean incluidoEnElPlan = true;
        double notaDePelicula = 8.2;

        double media = (8.2 + 5 + 9) / 3;
        System.out.println(media);

        String sinopsis = """
                Matrix es una mujer de 18 años que se encuentra en una casa de 150 metros cuadrados, fue lanzada en:  
                """ + fechaDeLanzamiento;
        System.out.println(sinopsis);

        //Comparar Strings..

        /*if (sinopsis.equals(sinopsis)) {
            System.out.println("Strings son iguales");
        } else {
            System.out.println("Strings no son iguales");
        }

        if (sinopsis.equalsIgnoreCase(sinopsis)) {
            System.out.println("Strings son iguales");
        } else {
            System.out.println("Strings no son iguales");
        }

        if (sinopsis.compareTo(sinopsis) == 0) {
            System.out.println("Strings son iguales");
        } else {
            System.out.println("Strings no son iguales");
        }

        if (sinopsis.compareToIgnoreCase(sinopsis) == 0) {
            System.out.println("Strings son iguales");
        } else {
            System.out.println("Strings no son iguales");
        }
        */

        //Formateo..
        String nombre = "Maria";
        int edad = 30;
        double valor = 55.9999;
        System.out.println(String.format("Mi nombre es %s, tengo %d años y hoy gasté %.2f dolares", nombre, edad, valor));


        //Convertir..
        int clasificacion = (int) (media / 2);
        System.out.println(clasificacion);
    }
}