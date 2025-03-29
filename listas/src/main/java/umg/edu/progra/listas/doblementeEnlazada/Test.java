package umg.edu.progra.listas.doblementeEnlazada;

public class Test {

    public static void main(String[] args) {
        DoblementeEnlazada doblementeEnlazada = new DoblementeEnlazada();
        doblementeEnlazada.insertAtBeginning(0);
        doblementeEnlazada.insertAtBeginning(1);
        doblementeEnlazada.insertAtBeginning(2);
        doblementeEnlazada.insertAtBeginning(3);
        doblementeEnlazada.insertAtBeginning(4);
        doblementeEnlazada.insertAtBeginning(5);

        doblementeEnlazada.displayForward(); //mostrar adelante
        System.out.println("");
        doblementeEnlazada.displayBackward(); //mostra hacia atrás

        // contar Nodos
        System.out.println("El número de nodos en la lista:  " + doblementeEnlazada.contarNodos());

        System.out.println("");
        //llamar método insertar después de un valor especifico
        doblementeEnlazada.insertarDespues(5, 6);
        //nuevo nodo insertado 
        System.out.println("");
        doblementeEnlazada.displayBackward(); //mostra hacia atrás

        //Método 3
        DoblementeEnlazada lista = new DoblementeEnlazada();
        lista.insertAtEnd(1);
        lista.insertAtEnd(2);
        lista.insertAtEnd(3);
        lista.insertAtEnd(4);
        lista.insertAtEnd(5);
        lista.insertAtEnd(6);
        
        System.out.println("Lista original:");
        lista.displayForward();

        System.out.println("Lista revertida:");
        lista.inversa();
        lista.displayForward();
    }

}
