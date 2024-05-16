public class VectorTeste {
    public static void main(String[] args) {
        Estudiante e1 = new Estudiante("Ariel");
        var e2 = new Estudiante("Pedro");
        var e3 = new Estudiante("Javier");

        Vector lista = new Vector();
        System.out.println(lista.tamanio());
        lista.adicionar(e1);
        lista.adicionar(e2);

        System.out.println(lista);
        System.out.println(lista.tamanio());
        System.out.println("Habemus alumno? " + lista.contener(e3));

        System.out.println("Hay o no hay alumnos? " + lista.pegar(1000));

    }
}
