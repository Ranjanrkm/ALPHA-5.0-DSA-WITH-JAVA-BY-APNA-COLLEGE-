import java.util.*; // This imports useful Java classes like Scanner.

/*
    Area of a Circle Program

    This program reads the radius of a circle from the user,
    calculates the area, and prints the answer.

    According to the Java input-output notes in your PDFs:
    - when one number is given, Scanner + nextDouble() is a simple and safe choice
    - decimal output should be handled carefully
    - Math.PI is better than writing 3.14 by hand for accuracy
    - if exact decimal places are needed, printf("%.2f", value) can be used
    :contentReference[oaicite:0]{index=0} :contentReference[oaicite:1]{index=1} :contentReference[oaicite:2]{index=2}
*/

public class areacircle { // Keep the class name unchanged as requested.

    public static void main(String args[]) { // Main method: Java starts running from here.

        Scanner sc = new Scanner(System.in); // Create Scanner object to read input from the keyboard.

        double rad = sc.nextDouble(); // Read the radius as a double so decimal values also work.

        double area = Math.PI * rad * rad; // Formula: area = pi × radius × radius.

        System.out.println(area); // Print the calculated area.

        sc.close(); // Close Scanner after use.
    }
}

/*
WHAT THE CODE DOES

This program finds the area of a circle.
It takes the radius from the user and uses the formula:

Area = pi × radius × radius

Then it prints the result.

LINE-BY-LINE EXPLANATION

import java.util.*;
This line brings Scanner into the program.
Scanner is used to take input from the user.

public class areacircle
This defines the class name.
You asked not to change the file name, so the class name is also kept the same.

public static void main(String args[])
This is the starting point of the program.
Java begins execution from this method.

Scanner sc = new Scanner(System.in);
This creates a Scanner object.
It lets the program read input from the keyboard.

double rad = sc.nextDouble();
This reads the radius.
double is used because radius can be a decimal like 2.5.

double area = Math.PI * rad * rad;
This calculates the area using the circle formula.
Math.PI is Java’s built-in value of pi.

System.out.println(area);
This prints the answer on the screen.

sc.close();
This closes the Scanner object.
It is a good habit to close input resources.

EXPLANATION OF ALL CODING TERMS USED

1) import
This tells Java to use ready-made classes from a package.

2) Scanner
Scanner is a class for reading input.

3) object
An object is a usable copy of a class.
Here, sc is a Scanner object.

4) double
double is a data type for decimal numbers.
Example: 3.14, 5.0, 2.75

5) variable
A variable stores a value.
Here, rad and area are variables.

6) Math.PI
This is Java’s built-in value of pi.
It is more accurate than 3.14.

7) operator
An operator is a symbol that performs an action.
* means multiplication.

8) formula
A formula is a math rule.
For circle area, the formula is pi × r × r.

9) println
This prints the value and moves to the next line.

10) close()
This closes the Scanner object.

IMPORTANT JAVA CONCEPTS USED

1) Input handling
The PDFs show that simple number input can be read directly with Scanner and nextDouble(). :contentReference[oaicite:3]{index=3}

2) Decimal handling
The PDFs say decimal precision matters in output.
If the question asks for a fixed number of decimal places, use printf("%.2f", area);. :contentReference[oaicite:4]{index=4}

3) Math constant
Math.PI is a built-in constant for pi.
This gives better accuracy than a hardcoded value.

4) Type choice
Using double is better than float for cleaner decimal work in many beginner problems.

INPUT AND OUTPUT ACCORDING TO THE PDFs AND THIS CODE

Input:
One decimal number for the radius.

Example input:
5

Output:
The area of the circle.

Example output:
78.53981633974483

If a problem asks for exactly 2 decimal places, then use:
System.out.printf("%.2f", area);

Then the output for radius 5 becomes:
78.54

The PDFs also warn that output formatting matters a lot, so sometimes the same answer can be marked wrong if the decimal style is not exact. 

DRY RUN WITH AN EXAMPLE

Example input:
5

Step 1:
rad = 5

Step 2:
area = Math.PI * 5 * 5

Step 3:
area = 78.53981633974483

Step 4:
Print the value

Final output:
78.53981633974483

COMMON BEGINNER MISTAKES

1) Using int instead of double
Then decimal radii will not work properly.

2) Using 3.14 only
That is less accurate than Math.PI.

3) Forgetting the second radius
The formula is radius × radius, not just radius.

4) Missing semicolons
Every statement in Java must end with a semicolon.

5) Wrong output format
If the judge wants 2 decimal places, println may not be enough.
Use printf("%.2f", area).

EASY INTERVIEW ANSWER

This program reads the radius of a circle, calculates the area using pi multiplied by radius squared, and prints the result.

ONE PRACTICE QUESTION

Write a program to read the radius of a circle and print its circumference.
Use the formula:
Circumference = 2 × pi × radius
*/