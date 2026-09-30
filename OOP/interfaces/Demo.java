
public class Demo {
    public static void main(String[] args) {
        A obj;
        obj = new B();
        obj.config();
        obj.show();

        // we can access the variable in this way for classes
        System.out.println(A.age);
    }
}

// every method within interfaces has public abstract keywords
// e.g public abstract void show(); -> same as void show();
interface A {

    //final and static variables
    int age = 55;
    String area = "Nairbi";

    void show();

    void config();
}

class B implements A {
    public void show() {
        System.out.println("in show B");
    }

    public void config() {
         System.out.println("in CONFIG B");
    }
}

interface C {
    int age = 34;
    String model = "iPhone";

    void purchasePhone();
}

interface X {
    int length = 4;

    void sellPhone();
} 

interface Y extends X {
    
}

class D implements C,Y {
    public void purchasePhone() {

    }

    public void sellPhone() {

    }
}