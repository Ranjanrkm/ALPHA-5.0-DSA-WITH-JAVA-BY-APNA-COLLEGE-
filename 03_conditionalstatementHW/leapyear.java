/*
 * ==========================================
 * Problem Statement:
 * ==========================================
 * Write a Java program to determine whether a given year is a leap year. 
 * A year is considered a leap year if:
 * 1. It is exactly divisible by 400 (Century leap year).
 * OR
 * 2. It is exactly divisible by 4 AND NOT exactly divisible by 100.
 * * The program must handle edge cases like century years (e.g., 1900, 2000) 
 * properly to pass strict competitive programming test cases.
 *
 * ==========================================
 * Input Format:
 * ==========================================
 * - A single integer representing the year.
 *
 * ==========================================
 * Output Format:
 * ==========================================
 * - A single string formatted exactly as: "[year] is a leap year" or "[year] is not a leap year".
 *
 * ==========================================
 * Dry Run Example:
 * ==========================================
 * Example 1: Century Year (Not Leap)
 * Input: 1900
 * Working:
 * 1. year = 1900
 * 2. Check (1900 % 400 == 0) -> FALSE
 * 3. Check (1900 % 4 == 0) -> TRUE, but check (1900 % 100 != 0) -> FALSE.
 * 4. Overall condition is FALSE.
 * Output: 1900 is not a leap year
 *
 * Example 2: Normal Leap Year
 * Input: 2024
 * Working:
 * 1. year = 2024
 * 2. Check (2024 % 400 == 0) -> FALSE
 * 3. Check (2024 % 4 == 0) -> TRUE AND (2024 % 100 != 0) -> TRUE.
 * 4. Overall condition is TRUE.
 * Output: 2024 is a leap year
 */

import java.util.Scanner;

public class leapyear { 

    public static void main(String[] args) { 
        
        // 1. Initialize Scanner to dynamically capture input from the standard input stream
        Scanner sc = new Scanner(System.in); 
        
        // Safety check to ensure there is a valid integer to read
        if (!sc.hasNextInt()) return; 
        
        // 2. Read the year input
        int year = sc.nextInt(); 
        
        // 3. Evaluate Leap Year Logic
        // The logic is grouped using parentheses to ensure correct precedence.
        // Rule 1: Divisible by 400 (Handles century years like 2000, 2400)
        // Rule 2: Divisible by 4 BUT NOT by 100 (Handles standard leap years like 2024, 2028)
        if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
            
            // Note: Added a space before "is" to prevent formatting errors (e.g., "2024is")
            System.out.println(year + " is a leap year"); 
            
        } else {
            
            System.out.println(year + " is not a leap year"); 
            
        }
        
        // 4. Close the scanner to release system resources
        sc.close(); 
    }
}

/*
 * ==========================================
 * IMPORTANT NOTES FOR REVISION:
 * ==========================================
 * 1. The Century Trap: A very common beginner mistake is writing just `if (year % 4 == 0)`. 
 * While this works for 2024, it completely fails for the year 1900. 1900 is divisible by 4, 
 * but it is NOT a leap year. Century years must be divisible by 400 to be a leap year.
 * 2. Spacing in Output: In the original code provided, `System.out.println(year + "is...");` 
 * lacked a leading space, resulting in "2024is a leap year". In strict coding assessments like 
 * TCS NQT, this triggers a "Presentation Error". Always verify string concatenation spacing.
 * 3. Short-Circuiting: Placing `(year % 400 == 0)` first or grouped securely allows Java 
 * to use short-circuit evaluation. If it's a multiple of 400, Java skips the rest of the 
 * condition entirely, slightly optimizing execution.
 * 4. Removing Prompts: Do not use `System.out.println("input the year:");` in competitive 
 * programming. The judge's compiler reads standard output strictly; extra prompts will cause 
 * the test cases to fail.
 *
 * ==========================================
 * HOW TO EXPLAIN THIS CODE IN FRONT OF INTERVIEWER:
 * ==========================================
 * "To determine if a year is a leap year, I wrote a conditional statement that accounts 
 * for the Gregorian calendar's century rule. Rather than nesting multiple if-else blocks 
 * or creating overly verbose boolean variables, I combined the logic into a single, clean 
 * evaluation. First, it checks if the year is a century leap year by using `year % 400 == 0`. 
 * If that fails, it checks the standard leap year rule: divisible by 4 AND not divisible 
 * by 100. This handles all edge cases perfectly. I also ensured strict output formatting 
 * by avoiding hardcoded input prompts and carefully managing string concatenation spaces."
 *
 * ==========================================
 * TIME COMPLEXITY & SPACE COMPLEXITY:
 * ==========================================
 * TIME COMPLEXITY: O(1)
 * The modulo arithmetic operations and conditional checks execute in constant time, 
 * regardless of the size of the input year.
 *
 * SPACE COMPLEXITY: O(1)
 * The algorithm allocates memory strictly for a single primitive integer (`year`) 
 * and the Scanner instance, requiring constant O(1) auxiliary space.
 */