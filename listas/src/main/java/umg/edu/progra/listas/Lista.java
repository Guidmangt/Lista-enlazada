package umg.edu.progra.listas;

/**
 *
 * @author Walter Cordova
 */
public class Lista {

    private Nodo primero;

    @Override
    public String toString() {
        return "=>" + primero;
    }

    /**
     * Constructor para inicializar una lista
     */
    public Lista() {
        primero = null;
    }

    /**
     * Devuelve el nodo inicial
     *
     * @return
     */
    public Nodo leerPrimero() {
        return primero;
    }

    /**
     * Inserta valores a la lista
     *
     * @param entrada
     */
    public void insertarCabezaLista(int entrada) {
        Nodo nuevo;
        nuevo = new Nodo(entrada);
        nuevo.enlace = primero;
        primero = nuevo;

    }

    /**
     * inserta un elemento a partir de anterior
     *
     * @param anterior
     * @param entrada
     */
    public void insertarLista(Nodo anterior, int entrada) {
        Nodo nuevo;
        nuevo = new Nodo(entrada);
        nuevo.enlace = anterior.enlace;
        anterior.enlace = nuevo;

    }

    /**
     * elimina el elemento entrada
     *
     * @param entrada
     */
    public void eliminar(int entrada) {
        Nodo actual, anterior;
        boolean encontrado;
        actual = primero;
        anterior = null;
        encontrado = false;
        // Bucle de búsqueda
        while ((actual != null) && !(actual.dato == entrada)) {
            if (!(actual.dato == entrada)) {
                anterior = actual;
                actual = actual.enlace;
            }
        }
        if (actual != null) {
            // Se distingue entre que el nodo sea el cabecera
            // o del resto de la lista
            if (actual == primero) {
                primero = actual.enlace;
            } else {
                anterior.enlace = actual.enlace;
            }
            actual = null;
        }
    }

    /**
     * busca el elemento destino
     *
     * @param destino
     * @return
     */
    public Nodo buscarLista(int destino) {
        Nodo indice;
        for (indice = primero; indice != null; indice = indice.enlace) {
            if (indice.dato == destino) {
                return indice;
            }
        }
        return null;
    }

    /**
     * recorre la lista y muestra cada dato
     */
    public void visualizar() {
        Nodo n;
        n = primero;
        while (n != null) {
            System.out.print(n.dato + " ");
            n = n.enlace;
        }
    }

    /**
     * Método para unir dos listas enlazadas
     */
    public void unirLista(Lista otraLista) {
        if (primero == null) {
            primero = otraLista.leerPrimero();
        } else {
            Nodo actual = primero;
            while (actual.enlace != null) { // Avanzamos hasta el último nodo
                actual = actual.enlace;
            }
            actual.enlace = otraLista.leerPrimero(); // Conectamos la segunda lista
        }
    }

//Método para separar números pares e impares en dos listas diferentes
    public void separarParesImpares(Lista pares, Lista impares) {
        Nodo actual = primero;

        while (actual != null) {
            if (actual.dato % 2 == 0) {
                pares.insertarCabezaLista(actual.dato); // Agregar a la lista de pares
            } else {
                impares.insertarCabezaLista(actual.dato); // Agregar a la lista de impares
            }
            actual = actual.enlace; // Avanzar al siguiente nodo
        }
    }

    /**
     * Crear los metodos que se solicitan * /** 1 - Método para invertir la
     * lista enlazada
     */
    public void invertir() {
        Nodo anterior = null;
        Nodo actual = primero;
        Nodo siguiente;

        while (actual != null) {
            siguiente = actual.enlace; // Guardar el siguiente nodo
            actual.enlace = anterior;  // Invertir el enlace
            anterior = actual;         // Mover anterior y actual un paso adelante
            actual = siguiente;
        }

        primero = anterior; // Actualizar la cabeza de la lista
    }

    /**
     * 2 - Método para obtener el elemento en la posición n desde el final
     */
    public int obtenerDesdeFinal(int n) {
        int tamaño = 0;
        Nodo actual = primero;

        // Obtener el tamaño de la lista
        while (actual != null) {
            tamaño++;
            actual = actual.enlace;
        }

        // Verificar si n es válido
        if (n > tamaño || n <= 0) {
            System.out.print("\nPosición fuera de rango " + n);
        }

        // Obtener la posición desde el inicio
        int posicionDesdeInicio = tamaño - n;
        actual = primero;
        for (int i = 0; i < posicionDesdeInicio; i++) {
            actual = actual.enlace;
        }

        return actual.dato;
    }

    /**
     * 3 - Método para eliminar duplicados en una lista enlazada
     */
    public void eliminarDuplicados() {
        Nodo actual = primero;

        while (actual != null) {
            Nodo iterador = actual;
            while (iterador.enlace != null) {
                if (iterador.enlace.dato == actual.dato) {
                    iterador.enlace = iterador.enlace.enlace; // Eliminar duplicado
                } else {
                    iterador = iterador.enlace;
                }
            }
            actual = actual.enlace;
        }
    }

    /**
     * 4 - Método para obtener el tamaño de la lista enlazada
     */
    public int obtenerTamaño() {
        int tamaño = 0;
        Nodo actual = primero;
        while (actual != null) {
            tamaño++;
            actual = actual.enlace;
        }
        return tamaño;
    }
}
