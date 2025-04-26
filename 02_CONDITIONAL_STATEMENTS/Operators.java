public class Operators {
    public static void main(String[] args) {

        // 1. Arithmetic Operators (+, -, *, /, %)
        int a = 10, b = 3;
        System.out.println("Arithmetic Operators:");
        System.out.println("Addition (a + b) = " + (a + b));         // 13
        System.out.println("Subtraction (a - b) = " + (a - b));      // 7
        System.out.println("Multiplication (a * b) = " + (a * b));   // 30
        System.out.println("Division (a / b) = " + (a / b));         // 3 (integer division)
        System.out.println("Modulus (a % b) = " + (a % b));          // 1 (remainder)

        System.out.println("\n-------------------------------\n");

        // 2. Relational (Comparison) Operators (==, !=, >, <, >=, <=)
        System.out.println("Relational Operators:");
        System.out.println("Is a equal to b? (a == b): " + (a == b));    // false
        System.out.println("Is a not equal to b? (a != b): " + (a != b)); // true
        System.out.println("Is a greater than b? (a > b): " + (a > b));   // true
        System.out.println("Is a less than b? (a < b): " + (a < b));      // false
        System.out.println("Is a greater than or equal to b? (a >= b): " + (a >= b)); // true
        System.out.println("Is a less than or equal to b? (a <= b): " + (a <= b));   // false

        System.out.println("\n-------------------------------\n");

        // 3. Logical Operators (&&, ||, !)
        boolean x = true, y = false;
        System.out.println("Logical Operators:");
        System.out.println("Logical AND (x && y): " + (x && y));  // false
        System.out.println("Logical OR (x || y): " + (x || y));   // true
        System.out.println("Logical NOT (!x): " + (!x));          // false

        System.out.println("\n-------------------------------\n");

        // 4. Bitwise Operators (&, |, ^, ~)
        int m = 5, n = 3; // In binary: m=0101, n=0011
        System.out.println("Bitwise Operators:");
        System.out.println("Bitwise AND (m & n): " + (m & n));    // 1 (0001)
        System.out.println("Bitwise OR (m | n): " + (m | n));     // 7 (0111)
        System.out.println("Bitwise XOR (m ^ n): " + (m ^ n));    // 6 (0110)
        System.out.println("Bitwise Complement (~m): " + (~m));   // -6 (Two's complement)

        System.out.println("\n-------------------------------\n");

        // 5. Assignment Operators (=, +=, -=, *=, /=, %=, &=, |=, ^=, >>=, <<=)
        int p = 10;
        System.out.println("Assignment Operators:");
        p += 5;   // p = p + 5
        System.out.println("After p += 5, p = " + p);  // 15
        p -= 3;   // p = p - 3
        System.out.println("After p -= 3, p = " + p);  // 12
        p *= 2;   // p = p * 2
        System.out.println("After p *= 2, p = " + p);  // 24
        p /= 6;   // p = p / 6
        System.out.println("After p /= 6, p = " + p);  // 4
        p %= 3;   // p = p % 3
        System.out.println("After p %= 3, p = " + p);  // 1

        System.out.println("\n-------------------------------\n");

        // 6. Unary Operators (+, -, ++, --, !)
        int u = 5;
        System.out.println("Unary Operators:");
        System.out.println("Unary plus (+u): " + (+u));  // 5
        System.out.println("Unary minus (-u): " + (-u)); // -5
        System.out.println("Pre-increment (++u): " + (++u)); // 6 (increment first, then use)
        System.out.println("Post-increment (u++): " + (u++)); // 6 (use first, then increment)
        System.out.println("After post-increment, u = " + u); // 7
        System.out.println("Pre-decrement (--u): " + (--u)); // 6 (decrement first, then use)
        System.out.println("Post-decrement (u--): " + (u--)); // 6 (use first, then decrement)
        System.out.println("After post-decrement, u = " + u); // 5

        System.out.println("\n-------------------------------\n");

        // 7. Ternary Operator (Condition ? True : False)
        int num1 = 10, num2 = 20;
        int max = (num1 > num2) ? num1 : num2;
        System.out.println("Ternary Operator:");
        System.out.println("Greater number is: " + max); // 20

        System.out.println("\n-------------------------------\n");

        // 8. Shift Operators (<<, >>, >>>)
        int shiftNum = 8; // Binary: 1000
        System.out.println("Shift Operators:");
        System.out.println("Left Shift (shiftNum << 2): " + (shiftNum << 2)); // 32 (100000)
        System.out.println("Right Shift (shiftNum >> 2): " + (shiftNum >> 2)); // 2 (10)
        System.out.println("Unsigned Right Shift (shiftNum >>> 2): " + (shiftNum >>> 2)); // 2 (unsigned, no negative)

        System.out.println("\n-------------------------------\n");

        // 9. instanceof Operator (Used to check if object is of a specific type)
        String s = "Hello";
        System.out.println("instanceof Operator:");
        System.out.println("Is s an instance of String? : " + (s instanceof String)); // true
    }
}
