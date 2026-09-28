# Object Oriented Programming

Object - the properties and behaviour that describes an item
Class - blueprint to create the object

Who creates the object? - The JVM

## How to design the class

The class will basically have the properties (variables) and the behaviour (methods)


## Method overloading

```java
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

```