# Practical 2: Recursive Functions

This project contains a Java console application that demonstrates various recursive algorithms. It was developed for the DSA - COMP1002 unit by Raihan Khalil Abdillah.

## Features

The program features an interactive command-line menu allowing users to select and execute different recursive mathematical and logical operations. 

The available operations include:
* **Factorial (Option 1):** Calculates the factorial of a provided non-negative integer using recursion.
* **Fibonacci (Option 2):** Computes the Fibonacci sequence value for a given non-negative integer.
* **Greatest Common Denominator (Option 3):** Uses a recursive method to find the GCD of two positive integers.
* **Base Conversion (Option 4):** Converts a decimal number to any specified base between 2 and 16, utilizing characters A-F for bases above 10.
* **Tower of Hanoi (Option 5):** Solves the Tower of Hanoi puzzle for a specified number of disks, outputting the step-by-step move sequence.
* **Tower of Hanoi - Lecture Slides (Option 6):** An alternative implementation of the Tower of Hanoi puzzle based on specific lecture pseudo-code, allowing the user to specify the number of disks, the source tower, and the destination tower.

## Error Handling
The application includes basic input validation to prevent invalid operations:
* Throws an `IllegalArgumentException` if negative values are input for Factorial, Fibonacci, GCD, or the Tower of Hanoi functions.
* Throws an `IllegalArgumentException` if the base specified in the Base Conversion function falls outside the accepted range of 2 to 16.

## File Reference
* `practical2.java`: The main Java source file containing the menu loop and all recursive method implementations.

## How to Run

1. Ensure you have the Java Development Kit (JDK) installed.
2. Open a terminal and navigate to the directory containing the file.
3. Compile the program:
   ```bash
   javac practical2.java
   ```
4. Run the compiled class:
   ```bash
   java practical2
   ```
5. Follow the on-screen prompts to input numbers (1-6) and interact with the recursive functions, or enter `0` to exit the program.