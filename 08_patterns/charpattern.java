/*
=========================================================
PROBLEM STATEMENT
=========================================================
Write a Java program to print the following
Character Pattern:

A
BC
DEF
GHIJ

The program uses:

1. Nested Loops
2. Character Data Type
3. Character Increment Operator
4. Pattern Printing Logic

=========================================================
INPUT FORMAT
=========================================================

No Input Required.

Pattern size is hardcoded:

n = 4

=========================================================
OUTPUT FORMAT
=========================================================

A
BC
DEF
GHIJ

=========================================================
DRY RUN EXAMPLE
=========================================================

Initial Values:

n = 4
ch = 'A'

---------------------------------------------------------

Line = 1

Print:

A

After Printing:

ch = 'B'

---------------------------------------------------------

Line = 2

Print:

B C

After Printing:

ch = 'D'

---------------------------------------------------------

Line = 3

Print:

D E F

After Printing:

ch = 'G'

---------------------------------------------------------

Line = 4

Print:

G H I J

After Printing:

ch = 'K'

---------------------------------------------------------

Final Output:

A
BC
DEF
GHIJ

=========================================================
FULLY COMMENTED JAVA CODE
=========================================================
*/

public class charpattern {

    public static void main(String args[]) {

        /*
        =================================================
        NUMBER OF LINES IN THE PATTERN
        =================================================

        n = 4 means the pattern will contain
        4 rows.

        Row 1 -> 1 character
        Row 2 -> 2 characters
        Row 3 -> 3 characters
        Row 4 -> 4 characters
        */
        int n = 4;

        /*
        =================================================
        STARTING CHARACTER
        =================================================

        Pattern printing begins from 'A'.

        Characters are stored internally
        using their Unicode values.

        'A' -> 65
        'B' -> 66
        'C' -> 67
        and so on.
        */
        char ch = 'A';

        /*
        =================================================
        OUTER LOOP
        =================================================

        Controls the number of rows.

        line = 1 to n

        For n = 4

        Rows:

        1
        2
        3
        4
        */
        for (int line = 1; line <= n; line++) {

            /*
            =============================================
            INNER LOOP
            =============================================

            Prints characters in the current row.

            Example:

            line = 1 -> print 1 character

            line = 2 -> print 2 characters

            line = 3 -> print 3 characters

            line = 4 -> print 4 characters
            */
            for (int chars = 1; chars <= line; chars++) {

                /*
                Print current character.

                Example:

                A
                B
                C
                etc.
                */
                System.out.print(ch);

                /*
                Move to the next character.

                Example:

                A -> B
                B -> C
                C -> D

                Character increment works because
                char is internally represented
                using Unicode values.
                */
                ch++;
            }

            /*
            Move cursor to the next line
            after completing one row.
            */
            System.out.println();
        }
    }
}

/*
=========================================================
IMPORTANT NOTES FOR REVISION
=========================================================

1. char in Java is a 16-bit unsigned data type
   that stores Unicode characters.

---------------------------------------------------------

2. Character Increment

   ch++

   internally increments the Unicode value.

   Example:

   'A' -> 'B'
   'B' -> 'C'

---------------------------------------------------------

3. Nested Loop Pattern Logic

   Outer Loop  -> Controls Rows

   Inner Loop  -> Controls Columns /
                  Characters per Row

---------------------------------------------------------

4. Unicode Representation

   Characters are stored as numeric values.

   Example:

   'A' = 65
   'B' = 66
   'C' = 67

---------------------------------------------------------

5. Pattern Printing Questions

   Most pattern problems are solved using:

   • Nested Loops
   • Row-Column Relationship
   • Controlled Variable Updates

=========================================================
HOW TO EXPLAIN THIS CODE IN FRONT OF INTERVIEWER
=========================================================

"In this solution, I use a nested loop approach.

The outer loop controls the number of rows,
while the inner loop controls how many
characters are printed in each row.

I start with the character 'A' and after
printing each character, I increment it
using the ++ operator.

Since Java stores characters using Unicode
values, incrementing a char automatically
moves it to the next alphabet.

This allows the pattern to continue
sequentially across all rows."

=========================================================
TIME COMPLEXITY
=========================================================

O(n²)

Reason:

Total characters printed:

1 + 2 + 3 + ... + n

= n(n + 1) / 2

Therefore complexity is O(n²).

=========================================================
SPACE COMPLEXITY
=========================================================

O(1)

Reason:

Only a few primitive variables are used.

No extra array, collection, or recursion
stack is required.

=========================================================
INTERVIEW QUICK ANSWER
=========================================================

Q1. Why does ch++ work for characters in Java?

Answer:

Because char is internally stored as a
Unicode numeric value. Incrementing a char
increments its Unicode code point.

---------------------------------------------------------

Q2. What is the internal data type size of
char in Java?

Answer:

char occupies 2 bytes (16 bits) and stores
Unicode characters ranging from 0 to 65535.

---------------------------------------------------------

Q3. What is the role of the outer and inner
loops in pattern printing problems?

Answer:

The outer loop controls rows, while the
inner loop controls the number of elements
printed in each row.

---------------------------------------------------------

Q4. Why is the time complexity O(n²)?

Answer:

The total number of iterations is:

1 + 2 + 3 + ... + n

= n(n + 1) / 2

which simplifies to O(n²).

=========================================================
END OF FILE
=========================================================
*/
