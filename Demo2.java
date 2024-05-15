

class MyThread1 extends Thread{
    public void run(){
        for(int i=0; i<5; i++){

            System.out.println("Hello From Thread 1");
            try{
                Thread.sleep(1000);
            }
            catch (Exception e){}
        }
    }
}
class MyThread2 extends Thread{
    public void run(){
        for(int i = 0; i<5; i++){

            System.out.println("Hello From Thread 2");
            
            try{
                Thread.sleep(1000);
            }
            catch (Exception e){}
        }
    }
}
/**
 * Demo2
 */
 class Demo2 {
    public static void main(String[] args) {
        MyThread1 obj1 = new MyThread1();
        MyThread2 obj2 = new MyThread2();
        
        obj1.start();
        obj2.start();
    }

    
}
