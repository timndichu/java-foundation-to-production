public class Demo {
    public static void main(String[] args) {
        //we can use an anonymous inner class to be able to call an abstract class only once
        A obj = new A() {
            public void show() {
                System.out.println("show face");
            }
            public void timeWillTell() {
                 System.out.println("the future face");
            }
        };
        obj.show();
        obj.timeWillTell();

    }
}


abstract class A {
    public void show() {
        System.out.println("show robot");
    }

    abstract void timeWillTell();
}