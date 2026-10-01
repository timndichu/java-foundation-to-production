
public class DemoRunnable {
    public static void main(String[] args) {
        Runnable objC = new C();
        Runnable objD = new D();

        Thread t1 = new Thread(objC);
        Thread t2 = new Thread(objD);
        t1.start();
        t2.start();
      
    }
}

class C implements Runnable {
    public void run() {
        for (int i = 0; i < 50; i++) {
            System.out.println("hi A");
            try {
                Thread.sleep(10);
            } catch (Exception e) {
                System.out.println(e);
            }

        }

    }
}

class D implements Runnable {
    public void run() {
        for (int i = 0; i < 50; i++) {
            System.out.println("hello B");
            try {
                 Thread.sleep(10);
            } catch (Exception e) {
                System.out.println(e);
            }
        }

    }
}