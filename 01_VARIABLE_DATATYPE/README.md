# ☕ Variables & Data Types in Java

## Variable Declaration
In Java, variables must be declared with a type. The type defines the kind of data the variable can hold.

```java
// Primitive Data Types
int age = 30;
double price = 99.99;
boolean isAvailable = true;
char grade = 'A';

// Reference Data Type
String name = "Alice";

```

## Java Primitive Data Types

| Data Type | Size       | Default Value | Description                | Example              |
|-----------|------------|----------------|----------------------------|----------------------|
| `byte`    | 8-bit      | `0`            | Whole number               | `byte b = 100;`      |
| `short`   | 16-bit     | `0`            | Larger whole number        | `short s = 30000;`   |
| `int`     | 32-bit     | `0`            | Common whole number        | `int i = 100000;`    |
| `long`    | 64-bit     | `0L`           | Very large whole number    | `long l = 15000000000L;` |
| `float`   | 32-bit     | `0.0f`         | Decimal number             | `float f = 5.75f;`   |
| `double`  | 64-bit     | `0.0d`         | Precise decimal number     | `double d = 19.99;`  |
| `char`    | 16-bit     | `'\u0000'`     | Single Unicode character   | `char c = 'A';`      |
| `boolean` | 1-bit (logical) | `false`  | True or False values       | `boolean flag = true;` |

## Reference Data Type
String is a commonly used reference type for storing text.

```Java
String greeting = "Hello, World!";
System.out.println(greeting);  // Output: Hello, World!
```

## Type Inference (Java 10+)
We can use var for local variables with inferred types (Java 10+).

```Java
var number = 42;            // inferred as int
var message = "Welcome";    // inferred as String
```
⚠️ var can only be used for local variables (inside methods), not for fields or parameters.

## Constants
Use final to declare constants (values that cannot change).

```Java
final double PI = 3.14159;
```



