/**
 * Real World Example: Simple Calculator with Menu System
 * Demonstrates operators, conditionals, and loops
 */

import java.util.Scanner;

public class RealWorldExample {
    
    public static void main(String[] args) {
        System.out.println("=== Simple Calculator with Menu System ===\n");
        
        Scanner scanner = new Scanner(System.in);
        boolean continueCalculating = true;
        
        while (continueCalculating) {
            displayMenu();
            int choice = getValidChoice(scanner);
            
            if (choice == 0) {
                continueCalculating = false;
                System.out.println("Thank you for using the calculator!");
            } else if (choice >= 1 && choice <= 5) {
                performCalculation(scanner, choice);
            } else {
                System.out.println("Invalid choice! Please try again.");
            }
            
            System.out.println();
        }
        
        scanner.close();
    }
    
    // Display the calculator menu
    public static void displayMenu() {
        System.out.println("=== Calculator Menu ===");
        System.out.println("1. Addition (+)");
        System.out.println("2. Subtraction (-)");
        System.out.println("3. Multiplication (*)");
        System.out.println("4. Division (/)");
        System.out.println("5. Modulus (%)");
        System.out.println("0. Exit");
        System.out.print("Enter your choice: ");
    }
    
    // Get valid choice from user
    public static int getValidChoice(Scanner scanner) {
        while (!scanner.hasNextInt()) {
            System.out.println("Please enter a valid number!");
            scanner.next(); // Clear invalid input
            System.out.print("Enter your choice: ");
        }
        return scanner.nextInt();
    }
    
    // Perform calculation based on user choice
    public static void performCalculation(Scanner scanner, int choice) {
        System.out.print("Enter first number: ");
        double num1 = getValidNumber(scanner);
        
        System.out.print("Enter second number: ");
        double num2 = getValidNumber(scanner);
        
        double result = 0;
        String operation = "";
        
        // Demonstrate different operators and conditionals
        switch (choice) {
            case 1:
                result = num1 + num2;
                operation = "Addition";
                break;
            case 2:
                result = num1 - num2;
                operation = "Subtraction";
                break;
            case 3:
                result = num1 * num2;
                operation = "Multiplication";
                break;
            case 4:
                if (num2 != 0) {
                    result = num1 / num2;
                    operation = "Division";
                } else {
                    System.out.println("Error: Division by zero!");
                    return;
                }
                break;
            case 5:
                if (num2 != 0) {
                    result = num1 % num2;
                    operation = "Modulus";
                } else {
                    System.out.println("Error: Modulus by zero!");
                    return;
                }
                break;
        }
        
        displayResult(operation, num1, num2, result);
        demonstrateOperators(num1, num2);
    }
    
    // Get valid number from user
    public static double getValidNumber(Scanner scanner) {
        while (!scanner.hasNextDouble()) {
            System.out.println("Please enter a valid number!");
            scanner.next(); // Clear invalid input
            System.out.print("Enter number: ");
        }
        return scanner.nextDouble();
    }
    
    // Display calculation result
    public static void displayResult(String operation, double num1, double num2, double result) {
        System.out.println("\n=== Result ===");
        System.out.printf("%s: %.2f and %.2f = %.2f%n", operation, num1, num2, result);
        
        // Demonstrate comparison operators
        if (result > 0) {
            System.out.println("Result is positive");
        } else if (result < 0) {
            System.out.println("Result is negative");
        } else {
            System.out.println("Result is zero");
        }
        
        // Demonstrate logical operators
        if (result > 0 && result < 100) {
            System.out.println("Result is between 0 and 100");
        }
        
        if (result < 0 || result > 1000) {
            System.out.println("Result is outside normal range");
        }
    }
    
    // Demonstrate various operators
    public static void demonstrateOperators(double num1, double num2) {
        System.out.println("\n=== Operator Demonstrations ===");
        
        // Arithmetic operators
        System.out.println("Arithmetic Operators:");
        System.out.printf("Addition: %.2f + %.2f = %.2f%n", num1, num2, num1 + num2);
        System.out.printf("Subtraction: %.2f - %.2f = %.2f%n", num1, num2, num1 - num2);
        System.out.printf("Multiplication: %.2f * %.2f = %.2f%n", num1, num2, num1 * num2);
        
        if (num2 != 0) {
            System.out.printf("Division: %.2f / %.2f = %.2f%n", num1, num2, num1 / num2);
            System.out.printf("Modulus: %.2f %% %.2f = %.2f%n", num1, num2, num1 % num2);
        }
        
        // Assignment operators
        System.out.println("\nAssignment Operators:");
        double temp = num1;
        System.out.printf("Original value: %.2f%n", temp);
        temp += num2;
        System.out.printf("After += %.2f: %.2f%n", num2, temp);
        temp -= num2;
        System.out.printf("After -= %.2f: %.2f%n", num2, temp);
        temp *= 2;
        System.out.printf("After *= 2: %.2f%n", temp);
        
        // Increment and decrement
        System.out.println("\nIncrement/Decrement:");
        int counter = 0;
        System.out.println("Original counter: " + counter);
        System.out.println("Post-increment: " + counter++);
        System.out.println("After post-increment: " + counter);
        System.out.println("Pre-increment: " + ++counter);
        System.out.println("After pre-increment: " + counter);
        
        // Bitwise operators (with integers)
        int int1 = (int) num1;
        int int2 = (int) num2;
        System.out.println("\nBitwise Operators (with integers):");
        System.out.println("int1: " + int1 + " (binary: " + Integer.toBinaryString(int1) + ")");
        System.out.println("int2: " + int2 + " (binary: " + Integer.toBinaryString(int2) + ")");
        System.out.println("AND: " + (int1 & int2) + " (binary: " + Integer.toBinaryString(int1 & int2) + ")");
        System.out.println("OR: " + (int1 | int2) + " (binary: " + Integer.toBinaryString(int1 | int2) + ")");
        System.out.println("XOR: " + (int1 ^ int2) + " (binary: " + Integer.toBinaryString(int1 ^ int2) + ")");
        System.out.println("NOT int1: " + (~int1) + " (binary: " + Integer.toBinaryString(~int1) + ")");
        
        // Demonstrate loops
        demonstrateLoops();
    }
    
    // Demonstrate different types of loops
    public static void demonstrateLoops() {
        System.out.println("\n=== Loop Demonstrations ===");
        
        // For loop - count from 1 to 5
        System.out.println("For loop (1 to 5):");
        for (int i = 1; i <= 5; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        
        // While loop - count down from 5
        System.out.println("While loop (countdown from 5):");
        int count = 5;
        while (count > 0) {
            System.out.print(count + " ");
            count--;
        }
        System.out.println();
        
        // Do-while loop - at least once execution
        System.out.println("Do-while loop (at least once):");
        int num = 1;
        do {
            System.out.print(num + " ");
            num *= 2;
        } while (num <= 16);
        System.out.println();
        
        // Enhanced for loop with array
        System.out.println("Enhanced for loop with array:");
        int[] numbers = {10, 20, 30, 40, 50};
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();
        
        // Nested loops
        System.out.println("Nested loops (multiplication table 1-3):");
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                System.out.printf("%d×%d=%d\t", i, j, i * j);
            }
            System.out.println();
        }
        
        // Break and continue demonstration
        System.out.println("Break and continue demonstration:");
        for (int i = 1; i <= 10; i++) {
            if (i == 3) {
                continue; // Skip 3
            }
            if (i == 8) {
                break; // Stop at 8
            }
            System.out.print(i + " ");
        }
        System.out.println();
    }
} 