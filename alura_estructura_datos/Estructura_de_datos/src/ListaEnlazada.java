public class ListaEnlazada {

    private Celula primera = null;
    private Celula ultima = null;
    private int totalDeElementos = 0;

    public void adicionarEnElComienzo(Object elemento) {
        Celula nueva = new Celula(elemento, primera);
        this.primera = nueva;

        if (this.totalDeElementos == 0) {
            this.ultima = this.primera;
        }

        this.totalDeElementos++;
    }

    public void adicionarAlFinal(Object elemento) {
        var nueva = new Celula(elemento, null);
        this.ultima.setProximo(nueva);
        this.ultima = nueva;
        this.totalDeElementos++;
    }

    public void adicionaEnCualquierLugar(int posicion, Object elemento) {
        if (posicion == 0) {
            adicionarEnElComienzo(elemento);
        } else if (posicion == this.totalDeElementos) {
            adicionarAlFinal(elemento);
        } else {
            Celula anterior = hallarCelula(posicion - 1);
            Celula nueva = new Celula(elemento, anterior.getProximo());
            anterior.setProximo(nueva);
            this.totalDeElementos++;
        }
    }

    private boolean posicionOcupada(int posicion) {
        return posicion >= 0 && posicion < this.totalDeElementos;
    }

    private Celula hallarCelula(int posicion) {
        if (!posicionOcupada(posicion)) {
            throw new IllegalArgumentException("Posición Inexistente");
        }
        Celula actual = primera;

        for (int i = 0; i < posicion; i++) {
            actual = actual.getProximo();
        }

        return actual;
    }

    public Object pegar(int posicion) {
        return this.hallarCelula(posicion).getElemento();
    }

    public void removerDelComienzo() {

        if (this.totalDeElementos == 0) {
            throw new IllegalArgumentException("Lista Vacía..");
        }

        this.primera = this.primera.getProximo();
        this.totalDeElementos--;

        if (this.totalDeElementos == 0){
            this.ultima = null;
        }

    }

    public int tamanio() {
        return this.totalDeElementos;
    }

    public boolean contiene(Object o) {
        return false;
    }

    @Override
    public String toString() {
        // sin elementos, devuelve solo los corchetes..
        if (this.totalDeElementos == 0) {
            return "[]";
        }

        Celula actual = primera;

        // ? construcción del STRING que quiero imprimir...le doy el formato necesario..
        StringBuilder builder = new StringBuilder("[");

        for (int i = 0; i < totalDeElementos; i++) {
            builder.append(actual.getElemento());

            if (i != totalDeElementos - 1) {
                builder.append(",");
            }

            actual = actual.getProximo();
        }

        builder.append("]");

        return builder.toString();
    }
}
