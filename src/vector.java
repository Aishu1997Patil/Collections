import java.util.Vector;
import java.util.List;
public class vector {
    public static void main(String[] args){
        Vector vector=new Vector();
        vector.add(10);
        vector.add("jai hanuman");
        vector.add(10.0d);
        vector.add(true);
        System.out.println(vector);
        vector.remove(0);
        System.out.println(vector.size());
        System.out.println(vector.contains(true));
        System.out.println(vector.isEmpty());
        System.out.println(vector.get(0));
    }

}
