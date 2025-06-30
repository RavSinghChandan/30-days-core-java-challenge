/**
 * Real World Example: Student Grade Management System
 * Demonstrates variables, data types, type casting, and wrapper classes
 */

import java.util.ArrayList;
import java.util.List;

public class RealWorldExample {
    
    public static void main(String[] args) {
        System.out.println("=== Student Grade Management System ===\n");
        
        // Demonstrate different data types
        demonstrateDataTypes();
        
        // Demonstrate type casting
        demonstrateTypeCasting();
        
        // Demonstrate wrapper classes
        demonstrateWrapperClasses();
        
        // Demonstrate autoboxing and unboxing
        demonstrateAutoboxing();
        
        // Demonstrate practical application
        demonstrateStudentGrades();
    }
    
    // Demonstrate all primitive data types
    public static void demonstrateDataTypes() {
        System.out.println("--- Data Types Demonstration ---");
        
        // Integer types
        byte studentAge = 20;
        short studentId = 12345;
        int totalStudents = 1000;
        long schoolPopulation = 50000L;
        
        // Floating point types
        float averageGrade = 85.5f;
        double preciseScore = 92.875;
        
        // Character and boolean
        char gradeLetter = 'A';
        boolean isPassed = true;
        
        // String (reference type)
        String studentName = "John Doe";
        
        System.out.println("Student Age (byte): " + studentAge);
        System.out.println("Student ID (short): " + studentId);
        System.out.println("Total Students (int): " + totalStudents);
        System.out.println("School Population (long): " + schoolPopulation);
        System.out.println("Average Grade (float): " + averageGrade);
        System.out.println("Precise Score (double): " + preciseScore);
        System.out.println("Grade Letter (char): " + gradeLetter);
        System.out.println("Is Passed (boolean): " + isPassed);
        System.out.println("Student Name (String): " + studentName);
    }
    
    // Demonstrate type casting
    public static void demonstrateTypeCasting() {
        System.out.println("\n--- Type Casting Demonstration ---");
        
        // Implicit casting (widening)
        int score = 95;
        long longScore = score; // int → long
        float floatScore = score; // int → float
        double doubleScore = score; // int → double
        
        System.out.println("Original int score: " + score);
        System.out.println("Implicit cast to long: " + longScore);
        System.out.println("Implicit cast to float: " + floatScore);
        System.out.println("Implicit cast to double: " + doubleScore);
        
        // Explicit casting (narrowing)
        double preciseGrade = 89.7;
        int roundedGrade = (int) preciseGrade; // double → int
        float floatGrade = (float) preciseGrade; // double → float
        
        System.out.println("\nOriginal double grade: " + preciseGrade);
        System.out.println("Explicit cast to int: " + roundedGrade);
        System.out.println("Explicit cast to float: " + floatGrade);
        
        // Character casting
        char letter = 'A';
        int asciiValue = letter; // char → int
        char nextLetter = (char) (letter + 1); // int → char
        
        System.out.println("\nCharacter: " + letter);
        System.out.println("ASCII value: " + asciiValue);
        System.out.println("Next letter: " + nextLetter);
    }
    
    // Demonstrate wrapper classes
    public static void demonstrateWrapperClasses() {
        System.out.println("\n--- Wrapper Classes Demonstration ---");
        
        // Creating wrapper objects
        Integer score = Integer.valueOf(85);
        Double average = Double.valueOf(87.5);
        Character grade = Character.valueOf('B');
        Boolean isExcellent = Boolean.valueOf(true);
        
        System.out.println("Integer score: " + score);
        System.out.println("Double average: " + average);
        System.out.println("Character grade: " + grade);
        System.out.println("Boolean isExcellent: " + isExcellent);
        
        // Utility methods
        System.out.println("\n--- Utility Methods ---");
        System.out.println("Max score: " + Integer.max(85, 92));
        System.out.println("Min score: " + Integer.min(85, 92));
        System.out.println("Binary representation: " + Integer.toBinaryString(85));
        System.out.println("Hex representation: " + Integer.toHexString(85));
        
        // String conversion
        String scoreStr = "95";
        int parsedScore = Integer.parseInt(scoreStr);
        System.out.println("Parsed score: " + parsedScore);
        
        // Constants
        System.out.println("Max int value: " + Integer.MAX_VALUE);
        System.out.println("Min int value: " + Integer.MIN_VALUE);
    }
    
    // Demonstrate autoboxing and unboxing
    public static void demonstrateAutoboxing() {
        System.out.println("\n--- Autoboxing and Unboxing ---");
        
        // Autoboxing (primitive → wrapper)
        Integer score1 = 90; // int → Integer
        Double average1 = 88.5; // double → Double
        Boolean isPassed1 = true; // boolean → Boolean
        
        System.out.println("Autoboxed Integer: " + score1);
        System.out.println("Autoboxed Double: " + average1);
        System.out.println("Autoboxed Boolean: " + isPassed1);
        
        // Unboxing (wrapper → primitive)
        int score2 = score1; // Integer → int
        double average2 = average1; // Double → double
        boolean isPassed2 = isPassed1; // Boolean → boolean
        
        System.out.println("Unboxed int: " + score2);
        System.out.println("Unboxed double: " + average2);
        System.out.println("Unboxed boolean: " + isPassed2);
        
        // Using in expressions
        Integer score3 = 85;
        int result = score3 + 10; // Unboxing happens automatically
        System.out.println("Score after adding 10: " + result);
    }
    
    // Demonstrate practical application
    public static void demonstrateStudentGrades() {
        System.out.println("\n--- Practical Application: Student Grades ---");
        
        // Using wrapper classes in collections
        List<Integer> scores = new ArrayList<>();
        scores.add(85); // Autoboxing
        scores.add(92);
        scores.add(78);
        scores.add(95);
        
        System.out.println("Student scores: " + scores);
        
        // Calculate average
        int total = 0;
        for (Integer score : scores) {
            total += score; // Unboxing happens automatically
        }
        double average = (double) total / scores.size();
        
        System.out.println("Total score: " + total);
        System.out.println("Average score: " + average);
        
        // Grade calculation
        char grade = calculateGrade(average);
        System.out.println("Final grade: " + grade);
        
        // Null handling with wrapper classes
        Integer nullableScore = null;
        if (nullableScore != null) {
            System.out.println("Score: " + nullableScore);
        } else {
            System.out.println("Score not available");
        }
    }
    
    // Helper method to calculate grade
    public static char calculateGrade(double average) {
        if (average >= 90) return 'A';
        else if (average >= 80) return 'B';
        else if (average >= 70) return 'C';
        else if (average >= 60) return 'D';
        else return 'F';
    }
} 