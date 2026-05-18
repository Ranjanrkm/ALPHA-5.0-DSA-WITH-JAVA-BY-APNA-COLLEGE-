/*
 * ==========================================
 * Problem Statement:
 * ==========================================
 * Write a Java program to calculate the income tax of an individual based on their 
 * annual income. The program must read the income as an integer, evaluate it against 
 * predefined tax slabs using conditional statements, calculate the tax amount, and 
 * print the result. Any decimal tax values should be truncated to an integer.
 *
 * Tax Slabs:
 * - Income < 5,00,000 : 0% tax
 * - 5,00,000 <= Income < 10,00,000 : 20% tax
 * - Income >= 10,00,000 : 30% tax
 *
 * ==========================================
 * Input Format:
 * ==========================================
 * - A single integer representing the annual income.
 *
 * ==========================================
 * Output Format:
 * ==========================================
 * - A string "your tax is :" followed immediately by the calculated integer tax amount.
 *
 * ==========================================
 * Dry Run Example:
 * ==========================================
 * Input:
 * 750000
 *
 * Step-by-step working:
 * 1. Initialize Scanner and read income. (income = 750000)
 * 2. Declare tax variable.
 * 3. Evaluate if (750000 < 500000) -> FALSE.
 * 4. Evaluate else if (750000 >= 500000 && 750000 < 1000000) -> TRUE.
 * 5. Calculate tax: 750000 * 0.2 = 150000.0 (a double).
 * 6. Cast the result to integer: (int) 150000.0 = 150000.
 * 7. Assign 150000 to the 'tax' variable.
 * 8. Print "your tax is :150000".
 *
 * Output:
 * your tax is :150000
 */

import java.util.Scanner;

public class incometax { 

    public static void main(String[] args) { 
        
        // 1. Initialize Scanner for console input
        Scanner sc = new Scanner(System.in); 
        
        // 2. Read the income as an integer
        if (!sc.hasNextInt()) return; // Safety check
        int income = sc.nextInt(); 
        
        // 3. Declare a variable to hold the final calculated tax
        int tax; 
        
        // 4. Evaluate tax slabs using an if-else if-else ladder
        if (income < 500000) { 
            // Slab 1: Income below 5 Lakhs -> No tax
            tax = 0; 
        } 
        else if (income >= 500000 && income < 1000000) { 
            // Slab 2: Income between 5 Lakhs and 9,99,999 -> 20% tax
            // income * 0.2 results in a double. We must explicitly cast it to (int) 
            // because the 'tax' variable only holds integers.
            tax = (int) (income * 0.2); 
        } 
        else { 
            // Slab 3: Income 10 Lakhs or above -> 30% tax
            tax = (int) (income * 0.3); 
        }
        
        // 5. Print the final result concatenating the string and integer
        System.out.println("your tax is :" + tax); 
        
        // 6. Close the scanner to release resources
        sc.close(); 
    }
}

/*
 * ==========================================
 * IMPORTANT NOTES FOR REVISION:
 * ==========================================
 * 1. Type Casting: Multiplying an `int` (income) by a `double` (0.2) implicitly 
 * promotes the entire operation to a `double`. Because the `tax` variable is 
 * declared as an `int`, attempting `tax = income * 0.2;` will cause a compilation 
 * error ("possible loss of precision"). You MUST use explicit casting: `(int) (income * 0.2)`.
 * 2. Scope of Variables: The `tax` variable is declared outside the `if` blocks 
 * but assigned inside them. This is valid because every possible path (if, else if, else) 
 * assigns a value to it before the `println` statement uses it.
 * 3. Logical Operators: `income >= 500000 && income < 1000000` is necessary to bound 
 * the middle condition. While just `< 1000000` would work due to top-down evaluation, 
 * explicit bounding is better practice for readability and preventing bugs if the ladder is modified.
 *
 * ==========================================
 * HOW TO EXPLAIN THIS CODE IN FRONT OF INTERVIEWER:
 * ==========================================
 * "This program calculates income tax using a standard conditional ladder. I start by 
 * capturing the user's income as an integer. I then route the control flow through an 
 * `if-else if-else` structure representing the tax brackets. The critical part of this 
 * code is handling the arithmetic. Since multiplying the integer income by a decimal 
 * rate (like 0.2) yields a double, I perform an explicit narrowing cast `(int)` to safely 
 * truncate the decimal and store the result back into the integer `tax` variable before printing."
 *
 * ==========================================
 * TIME COMPLEXITY & SPACE COMPLEXITY:
 * ==========================================
 * TIME COMPLEXITY: O(1)
 * The conditional checks and basic arithmetic operations all execute in constant time.
 *
 * SPACE COMPLEXITY: O(1)
 * Memory usage is limited to a few primitive variables (`income`, `tax`) and the Scanner object.
 */