import java.util.ArrayList;
import java.util.List;
public class list {
  public static void main(String [] args){
      List list = new ArrayList();
      list.add(10);
      list.add("jai Hanuman");
      list.add(10.0d);
      list.add(true);
      System.out.println(list);
      list.remove(0);
      System.out.println(list.size());
      System.out.println(list.contains(true));
      System.out.println(list.isEmpty());
      System.out.println(list.get(0));
      List list1=new ArrayList();
      list1.add("Any name");
      list1.add(420);
      list1.add(false);
      list1.addAll(list1);
      System.out.println(list.size());
      System.out.println(list.containsAll(list1));
      list.removeAll(list1);
      System.out.println(list.containsAll(list1));
  }
}
