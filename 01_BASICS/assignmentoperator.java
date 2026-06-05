/*
 * ==========================================
 * Problem Statement:
 * ==========================================
 * Demonstrate the usage of compound assignment operators in Java. 
 * Specifically, initialize an integer variable with a value and use the `+=` 
 * operator to update its value, showing the shorthand method for `a = a + 10`.
 *
 * ==========================================
 * Input Format:
 * ==========================================
 * - No dynamic input is required for this demonstration program. Values are hardcoded.
 *
 * ==========================================
 * Output Format:
 * ==========================================
 * - A single integer representing the final calculated value.
 *
 * ==========================================
 * Dry Run Example:
 * ==========================================
 * Initial State:
 * a = 10
 *
 * Operation: a += 10
 * Step 1: Evaluate the right side implicitly: a + 10 -> 10 + 10 = 20
 * Step 2: Assign the result back to 'a': a = 20
 *
 * Output:
 * 20
 */

public class assignmentoperator { 

    public static void main(String[] args) { 
        
        // 1. Initialize an integer variable 'a' with the value 10.
        int a = 10; 
        
        // 2. The Long Way (Commented out):
        // a = a + 10; 
        
        // 3. The Short Way (Compound Assignment):
        // The '+=' operator adds the value on the right to the variable on the left, 
        // and then assigns the new result back to the variable on the left.
        a += 10; 
        
        // 4. Print the final updated value of 'a'.
        System.out.println(a); 
    }
}

/*
 * ==========================================
 * IMPORTANT NOTES FOR REVISION:
 * ==========================================
 * 1. Compound Operators: Java supports several compound assignment operators, 
 * including `+=`, `-=`, `*=`, `/=`, and `%=`. They make code cleaner and more concise.
 * 2. Syntax Rule: Never put a space between the mathematical operator and the equals sign. 
 * `a + = 10` is a syntax error; it must be `a += 10`.
 * 3. Implicit Casting: A hidden feature of compound operators (like `+=`) is that they 
 * automatically cast the result back to the type of the left-hand variable, which 
 * prevents certain compilation errors that the long form (`a = a + b`) might cause 
 * if the types differ.
 *
 * ==========================================
 * HOW TO EXPLAIN THIS CODE IN FRONT OF INTERVIEWER:
 * ==========================================
 * "This program demonstrates the `+=` compound assignment operator. I initialized 
 * an integer variable 'a' to 10. Instead of writing the verbose `a = a + 10`, 
 * I used `a += 10`. This operator evaluates the addition and assigns the result 
 * back to the variable in a single step, resulting in cleaner code. This is 
 * standard practice in Java development for incrementing variables efficiently."
 *
 * ==========================================
 * TIME COMPLEXITY & SPACE COMPLEXITY:
 * ==========================================
 * TIME COMPLEXITY: O(1)
 * The assignment and arithmetic operations execute in constant time.
 *
 * SPACE COMPLEXITY: O(1)
 * A single integer variable `a` is stored in memory, requiring constant space.
 */