import java.util.*; // This imports Scanner and other useful Java classes.

/*
    Input Demo Program

    This program shows how to take input in Java.
    In this version, we read one float value and print it back.

    The PDFs you shared say:
    - if input is a single number, Scanner with nextFloat() / nextInt() is simple and safe
    - if decimal output matters, formatting like printf("%.2f", value) can be used
    - keeping input and output exact is very important in coding tests
    :contentReference[oaicite:0]{index=0} :contentReference[oaicite:1]{index=1} :contentReference[oaicite:2]{index=2}
*/

public class input { // Keep the class name same as your code.

    public static void main(String args[]) { // Main method: Java starts execution here.

        Scanner sc = new Scanner(System.in); // Create Scanner object to read input from keyboard.

        /*
            These are example input lines.
            They are commented out, so they do not run.

            next()      -> reads one word
            nextLine()  -> reads full line
            nextInt()   -> reads an integer
            nextFloat() -> reads a decimal number like 12.5
        */

        // String input = sc.next(); // Reads one word only.
        // System.out.println(input); // Prints that one word.

        // String name = sc.nextLine(); // Reads a full line of text.
        // System.out.println(name); // Prints the full line.

        // int number = sc.nextInt(); // Reads a whole number.
        // System.out.println(number); // Prints the integer.

        float price = sc.nextFloat(); // Read one decimal number as float.

        System.out.println(price); // Print the same value back.

        sc.close(); // Close Scanner after use.
    }
}

/*
WHAT THIS CODE DOES

This program reads one float number from the user and prints it.

Example:
Input:
12.5

Output:
12.5

LINE-BY-LINE EXPLANATION

import java.util.*;
This line imports Scanner.
Scanner is used to take input from the user.

public class input
This creates a class named input.
Java code must stay inside a class.

public static void main(String args[])
This is the main method.
Java starts running the program from here.

Scanner sc = new Scanner(System.in);
This creates a Scanner object.
It helps the program read input from the keyboard.

String input = sc.next();
This is a commented example.
next() reads only one word, not a full line.

String name = sc.nextLine();
This is a commented example.
nextLine() reads a full line of text.

int number = sc.nextInt();
This is a commented example.
nextInt() reads a whole number.

float price = sc.nextFloat();
This reads a decimal number and stores it in a float variable.

System.out.println(price);
This prints the float value on the screen.

sc.close();
This closes the Scanner object.

EXPLANATION OF ALL CODING TERMS USED

1) import
This tells Java to use ready-made classes.

2) Scanner
Scanner is a class used to take input from the user.

3) object
An object is a usable thing made from a class.
Here, sc is a Scanner object.

4) class
A class is a container for Java code.

5) public
public means the code can be accessed from anywhere.

6) static
static means the method belongs to the class, not to an object.

7) void
void means the method does not return any value.

8) main
main is the starting point of every Java program.

9) String args[]
This can store command-line arguments.

10) float
float is a data type for decimal numbers.
Example: 10.5, 3.14, 99.9

11) next()
Reads one word only.

12) nextLine()
Reads a full line of text.

13) nextInt()
Reads a whole number.

14) nextFloat()
Reads a decimal number.

15) variable
A variable stores a value.
Here, price is a variable.

16) println
This prints output and moves to the next line.

17) close()
This closes the Scanner object.

IMPORTANT JAVA CONCEPTS USED

1) Input handling
The PDFs teach that Scanner is the easiest way to read simple input.
For one decimal value, nextFloat() is a simple choice. 

2) Data type choice
We used float because the input is a decimal number.

3) Output formatting
The PDFs say that output should match the expected format exactly.
If a question asks for fixed decimal places, use printf("%.2f", price);. 

INPUT AND OUTPUT ACCORDING TO THE PDFs AND THIS CODE

Input:
One decimal number

Example input:
12.5

Output:
12.5

If the question wants 2 decimal places, then use:
System.out.printf("%.2f", price);

Then the output for 12.5 becomes:
12.50

The PDFs stress that decimal formatting can matter in evaluation. 

DRY RUN WITH EXAMPLE

Example input:
12.5

Step 1:
Scanner reads 12.5

Step 2:
price = 12.5

Step 3:
Print price

Final output:
12.5

COMMON BEGINNER MISTAKES

1) Using nextInt() for decimal input
That will not work for 12.5.

2) Using next() when full line is needed
next() reads only one word.

3) Forgetting that float is a decimal type
float is not for whole numbers only.

4) Not matching the required output format
Sometimes the judge wants 12.50, not 12.5.

5) Forgetting semicolons
Every Java statement must end with a semicolon.

EASY INTERVIEW ANSWER

This program shows basic Java input using Scanner.
It reads a float value with nextFloat() and prints it.

ONE PRACTICE QUESTION

Write a Java program that reads an integer and prints it, then reads a full line string and prints it.
*/