package Inheritance.accessModifiers;

public class Demo {
    public static void main(String[] args) {
        A obj = new A();
        int marks = obj.marks;

        B obj2 = new B();
        int marks2 = obj2.marks;

        C obj3 = new C();
        int marks3 = obj3.marks;
    }
}
