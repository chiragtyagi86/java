// created by Chirag Tyagi
// Stack collection

import java.util.*;

public class Demo15 {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("Chirag");
        stack.push("Vijay");
        stack.push("Dhruv");
        stack.push("Darshil");
        Iterator<String> itr = stack.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
