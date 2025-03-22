package umg.edu.progra.listas;

/**
 *
 * @author Walter Cordova
 */
public class Principal {

    public static void main(String[] args) {

        Lista lista = new Lista();
        lista.insertarCabezaLista(1);
        lista.insertarCabezaLista(2);
        lista.insertarCabezaLista(3);
        lista.insertarCabezaLista(4);
        lista.insertarCabezaLista(5);
        lista.insertarCabezaLista(6);

        lista.visualizar();

        System.out.println("\n");
        System.out.println("primero: " + lista.leerPrimero());

        lista.eliminar(3);
        System.out.println("lista: " + lista);

        System.out.println("\n");

        Nodo dato = lista.buscarLista(4);
        System.out.println("dato: " + dato);

        lista.insertarLista(dato, 10);
        System.out.println("lista " + lista);

        dato = lista.buscarLista(5);
        System.out.println("dato " + dato);
        lista.insertarLista(dato, 600);

        System.out.println("lista " + lista);

        lista.visualizar();

        /**
         * Resolver lo que se solicita a continuacion Ejercicio 1: Ordernar la
         * lista de forma ascendente Ejercicio 2: Unir dos listas enlazadas
         * Ejercicio 3: Separa numeros pares e impares en dos listas enlazadas
         * diferentes
         */
        System.out.println("");
        // ejercicio 1
        Lista ascendente = new Lista();
        System.out.println("\nEjercicio 1 - ascendente: ");
        ascendente.insertarCabezaLista(0);
        ascendente.insertarCabezaLista(1);
        ascendente.insertarCabezaLista(2);
        ascendente.insertarCabezaLista(3);
        ascendente.insertarCabezaLista(4);
        ascendente.insertarCabezaLista(5);
        ascendente.insertarCabezaLista(6);
        ascendente.insertarCabezaLista(7);
        ascendente.insertarCabezaLista(8);
        ascendente.insertarCabezaLista(9);
        ascendente.invertir();
        ascendente.visualizar();

        // ejercicio 2
        ascendente.unirLista(lista);
        System.out.println("\nEjercicio 2 - Lista unida: ");
        ascendente.visualizar();

        // ejercicio 3
        System.out.println("\nEjericicio 3 -  numeros pares e impares");
        Lista numeros = new Lista();
        Lista numPares = new Lista();
        Lista numImpares = new Lista();
        numeros.insertarCabezaLista(1);
        numeros.insertarCabezaLista(2);
        numeros.insertarCabezaLista(3);
        numeros.insertarCabezaLista(4);
        numeros.insertarCabezaLista(5);
        numeros.insertarCabezaLista(6);
        numeros.insertarCabezaLista(7);
        numeros.insertarCabezaLista(8);
        numeros.insertarCabezaLista(9);

        numeros.separarParesImpares(numPares, numImpares);

        // mostrar lista pares
        System.out.println("Lista de pares");
        numPares.visualizar();
        // mostrar lista impares
        System.out.println("\nLista de impares");
        numImpares.visualizar();

    }

}
