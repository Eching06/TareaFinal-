package Automovil;

public class Nodo {

    ObAuto A = new ObAuto();
    private Nodo anterior;
    private Nodo siguiente;
    private Nodo anterior2;
    private Nodo siguiente2;

    public Nodo(ObAuto A) {
        this.A = A;
        this.anterior = anterior;
        this.siguiente = siguiente;
        this.anterior = anterior2;
        this.siguiente = siguiente2;
    }

    public ObAuto getA() {
        return A;
    }

    public void setA(ObAuto A) {
        this.A = A;
    }

    public Nodo getAnterior() {
        return anterior;
    }

    public void setAnterior(Nodo anterior) {
        this.anterior = anterior;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }

    public Nodo getAnterior2() {
        return anterior2;
    }

    public void setAnterior2(Nodo anterior2) {
        this.anterior2 = anterior2;
    }

    public Nodo getSiguiente2() {
        return siguiente2;
    }

    public void setSiguiente2(Nodo siguiente2) {
        this.siguiente2 = siguiente2;
    }

}
