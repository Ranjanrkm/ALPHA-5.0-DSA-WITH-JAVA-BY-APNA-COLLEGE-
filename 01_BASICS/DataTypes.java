/*
 * ==========================================
 * Problem Statement:
 * ==========================================
 * Create a reference program to demonstrate the initialization and usage of all 
 * primary primitive data types in Java. The program must correctly handle literal 
 * assignments, specifically fixing the common compilation error associated with 
 * floating-point and long integer literals (e.g., `float price = 10.5;` causing 
 * a precision loss error).
 *
 * ==========================================
 * Input Format:
 * ==========================================
 * - No dynamic input is required for this demonstration. Values are hardcoded.
 *
 * ==========================================
 * Output Format:
 * ==========================================
 * - The values of the initialized variables printed to the standard console.
 *
 * ==========================================
 * Dry Run Example:
 * ==========================================
 * Execution Flow:
 * 1. `byte b = 8` -> Allocates 1 byte, stores 8. Prints 8.
 * 2. `char ch = 'a'` -> Allocates 2 bytes, stores 'a'. Prints a.
 * 3. `float price = 10.5f` -> Allocates 4 bytes, stores 10.5. Prints 10.5.
 * (Continues sequentially for all defined variables...)
 * * Output:
 * 8
 * a
 * false
 * 10.5
 * 25
 * 15000000000
 * 99.99
 * 240
 */

public class DataTypes { 

    public static void main(String[] args) { 
        
        // 1. byte: 8-bit signed integer. Range: -128 to 127. Useful for saving memory in large arrays.
        byte b = 8; 
        System.out.println(b); 
        
        // 2. char: 16-bit Unicode character. Must be enclosed in single quotes.
        char ch = 'a'; 
        System.out.println(ch); 
        
        // 3. boolean: Represents one of two values: true or false. size is not precisely defined.
        boolean var = false; 
        System.out.println(var);
        
        // 4. float: 32-bit floating point. 
        // NOTE: 'f' or 'F' suffix is MANDATORY. Without it, Java assumes it's a double, causing a compilation error.
        float price = 10.5f; 
        System.out.println(price);
        
        // 5. int: 32-bit signed integer. The default choice for integral numbers.
        int number = 25; 
        System.out.println(number);
        
        // 6. long: 64-bit signed integer. Used when a value exceeds the int range (~2 billion).
        // NOTE: 'L' or 'l' suffix is required for values outside the int range.
        long largeNumber = 15000000000L; 
        System.out.println(largeNumber);
        
        // 7. double: 64-bit floating point. The default choice for decimal numbers.
        double preciseDecimal = 99.99;
        System.out.println(preciseDecimal);
        
        // 8. short: 16-bit signed integer. Range: -32,768 to 32,767.
        short n = 240; 
        System.out.println(n);
    }
}

/*
 * ==========================================
 * IMPORTANT NOTES FOR REVISION:
 * ==========================================
 * 1. The Float Trap: In Java, any decimal literal (like `10.5`) is considered a `double` 
 * by default. If you try to write `float f = 10.5;`, the compiler will throw an error: 
 * "incompatible types: possible lossy conversion from double to float". You must append 
 * an 'f' or 'F' -> `float f = 10.5f;`.
 * 2. The Long Trap: Similarly, whole number literals are treated as `int` by default. 
 * If you assign a number larger than 2,147,483,647 to a long without the 'L' suffix, 
 * it will fail to compile. Always use `long l = 3000000000L;`.
 * 3. Java is Statically Typed: Every variable must be declared with a specific data type 
 * before it can be used, ensuring memory safety and type checking at compile time.
 *
 * ==========================================
 * HOW TO EXPLAIN THIS CODE IN FRONT OF INTERVIEWER:
 * ==========================================
 * "This code acts as a foundational cheat sheet for Java's 8 primitive data types. 
 * Java is a strongly, statically typed language, meaning the type of every variable 
 * must be declared at compile time. In this implementation, I demonstrated standard 
 * initialization for whole numbers (byte, short, int), characters (char), and booleans. 
 * Most importantly, I highlighted critical syntax rules that often catch beginners: 
 * using the 'f' suffix for floats to override the default double typing, and the 'L' 
 * suffix for longs to prevent integer overflow during compilation."
 *
 * ==========================================
 * TIME COMPLEXITY & SPACE COMPLEXITY:
 * ==========================================
 * TIME COMPLEXITY: O(1)
 * Initializing variables and printing them to the console takes constant time.
 *
 * SPACE COMPLEXITY: O(1)
 * The memory allocated is strictly for the primitive variables defined, which take 
 * a fixed, constant amount of space on the stack regardless of any inputs.
 */