# Data Types

Data types in java are divided into two:
1. Primitive variables
2. Reference variables

## Primitive Data Type

These are simple data types divided into 4 main categories:
1. Integer - natural numbers on a number line: -2, 0 , 1 , 4 ...
2. Float: point values - 1.3, 4.0 ....
3. Character - 
4. Boolean - True or False

They are further divided:
1. Integer:
- int - 4bytes - (-2^31 to 2^31 - 1)
- long - 8bytes - (-2^63 to 2^63 - 1)
- short - 2bytes - (-2^15 to 2^15 - 1)
- byte - 1byte - (-2^7 to 2^7 - 1)


2. Float:
- float: 4bytes
- double: 8bytes (default)

Float has a limited precision set i.e 12.434234 -> float has a limit, double however has a larger capacity to hold more decimals.
To use float, you need to explicity put an 'f' to the end of the value

In Java, any decimal number (like `5.6`) is treated as a **`double`** by default. Because a 64-bit `double` has higher precision than a 32-bit `float`, you cannot directly assign a `double` literal to a `float` variable without explicitly defining it.

**Code Examples**

```java
double num = 5.6;  // Supported by default
float num2 = 5.6;  // ERROR: Incompatible types (possible lossy conversion)
float num3 = 5.6f; // Correct definition (using 'f' suffix)
```

**Why does the error happen?**

* **`double num = 5.6;`** 
  The compiler treats `5.6` as a `double` out of the box. Assigning a `double` to a `double` variable works perfectly.
* **`float num = 5.6;`** 
  Java prevents you from squeezing a large 64-bit `double` value into a smaller 32-bit `float` container because it can cause a **loss of precision**.
* **`float num = 5.6f;`** 
  Adding an **`f`** or **`F`** suffix explicitly tells the compiler to treat the literal value as a 32-bit `float`.

---

**Alternative: Explicit Type Casting**

If you ever need to forcefully convert a `double` value into a `float`, you can use an explicit cast:

```java
float num = (float) 5.6; // Also works by explicitly casting the double to a float
```

3. Character: 2bytes
supports unicode and not ASCII by default

```java
char c = 'k'; //accepts single character, use single quotes
```

4. Boolean: True or false

```java
boolean b = true;
boolean a = false;
```