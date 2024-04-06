public class Decisiones {
    public static void main(String[] args) {
        int fechaDeLanzamiento = 1999;
        boolean incluidoEnElPlan = false;
        double notaDePelicula = 8.2;
        String plan = "Plus";

        if (fechaDeLanzamiento > 2022) {
            System.out.println("Películas más populares");
        } else {
            System.out.println("Película retro que vale la pena ver :)");
        }

        if (incluidoEnElPlan || plan.equalsIgnoreCase("plus")) {
            System.out.println("Disfrute de su película");
        } else {
            System.out.println("Esta película no está en el plan");
        }
    }
}
