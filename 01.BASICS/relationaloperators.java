public class relationaloperators { // This is the class name. It is kept the same as your code.

    public static void main(String args[]) { // Main method: Java starts execution from here.

        int a = 10; // Create integer variable a and store value 10.

        int b = 5; // Create integer variable b and store value 5.

        // == checks whether two values are equal.
        System.out.println(a == b);

        // != checks whether two values are NOT equal.
        System.out.println(a != b);

        // > checks whether left value is greater than right value.
        System.out.println(a > b);

        // < checks whether left value is smaller than right value.
        System.out.println(a < b);

        // <= checks whether left value is less than or equal to right value.
        System.out.println(a <= b);

        // >= checks whether left value is greater than or equal to right value.
        System.out.println(a >= b);
    }

}

/*
WHAT THIS CODE DOES

This program demonstrates relational operators in Java.

It compares two numbers:
a = 10
b = 5

and prints either:
true
or
false

depending on the comparison result.

LINE-BY-LINE EXPLANATION

public class relationaloperators
This creates a class named relationaloperators.

public static void main(String args[])
This is the main method.
Java starts execution from here.

int a = 10;
This creates an integer variable named a and stores 10.

int b = 5;
This creates another integer variable named b and stores 5.

System.out.println(a == b);
== checks whether both values are equal.

10 == 5
This is false.

System.out.println(a != b);
!= checks whether values are not equal.

10 != 5
This is true.

System.out.println(a > b);
> checks whether a is greater than b.

10 > 5
This is true.

System.out.println(a < b);
< checks whether a is smaller than b.

10 < 5
This is false.

System.out.println(a <= b);
<= checks whether a is less than or equal to b.

10 <= 5
This is false.

System.out.println(a >= b);
>= checks whether a is greater than or equal to b.

10 >= 5
This is true.

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
main is the starting point of the Java program.

6) String args[]
This stores command-line arguments.

7) int
int is a data type for whole numbers.

8) variable
A variable stores data.
Here:
a and b are variables.

9) relational operators
Relational operators compare two values.

10) ==
Checks equality.

11) !=
Checks not equal.

12) >
Checks greater than.

13) <
Checks less than.

14) <=
Checks less than or equal to.

15) >=
Checks greater than or equal to.

16) boolean value
The result of relational operators is always:
true or false

17) println
println prints output and moves to the next line.

IMPORTANT JAVA CONCEPTS USED

1) Relational operators
This program demonstrates all major relational operators.

2) Boolean output
Comparisons always return true or false.

3) Expression evaluation
Java evaluates the comparison first, then prints the result.

4) Variables
Variables are used for storing values before comparison.

INPUT AND OUTPUT

Input:
No user input is needed.

Output:
false
true
true
false
false
true

DRY RUN WITH EXAMPLE

Values:
a = 10
b = 5

Step 1:
a == b
10 == 5
false

Step 2:
a != b
10 != 5
true

Step 3:
a > b
10 > 5
true

Step 4:
a < b
10 < 5
false

Step 5:
a <= b
10 <= 5
false

Step 6:
a >= b
10 >= 5
true

Final output:
false
true
true
false
false
true

COMMON BEGINNER MISTAKES

1) Confusing = and ==
= means assignment.
== means comparison.

2) Forgetting that comparisons return boolean values
The result is always true or false.

3) Writing => instead of >=
Correct operator:
>=

4) Writing =< instead of <=
Correct operator:
<=

5) Thinking != means divide
!= means not equal.

6) Forgetting semicolons
Every Java statement must end with a semicolon.

EASY INTERVIEW ANSWER

Relational operators are used to compare two values in Java.
They return either true or false.
Examples include:
==, !=, >, <, <=, >=

ONE PRACTICE QUESTION

Write a Java program that compares two numbers and prints:
- whether they are equal
- whether the first number is greater
- whether the second number is greater
*/