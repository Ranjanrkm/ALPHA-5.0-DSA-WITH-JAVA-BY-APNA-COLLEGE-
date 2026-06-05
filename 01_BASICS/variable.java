
/*
 * ==========================================
 * Problem Statement:
 * ==========================================
 * Write a fundamental Java program to demonstrate variable declaration, 
 * initialization, output generation, and variable reassignment. The program 
 * should illustrate how to store integer and string values in memory, print them, 
 * and show how assigning one variable to another (e.g., a = b) overwrites the 
 * original value.
 *
 * ==========================================
 * Input Format:
 * ==========================================
 * - No dynamic input is required for this demonstration. Values are hardcoded.
 *
 * ==========================================
 * Output Format:
 * ==========================================
 * - The values of the variables printed to the standard console sequentially.
 *
 * ==========================================
 * Dry Run Example:
 * ==========================================
 * Execution Flow:
 * 1. Allocate memory for integer 'a' and store 10. (a = 10)
 * 2. Allocate memory for integer 'b' and store 5. (b = 5)
 * 3. Print 'a' -> Outputs: 10
 * 4. Print 'b' -> Outputs: 5
 * 5. Allocate memory for String 'name' and store "Ranjan Mahato".
 * 6. Print 'name' -> Outputs: Ranjan Mahato
 * 7. Reassign 'a' with the value of 'b'. 'a' drops 10 and becomes 5. (a = 5)
 * 8. Print 'a' -> Outputs: 5
 *
 * Output:
 * 10
 * 5
 * Ranjan Mahato
 * 5
 */

public class variable { 

    public static void main(String[] args) { 
        
        // 1. Declare an integer variable 'a' and initialize it with the value 10
        int a = 10; 
        
        // 2. Declare an integer variable 'b' and initialize it with the value 5
        int b = 5; 
        
        // 3. Print the current value of 'a' to the console
        System.out.println(a); 
        
        // 4. Print the current value of 'b' to the console
        System.out.println(b); 
        
        // 5. Declare a String variable 'name' to store text and initialize it
        String name = "Ranjan Mahato"; 
        
        // 6. Print the String value to the console
        System.out.println(name); 
        
        // 7. Variable Reassignment: 
        // Read the value of 'b' (which is 5) and store it into 'a'.
        // The old value of 'a' (10) is completely overwritten and lost.
        a = b; 
        
        // 8. Print the newly updated value of 'a'
        System.out.println(a); 
    }
}

/*
 * ==========================================
 * IMPORTANT NOTES FOR REVISION:
 * ==========================================
 * 1. Variables as Containers: Think of variables as labeled boxes in memory. 
 * An `int` box can only hold whole numbers, and a `String` box can only hold text.
 * 2. Right-to-Left Assignment: The assignment operator (`=`) always evaluates 
 * what is on the right side and copies it into the variable on the left side. 
 * `a = b` means "put the value of b into a". It does NOT link them permanently; 
 * if you change `b` later, `a` will not automatically change.
 * 3. Static Typing: Java requires you to state the data type (`int`, `String`) 
 * before the variable name. You cannot put text into an `int` variable later.
 *
 * ==========================================
 * HOW TO EXPLAIN THIS CODE IN FRONT OF INTERVIEWER:
 * ==========================================
 * "This code demonstrates the absolute fundamentals of memory management and 
 * variable manipulation in Java. First, I statically declare and initialize 
 * integer and String variables, printing their literal values to the standard output. 
 * The most crucial part of this demonstration is the reassignment statement `a = b;`. 
 * This shows how primitive data types work in Java: the value of 'b' is copied and 
 * assigned to 'a', completely overwriting 'a's previous value in memory. This proves 
 * that assignment operations process strictly from right to left."
 *
 * ==========================================
 * TIME COMPLEXITY & SPACE COMPLEXITY:
 * ==========================================
 * TIME COMPLEXITY: O(1)
 * Declaring variables, reassigning them, and printing to the console execute in 
 * constant time.
 *
 * SPACE COMPLEXITY: O(1)
 * The memory allocated is strictly for a few primitive variables (`a`, `b`) and 
 * one String literal, which takes a fixed, constant amount of auxiliary space.
 */