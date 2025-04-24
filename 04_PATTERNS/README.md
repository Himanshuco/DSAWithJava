# Java Pattern Printing

Pattern printing in Java is a common way to improve logical thinking and problem-solving skills. 

---

## Table of Contents
1. Introduction
2. Square Patterns
3. Right-Angled Triangle Patterns
4. Pyramid Patterns
5. Inverted Patterns
6. Diamond Patterns
7. Number Patterns
8. Alphabet Patterns
9. Advanced Patterns


---

## 1. Introduction
Pattern programs are often asked in coding interviews. They help understand nested loops and conditional logic.

---

## 2. Square Pattern
### Example: 5x5 Square
```java
for(int i = 0; i < 5; i++) {
    for(int j = 0; j < 5; j++) {
        System.out.print("* ");
    }
    System.out.println();
}
```
**Output:**
```
* * * * *
* * * * *
* * * * *
* * * * *
* * * * *
```

---

## 3. Right-Angled Triangle
### Example:
```java
for(int i = 1; i <= 5; i++) {
    for(int j = 1; j <= i; j++) {
        System.out.print("* ");
    }
    System.out.println();
}
```
**Output:**
```
* 
* * 
* * * 
* * * * 
* * * * *
```

---

## 4. Pyramid Pattern
### Example:
```java
for(int i = 1; i <= 5; i++) {
    for(int j = 5; j > i; j--) {
        System.out.print("  ");
    }
    for(int k = 1; k <= (2*i - 1); k++) {
        System.out.print("* ");
    }
    System.out.println();
}
```
**Output:**
```
        * 
      * * * 
    * * * * * 
  * * * * * * * 
* * * * * * * * *
```

---

## 5. Inverted Triangle
### Example:
```java
for(int i = 5; i >= 1; i--) {
    for(int j = 1; j <= i; j++) {
        System.out.print("* ");
    }
    System.out.println();
}
```
**Output:**
```
* * * * *
* * * *
* * *
* *
*
```

---

## 6. Diamond Pattern
### Example:
```java
int n = 5;
// Upper part
for(int i = 1; i <= n; i++) {
    for(int j = i; j < n; j++) System.out.print("  ");
    for(int j = 1; j <= (2*i - 1); j++) System.out.print("* ");
    System.out.println();
}
// Lower part
for(int i = n-1; i >= 1; i--) {
    for(int j = n; j > i; j--) System.out.print("  ");
    for(int j = 1; j <= (2*i - 1); j++) System.out.print("* ");
    System.out.println();
}
```
**Output:**
```
        * 
      * * * 
    * * * * * 
  * * * * * * * 
* * * * * * * * *
  * * * * * * * 
    * * * * * 
      * * * 
        *
```

---

## 7. Number Patterns
### Increasing Triangle
```java
for(int i = 1; i <= 5; i++) {
    for(int j = 1; j <= i; j++) {
        System.out.print(j + " ");
    }
    System.out.println();
}
```
**Output:**
```
1 
1 2 
1 2 3 
1 2 3 4 
1 2 3 4 5 
```

### Floyd’s Triangle
```java
int num = 1;
for(int i = 1; i <= 4; i++) {
    for(int j = 1; j <= i; j++) {
        System.out.print(num++ + " ");
    }
    System.out.println();
}
```
**Output:**
```
1 
2 3 
4 5 6 
7 8 9 10 
```

---

## 8. Alphabet Patterns
### Example:
```java
char ch = 'A';
for(int i = 1; i <= 5; i++) {
    for(int j = 1; j <= i; j++) {
        System.out.print(ch + " ");
    }
    ch++;
    System.out.println();
}
```
**Output:**
```
A 
B B 
C C C 
D D D D 
E E E E E 
```

---

## 9. Advanced Patterns

### Butterfly Pattern
```java
int n = 5;
for(int i = 1; i <= n; i++) {
    for(int j = 1; j <= i; j++) System.out.print("* ");
    for(int j = 1; j <= 2*(n - i); j++) System.out.print("  ");
    for(int j = 1; j <= i; j++) System.out.print("* ");
    System.out.println();
}
for(int i = n; i >= 1; i--) {
    for(int j = 1; j <= i; j++) System.out.print("* ");
    for(int j = 1; j <= 2*(n - i); j++) System.out.print("  ");
    for(int j = 1; j <= i; j++) System.out.print("* ");
    System.out.println();
}
```
**Output:**
```
*                 *
* *             * *
* * *         * * *
* * * *     * * * *
* * * * * * * * * *
* * * * * * * * * *
* * * *     * * * *
* * *         * * *
* *             * *
*                 *
```

### Mirror Image Number Pyramid
```java
int n = 5;
for(int i = 1; i <= n; i++) {
    for(int j = 1; j <= n - i; j++) System.out.print("  ");
    for(int j = 1; j <= i; j++) System.out.print(j + " ");
    for(int j = i - 1; j >= 1; j--) System.out.print(j + " ");
    System.out.println();
}
```
**Output:**
```
        1
      1 2 1
    1 2 3 2 1
  1 2 3 4 3 2 1
1 2 3 4 5 4 3 2 1
```

### Pascal's Triangle
```java
int n = 6;
for (int i = 0; i < n; i++) {
    int number = 1;
    System.out.printf("%" + (n - i) * 2 + "s", "");
    for (int j = 0; j <= i; j++) {
        System.out.printf("%4d", number);
        number = number * (i - j) / (j + 1);
    }
    System.out.println();
}
```
**Output:**
```
            1
          1   1
        1   2   1
      1   3   3   1
    1   4   6   4   1
  1   5  10  10   5   1
```

---

