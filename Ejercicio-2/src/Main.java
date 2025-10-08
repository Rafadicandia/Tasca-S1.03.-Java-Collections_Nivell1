import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        List<Integer> list2 = new ArrayList<>();

        ListIterator<Integer> it1 = list.listIterator(list.size());


// Primero recorremos la primera tabla
        while (it1.hasPrevious()) {
            Integer i=it1.previous();
            list2.add(i);
        }

        ListIterator<Integer> it2 = list2.listIterator();

        while (it2.hasNext()) {
        System.out.println(it2.next());
        }


    }
}

