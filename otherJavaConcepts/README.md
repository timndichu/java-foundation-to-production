# Other Java Concepts

# Optional Class
Optional class is used to represent a value that may or may not be present. It provides a clear way to handle missing values instead of relying directly on null.

Provides methods to check, retrieve, transform, or provide alternatives for a value.
Encourages explicit handling of potentially absent values

Using null to represent a missing value requires explicit null checks. If these checks are missed, accessing the value can result in a NullPointerException. Optional makes the possibility of an absent value explicit and provides methods for handling both present and empty cases.

Example: Program Without the Optional Class
```java
public class OptionalDemo {
    public static void main(String[] args)
    {
        String[] words = new String[10];
        String word = words[5].toLowerCase();
        System.out.print(word);
    }
}

//Output: Exception in thread "main" java.lang.NullPointerException
```


With Optional class:
```java
 Optional<String> name = list.stream().filter(str-> str.contains("x")).findFirst();
 ```

# MethodReference
Java Method References are a shorthand way to refer to an existing method without invoking it. They were introduced in Java 8 to make lambda expressions shorter, cleaner, and more readable. Method references use the double colon `(::)` operator and are mainly used with functional interfaces.

Introduced in Java 8 as an alternative to lambda expressions
Improve code readability and reduce boilerplate
Used when a lambda expression simply forwards its parameters to a single existing method (pass-through call).

Example 1:

```java
public class Geeks{
    
  	// Method
    public static void print(String s){
        System.out.println(s);
    }

    public static void main(String[] args){
        
        String[] names = {"Geek1", "Geek2", "Geek3"};

        // Using method reference to print each name
        Arrays.stream(names).forEach(Geeks::print);
    }
}

```

Example 2 :

```java
class GFG{
    
    public static void main(String[] args){

        List<String> names = Arrays.asList("java", "spring", "microservice");

        names.stream()
             .map(String::toUpperCase)
             .forEach(System.out::println);
    }
}

```

# Constructor Reference

A constructor reference in Java is a specialized type of method reference introduced in Java 8 that allows you to point to a class constructor without instantly executing it. It acts as a clean, highly readable shorthand for a lambda expression that simply instantiates an object.

**Syntax**
The basic syntax uses the class name combined with the ``::`` delimiter and the new keyword:
```java
ClassName::new
```

```java
 List<String> names = Arrays.asList("Rob", "John", "Greg");
         List<Student> students = new ArrayList<>();

        //students = names.stream().map(name -> new Student(name)).toList();
        students = names.stream().map(Student::new).toList();
```
**NOTE**

name -> new Student(name, 3)   // lambda: you control the arguments
Student::new                   // constructor reference: arguments come from the function input 

# LVTI - Local Variable Type Inference

```java
int a = 9;
var b = 8;
int c;
var d; /// will throw exception -> var needs to be initialized
```

# Sealed Class

If you are extending a sealed class, then that class has to be either final or non-sealed

final: no other class can extend us
non-sealed: other classes can extend us

```java
sealed class A permits B,C {

}

non-sealed class B extends A {

}

final class C extends A {

}

/// CLASS D will throw error as it is not permitted to extend A
class D extends A {

}

```

# Sealed Interface

For interface, we only have sealed and non-sealed as options