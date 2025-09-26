/** Exercises - Day 01: Java Basics

Exercise 1: Create a simple program that prints your name and age Exercise 2: Create a program that demonstrates command line arguments Exercise 3: Create a program that calculates the area of a circle Exercise 4: Create a program that converts temperature from Celsius to Fahrenheit  */

public class Exercises {

    // Exercise 1: Print your name and age     public static void exercise1() {         System.out.println("=== Exercise 1: Personal Information ===");

        // TODO: Declare variables for your name and age         // TODO: Print them using System.out.println()

        // Your code here:         String name = "Your Name"; // Replace with your actual name         int age = 25; // Replace with your actual age

        System.out.println("Name: " + name);         System.out.println("Age: " + age);         System.out.println("Hello! I am " + name + " and I am " + age + " years old.");     }

    // Exercise 2: Command line arguments     public static void exercise2(String[] args) {         System.out.println("\n=== Exercise 2: Command Line Arguments ===");

        // TODO: Check if any arguments were provided         // TODO: Print each argument with its index         // TODO: If no arguments, print a message asking for arguments

        // Your code here:         if (args.length == 0) {             System.out.println("No command line arguments provided.");             System.out.println("Try running: java Exercises arg1 arg2 arg3");         } else {             System.out.println("Number of arguments: " + args.length);             for (int i = 0; i < args.length; i++) {                 System.out.println("Argument " + i + ": " + args[i]);             }         }     }

    // Exercise 3: Calculate area of a circle     public static void exercise3() {         System.out.println("\n=== Exercise 3: Circle Area Calculator ===");

        // TODO: Declare a variable for radius         // TODO: Calculate the area using the formula: area = π * radius²         // TODO: Print the result         // Use Math.PI for π and Math.pow() for power

        // Your code here:         double radius = 5.0; // You can change this value         double area = Math.PI * Math.pow(radius, 2);

        System.out.println("Radius: " + radius);         System.out.println("Area of circle: " + area);         System.out.printf("Area of circle (formatted): %.2f%n", area);     }

    // Exercise 4: Temperature conversion     public static void exercise4() {         System.out.println("\n=== Exercise 4: Temperature Converter ===");

        // TODO: Declare a variable for Celsius temperature         // TODO: Convert to Fahrenheit using the formula: F = (C * 9/5) + 32         // TODO: Print both Celsius and Fahrenheit values

        // Your code here:         double celsius = 25.0; // You can change this value         double fahrenheit = (celsius * 9.0 / 5.0) + 32;

        System.out.println("Celsius: " + celsius + "°C");         System.out.println("Fahrenheit: " + fahrenheit + "°F");         System.out.printf("Temperature: %.1f°C = %.1f°F%n", celsius, fahrenheit);     }

    // Bonus Exercise: Create a simple calculator     public static void bonusExercise() {         System.out.println("\n=== Bonus Exercise: Simple Calculator ===");

        // TODO: Declare two numbers         // TODO: Perform and display the results of:         // - Addition         // - Subtraction         // - Multiplication         // - Division         // - Modulus

        // Your code here:         int num1 = 15;         int num2 = 4;

        System.out.println("Numbers: " + num1 + " and " + num2);         System.out.println("Addition: " + num1 + " + " + num2 + " = " + (num1 + num2));         System.out.println("Subtraction: " + num1 + " - " + num2 + " = " + (num1 - num2));         System.out.println("Multiplication: " + num1 + " * " + num2 + " = " + (num1 * num2));         System.out.println("Division: " + num1 + " / " + num2 + " = " + (num1 / num2));         System.out.println("Modulus: " + num1 + " % " + num2 + " = " + (num1 % num2));     }

    public static void main(String[] args) {         System.out.println("Day 01 Exercises: Java Basics\n");

        exercise1();         exercise2(args);         exercise3();         exercise4();         bonusExercise();

        System.out.println("\n=== Challenge Questions ===");         System.out.println("1. Modify Exercise 1 to accept name and age as command line arguments");         System.out.println("2. Create a program that calculates the perimeter of a rectangle");         System.out.println("3. Write a program that prints a simple ASCII art pattern");         System.out.println("4. Create a program that demonstrates different data types");     } } 
