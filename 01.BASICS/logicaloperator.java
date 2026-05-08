public class logicaloperator { // This is the class name. It is kept the same as your code.

    public static void main(String args[]) { // Main method: Java starts execution from here.

        // LOGICAL AND OPERATOR (&&)
        // AND returns true only when BOTH conditions are true.

        System.out.println((3 > 2) && (5 > 0));
        // true && true
        // Output: true

        System.out.println((3 < 2) && (5 > 0));
        // false && true
        // Output: false

        System.out.println((3 < 2) && (5 < 0));
        // false && false
        // Output: false

        System.out.println((3 > 2) && (5 < 0));
        // true && false
        // Output: false


        // LOGICAL OR OPERATOR (||)
        // OR returns true if AT LEAST ONE condition is true.

        System.out.println((3 > 2) || (5 > 0));
        // true || true
        // Output: true

        System.out.println((3 < 2) || (5 > 0));
        // false || true
        // Output: true

        System.out.println((3 < 2) || (5 < 0));
        // false || false
        // Output: false

        System.out.println((3 > 2) || (5 < 0));
        // true || false
        // Output: true


        // LOGICAL NOT OPERATOR (!)
        // NOT reverses the result.
        // true becomes false
        // false becomes true

        System.out.println(!(3 > 2));
        // !(true)
        // Output: false

        System.out.println(!(3 < 2));
        // !(false)
        // Output: true
    }
}

/*
WHAT THIS CODE DOES

This program demonstrates logical operators in Java.

The program uses:
1) Logical AND (&&)
2) Logical OR (||)
3) Logical NOT (!)

It checks conditions and prints either true or false.

LINE-BY-LINE EXPLANATION

public class logicaloperator
This creates a class named logicaloperator.

public static void main(String args[])
This is the main method.
Java starts execution from here.

System.out.println((3 > 2) && (5 > 0));
This checks:
Is 3 greater than 2?
AND
Is 5 greater than 0?

Both are true.
So the result is true.

System.out.println((3 < 2) && (5 > 0));
This checks:
false && true

AND needs both conditions true.
So the result is false.

System.out.println((3 < 2) && (5 < 0));
Both conditions are false.
So result is false.

System.out.println((3 > 2) && (5 < 0));
true && false
Result is false.

System.out.println((3 > 2) || (5 > 0));
true || true
OR needs at least one true.
Result is true.

System.out.println((3 < 2) || (5 > 0));
false || true
One condition is true.
Result is true.

System.out.println((3 < 2) || (5 < 0));
false || false
Both are false.
Result is false.

System.out.println((3 > 2) || (5 < 0));
true || false
One condition is true.
Result is true.

System.out.println(!(3 > 2));
3 > 2 is true.
NOT reverses true to false.

System.out.println(!(3 < 2));
3 < 2 is false.
NOT reverses false to true.

EXPLANATION OF ALL CODING TERMS USED

1) class
A class is a container for Java code.

2) public
public means accessible from anywhere.

3) static
static means the method belongs to the class itself.

4) void
void means the method returns nothing.

5) main
main is the starting point of the program.

6) String args[]
This stores command-line arguments.

7) logical operator
Logical operators combine or reverse conditions.

8) &&
This is the logical AND operator.
Result is true only when both conditions are true.

9) ||
This is the logical OR operator.
Result is true when at least one condition is true.

10) !
This is the logical NOT operator.
It reverses true to false and false to true.

11) condition
A condition gives either true or false.

12) relational operator
Operators like > and < compare values.

13) boolean value
true and false are boolean values.

14) println
println prints output and moves to the next line.

IMPORTANT JAVA CONCEPTS USED

1) Boolean logic
This program teaches true and false logic.

2) Logical operators
The program demonstrates:
- AND
- OR
- NOT

3) Relational operators
The conditions use:
>
<

4) Expression evaluation
Java first checks the conditions and then prints the result.

INPUT AND OUTPUT

Input:
No user input is needed.

Output:
true
false
false
false
true
true
false
true
false
true

DRY RUN WITH EXAMPLE

Example:
(3 > 2) && (5 > 0)

Step 1:
3 > 2
Result: true

Step 2:
5 > 0
Result: true

Step 3:
true && true
Final result: true

COMMON BEGINNER MISTAKES

1) Confusing && and ||
&& means BOTH conditions true.
|| means ANY ONE condition true.

2) Forgetting parentheses
Parentheses make conditions easier to read.

3) Thinking ! means not equal
!= means not equal.
! alone means logical NOT.

4) Using = instead of ==
= means assignment.
== means comparison.

5) Confusing true/false with strings
true is boolean.
"true" is a string.

EASY INTERVIEW ANSWER

Logical operators are used to combine or reverse conditions in Java.
&& returns true only if both conditions are true.
|| returns true if at least one condition is true.
! reverses the result.

ONE PRACTICE QUESTION

Write a Java program that checks:
- if a number is greater than 10 AND less than 50
- if a number is less than 0 OR greater than 100
*/