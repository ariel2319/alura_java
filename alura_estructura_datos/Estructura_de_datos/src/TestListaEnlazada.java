public class TestListaEnlazada {
    public static void main(String[] args) {

        ListaEnlazada lista = new ListaEnlazada();

        System.out.println(lista);
        lista.adicionarEnElComienzo("perrito");
        System.out.println(lista);
        lista.adicionarEnElComienzo("gatitu");
        System.out.println(lista);
        lista.adicionarEnElComienzo("michu");
        System.out.println(lista);
        lista.adicionarAlFinal("the last?");
        System.out.println(lista);
        lista.adicionaEnCualquierLugar(2, "tomy");
        System.out.println(lista);
        System.out.println(lista.pegar(1));
        System.out.println("Cantidad => " + lista.tamanio());

        lista.removerDelComienzo();
        System.out.println(lista);
        System.out.println("Cantidad => " + lista.tamanio());
    }
}
