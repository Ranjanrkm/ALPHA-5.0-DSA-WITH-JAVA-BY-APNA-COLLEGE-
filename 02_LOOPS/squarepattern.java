
/*
 * ==========================================
 * Problem Statement:
 * ==========================================
 * Write a Java program to print a square pattern
 * of stars (*) using a while loop.
 *
 * The program should:
 * - Print 4 rows.
 * - Each row should contain 4 stars.
 *
 * Pattern:
 *
 * * * * *
 * * * * *
 * * * * *
 * * * * *
 *
 * This program demonstrates:
 * - while loop
 * - Pattern Printing
 * - Loop Counter Variable
 *
 * ==========================================
 * Input Format:
 * ==========================================
 * No input required.
 *
 * ==========================================
 * Output Format:
 * ==========================================
 * * * * *
 * * * * *
 * * * * *
 * * * * *
 *
 * ==========================================
 * Dry Run Example:
 * ==========================================
 * Initial Value:
 *
 * line = 1
 *
 * ------------------------------------------
 *
 * Iteration 1:
 *
 * line = 1
 *
 * Print:
 * * * * *
 *
 * line becomes 2
 *
 * ------------------------------------------
 *
 * Iteration 2:
 *
 * line = 2
 *
 * Print:
 * * * * *
 *
 * line becomes 3
 *
 * ------------------------------------------
 *
 * Iteration 3:
 *
 * line = 3
 *
 * Print:
 * * * * *
 *
 * line becomes 4
 *
 * ------------------------------------------
 *
 * Iteration 4:
 *
 * line = 4
 *
 * Print:
 * * * * *
 *
 * line becomes 5
 *
 * ------------------------------------------
 *
 * Condition Check:
 *
 * 5 <= 4
 *
 * FALSE
 *
 * Loop terminates.
 */

public class squarepattern {

    public static void main(String args[]) {

        // Initialize line counter
        int line = 1;

        /*
         * Run loop until line becomes greater than 4
         */
        while (line <= 4) {

            // Print one complete row of stars
            System.out.println("* * * *");

            // Move to next row
            line++;
        }
    }
}

/*
 * ==========================================
 * IMPORTANT NOTES FOR REVISION:
 * ==========================================
 * 1. This is a basic pattern printing program.
 *
 * 2. while loop controls the number of rows.
 *
 * 3. Here:
 *
 * line = 1
 * line <= 4
 *
 * means exactly 4 rows are printed.
 *
 * 4. Pattern printing is a very common topic
 *    in beginner Java interviews and coding tests.
 *
 * ==========================================
 * COMMON BEGINNER MISTAKES:
 * ==========================================
 * 1. Forgetting:
 *
 * line++;
 *
 * Result:
 * Infinite Loop
 *
 * ------------------------------------------
 *
 * 2. Writing:
 *
 * line < 4
 *
 * instead of:
 *
 * line <= 4
 *
 * Output:
 * Only 3 rows printed.
 *
 * ------------------------------------------
 *
 * 3. Using print() instead of println().
 *
 * Then all rows appear on the same line.
 *
 * ==========================================
 * HOW TO EXPLAIN THIS CODE IN FRONT OF INTERVIEWER:
 * ==========================================
 * "This program prints a square star pattern
 * using a while loop. A counter variable named
 * line controls the number of rows. During each
 * iteration, one complete row containing four
 * stars is printed. The counter is incremented
 * after every iteration, and the loop stops
 * after printing four rows."
 *
 * ==========================================
 * TIME COMPLEXITY & SPACE COMPLEXITY:
 * ==========================================
 * TIME COMPLEXITY:
 *
 * O(n)
 *
 * Here:
 * n = 4 rows
 *
 * Loop executes 4 times.
 *
 * ------------------------------------------
 *
 * SPACE COMPLEXITY:
 *
 * O(1)
 *
 * Only one integer variable is used.
 *
 * ==========================================
 * INTERVIEW QUICK ANSWER:
 * ==========================================
 * Q: Which loop is used here?
 *
 * Answer:
 * A while loop is used to control the number
 * of rows printed in the pattern.
 *
 * ------------------------------------------
 *
 * Q: Why is this called a square pattern?
 *
 * Answer:
 * Because the number of rows and the number
 * of columns are equal, forming a square shape.
 *
 * ------------------------------------------
 *
 * Q: What happens if line++ is removed?
 *
 * Answer:
 * The condition never becomes false,
 * causing an infinite loop.
 */