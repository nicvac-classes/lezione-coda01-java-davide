//Implementare qui la classe TestCoda, per l'esercizio del gioco della patata bollente
public class Coda<T> {
    private Nodo<T> head;
    private Nodo<T> tail;

    public Coda() {
        this.head = null;
        this.tail = null;
    }
}