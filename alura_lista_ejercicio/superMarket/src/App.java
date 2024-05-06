import java.util.ArrayList;
import java.util.Scanner;

import com.alura.superMarket.modelos.Producto;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("\n\n\t************************");
        System.out.println("\tSuper Market El Hijolín!\n\n");

        Scanner entrada = new Scanner(System.in);
        System.out.printf("Nombre del cliente: ");
        String nombre = entrada.nextLine();
        System.out.printf("Saldo de Tarjeta: $");
        int saldoTarjeta = entrada.nextInt();
        System.out.println("Comenzemos con las compras => ");

        ArrayList<Producto> carrito = new ArrayList<>();

        int again = 1;
        do {

            System.out.printf("PRODUCTO = ");
            String producto = entrada.next();
            System.out.printf("PRECIO = $");
            int precio = entrada.nextInt();

            var elemento = new Producto(producto, precio);
            carrito.add(elemento);

            System.out.println("CARRITO: ");
            for (Object cosita : carrito) {
                System.out.println(cosita);
            }
            // System.out.printf("Continuar? 1/0 => ");
            // again = entrada.nextInt();
        } while (again == 1);

    }
}
