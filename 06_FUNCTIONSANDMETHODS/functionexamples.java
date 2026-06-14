/*
=========================================================
PROBLEM STATEMENT
=========================================================
Write a Java program to demonstrate a simple
User-Defined Function (Method).

The function printHelloWorld() prints
"Hello World" three times.

The main method calls the function,
and the function executes its statements.

This program helps understand:

1. Function Definition
2. Function Call
3. void Return Type
4. Control Flow in Functions

=========================================================
INPUT FORMAT
=========================================================

No Input Required.

=========================================================
OUTPUT FORMAT
=========================================================

Hello World
Hello World
Hello World

=========================================================
DRY RUN EXAMPLE
=========================================================

Program Starts

↓

main() method executes

↓

Function Call:

printHelloWorld();

↓

Control transfers to:

printHelloWorld()

↓

Line 1 executes:

Hello World

↓

Line 2 executes:

Hello World

↓

Line 3 executes:

Hello World

↓

return;

↓

Control returns to main()

↓

Program Ends

=========================================================
FUNCTION FLOW DIAGRAM
=========================================================

main()
  |
  V
printHelloWorld()
  |
  |--> Hello World
  |--> Hello World
  |--> Hello World
  |
  V
return
  |
  V
main() Ends

=========================================================
FULLY COMMENTED JAVA CODE
=========================================================
*/

public class functionexamples {

    /*
    =====================================================
    FUNCTION DEFINITION
    =====================================================

    Function Name:

    printHelloWorld

    Return Type:

    void

    Meaning:

    This function performs an action
    but does not return any value.

    Purpose:

    Print "Hello World" three times.
    */
    public static void printHelloWorld() {

        // Print first Hello World.
        System.out.println("Hello World");

        // Print second Hello World.
        System.out.println("Hello World");

        // Print third Hello World.
        System.out.println("Hello World");

        /*
        Explicit return statement.

        Since the return type is void,
        no value is returned.

        This statement is optional here.
        */
        return;
    }

    public static void main(String args[]) {

        /*
        =================================================
        FUNCTION CALL
        =================================================

        When this statement executes,
        control moves to the function
        printHelloWorld().

        After function execution,
        control returns back to main().
        */
        printHelloWorld();
    }
}

/*
=========================================================
IMPORTANT NOTES FOR REVISION
=========================================================

1. Function is a block of code
   designed to perform a specific task.

---------------------------------------------------------

2. Syntax:

   returnType functionName() {
       // code
   }

---------------------------------------------------------

3. Function Definition:

   Creating the function.

---------------------------------------------------------

4. Function Call:

   Executing the function.

---------------------------------------------------------

5. void means:

   Function does not return anything.

---------------------------------------------------------

6. return; in a void method is optional.

---------------------------------------------------------

7. Benefits of Functions:

   • Code Reusability
   • Better Readability
   • Easier Maintenance
   • Modular Programming

---------------------------------------------------------

8. This is one of the first concepts
   asked in Java interviews because it
   forms the foundation of OOP and methods.

=========================================================
COMMON BEGINNER MISTAKES
=========================================================

1. Forgetting to call the function.

   Defining a function does not
   automatically execute it.

---------------------------------------------------------

2. Writing function inside main().

   Java does not allow nested methods.

---------------------------------------------------------

3. Using return value inside
   a void function.

---------------------------------------------------------

4. Forgetting static keyword
   while calling method from main().

---------------------------------------------------------

5. Assuming execution starts
   from a custom function.

   Execution always starts from:

   main()

=========================================================
HOW TO EXPLAIN THIS CODE IN FRONT OF INTERVIEWER
=========================================================

"This program demonstrates a simple
user-defined method in Java.

I created a method named
printHelloWorld() with a void return type,
which means it performs an action but
does not return any value.

Inside the method, I print 'Hello World'
three times.

From the main method, I call
printHelloWorld().

When the function is called, control
transfers to the function, executes all
its statements, and then returns back
to the main method."

=========================================================
TIME COMPLEXITY
=========================================================

O(1)

Reason:

The function executes a fixed number
of statements regardless of input size.

=========================================================
SPACE COMPLEXITY
=========================================================

O(1)

Reason:

No extra memory proportional to input
size is used.

=========================================================
INTERVIEW QUICK ANSWER
=========================================================

Q1. Why is printHelloWorld() declared as static?

Answer:
main() is a static method. A static method
can directly call another static method
without creating an object. If
printHelloWorld() were non-static, we
would need to create an object first.

---------------------------------------------------------

Q2. Is "return;" necessary in a void method?

Answer:
No. Java automatically returns control
when the method reaches the closing brace.
Using "return;" in a void method is optional.

---------------------------------------------------------

Q3. What happens internally when a function is called?

Answer:
A new stack frame is created in the call
stack. Local variables and execution state
are stored there. After execution completes,
the stack frame is removed and control
returns to the caller.

---------------------------------------------------------

Q4. What is the difference between a method
that returns void and one that returns int?

Answer:
A void method performs an action and does
not return a value. An int method must
return an integer value using the return
statement.

Example:

void display() { }

int add() {
    return 10;
}

---------------------------------------------------------

Q5. Can we overload printHelloWorld()?

Answer:
Yes.

Method overloading allows multiple methods
with the same name but different parameter
lists.

Example:

printHelloWorld()

printHelloWorld(String name)

Java resolves the correct method at
compile time.

---------------------------------------------------------

Q6. Why do interviewers encourage using
functions instead of writing everything
inside main()?

Answer:
Functions improve modularity, reusability,
testing, debugging, readability, and
maintainability. Large applications are
built by dividing logic into smaller
methods rather than writing everything
inside main().

=========================================================
END OF FILE
=========================================================
*/
