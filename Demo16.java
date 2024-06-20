// created by Chirag Tyagi
// PriorityQueue collection
import java.util.*;
public class Demo16 {
 public static void main(String[] args) {
    PriorityQueue <String> queue = new PriorityQueue<>();
    queue.add("Chirag");
    queue.add("Vijay");
    queue.add("Dhruv");
    queue.add("Darshil");
    System.out.println("Head Elements By peek() : " + queue.peek());
    System.out.println("Head Elements By element(): " + queue.element());
    System.out.println("Iterating the queue...");
    Iterator<String> itr = queue.iterator();
    while (itr.hasNext()) {
        System.out.println(itr.next());
    }
    queue.remove();
    queue.poll();
    System.out.println("After removing the 2 elements from the queue...");

    Iterator<String> itr2 = queue.iterator();
    while (itr2.hasNext()) {
        System.out.println(itr2.next());
    }
 }   

}
