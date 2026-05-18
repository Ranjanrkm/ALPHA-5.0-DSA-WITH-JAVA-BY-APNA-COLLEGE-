/*
 * ==========================================
 * Problem Statement:
 * ==========================================
 * Write a program to calculate the area of a circle. The program should read the 
 * radius from the user, compute the area using the standard mathematical formula, 
 * and print the result. To ensure it passes strict competitive coding environments 
 * (like TCS NQT), it must handle decimal inputs safely and format the output to 
 * exactly 2 decimal places to avoid presentation errors.
 *
 * ==========================================
 * Input Format:
 * ==========================================
 * - A single floating-point number (double) representing the radius of the circle.
 *
 * ==========================================
 * Output Format:
 * ==========================================
 * - A single floating-point number representing the area of the circle, 
 * formatted to exactly 2 decimal places.
 *
 * ==========================================
 * Dry Run Example:
 * ==========================================
 * Input: 
 * 5
 *
 * Step-by-step working:
 * 1. Initialize Scanner to read input from the console.
 * 2. Read the input value into the variable `rad`. (rad = 5.0)
 * 3. Calculate the area using the formula: Area = pi * r * r.
 * -> area = Math.PI * 5.0 * 5.0
 * -> area = 3.141592653589793 * 25.0
 * -> area = 78.53981633974483
 * 4. Format the output to 2 decimal places using printf("%.2f\n").
 *
 * Output: 
 * 78.54
 */

import java.util.Scanner; 

public class areacircle { 

    public static void main(String[] args) { 
        
        // 1. Create a Scanner object to read input from the keyboard
        Scanner sc = new Scanner(System.in); 
        
        // 2. Safety check: Ensure there is actually a number to read
        if (sc.hasNextDouble()) {
            
            // 3. Read the radius as a double so decimal values (e.g., 2.5) work perfectly
            double rad = sc.nextDouble(); 
            
            // 4. Calculate area using Java's highly accurate Math.PI constant
            // Formula: Area = pi * radius^2
            double area = Math.PI * rad * rad; 
            
            // 5. TCS NQT Standard: Format output to exactly 2 decimal places.
            // Using printf prevents "Presentation Errors" in hidden test cases.
            // \n is added because printf does not automatically insert a new line.
            System.out.printf("%.2f\n", area); 
        }
        
        // 6. Always close the Scanner to free up system resources and prevent memory leaks
        sc.close(); 
    }
}

/*
 * ==========================================
 * IMPORTANT NOTES FOR REVISION:
 * ==========================================
 * 1. Precision Handling: Simply using `System.out.println(area)` often leads to a 
 * "Presentation Error" or "Wrong Answer" on platforms like TCS NQT because they 
 * expect strict decimal formatting (e.g., `78.54` instead of `78.53981633974483`). 
 * Always default to `System.out.printf("%.2f\n", value)` when decimals matter.
 * 2. Math Constants: Never hardcode pi as `3.14` or `22/7`. Always use `Math.PI` 
 * to guarantee maximum floating-point accuracy.
 * 3. Data Types: Using `double` instead of `int` for the radius ensures the program 
 * doesn't crash or incorrectly truncate values if a user inputs a decimal like `2.5`.
 *
 * ==========================================
 * HOW TO EXPLAIN THIS CODE IN FRONT OF INTERVIEWER:
 * ==========================================
 * "As a final-year IT student, I know that even straightforward computational logic 
 * can fail hidden test cases in strict environments if data types and precision aren't 
 * handled carefully. To solve this, I first imported the Scanner class to handle standard 
 * input and stored the radius in a `double` to seamlessly accommodate decimal values. 
 * I calculated the area utilizing Java's built-in `Math.PI` constant for optimal accuracy, 
 * rather than a hardcoded approximation. Finally, because competitive programming platforms 
 * evaluate output strictly, I utilized `System.out.printf` to format the final area to 
 * exactly two decimal places, preventing any presentation errors."
 *
 * ==========================================
 * TIME COMPLEXITY & SPACE COMPLEXITY:
 * ==========================================
 * TIME COMPLEXITY: O(1)
 * The calculation of the area takes constant time. It performs the same number of 
 * mathematical operations regardless of the input size.
 *
 * SPACE COMPLEXITY: O(1)
 * The program only allocates memory for a few primitive double variables (`rad`, `area`) 
 * and a Scanner object, requiring a constant amount of auxiliary space.
 */