// created by Chirag Tyagi
// LinkList Collections
import java.util.*;

public class Demo13 {
    public static void main(String args[]) {
        LinkedList<String> al = new LinkedList<String>();
        al.add("Chirag");
        al.add("Hemo");
        al.add("Anjuli");
        al.add("monica");
        Iterator<String> itr = al.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}