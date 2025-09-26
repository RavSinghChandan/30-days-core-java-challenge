/** Exercises - Day 03: Operators, Conditionals, Loops

Exercise 1: Create a number guessing game using loops and conditionals Exercise 2: Calculate factorial using different loop types Exercise 3: Find prime numbers in a range using nested loops Exercise 4: Create a simple grade calculator using switch statements Exercise 5: Demonstrate various operators with practical examples  */

import java.util.Scanner; import java.util.Random;

public class Exercises {

    // Exercise 1: Number guessing game     public static void exercise1() {         System.out.println("=== Exercise 1: Number Guessing Game ===");

        // TODO: Create a number guessing game         // 1. Generate a random number between 1 and 100         // 2. Ask user to guess the number         // 3. Provide hints (higher/lower)         // 4. Count number of attempts         // 5. Ask if user wants to play again

        Scanner scanner = new Scanner(System.in);         Random random = new Random();         boolean playAgain = true;

        while (playAgain) {             int secretNumber = random.nextInt(100) + 1;             int attempts = 0;             boolean guessed = false;

            System.out.println("\nI'm thinking of a number between 1 and 100...");

            while (!guessed) {                 System.out.print("Enter your guess: ");                 int guess = scanner.nextInt();                 attempts++;

                if (guess == secretNumber) {                     System.out.println("Congratulations! You guessed it in " + attempts + " attempts!");                     guessed = true;                 } else if (guess < secretNumber) {                     System.out.println("Too low! Try again.");                 } else {                     System.out.println("Too high! Try again.");                 }             }

            System.out.print("Play again? (y/n): ");             String answer = scanner.next();             playAgain = answer.toLowerCase().startsWith("y");         }

        System.out.println("Thanks for playing!");     }

    // Exercise 2: Factorial calculation     public static void exercise2() {         System.out.println("\n=== Exercise 2: Factorial Calculation ===");

        // TODO: Calculate factorial using different loop types         // 1. Use for loop         // 2. Use while loop         // 3. Use do-while loop         // 4. Handle edge cases (0, negative numbers)

        Scanner scanner = new Scanner(System.in);         System.out.print("Enter a number to calculate factorial: ");         int n = scanner.nextInt();

        if (n < 0) {             System.out.println("Factorial is not defined for negative numbers.");             return;         }

        // Using for loop         long factorialFor = 1;         for (int i = 1; i <= n; i++) {             factorialFor *= i;         }         System.out.println("Factorial using for loop: " + n + "! = " + factorialFor);

        // Using while loop         long factorialWhile = 1;         int i = 1;         while (i <= n) {             factorialWhile *= i;             i++;         }         System.out.println("Factorial using while loop: " + n + "! = " + factorialWhile);

        // Using do-while loop         long factorialDoWhile = 1;         int j = 1;         do {             factorialDoWhile *= j;             j++;         } while (j <= n);         System.out.println("Factorial using do-while loop: " + n + "! = " + factorialDoWhile);     }

    // Exercise 3: Prime number finder     public static void exercise3() {         System.out.println("\n=== Exercise 3: Prime Number Finder ===");

        // TODO: Find prime numbers in a range         // 1. Ask user for range (start and end)         // 2. Check each number for primality         // 3. Use nested loops         // 4. Optimize the algorithm

        Scanner scanner = new Scanner(System.in);         System.out.print("Enter start of range: ");         int start = scanner.nextInt();         System.out.print("Enter end of range: ");         int end = scanner.nextInt();

        System.out.println("Prime numbers between " + start + " and " + end + ":");

        for (int num = start; num <= end; num++) {             if (isPrime(num)) {                 System.out.print(num + " ");             }         }         System.out.println();     }

    // Helper method to check if a number is prime     public static boolean isPrime(int number) {         if (number <= 1) return false;         if (number <= 3) return true;         if (number % 2 == 0 || number % 3 == 0) return false;

        for (int i = 5; i * i <= number; i += 6) {             if (number % i == 0 || number % (i + 2) == 0) {                 return false;             }         }         return true;     }

    // Exercise 4: Grade calculator     public static void exercise4() {         System.out.println("\n=== Exercise 4: Grade Calculator ===");

        // TODO: Create a grade calculator using switch statements         // 1. Ask for numerical score         // 2. Convert to letter grade using switch         // 3. Handle different grading scales         // 4. Provide grade descriptions

        Scanner scanner = new Scanner(System.in);         System.out.print("Enter numerical score (0-100): ");         int score = scanner.nextInt();

        if (score < 0 || score > 100) {             System.out.println("Invalid score! Score must be between 0 and 100.");             return;         }

        // Convert to grade range         int gradeRange = score / 10;

        switch (gradeRange) {             case 10:             case 9:                 System.out.println("Grade: A");                 System.out.println("Description: Excellent");                 break;             case 8:                 System.out.println("Grade: B");                 System.out.println("Description: Good");                 break;             case 7:                 System.out.println("Grade: C");                 System.out.println("Description: Satisfactory");                 break;             case 6:                 System.out.println("Grade: D");                 System.out.println("Description: Needs Improvement");                 break;             default:                 System.out.println("Grade: F");                 System.out.println("Description: Failing");                 break;         }     }

    // Exercise 5: Operator demonstrations     public static void exercise5() {         System.out.println("\n=== Exercise 5: Operator Demonstrations ===");

        // TODO: Demonstrate various operators         // 1. Arithmetic operators         // 2. Assignment operators         // 3. Comparison operators         // 4. Logical operators         // 5. Bitwise operators

        int a = 10;         int b = 3;

        // Arithmetic operators         System.out.println("Arithmetic Operators:");         System.out.println("a = " + a + ", b = " + b);         System.out.println("Addition: " + a + " + " + b + " = " + (a + b));         System.out.println("Subtraction: " + a + " - " + b + " = " + (a - b));         System.out.println("Multiplication: " + a + " * " + b + " = " + (a * b));         System.out.println("Division: " + a + " / " + b + " = " + (a / b));         System.out.println("Modulus: " + a + " % " + b + " = " + (a % b));

        // Assignment operators         System.out.println("\nAssignment Operators:");         int temp = a;         System.out.println("Original a: " + temp);         temp += b;         System.out.println("After += " + b + ": " + temp);         temp -= b;         System.out.println("After -= " + b + ": " + temp);         temp *= 2;         System.out.println("After *= 2: " + temp);

        // Comparison operators         System.out.println("\nComparison Operators:");         System.out.println(a + " == " + b + ": " + (a == b));         System.out.println(a + " != " + b + ": " + (a != b));         System.out.println(a + " > " + b + ": " + (a > b));         System.out.println(a + " < " + b + ": " + (a < b));         System.out.println(a + " >= " + b + ": " + (a >= b));         System.out.println(a + " <= " + b + ": " + (a <= b));

        // Logical operators         System.out.println("\nLogical Operators:");         boolean x = true;         boolean y = false;         System.out.println("x = " + x + ", y = " + y);         System.out.println("x && y: " + (x && y));         System.out.println("x || y: " + (x || y));         System.out.println("!x: " + (!x));         System.out.println("!y: " + (!y));

        // Bitwise operators         System.out.println("\nBitwise Operators:");         System.out.println("a = " + a + " (binary: " + Integer.toBinaryString(a) + ")");         System.out.println("b = " + b + " (binary: " + Integer.toBinaryString(b) + ")");         System.out.println("a & b: " + (a & b) + " (binary: " + Integer.toBinaryString(a & b) + ")");         System.out.println("a | b: " + (a | b) + " (binary: " + Integer.toBinaryString(a | b) + ")");         System.out.println("a ^ b: " + (a ^ b) + " (binary: " + Integer.toBinaryString(a ^ b) + ")");         System.out.println("~a: " + (~a) + " (binary: " + Integer.toBinaryString(~a) + ")");         System.out.println("a << 1: " + (a << 1) + " (binary: " + Integer.toBinaryString(a << 1) + ")");         System.out.println("a >> 1: " + (a >> 1) + " (binary: " + Integer.toBinaryString(a >> 1) + ")");     }

    public static void main(String[] args) {         System.out.println("Day 03 Exercises: Operators, Conditionals, Loops\n");

        exercise1();         exercise2();         exercise3();         exercise4();         exercise5();

        System.out.println("\n=== Challenge Questions ===");         System.out.println("1. Create a program that finds the largest number in an array using loops");         System.out.println("2. Write a program that prints a pattern using nested loops (e.g., pyramid)");         System.out.println("3. Create a simple calculator that handles multiple operations");         System.out.println("4. Write a program that checks if a string is a palindrome");         System.out.println("5. Create a program that demonstrates operator precedence with complex expressions");     } } 
