
public class DemoRaceConditions {
    public static void main(String[] args) throws InterruptedException {

        Counter c = new Counter();

        Runnable objC = () -> {
            for (int i = 0; i < 10000; i++) {
                // System.out.println("hi A");
                // try {
                //     Thread.sleep(10);
                // } catch (Exception e) {
                //     System.out.println(e);
                // }
                c.increment();
            }
        };
        Runnable objD = () -> {
            for (int i = 0; i < 10000; i++) {
                // System.out.println("hi A");
                // try {
                //     Thread.sleep(10);
                // } catch (Exception e) {
                //     System.out.println(e);
                // }
                c.increment();
            }
        };

        Thread t1 = new Thread(objC);
        Thread t2 = new Thread(objD);
        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println(c.count);

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

class Counter {
    int count;

    public synchronized void increment() {
        count++;
    }
}