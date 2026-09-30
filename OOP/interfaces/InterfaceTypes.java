
public class InterfaceTypes {
    public static void main(String[] args) {
        // A obj = new A() {
        // public void show() {}
        // };
        A obj = () -> {
            System.out.println("Lambda expression");
        };
        obj.show();

        C obj2 = (a) -> System.out.println("Lambda expression " + a);

        obj2.show(3);

        // Add calc = new Add() {
        // public int add(int i, int j) {
        // return i + j;
        // }
        // };

        // Add calc = (i, j) -> {
        // return i + j;
        // };

        Add calc = (i, j) -> i + j;

        int sum = calc.add(3, 60);
        System.out.println("sum is " + sum);
    }
}

@FunctionalInterface
interface A {
    void show();
    // void run();
}

// Normal interface
interface B {
    void show();

    void run();
}

@FunctionalInterface
interface C {
    void show(int a);
    // void run();
}

@FunctionalInterface
interface Add {
    int add(int i, int j);
    // void run();
}