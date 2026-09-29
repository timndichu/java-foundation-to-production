package Inheritance;

import Inheritance.calcModel.AdvancedCalc;
import Inheritance.calcModel.Calculator;

public class Inheritance {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int result = calculator.add(2, 5);
        int result2 = calculator.sub(7, 3);
        System.out.println(result);
        System.out.println(result2);

        AdvancedCalc advcalc = new AdvancedCalc();
        int multiplicationRes = advcalc.multiplication(3, 2);
        int divisionRes = advcalc.multiplication(6, 2);
        int addRes = advcalc.add(2, 4);
        int subRes = advcalc.sub(9, 7);

        // B obj = new B();
        // B obj1 = new B(6);

        B showObj = new B();
        showObj.show();
    }
}

class A {

    public A() {
        System.out.println("In A constructor");
    }

    public A(int n) {
        System.out.println("In int A constructor "+ n);
    }

    public void show() {
        System.out.println("In show A fnc");
    }

}

class B extends A {
    public B() {
        System.out.println("In B constructor");
    }

    public B(int n) {
        //this() will call the constructor for the current class B()
        this();
        System.out.println("In int B constructor");
    }

    public void show() {
        super.show();
        System.out.println("In show B fnc");
    }
}