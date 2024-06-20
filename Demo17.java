
/**
    cretad by Chirag Tyagi
    HashSert collection
 */
import java.util.*;

public class Demo17 {
    public static void main(String args[]) {

        HashSet<String> set = new HashSet<String>();
                set.add("Chirag");
                set.add("Vijay");
                set.add("Dhruv");
                set.add("Darshil");
                set.add("Chirag");

        Iterator<String> itr = set.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}