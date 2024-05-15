

class Sender{
    public void send(String msg){
        System.out.println("Sending" + msg);
        try{
            Thread.sleep(1000);
        }
        catch(Exception e) {}
        System.out.println(msg + "sem");
    }
}
class T1 extends Thread {
    private String msg;
    Sender sd;
    T1(String m, Sender obj) {
        msg = m;
        sd = obj;
    }
    public void run() {
        synchronized(sd)
        {
            sd.send(msg);
        }

        
    }
    {
        
    }
}
/**
 * Demo3
 */
public class Demo3 {

    public static void main(String[] args) {
        Sender st = new Sender();
        T1 mp = new T1("Hello", st);
        T1 np = new T1("Bye", st);
        mp.start();
        np.start();
    
    }
}