import java.util.Scanner;

public class Desafío1_Banco {
    public static void cliente(String name, String account, double balance) {
        System.out.println("\t\tDATOS CLIENTE");
        System.out.printf("Nombre del cliente: " + name + "\nTipo de cuenta: " + account + "\nSaldo Disponible: $" + balance);
    }

    public static void separador() {
        System.out.println("\n\t ***************************************\n ");
    }

    public static void menu() {
        System.out.println("\tMENU PRINCIPAL\nSeleccione una opción => \n1 - Consultar Saldo\n2 - Retirar Saldo\n3 - Depositar Saldo\n0 - Salir");
    }

    public static void main(String[] args) {
        separador();
        Scanner scanner = new Scanner(System.in);
        String nameClient = "Arielito Maldonadito";
        String accountType = "Corriente";
        double balance = 2000.0;

        cliente(nameClient, accountType, balance);

        int option = 10;

        while (option != 0) {
            separador();
            menu();
            option = scanner.nextInt();
            separador();
            switch (option) {
                case 1:
                    System.out.println("\t\tCONSULTA SALDO");
                    System.out.println("\tSaldo disponible: $" + balance);
                    break;
                case 2:
                    System.out.printf("\t\tRETIRAR SALDO\nIngrese Monto: ");
                    int retire = scanner.nextInt();
                    if (retire > balance) {
                        System.out.println("\tSaldo insuficiente");
                    } else {
                        balance = balance - retire;
                    }
                    System.out.println("\tSaldo disponible: $" + balance);
                    break;
                case 3:
                    System.out.printf("\t\tDEPOSITAR SALDO\nIngrese Monto: ");
                    int deposite = scanner.nextInt();
                    balance = balance + deposite;
                    System.out.println("\tSaldo disponible: $" + balance);
                    break;
                case 0:
                    cliente(nameClient, accountType, balance);
                    System.out.println("\n\n\t\tSALIENDO...");
                    break;
                default:
                    System.out.println("\t\tOPCIÓN INVÁLIDA");
                    break;
            }
        }


    }
}
