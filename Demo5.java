import java.io.*;
/**
 * Demo5
 */
public class Demo5 {

    public static void main(String[] args) {
        char[] array = {'H', 'e', 'l', 'l', 'o'};
        try{
            CharArrayReader reader = new CharArrayReader(array);
            System.out.println("The Char read from the reader");
            int charRead;
            while ((charRead = reader.read()) != -1) {
                System.out.println((char) charRead + ",");
            }
            reader.close();

        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
}