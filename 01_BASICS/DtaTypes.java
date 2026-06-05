/*
 * ==========================================
 * Problem Statement:
 * ==========================================
 * Create a reference program to demonstrate the initialization and usage of 
 * primary primitive data types in Java. The program must correctly handle literal 
 * assignments, specifically fixing the common compilation error associated with 
 * floating-point literals (e.g., `float price = 10.5;` causing a precision loss error).
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
 * 3. `boolean var = false` -> Stores boolean value. Prints false.
 * 4. `int number = 25` -> Allocates 4 bytes, stores 25. Prints 25.
 * 5. `short n = 240` -> Allocates 2 bytes, stores 240. Prints 240.
 *
 * Output:
 * 8
 * a
 * false
 * 25
 * 240
 */

public class DtaTypes { 

    public static void main(String[] args) { 
        
        // 1. byte: 8-bit signed integer. Useful for saving memory in large arrays.
        byte b = 8; 
        System.out.println(b); 
        
        // 2. char: 16-bit Unicode character. Must be enclosed in single quotes.
        char ch = 'a'; 
        System.out.println(ch); 
        
        // 3. boolean: Represents one of two values: true or false.
        boolean var = false; 
        System.out.println(var);
        
        // 4. float: 32-bit floating point. 
        // NOTE: 'f' or 'F' suffix is MANDATORY. Without it, Java assumes it's a double.
        // float price = 10.5; // This causes a compilation error!
        // float price = 10.5f; // This is the correct way.
        
        // 5. int: 32-bit signed integer. The default choice for integral numbers.
        int number = 25; 
        System.out.println(number);
        
        // 6. long: 64-bit signed integer. Used when a value exceeds the int range.
        // long bigNumber = 123456789L; // 'L' suffix is required for values outside int range.
        
        // 7. double: 64-bit floating point. The default choice for decimal numbers.
        // double decimal = 12.5;
        
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
 * 2. Type Checking: Java is a strongly, statically typed language. Every variable must 
 * be declared with a specific data type before it can be used, ensuring memory safety 
 * and type checking at compile time.
 * 3. Output Formatting: As noted in TCS NQT prep, if exact decimal places 
 * are needed for floats/doubles, use `System.out.printf("%.2f", value);` instead of `println`.
 *
 * ==========================================
 * HOW TO EXPLAIN THIS CODE IN FRONT OF INTERVIEWER:
 * ==========================================
 * "This code acts as a foundational cheat sheet for Java's primitive data types. 
 * Java is statically typed, meaning the type of every variable must be declared 
 * at compile time. In this implementation, I demonstrated standard initialization 
 * for whole numbers (byte, short, int), characters (char), and booleans. 
 * Most importantly, I included comments highlighting critical syntax rules that often 
 * catch beginners: using the 'f' suffix for floats to override the default double typing, 
 * and the 'L' suffix for longs to prevent integer overflow."
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