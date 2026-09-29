public class OOPConcepts {
    public static void main(String args[]) {
        // calc is a reference variable
        // reference variables are variables we can use to gain access to methods within
        // the class
        int num1 = 3;
        int num2 = 5;
        Calculator calc = new Calculator();

        // we are able to get the add method
        int result = calc.add(num1, num2);
        System.out.println(result);

        Computer myComputer = new Computer();
        myComputer.playMusic();
        String myPen = myComputer.getMeAPen(2);
        System.out.println(myPen);

        Human aHuman2 = new Human();
        Human aHuman = new Human("Hugo Lloris",45);
        String name = aHuman.getName();

        // aHuman.setAge(55);
        int age = aHuman.getAge();
        //  System.out.println("Age is " + age);
        //   System.out.println("Name is "+ name);

          Human.person = "rob";
          Human.getPerson(aHuman);
    }
}

class Calculator {

   

    public int add(int num1, int num2) {
        System.out.println("In add function");
       int result = num1 + num2;
        return result;
    }

    public double add(double num1, int num2) {
        System.out.println("In add function");
        double result = num1 + num2;
        return result;
    }

    public double add(double num1, int num2, int num3) {
        System.out.println("In add function");
        double result = num1 + num2;
        return result;
    }

}

class Computer {

    public void playMusic() {
        System.out.println("Playing music");
    }

    public String getMeAPen(int cost) {
        if (cost >= 10) {
            return "A pen";
        }
        return "nothing";
    }

}

class Human {
    private String name;
    private int age;
    public static String person;

    // constructor
    // to define default values
    // default constructor
    public Human() {
        name = "Thomas";
        age = 34;
    }

    //Parameterized constructor
     public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        // this refers to the current object calling this method
        this.age = age;
    }

    public static void getPerson() {
        System.out.print(person);
        //  System.out.print(name); //error Cannot make a static reference to the non-static field name
    }

    public static void getPerson(Human obj) {
        System.out.print(person);
        //  System.out.print(name); //error Cannot make a static reference to the non-static field name
        
        //However, we can make reference to an object by passing it
        // We can then obtain the values from the object

        System.out.print(obj.name); 
    
    }
}