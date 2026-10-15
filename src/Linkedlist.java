
import java.util.LinkedList;

public class Linkedlist {
    public static void main(String[] args) {

        LinkedList list = new LinkedList();

        list.add(10);
        list.add("jai balayya");
        list.add(10.0d);
        list.add(true);

        System.out.println(list);

        list.remove(0);

        System.out.println(list.size());
        System.out.println(list.contains(true));
        System.out.println(list.isEmpty());
        System.out.println(list.get(0));
    }
}
