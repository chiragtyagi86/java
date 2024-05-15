import java.io.*;
public class Demo6 {
    public static void main(String[] args) {
        byte[] array = {10,20,30,40};
        try{
            ByteArrayInputStream input  =  new ByteArrayInputStream(array);
            System.out.println("The Bytes read from the input");
            for(int i=0; i<array.length; i++){
                int data = input.read();
                System.out.print(data +",");
            }
            input.close();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
