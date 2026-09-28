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
