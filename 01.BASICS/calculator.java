/*
 * ==========================================
 * Problem Statement:
 * ==========================================
 * Create a simple command-line calculator in Java. The program must prompt the user 
 * to input two integer values and a mathematical operator character (+, -, *, /, %). 
 * Based on the operator provided, the program should compute the correct arithmetic 
 * result using a switch-case control structure and print the output.
 *
 * ==========================================
 * Input Format:
 * ==========================================
 * - A single integer 'a'.
 * - A single integer 'b'.
 * - A single character representing the arithmetic operator (+, -, *, /, %).
 *
 * ==========================================
 * Output Format:
 * ==========================================
 * - A single integer representing the result of the arithmetic operation.
 * - Or, a string "wrong operator" if the input operator is invalid.
 *
 * ==========================================
 * Dry Run Example:
 * ==========================================
 * Input:
 * 10
 * 2
 * /
 *
 * Step-by-step working:
 * 1. Initialize Scanner to read input.
 * 2. Read first integer into 'a'. (a = 10)
 * 3. Read second integer into 'b'. (b = 2)
 * 4. Read the operator character into 'operator'. (operator = '/')
 * 5. Enter the switch(operator) block.
 * 6. Skip case '+', '-', and '*'.
 * 7. Match case '/'. Execute System.out.println(10 / 2).
 * 8. Hit the 'break' statement and exit the switch block.
 *
 * Output:
 * 5
 */

import java.util.Scanner; 

public class calculator { 
    
    public static void main(String[] args) { 
        
        // 1. Initialize the Scanner tool to read keyboard input
        Scanner sc = new Scanner(System.in); 
        
        // 2. Prompt and read the first integer operand 
        System.out.println("enter a :"); 
        int a = sc.nextInt(); 
        
        // 3. Prompt and read the second integer operand
        System.out.println("enter b :"); 
        int b = sc.nextInt(); 
        
        // 4. Prompt and read the arithmetic operator character
        System.out.println("enter operator :"); 
        // sc.next() reads the next word, and .charAt(0) extracts its first character
        char operator = sc.next().charAt(0); 
        
        // 5. Use a switch statement to direct flow based on the operator character
        switch(operator) {
            case '+' : 
                System.out.println(a + b); 
                break; // 'break' prevents the execution from falling through to the next case
                
            case '-' : 
                System.out.println(a - b); 
                break;
                
            case '*' : 
                System.out.println(a * b); 
                break;
                
            case '/' : 
                // Note: Integer division discards the remainder (e.g., 5 / 2 = 2)
                System.out.println(a / b); 
                break;
                
            case '%' : 
                System.out.println(a % b); 
                break;
                
            default : 
                // Fallback for invalid operators
                System.out.println("wrong operator"); 
        }

        // 6. Close the scanner to release system resources 
        sc.close(); 
    }    
}

/*
 * ==========================================
 * IMPORTANT NOTES FOR REVISION:
 * ==========================================
 * 1. Character Input Parsing: Java's `Scanner` does not have a `nextChar()` method. 
 * To read a single character, you must read the input as a String using `sc.next()` 
 * and then extract the first character using the `.charAt(0)` string method.
 * 2. The Switch "Fall-Through": The `break` keyword inside each case is critical. 
 * Without it, Java will continue executing all subsequent cases until it hits a break 
 * or the end of the switch block, regardless of whether the case matches.
 * 3. The "Scanner Bug" Avoidance: While the PDFs warn heavily about mixing `nextInt()` 
 * with `nextLine()`, this code is safe because it uses `sc.next()`. 
 * Unlike `nextLine()`, `sc.next()` skips any leading whitespace (including leftover 
 * newline characters) before reading the token.
 *
 * ==========================================
 * HOW TO EXPLAIN THIS CODE IN FRONT OF INTERVIEWER:
 * ==========================================
 * "This implementation is a straightforward console-based calculator. I initialized 
 * a `Scanner` object to capture user inputs for two integers and an operator. Because 
 * `Scanner` lacks a native character read method, I parsed the operator by capturing 
 * a string token with `next()` and extracting the index zero character. For the 
 * core logic, I opted for a `switch` statement instead of cascaded `if-else` blocks to 
 * improve readability and execute the corresponding arithmetic operation based on the 
 * parsed character. I also included a default case as a robust fallback for invalid inputs."
 *
 * ==========================================
 * TIME COMPLEXITY & SPACE COMPLEXITY:
 * ==========================================
 * TIME COMPLEXITY: O(1)
 * The execution time is constant. The switch statement performs a direct jump to the 
 * matching case, and the arithmetic operations execute in O(1) time.
 *
 * SPACE COMPLEXITY: O(1)
 * The memory used is restricted to a few primitive variables (`a`, `b`, `operator`) 
 * and the `Scanner` object instance, requiring O(1) auxiliary space.
 */