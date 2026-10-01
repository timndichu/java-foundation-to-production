# Collection API, Collection and Collections

## Collection API

The **Java Collection API** is a framework provided by Java for **storing and manipulating groups of objects**.

Instead of creating our own data structures every time we need to store multiple objects, Java provides ready-made interfaces and classes such as:

* `List`
* `Set`
* `Queue`
* `Map`

These collections provide operations for adding, removing, searching, sorting, and processing data.

For example, instead of manually managing an array:

```java
String[] names = new String[5];
```

we can use a collection:

```java
List<String> names = new ArrayList<>();
```

The Collection API provides us with:

1. **Interfaces** – define the behavior of different types of collections.
2. **Implementations** – provide concrete implementations of those interfaces.
3. **Utility methods** – provide common operations for working with collections.

### The basic hierarchy

A simplified view of the Collection API is:

```text
                 Iterable
                    |
                Collection
              /     |      \
           List     Set    Queue
            |        |       |
       ArrayList   HashSet  PriorityQueue
       LinkedList  TreeSet  Deque
```

`Map` is also part of the Java Collections Framework, but it **does not extend `Collection`**:

```text
                 Map
              /       \
         HashMap     TreeMap
```

This is because a `Map` stores data as **key-value pairs**, rather than individual elements.

---

# Collection

`Collection` is an **interface**.

It represents a general group of objects and provides common operations that different collection types can implement.

For example:

```java
Collection<String> names = new ArrayList<>();

names.add("John");
names.add("Mary");
names.add("Peter");
```

Some common methods provided by `Collection` include:

```java
add()
remove()
contains()
size()
isEmpty()
clear()
```

For example:

```java
names.add("John");

System.out.println(names.size());
System.out.println(names.contains("John"));
```

The important thing to remember is:

> **`Collection` is an interface that defines common behavior for groups of objects.**

---

# Collections

`Collections` is a **utility class**.

Notice the difference:

```text
Collection  → Interface
Collections → Utility class
```

The `Collections` class provides **static utility methods** for working with collections.

For example, we can sort a list:

```java
List<Integer> numbers = new ArrayList<>();

numbers.add(30);
numbers.add(10);
numbers.add(20);

Collections.sort(numbers);
```

Now the list contains:

```text
[10, 20, 30]
```

Other useful methods include:

```java
Collections.sort()
Collections.reverse()
Collections.shuffle()
Collections.max()
Collections.min()
```

For example:

```java
Collections.reverse(numbers);
```

reverses the order of the elements.

---

## Collection vs Collections

A simple way to remember the difference:

| `Collection`                                       | `Collections`                  |
| -------------------------------------------------- | ------------------------------ |
| Interface                                          | Utility class                  |
| Represents a group of objects                      | Provides utility methods       |
| Part of the collection hierarchy                   | Contains static helper methods |
| Implemented by classes such as `List`, `Set`, etc. | Used to manipulate collections |
| `Collection<String> names`                         | `Collections.sort(names)`      |

### Key takeaway

> **The Collection API is the overall framework. `Collection` is an interface within that framework, while `Collections` is a utility class containing methods for working with collections.**


## Key Points

### Collections work with objects, not primitive types

Java Collections can only store **objects**. They cannot directly store primitive data types such as:

* `int`
* `double`
* `char`
* `boolean`
* etc.

Therefore, this is **not valid**:

```java
Collection<int> nums = new ArrayList<int>(); // ❌
```

Instead, we use the corresponding **Wrapper class**:

```java
Collection<Integer> nums = new ArrayList<Integer>(); // ✅
```

Here:

```text
int      → Integer
double   → Double
char     → Character
boolean  → Boolean
long     → Long
float    → Float
short    → Short
byte     → Byte
```

### Why does this work?

`Integer` is an **object**, while `int` is a **primitive**.

Collections use **generics**, and generic type parameters can only be reference types (objects), not primitives.

For example:

```java
List<Integer> numbers = new ArrayList<>();

numbers.add(10);
numbers.add(20);
numbers.add(30);
```

Although we write:

```java
numbers.add(10);
```

Java automatically converts the primitive `int` value `10` into an `Integer` object. This is called **autoboxing**.

Similarly, when retrieving the value:

```java
int number = numbers.get(0);
```

Java automatically converts the `Integer` object back into an `int`. This is called **unboxing**.

### Key takeaway

> **Collections store objects, so when we need to store primitive values, we use their corresponding wrapper classes.**


# HashSet

Items in a hashset are not sorted

```java
     Set<Integer> uniqueNums = new HashSet<Integer>();
        uniqueNums.add(880);
        uniqueNums.add(573324);
        uniqueNums.add(22567);
        uniqueNums.add(5333);
        uniqueNums.add(2);

        System.out.println("uniquenums: " + uniqueNums);
    

        for(int num : uniqueNums) {
              System.out.println(num);
        }

        //output
        //uniquenums: [880, 2, 573324, 5333, 22567]
        // 880
        // 2
        // 573324
        // 5333
        // 22567
```

# TreeSet

```java
 Set<Integer> sortedNums = new TreeSet<Integer>();

        sortedNums.add(573324);
        sortedNums.add(22567);
        sortedNums.add(5333);
        sortedNums.add(2);
        sortedNums.add(880);

        System.out.println(sortedNums);

        //output: [2, 880, 5333, 22567, 573324]
```

