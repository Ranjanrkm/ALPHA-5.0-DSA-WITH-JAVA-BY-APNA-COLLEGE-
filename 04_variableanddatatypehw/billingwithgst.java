import java.util.*;

/*
=========================================================
PROBLEM STATEMENT
=========================================================
Write a Java program to calculate the total bill amount
of three items:

1. Pencil
2. Pen
3. Eraser

After calculating the total bill amount, add 18% GST
(Goods and Services Tax) and print the final bill.

=========================================================
INPUT FORMAT
=========================================================
Three floating-point numbers:

pencilPrice
penPrice
eraserPrice

Example:
10
20
5

=========================================================
OUTPUT FORMAT
=========================================================
Print:

1. Total Bill Amount
2. Bill Amount After Adding 18% GST

Example:

35.00
41.30

=========================================================
DRY RUN EXAMPLE 1
=========================================================

Input:
10
20
5

Step 1:
pencil = 10

Step 2:
pen = 20

Step 3:
eraser = 5

Step 4:
total = pencil + pen + eraser
total = 10 + 20 + 5
total = 35

Step 5:
gstAmount = 18% of 35
gstAmount = 0.18 × 35
gstAmount = 6.30

Step 6:
finalBill = total + gstAmount
finalBill = 35 + 6.30
finalBill = 41.30

Output:
35.00
41.30

=========================================================
DRY RUN EXAMPLE 2
=========================================================

Input:
15
25
10

Step 1:
total = 15 + 25 + 10
total = 50

Step 2:
gstAmount = 50 × 18 / 100
gstAmount = 9

Step 3:
finalBill = 50 + 9
finalBill = 59

Output:
50.00
59.00

=========================================================
FULLY COMMENTED JAVA CODE
=========================================================
*/

public class billingwithgst {

    public static void main(String args[]) {

        // Create Scanner object.
        //
        // Scanner is used to read input from the keyboard.
        Scanner sc = new Scanner(System.in);

        // Read the price of the pencil.
        //
        // Example Input:
        // 10
        //
        // After execution:
        // pencil = 10.0
        float pencil = sc.nextFloat();

        // Read the price of the pen.
        //
        // Example Input:
        // 20
        //
        // After execution:
        // pen = 20.0
        float pen = sc.nextFloat();

        // Read the price of the eraser.
        //
        // Example Input:
        // 5
        //
        // After execution:
        // eraser = 5.0
        float eraser = sc.nextFloat();

        // Calculate the total bill before GST.
        //
        // Formula:
        // Total Bill = Pencil + Pen + Eraser
        //
        // Example:
        // 10 + 20 + 5 = 35
        float total = pencil + pen + eraser;

        // Calculate GST amount.
        //
        // GST Percentage = 18%
        //
        // Formula:
        // GST Amount = Total × 18 / 100
        //
        // Example:
        // 35 × 18 / 100 = 6.30
        float gstAmount = total * 18 / 100;

        // Calculate final bill after GST.
        //
        // Formula:
        // Final Bill = Total Bill + GST Amount
        //
        // Example:
        // 35 + 6.30 = 41.30
        float finalBill = total + gstAmount;

        // Print total bill before GST.
        //
        // %.2f ensures exactly 2 digits
        // after the decimal point.
        //
        // Example:
        // 35.00
        System.out.printf("%.2f%n", total);

        // Print final bill after GST.
        //
        // Example:
        // 41.30
        System.out.printf("%.2f%n", finalBill);

        // Close Scanner.
        //
        // Good programming practice.
        sc.close();
    }
}

/*
=========================================================
IMPORTANT NOTES FOR REVISION
=========================================================

1. Total Bill Formula:

   Total = Pencil + Pen + Eraser

2. GST Formula:

   GST Amount = Total × GST Percentage / 100

3. Final Bill Formula:

   Final Bill = Total + GST Amount

4. Always use floating-point data types
   when dealing with money calculations.

5. For large financial applications,
   prefer double over float for better precision.

6. TCS NQT Rule:
   Do not print extra statements like:

   "Enter Pencil Price"
   "Enter Pen Price"

   unless explicitly required.

7. If the output requires decimal values,
   use:

   System.out.printf("%.2f", value);

=========================================================
COMMON BEGINNER MISTAKES
=========================================================

1. Forgetting to divide GST by 100.

   Wrong:
   total * 18

   Correct:
   total * 18 / 100

---------------------------------------------------------

2. Using integer variables instead of float.

---------------------------------------------------------

3. Printing unnecessary messages that
   cause Online Judge failures.

---------------------------------------------------------

4. Forgetting to add GST to the total bill.

---------------------------------------------------------

5. Using wrong GST percentage.

=========================================================
HOW TO EXPLAIN THIS CODE IN FRONT OF INTERVIEWER
=========================================================

"This program calculates the bill amount of
three products: pencil, pen, and eraser.

First, I take the prices of all three items
as input using Scanner.

Then I calculate the total bill amount by
adding all item prices.

Next, I calculate the GST amount using
the formula:

GST Amount = Total × 18 / 100

Finally, I add the GST amount to the total
bill and print both the original bill and
the final bill after tax.

The solution uses simple arithmetic
operations and runs in constant time."

=========================================================
TIME COMPLEXITY
=========================================================

O(1)

Reason:
Only a fixed number of arithmetic operations
are performed.

=========================================================
SPACE COMPLEXITY
=========================================================

O(1)

Reason:
Only a few float variables are used.

No extra data structure is required.

=========================================================
INTERVIEW QUICK ANSWER
=========================================================

Q1. What is GST?

Answer:
GST stands for Goods and Services Tax.

---------------------------------------------------------

Q2. How do you calculate 18% GST?

Answer:
GST Amount = Total × 18 / 100

---------------------------------------------------------

Q3. Why use float or double?

Answer:
Because bill amounts may contain decimal values.

---------------------------------------------------------

Q4. What is the time complexity?

Answer:
O(1)

Because only a fixed number of calculations
are performed.

---------------------------------------------------------

Q5. If total bill is 100, what is the final
bill after 18% GST?

Answer:

GST = 100 × 18 / 100 = 18

Final Bill = 100 + 18 = 118

=========================================================
END OF FILE
=========================================================
*/
