/*Crea y rellena un List<Integer>.
Crea un segundo List<Integer> e inserta en la segunda lista
los elementos de la primera en orden inverso.
Emplea los objetos ListIterator para leer los elementos de
la primera lista e insertarlos en la segunda.*/

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
        List<Integer> lista1 = new ArrayList<>();

        lista1.add(1);
        lista1.add(2);
        lista1.add(3);
        lista1.add(4);

        List<Integer> lista2 = new ArrayList<>();

        ListIterator<Integer> it1 = lista1.listIterator(lista1.size());


// Primero recorremos la primera tabla
        while (it1.hasPrevious()) {
            Integer i=it1.previous();
            lista2.add(i);
        }

        ListIterator<Integer> it2 = lista2.listIterator();

        while (it2.hasNext()) {
        System.out.println(it2.next());
        }


    }
}

