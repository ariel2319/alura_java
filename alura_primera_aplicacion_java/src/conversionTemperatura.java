import java.util.Scanner;

public class conversionTemperatura {
    public static void main(String[] args) {
        int i = 1;
        while (i == 1) {
            Scanner entrada = new Scanner(System.in);

            System.out.println("Convertidor de Temperaturas\n\tF - Celsius => Fahrenheit\n\tC - Fahrenheit => Celsius");
            String opcion = entrada.next();

            System.out.printf("Ingresá la temperatura => ");
            float temperatura = entrada.nextFloat();

            if (opcion.equalsIgnoreCase("f")) {
                float conversion = (temperatura * 9 / 5) + 32;
                System.out.println(String.format("%.2f ° Fahrenheit", conversion));
            } else if (opcion.equalsIgnoreCase("c")) {
                float conversion = (temperatura - 32) * 5 / 9;
                System.out.println(String.format("%.2f ° Celsius", conversion));
            }
        }
    }
}
