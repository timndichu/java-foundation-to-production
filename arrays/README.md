# Arrays in Java

An array is a collection of elements of the same data type stored in contiguous memory locations. It allows multiple values to be stored under a single name and accessed using an index.

## What can it hold?
Java arrays can hold both primitive types (like int, char, boolean, etc.) and objects (like String, Integer, etc.)

When we use arrays of primitive types, the elements are stored in contiguous locations. For non primitive types, references to items are stored at contiguous locations.

## Size
After creating an array, its size is fixed; we can not change it.
The size of an array refers to the number of elements it can hold. To find the size of array java provides a built-in property called length.

```java
class GFG{
    
    public static void main(String[] args){
        
        int[] arr = {2, 4, 8, 12, 16};
        System.out.println("Size of array: " + arr.length);
    }
}
```

## Declaring an Array
In Java, an array is declared by specifying the data type, followed by the array name, and empty square brackets [].

### Syntax:

```java
dataType[] arrayName; //e.g int[] myintArr;
              or
dataType arrayName[]; //e.g int myintArr[];
```

### Initialization an Array
When an array is declared, only a reference is created. Memory is allocated using the new keyword by specifying the array size.

Syntax:
```java
int arr[] = new int[size];
```

Once an array is created, its size is fixed and cannot be changed. For collections that can grow or shrink dynamically, Java provides classes like ArrayList or Vector.

>Memory for arrays is always allocated on the **heap** in Java.

The elements in the array allocated by new will automatically be initialized to zero (for numeric types), false (for boolean) or null (for reference types).

## Access Array

Elements of an array can be accessed by their position, called the index. In Java, array indexing starts from 0 (not 1). To access an element, provide the index inside square brackets [] along with the array name.

```java
class GFG{
    
    public static void main(String[] args){
        
        int[] arr = {2, 4, 8, 12, 16};

        // Accessing fourth element
        System.out.print(arr[3] + " ");

        // Accessing first element
        System.out.print(arr[0]);
    }
}
```

## Traverse Array

Traversing an array means accessing each element one by one. In Java, arrays can be easily traversed using a loop where the loop variable runs from 0 to array.length - 1.

```java
class GFG{
    
    public static void main(String[] args){
        
        int[] arr = {2, 4, 8, 12, 16};

        // Traversing and printing array
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
```

## Update Array Elements
To update an element at a specific index in an array, use the assignment operator = while accessing the array element and assign a new value.

```java
 int[] arr = {2, 4, 8, 12, 16};

        // Updating first element
        arr[0] = 90;
        System.out.println(arr[0]);
```

## Examples

```java
public class HelloArrays{
    
    public static void main(String[] args){
        
        // Primitive array
        int[] arr = {10, 20, 30, 40};
        int n = arr.length;

        System.out.print("Primitive Array -> ");
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");

        System.out.println();

        // Non-primitive array (String objects)
        String[] names = {"Robert", "Sam", "Frank"};

        System.out.print("Non-Primitive Array -> ");
        for (int i = 0; i < names.length; i++)
            System.out.print(names[i] + " ");
    }
}
```

# Advantages of Java Arrays
1. Efficient Access: Accessing an element by its index is fast and has constant time complexity, O(1).
2. Memory Management: Arrays have fixed size, which makes memory management straightforward and predictable.
3. Data Organization: Arrays help organize data in a structured manner, making it easier to manage related elements.

# Limitations of Java Arrays
1. Fixed Size: Array size cannot be changed after creation. Better option is to use ArrayList (dynamic resizing).
2. Type Homogeneity: Stores only same data type elements. Better option is to use Object class, Collections, or custom classes for mixed data.
3. Costly Insertion & Deletion: Adding/removing elements requires shifting. Better option is to use LinkedList for efficient insert/delete operations.