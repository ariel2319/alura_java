import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
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
        System.out.println("\n\tComenzemos con las compras => \n");

        ArrayList<Producto> carrito = new ArrayList<>();

        int again = 1;
        do {

            System.out.printf("PRODUCTO = ");
            String producto = entrada.next();
            System.out.printf("PRECIO = $");
            int precio = entrada.nextInt();

            saldoTarjeta = saldoTarjeta - precio;
            if (saldoTarjeta > 0) {
                var elemento = new Producto(producto, precio);
                carrito.add(elemento);
            } else if (saldoTarjeta == 0) {
                var elemento = new Producto(producto, precio);
                carrito.add(elemento);
                System.out.println("No tienes saldo para seguir comprando.\n");
                again = 0;
            } else {
                System.out.println("Saldo insuficiente para comprar este producto.\n\n");
                saldoTarjeta = saldoTarjeta + precio;
                again = 0;
            }

            if (again == 1) {
                System.out.printf("\tContinuar? 1/0 => ");
                again = entrada.nextInt();
            }
        } while (again == 1);

        System.out.println("\n\n\tCARRITO de " + nombre + " =");

        // ! TODO => ordenar el carrito por valor de las compras

        //System.out.println("CaRRITO ?> " + carrito);
        carrito.sort(Comparator.comparing(Producto::getPrecio));

        //System.out.println("CARITOOTOEOOTEOTOEOTOE : ");
        for (Object cosita : carrito) {
            System.out.println(cosita);
        }
        System.out.println("\n\tSaldo = $" + saldoTarjeta + "\n\n\t************************");

        entrada.close();
    }
}
