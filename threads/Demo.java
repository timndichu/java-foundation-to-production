
public class Demo {
    public static void main(String[] args) {
        A objA = new A();
        B objB = new B();
        // objB.setPriority(10);
        // objA.setPriority(1);
        
        objA.start();
        try {
                 Thread.sleep(5);
            } catch (Exception e) {
                System.out.println(e);
            }
        objB.start();
    }
}

class A extends Thread {
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

class B extends Thread {
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