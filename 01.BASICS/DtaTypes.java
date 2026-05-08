public class DtaTypes { // This is the class name.

    public static void main(String args[]) { // Main method: Java starts execution from here.

        byte b = 8; // byte stores a very small whole number.
        System.out.println(b); // Print the byte value.

        char ch = 'a'; // char stores one single character.
        System.out.println(ch); // Print the character.

        boolean var = false; // boolean stores only true or false.
        System.out.println(var); // Print the boolean value.

        // float price = 10.5; // This is NOT the correct way for float because float needs 'f' at the end.
        // Correct float example:
        // float price = 10.5f;

        int number = 25; // int stores a whole number.
        System.out.println(number); // Print the integer value.

        // long stores a bigger whole number than int.
        // Example:
        // long bigNumber = 123456789L;

        // double stores decimal numbers.
        // Example:
        // double decimal = 12.5;

        short n = 240; // short also stores a whole number, but in a smaller range than int.
        System.out.println(n); // Print the short value.
    }
}

/*
WHAT THIS CODE DOES

This program shows some basic Java data types.
It creates variables of different types and prints some of them.

The PDFs you shared mainly focus on Java input-output, formatting, and type casting.
This code is a simple beginner data-type example, and the same PDF rules remind you to be careful with exact output and type conversion. 

LINE-BY-LINE EXPLANATION

public class DataTypes
This creates a class named DataTypes.
In Java, all code must be inside a class.

public static void main(String args[])
This is the main method.
Java starts running the program from here.

byte b = 8;
This creates a byte variable named b.
byte is used for very small whole numbers.

System.out.println(b);
This prints the value of b.

char ch = 'a';
This creates a char variable named ch.
char stores one single character inside single quotes.

System.out.println(ch);
This prints the character a.

boolean var = false;
This creates a boolean variable named var.
boolean can hold only two values: true or false.

System.out.println(var);
This prints false.

float price = 10.5f;
This is the correct way to write a float value.
A float number should usually end with f.

int number = 25;
This creates an int variable named number.
int stores whole numbers.

System.out.println(number);
This prints 25.

long bigNumber = 123456789L;
This is an example of long.
long is used for very large whole numbers.
The letter L is used at the end.

double decimal = 12.5;
This is an example of double.
double is used for decimal numbers.

short n = 240;
This creates a short variable named n.
short stores whole numbers in a smaller range than int.

System.out.println(n);
This prints 240.

EXPLANATION OF ALL CODING TERMS USED

1) class
A class is a blueprint or container for Java code.

2) public
public means the code can be accessed from outside.

3) static
static means the method belongs to the class itself.

4) void
void means the method does not return any value.

5) main
main is the starting point of the program.

6) String args[]
This stores command-line arguments.
For beginners, you can think of it as input passed when the program starts.

7) byte
byte is a data type for very small whole numbers.

8) char
char stores one character only.

9) boolean
boolean stores true or false.

10) int
int stores whole numbers.

11) short
short stores smaller whole numbers than int.

12) long
long stores bigger whole numbers than int.

13) float
float stores decimal numbers.

14) double
double also stores decimal numbers, usually with more precision than float.

15) variable
A variable is a named box that stores data.
Examples here are b, ch, var, number, and n.

16) =
This is the assignment operator.
It gives a value to a variable.

17) System.out.println()
This prints output on the screen and moves to the next line.

18) comment
A comment is a line that Java ignores.
Comments are used to explain code for humans.

IMPORTANT JAVA CONCEPTS USED

1) Data types
Java has different data types for different kinds of values.
This program shows byte, char, boolean, int, short, long, float, and double.

2) Output
The program prints values using System.out.println().

3) Type safety
Each data type is meant for a specific kind of value.
For example:
- char for characters
- boolean for true/false
- int for whole numbers
- double for decimal numbers

4) Correct float writing
The float value must end with f, like 10.5f.
Without f, Java treats it as a double first.

5) Beginner-friendly declaration
This program is a simple example of declaring variables and printing them.

INPUT AND OUTPUT ACCORDING TO THE PDFs AND THIS CODE

Input:
No user input is needed in this program.

Output:
8
a
false
25
240

The PDFs say output formatting matters a lot in Java coding tasks.
If a question needs exact decimal places, use printf, like:
System.out.printf("%.2f", value); 

DRY RUN WITH AN EXAMPLE

Step 1:
byte b = 8
Prints: 8

Step 2:
char ch = 'a'
Prints: a

Step 3:
boolean var = false
Prints: false

Step 4:
int number = 25
Prints: 25

Step 5:
short n = 240
Prints: 240

Final output:
8
a
false
25
240

COMMON BEGINNER MISTAKES

1) Writing float without f
Wrong:
float price = 10.5;
Correct:
float price = 10.5f;

2) Using double quotes for char
Wrong:
char ch = "a";
Correct:
char ch = 'a';

3) Forgetting that boolean has only two values
boolean can be only true or false.

4) Confusing int and short
Both store whole numbers, but short has a smaller range.

5) Forgetting semicolons
Every Java statement must end with a semicolon.

6) Thinking println prints on the same line
println moves the cursor to the next line after printing.

EASY INTERVIEW ANSWER

This program demonstrates basic Java data types like byte, char, boolean, int, short, float, long, and double.
It also shows how to assign values and print them using System.out.println().

ONE PRACTICE QUESTION

Write a Java program that declares one int, one float, one long, and one double variable, then prints all of them.
*/