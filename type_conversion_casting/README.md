# Type Conversion and Casting

```java
byte b = 127;
int a = 3523;

b = a // xx not allowed
a = b // correct -> implicit conversion
```

However, we can do casting / explicit conversion

```java
int a = 127;
byte b = (byte) a; // correct
```

### Type promotion

```java
 //type promotion
        byte a1 = 44;
        byte a2 = 55;

        int res = a1*a2;
         System.out.print(res);
```