
/*
 * Created By Chirag Tyagi
 * Date: May 20
 * Topic: Map collection
 */
import java.util.*;

public class Demo18 {

        public static void main(String[] args) {
                Map<String, String> data = new HashMap<String, String>();
                data.put("Name:", " Chirag Tyagi");
                data.put("Age:", " 20");
                data.put("Course:", " B.tech");
                data.put("Branch:", " CSE");
                data.put("College:", " ABESIT");
                data.put("Address:", " Khatauli UP 251201");

                // Display the Data

                for (Map.Entry<String, String> entry : data.entrySet()) {
                        System.out.println(entry.getKey() + entry.getValue());
                }

        }
}