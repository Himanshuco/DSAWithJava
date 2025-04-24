# 🔢 Java Operators

Operators are special symbols that perform operations on variables and values. Java supports a wide range of operators to perform various operations.

## 📂 Table of Contents

- [Arithmetic Operators](#arithmetic-operators)
- [Relational (Comparison) Operators](#relational-comparison-operators)
- [Logical Operators](#logical-operators)
- [Assignment Operators](#assignment-operators)
- [Unary Operators](#unary-operators)
- [Bitwise Operators](#bitwise-operators)
- [Ternary Operator](#ternary-operator)
- [Instanceof Operator](#instanceof-operator)

---

## Arithmetic Operators

Used to perform basic mathematical operations:

| Operator | Description      | Example      |
|----------|------------------|--------------|
| `+`      | Addition          | `a + b`      |
| `-`      | Subtraction       | `a - b`      |
| `*`      | Multiplication    | `a * b`      |
| `/`      | Division          | `a / b`      |
| `%`      | Modulus (remainder) | `a % b`    |

---

## Relational (Comparison) Operators

Used to compare two values:

| Operator | Description          | Example     |
|----------|----------------------|-------------|
| `==`     | Equal to             | `a == b`    |
| `!=`     | Not equal to         | `a != b`    |
| `>`      | Greater than         | `a > b`     |
| `<`      | Less than            | `a < b`     |
| `>=`     | Greater than or equal to | `a >= b` |
| `<=`     | Less than or equal to    | `a <= b` |

---

## Logical Operators

Used to combine multiple boolean expressions:

| Operator | Description | Example         |
|----------|-------------|-----------------|
| `&&`     | Logical AND | `a > 5 && b < 10` |
| `||`     | Logical OR  | `a > 5 || b < 10` |
| `!`      | Logical NOT | `!(a > 5)`        |

---

## Assignment Operators

Used to assign values to variables:

| Operator | Description        | Example     |
|----------|--------------------|-------------|
| `=`      | Assign              | `a = 10`    |
| `+=`     | Add and assign      | `a += 5`    |
| `-=`     | Subtract and assign | `a -= 3`    |
| `*=`     | Multiply and assign | `a *= 2`    |
| `/=`     | Divide and assign   | `a /= 4`    |
| `%=`     | Modulus and assign  | `a %= 3`    |

---

## Unary Operators

Operate on a single operand:

| Operator | Description      | Example     |
|----------|------------------|-------------|
| `+`      | Unary plus       | `+a`        |
| `-`      | Unary minus      | `-a`        |
| `++`     | Increment        | `a++` or `++a` |
| `--`     | Decrement        | `a--` or `--a` |
| `!`      | Logical complement | `!true`   |

---

## Bitwise Operators

Perform operations on bits:

| Operator | Description        | Example      |
|----------|--------------------|--------------|
| `&`      | AND                 | `a & b`      |
| `|`      | OR                  | `a | b`      |
| `^`      | XOR                 | `a ^ b`      |
| `~`      | One's complement    | `~a`         |
| `<<`     | Left shift          | `a << 2`     |
| `>>`     | Right shift         | `a >> 2`     |
| `>>>`    | Zero-fill right shift | `a >>> 2` |



## Ternary Operator

Shortcut for `if-else`:

```java
int result = (a > b) ? a : b;
```

## instanceof Operator

Checks if an object is an instance of a specific class or subclass:

```Java
if (obj instanceof String) {
    System.out.println("It's a string!");
}
```

<b>Program</b>

```Java
public class JavaOperatorsDemo {
    public static void main(String[] args) {
        // 1. Arithmetic Operators
        int a = 10, b = 3;
        System.out.println("Arithmetic Operators:");
        System.out.println("a + b = " + (a + b)); // 13
        System.out.println("a - b = " + (a - b)); // 7
        System.out.println("a * b = " + (a * b)); // 30
        System.out.println("a / b = " + (a / b)); // 3
        System.out.println("a % b = " + (a % b)); // 1

        // 2. Relational Operators
        System.out.println("\nRelational Operators:");
        System.out.println("a == b: " + (a == b)); // false
        System.out.println("a != b: " + (a != b)); // true
        System.out.println("a > b: " + (a > b));   // true
        System.out.println("a < b: " + (a < b));   // false
        System.out.println("a >= b: " + (a >= b)); // true
        System.out.println("a <= b: " + (a <= b)); // false

        // 3. Logical Operators
        boolean x = true, y = false;
        System.out.println("\nLogical Operators:");
        System.out.println("x && y: " + (x && y)); // false
        System.out.println("x || y: " + (x || y)); // true
        System.out.println("!x: " + (!x));         // false

        // 4. Assignment Operators
        int c = 5;
        System.out.println("\nAssignment Operators:");
        c += 3; // c = c + 3
        System.out.println("c += 3: " + c); // 8
        c -= 2;
        System.out.println("c -= 2: " + c); // 6
        c *= 4;
        System.out.println("c *= 4: " + c); // 24
        c /= 6;
        System.out.println("c /= 6: " + c); // 4
        c %= 3;
        System.out.println("c %= 3: " + c); // 1

        // 5. Unary Operators
        int d = 5;
        System.out.println("\nUnary Operators:");
        System.out.println("+d: " + (+d));  // 5
        System.out.println("-d: " + (-d));  // -5
        System.out.println("d++: " + (d++)); // 5 (post-increment)
        System.out.println("Now d: " + d);   // 6
        System.out.println("++d: " + (++d)); // 7 (pre-increment)
        System.out.println("d--: " + (d--)); // 7 (post-decrement)
        System.out.println("--d: " + (--d)); // 5

        // 6. Bitwise Operators
        int m = 5, n = 3;
        System.out.println("\nBitwise Operators:");
        System.out.println("m & n: " + (m & n));  // 1
        System.out.println("m | n: " + (m | n));  // 7
        System.out.println("m ^ n: " + (m ^ n));  // 6
        System.out.println("~m: " + (~m));        // -6
        System.out.println("m << 1: " + (m << 1)); // 10
        System.out.println("m >> 1: " + (m >> 1)); // 2
        System.out.println("m >>> 1: " + (m >>> 1)); // 2

        // 7. Ternary Operator
        int num1 = 10, num2 = 20;
        int max = (num1 > num2) ? num1 : num2;
        System.out.println("\nTernary Operator:");
        System.out.println("Max of num1 and num2 is: " + max); // 20

        // 8. instanceof Operator
        String text = "Hello";
        System.out.println("\ninstanceof Operator:");
        System.out.println("Is 'text' a String? " + (text instanceof String)); // true
    }
}
```

<b>Output</b>
```
Arithmetic Operators:
a + b = 13
a - b = 7
a * b = 30
a / b = 3
a % b = 1

Relational Operators:
a == b: false
a != b: true
a > b: true
a < b: false
a >= b: true
a <= b: false

Logical Operators:
x && y: false
x || y: true
!x: false

Assignment Operators:
c += 3: 8
c -= 2: 6
c *= 4: 24
c /= 6: 4
c %= 3: 1

Unary Operators:
+d: 5
-d: -5
d++: 5
Now d: 6
++d: 7
d--: 7
--d: 5

Bitwise Operators:
m & n: 1
m | n: 7
m ^ n: 6
~m: -6
m << 1: 10
m >> 1: 2
m >>> 1: 2

Ternary Operator:
Max of num1 and num2 is: 20

instanceof Operator:
Is 'text' a String? true

```
<br>
<br>
<hr>
<hr>

# 🔀 Conditional Statements in Java

Conditional statements are used to control the flow of a program based on certain conditions.



## 📚 Table of Contents

- [What are Conditional Statements?](#what-are-conditional-statements)
- [if Statement](#1-if-statement)
- [if-else Statement](#2-if-else-statement)
- [if-else-if Ladder](#3-if-else-if-ladder)
- [switch Statement](#4-switch-statement)
- [Nested if Statement](#5-nested-if-statement)
- [Important Points](#important-points)



## What are Conditional Statements?

Conditional statements execute a block of code only when a specific condition is `true`. They are fundamental for implementing decision-making in Java programs.

```mermaid
graph TD
    A[Conditional Statements] --> B[if Statement]
    A --> C[if-else Statement]
    A --> D[if-else-if Ladder]
    A --> E[switch Statement]
    A --> F[Nested if Statement]
```

Java supports:

- `if`
- `if-else`
- `if-else-if` ladder
- `switch`
- Nested `if`

---

## 1 if Statement

```mermaid
flowchart TD
    A[Start] --> B{Condition True or False?}
    B -- Yes --> C[Execute if-block]
    B -- No --> D[Skip if-block]
    C --> E[Continue Program]
    D --> E
```

### Definition

Executes a block of code **only if** the condition evaluates to `true`.

### 🧑‍💻 Example

```java
int num = 10;

if (num > 0) {
    System.out.println("Number is positive");
}
```
<hr>

## 2 if-else Statement

```mermaid
flowchart TD
    A[Start] --> B{Condition?}
    B -- Yes --> C[Execute if block]
    B -- No --> D[Execute else block]
    C --> E[End]
    D --> E
```

### Definition
Provides two paths: one if the condition is true, another if it's false.

### 🧑‍💻 Example
```Java
int age = 16;

if (age >= 18) {
    System.out.println("You are eligible to vote.");
} else {
    System.out.println("You are not eligible to vote.");
}
```
<hr>

## 3 if-else-if Ladder

```mermaid
flowchart TD
    A[Start] --> B{Condition 1?}
    B -- Yes --> C[Execute Block 1]
    B -- No --> D{Condition 2?}
    D -- Yes --> E[Execute Block 2]
    D -- No --> F{Condition 3?}
    F -- Yes --> G[Execute Block 3]
    F -- No --> H[Execute else Block]
    
    C --> Z[End]
    E --> Z
    G --> Z
    H --> Z
```

### Definition
Checks multiple conditions in sequence. Executes the first true condition.

### 🧑‍💻 Example
```Java
int marks = 85;

if (marks >= 90) {
    System.out.println("Grade: A");
} else if (marks >= 75) {
    System.out.println("Grade: B");
} else if (marks >= 60) {
    System.out.println("Grade: C");
} else {
    System.out.println("Grade: F");
}
```

## 4 switch Statement

```mermaid
flowchart TD
    Start --> Switch[Check variable]
    Switch --> CaseA[Case A]
    Switch --> CaseB[Case B]
    Switch --> CaseC[Case C]
    Switch --> Default[Default Case]

    CaseA --> EndA[Execute Block A]
    CaseB --> EndB[Execute Block B]
    CaseC --> EndC[Execute Block C]
    Default --> EndD[Execute Default Block]

    EndA --> End
    EndB --> End
    EndC --> End
    EndD --> End


```

### Definition
Used as a cleaner alternative to multiple if-else-if conditions, especially when checking the value of a single variable.

### 🧑‍💻 Example
```Java
char grade = 'B';

switch (grade) {
    case 'A':
        System.out.println("Excellent!");
        break;
    case 'B':
        System.out.println("Well done!");
        break;
    case 'C':
        System.out.println("Good job!");
        break;
    default:
        System.out.println("Keep trying!");
        break;
}
```

## 5 Nested if Statement

```mermaid
flowchart TD
    Start --> Check1{Condition 1?}
    Check1 -- Yes --> Check2{Condition 2?}
    Check1 -- No --> Else1[Execute else block of Condition 1]
    Check2 -- Yes --> Block1[Execute block of Condition 2]
    Check2 -- No --> Else2[Execute else block of Condition 2]

    Block1 --> End
    Else1 --> End
    Else2 --> End

```

### Definition
An if inside another if. Useful for checking multiple layers of conditions.

### 🧑‍💻 Example
```Java
int number = 10;

if (number > 0) {
    if (number % 2 == 0) {
        System.out.println("Positive even number");
    } else {
        System.out.println("Positive odd number");
    }
}

```

## Important Points
<li>Always use braces {} to define blocks clearly, even for single-line statements.</li>
<li>Conditions in if, else if, and while must evaluate to a boolean.</li>
<li>Java supports switch for int, char, String, and enum types.</li>
<li>Avoid deep nesting for better code readability.</li>
