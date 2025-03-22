package umg.edu.progra.listas;

/**
 *
 * @author Walter Cordova
 */
public class Nodo {

    int dato;
    Nodo enlace;
    // Nodo enlaceSiguiente;
    // Nodo enlaceAnterior;

    @Override
    public String toString() {
        return this.dato + "=>" +  this.enlace;
    }

    public Nodo(int x) {
        this.dato = x;
        this.enlace = null;
    }

    public Nodo(int x, Nodo n) {
        this.dato = x;
        this.enlace = n;
    }

    public int leerDato() {
        return this.dato;
    }

    public Nodo siguiente() {
        return this.enlace;
    }
}
