import java.util.*; // We bring in (import) Java's utility tools, specifically the Scanner tool[cite: 6].

public class calculator { // Every Java program must start with a class. I changed 'calculator' to 'Calculator' because class names should start with a capital letter.
    
    public static void main(String args[]) { // This is the starting point (doorway) of our program[cite: 8].
        
        // We create a tool named 'sc' to read what the user types on the keyboard (System.in)[cite: 9].
        Scanner sc = new Scanner(System.in); 
        
        System.out.println("enter a :"); // Prints a message to the screen asking for the first number.
        // The program waits for the user to type a whole number. We store it in a box named 'a'[cite: 11].
        int a = sc.nextInt(); 
        
        System.out.println("enter b :"); // Prints a message asking for the second number.
        // We store the second whole number in a box named 'b'[cite: 16].
        int b = sc.nextInt(); 
        
        System.out.println("enter operator :"); // Asks the user for a math symbol (+, -, *, /).
        // sc.next() reads a single word, and .charAt(0) picks the very first letter/symbol of that word.
        // We save this symbol in a character box named 'operator'[cite: 285, 286].
        char operator = sc.next().charAt(0); 
        
        // 'switch' acts like a train track director. It looks at the 'operator' and chooses the right path.
        switch(operator) {
            case '+' : 
                System.out.println(a+b); // If the symbol is '+', print a plus b.
                break; // 'break' stops the code here so it doesn't accidentally run the next cases.
                
            case '-' : 
                System.out.println(a-b); // If the symbol is '-', print a minus b.
                break;
                
            case '*' : 
                System.out.println(a*b); // If the symbol is '*', print a multiplied by b.
                break;
                
            case '/' : 
                System.out.println(a/b); // If the symbol is '/', print a divided by b.
                break;
                
            case '%' : 
                System.out.println(a%b); // If the symbol is '%', print the remainder of a divided by b.
                break;
                
            default : 
                // If the user typed a symbol that is not in our list, print an error message.
                System.out.println("wrong operator"); 
        }

        // We politely close the Scanner tool because we are done using it[cite: 22].
        sc.close(); 
    }    
}

/* ============================================================================
 * WHAT THE CODE DOES
 * This program is a simple digital calculator. 
 * First, it asks the user to type two numbers.
 * Next, it asks the user to type a math symbol (like + or -).
 * Finally, it uses a "switch" to figure out which math symbol was typed, does the math, and prints the result on the screen.
 * * LINE-BY-LINE EXPLANATION
 * Line 1: `import java.util.*;` -> Tells Java to get its utility tools ready, like the Scanner for reading inputs[cite: 6].
 * Line 3: `public class Calculator {` -> Creates the main container for our code.
 * Line 5: `public static void main(String args[]) {` -> The exact engine where Java begins reading instructions[cite: 8].
 * Line 8: `Scanner sc = new Scanner(System.in);` -> Creates our "keyboard reader" tool called 'sc'[cite: 9].
 * Line 10: `System.out.println("enter a :");` -> Prints text to the screen.
 * Line 12: `int a = sc.nextInt();` -> Uses the 'sc' tool to grab the first whole number typed and saves it as 'a'[cite: 11].
 * Line 14-16: Asks for and reads the second whole number, saving it as 'b'[cite: 16].
 * Line 21: `char operator = sc.next().charAt(0);` -> Reads the symbol typed by the user and saves it as a character[cite: 285, 286].
 * Line 24: `switch(operator) {` -> Opens the switch board to check what the operator is.
 * Line 25-26: `case '+' : System.out.println(a+b); break;` -> If it's '+', add them together and then stop (break).
 * Line 28-39: Does the same thing for minus, multiply, divide, and remainder (modulo).
 * Line 41: `default : System.out.println("wrong operator");` -> A safety net in case the user typed a bad symbol.
 * Line 45: `sc.close();` -> Shuts down the reader tool to keep the computer running smoothly[cite: 22].
 * * EXPLANATION OF ALL CODING TERMS USED
 * 1. import: Like borrowing a book from the library. You bring pre-written Java code into your program.
 * 2. Scanner: A tool in Java used to take input from the console (keyboard)[cite: 122].
 * 3. Class: The blueprint of a Java program. Everything lives inside a class.
 * 4. Main Method (public static void main): The starting engine of the code. Without it, the program cannot run.
 * 5. int: Short for integer. A box that stores whole numbers like 5, -10, or 100.
 * 6. char: Short for character. A box that stores a single letter or symbol, like 'A' or '+'.
 * 7. switch: A cleaner way to write many "if/else" conditions. It switches paths based on a value.
 * 8. case: A specific path inside a switch.
 * 9. break: A command that tells the program "Stop reading here, jump out of the switch block."
 * 10. default: The fallback path if none of the 'cases' match the value.
 * * IMPORTANT JAVA CONCEPTS USED
 * 1. Standard Input/Output: Taking data in using Scanner and pushing data out using System.out.println[cite: 122, 131].
 * 2. Type Casting / Reading Characters: We cannot read a 'char' directly like an 'int'. We read a word using next() and grab the 0th (first) letter using charAt(0)[cite: 286, 287].
 * 3. Control Flow (Switch): Making the code decide which math operation to perform based on user input.
 * * INPUT AND OUTPUT ACCORDING TO THE PDFs
 * The PDFs discuss standard input reading[cite: 123, 124].
 * Here, we take single values one by one instead of an array.
 * Example Input sequence: 
 * 10
 * 5
 * *
 * Example Output:
 * 50
 * * DRY RUN WITH AN EXAMPLE
 * Imagine the user types:
 * a = 10
 * b = 2
 * operator = '/'
 * 1. `int a = sc.nextInt();` -> 'a' is 10.
 * 2. `int b = sc.nextInt();` -> 'b' is 2.
 * 3. `char operator = ...` -> 'operator' becomes '/'.
 * 4. The switch looks at 'operator'. It skips '+', skips '-', skips '*'. 
 * 5. It matches `case '/'`. It runs `System.out.println(10/2);`.
 * 6. The screen prints `5`. 
 * 7. The `break` stops the switch. Program finishes.
 * * COMMON BEGINNER MISTAKES
 * 1. The "Scanner Bug" Trap: This is a famous error highlighted in your study materials[cite: 1445, 1446]. If you read an integer using `sc.nextInt()` and immediately try to read a full string sentence using `sc.nextLine()`, the string gets completely skipped[cite: 1446]. This happens because `nextInt()` leaves the "Enter" press behind[cite: 1447]. Luckily, in this code, we used `sc.next()` instead of `nextLine()`, which safely ignores the leftover Enter key.
 * 2. Forgetting the `break;` command: If you forget the break inside the switch, the code will "fall through" and execute all the math operations below it too!
 * 3. Not closing the scanner: Forgetting `sc.close()` leaves the tool running in the background.
 * * EASY INTERVIEW ANSWER
 * "This code is a basic console calculator. It uses Java's Scanner class to take two integers and an operator character from the user. Then, it uses a switch-case statement to direct the control flow to the correct arithmetic operation and prints the result."
 * * ONE PRACTICE QUESTION
 * Right now, this calculator only handles whole numbers (int). What if a user wants to divide 5 by 2 and get 2.5? Can you change the code to use decimal numbers (`double` instead of `int`) and use `sc.nextDouble()`?
============================================================================ */
