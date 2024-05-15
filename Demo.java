
class MyThread1 implements Runnable {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello From Thread 1");
            try {
                Thread.sleep(100);
            } catch (Exception e) {
            }
        }
    }
}

class MyThread2 implements Runnable {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello From Thread 2");
            try {
                Thread.sleep(100);
            } catch (Exception e) {
            }
        }
    }
}

/**
 * Demo
 */
class Demo {
    public static void main(String[] args) {
        MyThread1 obj1 = new MyThread1();
        MyThread2 obj2 = new MyThread2();
        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);
        t1.start();
        try {
            t1.join();
        } catch (Exception e) {
        }

        t2.start();
        try {
            t2.join();
        } catch (Exception e) {
        }
    }

}