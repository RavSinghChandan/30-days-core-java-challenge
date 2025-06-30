/**
 * Real World Example: Simple Calculator Application
 * Demonstrates Java basics, compilation, and program structure
 */

// Import statement example
import java.util.Scanner;

public class RealWorldExample {
    public static void main(String[] args) {
        System.out.println("=== Java Basics Demo ===");
        
        // Demonstrate basic output
        System.out.println("Welcome to Java Programming!");
        
        // Demonstrate command line arguments
        System.out.println("Number of arguments: " + args.length);
        for (int i = 0; i < args.length; i++) {
            System.out.println("Argument " + i + ": " + args[i]);
        }
        
        // Demonstrate user input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Hello, " + name + "!");
        
        // Demonstrate method calls
        demonstrateVariables();
        demonstrateOperators();
        
        scanner.close();
    }
    
    // Method demonstration
    public static void demonstrateVariables() {
        System.out.println("\n--- Variable Demonstration ---");
        
        // Different data types
        int age = 25;
        double salary = 75000.50;
        char grade = 'A';
        boolean isEmployed = true;
        String company = "TechCorp";
        
        System.out.println("Age: " + age);
        System.out.println("Salary: $" + salary);
        System.out.println("Grade: " + grade);
        System.out.println("Employed: " + isEmployed);
        System.out.println("Company: " + company);
    }
    
    public static void demonstrateOperators() {
        System.out.println("\n--- Operator Demonstration ---");
        
        int a = 10;
        int b = 3;
        
        System.out.println("a = " + a + ", b = " + b);
        System.out.println("Addition: " + (a + b));
        System.out.println("Subtraction: " + (a - b));
        System.out.println("Multiplication: " + (a * b));
        System.out.println("Division: " + (a / b));
        System.out.println("Modulus: " + (a % b));
        System.out.println("Increment a: " + (++a));
        System.out.println("Decrement b: " + (--b));
    }
}

// Another class in the same file (non-public)
class Calculator {
    public int add(int a, int b) {
        return a + b;
    }
    
    public int subtract(int a, int b) {
        return a - b;
    }
    
    public int multiply(int a, int b) {
        return a * b;
    }
    
    public double divide(int a, int b) {
        if (b == 0) {
            System.out.println("Error: Division by zero!");
            return 0;
        }
        return (double) a / b;
    }
} 