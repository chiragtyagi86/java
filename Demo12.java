
//  created by Chirag Tyagi
//  Array list program
import java.util.*;

class Demo12 {
    public static void main(String args[]) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("Chirag");
        list.add("Vijay");
        list.add("Dhruv");
        list.add("Darshil");
        Iterator<String> itr = list.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}