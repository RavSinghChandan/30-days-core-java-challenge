/**
 * Real World Example: Student Grade Management System with Arrays
 * Demonstrates arrays, 2D arrays, traversal, and common operations
 */

import java.util.Arrays;
import java.util.Scanner;

public class RealWorldExample {
    
    public static void main(String[] args) {
        System.out.println("=== Student Grade Management System with Arrays ===\n");
        
        // Demonstrate 1D arrays
        demonstrate1DArrays();
        
        // Demonstrate 2D arrays
        demonstrate2DArrays();
        
        // Demonstrate array operations
        demonstrateArrayOperations();
        
        // Demonstrate practical application
        demonstrateGradeManagement();
    }
    
    // Demonstrate 1D arrays
    public static void demonstrate1DArrays() {
        System.out.println("--- 1D Arrays Demonstration ---");
        
        // Different ways to declare and initialize arrays
        int[] studentIds = {1001, 1002, 1003, 1004, 1005};
        String[] studentNames = new String[5];
        studentNames[0] = "Alice";
        studentNames[1] = "Bob";
        studentNames[2] = "Charlie";
        studentNames[3] = "Diana";
        studentNames[4] = "Eve";
        
        double[] grades = new double[5];
        grades[0] = 85.5;
        grades[1] = 92.0;
        grades[2] = 78.5;
        grades[3] = 95.0;
        grades[4] = 88.5;
        
        System.out.println("Student IDs: " + Arrays.toString(studentIds));
        System.out.println("Student Names: " + Arrays.toString(studentNames));
        System.out.println("Grades: " + Arrays.toString(grades));
        
        // Array traversal using different methods
        System.out.println("\n--- Array Traversal Methods ---");
        
        // Traditional for loop
        System.out.println("Traditional for loop:");
        for (int i = 0; i < studentNames.length; i++) {
            System.out.println("Student " + (i + 1) + ": " + studentNames[i] + " (ID: " + studentIds[i] + ")");
        }
        
        // Enhanced for loop
        System.out.println("\nEnhanced for loop:");
        for (String name : studentNames) {
            System.out.println("Student: " + name);
        }
        
        // While loop
        System.out.println("\nWhile loop:");
        int index = 0;
        while (index < grades.length) {
            System.out.println("Grade " + (index + 1) + ": " + grades[index]);
            index++;
        }
    }
    
    // Demonstrate 2D arrays
    public static void demonstrate2DArrays() {
        System.out.println("\n--- 2D Arrays Demonstration ---");
        
        // 2D array for student grades across multiple subjects
        double[][] studentGrades = {
            {85.5, 92.0, 78.5, 88.0}, // Alice's grades
            {92.0, 88.5, 95.0, 90.5}, // Bob's grades
            {78.5, 85.0, 82.0, 79.5}, // Charlie's grades
            {95.0, 98.0, 96.5, 94.0}, // Diana's grades
            {88.5, 91.0, 87.5, 89.0}  // Eve's grades
        };
        
        String[] subjects = {"Math", "Science", "English", "History"};
        String[] students = {"Alice", "Bob", "Charlie", "Diana", "Eve"};
        
        System.out.println("Student Grades Matrix:");
        System.out.print("Student\t");
        for (String subject : subjects) {
            System.out.print(subject + "\t");
        }
        System.out.println("Average");
        
        // Traverse 2D array using nested for loops
        for (int i = 0; i < studentGrades.length; i++) {
            System.out.print(students[i] + "\t");
            double sum = 0;
            for (int j = 0; j < studentGrades[i].length; j++) {
                System.out.printf("%.1f\t", studentGrades[i][j]);
                sum += studentGrades[i][j];
            }
            double average = sum / studentGrades[i].length;
            System.out.printf("%.1f%n", average);
        }
        
        // Enhanced for loop traversal
        System.out.println("\nEnhanced for loop traversal:");
        for (double[] studentGrade : studentGrades) {
            for (double grade : studentGrade) {
                System.out.print(grade + " ");
            }
            System.out.println();
        }
        
        // Jagged array example
        System.out.println("\n--- Jagged Array Example ---");
        int[][] jaggedArray = new int[3][];
        jaggedArray[0] = new int[2]; // First row has 2 elements
        jaggedArray[1] = new int[4]; // Second row has 4 elements
        jaggedArray[2] = new int[1]; // Third row has 1 element
        
        // Initialize jagged array
        jaggedArray[0][0] = 1; jaggedArray[0][1] = 2;
        jaggedArray[1][0] = 3; jaggedArray[1][1] = 4; jaggedArray[1][2] = 5; jaggedArray[1][3] = 6;
        jaggedArray[2][0] = 7;
        
        System.out.println("Jagged Array:");
        for (int i = 0; i < jaggedArray.length; i++) {
            for (int j = 0; j < jaggedArray[i].length; j++) {
                System.out.print(jaggedArray[i][j] + " ");
            }
            System.out.println();
        }
    }
    
    // Demonstrate array operations
    public static void demonstrateArrayOperations() {
        System.out.println("\n--- Array Operations ---");
        
        int[] numbers = {64, 34, 25, 12, 22, 11, 90};
        System.out.println("Original array: " + Arrays.toString(numbers));
        
        // Searching
        System.out.println("\n--- Searching ---");
        int target = 25;
        int linearSearchResult = linearSearch(numbers, target);
        System.out.println("Linear search for " + target + ": " + linearSearchResult);
        
        // Sort array for binary search
        Arrays.sort(numbers);
        System.out.println("Sorted array: " + Arrays.toString(numbers));
        
        int binarySearchResult = binarySearch(numbers, target);
        System.out.println("Binary search for " + target + ": " + binarySearchResult);
        
        // Finding min and max
        System.out.println("\n--- Min and Max ---");
        int min = findMin(numbers);
        int max = findMax(numbers);
        System.out.println("Minimum: " + min);
        System.out.println("Maximum: " + max);
        
        // Array copying
        System.out.println("\n--- Array Copying ---");
        int[] copy1 = Arrays.copyOf(numbers, numbers.length);
        int[] copy2 = numbers.clone();
        int[] copy3 = new int[numbers.length];
        System.arraycopy(numbers, 0, copy3, 0, numbers.length);
        
        System.out.println("Original: " + Arrays.toString(numbers));
        System.out.println("Copy 1: " + Arrays.toString(copy1));
        System.out.println("Copy 2: " + Arrays.toString(copy2));
        System.out.println("Copy 3: " + Arrays.toString(copy3));
        
        // Array comparison
        System.out.println("\n--- Array Comparison ---");
        System.out.println("Arrays.equals(numbers, copy1): " + Arrays.equals(numbers, copy1));
        System.out.println("Arrays.equals(numbers, copy2): " + Arrays.equals(numbers, copy2));
        
        // Array filling
        System.out.println("\n--- Array Filling ---");
        int[] filledArray = new int[5];
        Arrays.fill(filledArray, 42);
        System.out.println("Filled array: " + Arrays.toString(filledArray));
    }
    
    // Demonstrate practical grade management application
    public static void demonstrateGradeManagement() {
        System.out.println("\n--- Practical Grade Management ---");
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter number of students: ");
        int numStudents = scanner.nextInt();
        
        System.out.print("Enter number of subjects: ");
        int numSubjects = scanner.nextInt();
        
        // Create 2D array for grades
        double[][] grades = new double[numStudents][numSubjects];
        String[] studentNames = new String[numStudents];
        String[] subjectNames = new String[numSubjects];
        
        // Input subject names
        for (int i = 0; i < numSubjects; i++) {
            System.out.print("Enter subject " + (i + 1) + " name: ");
            subjectNames[i] = scanner.next();
        }
        
        // Input student data
        for (int i = 0; i < numStudents; i++) {
            System.out.print("Enter student " + (i + 1) + " name: ");
            studentNames[i] = scanner.next();
            
            for (int j = 0; j < numSubjects; j++) {
                System.out.print("Enter " + studentNames[i] + "'s grade for " + subjectNames[j] + ": ");
                grades[i][j] = scanner.nextDouble();
            }
        }
        
        // Display grade report
        System.out.println("\n=== Grade Report ===");
        System.out.print("Student\t");
        for (String subject : subjectNames) {
            System.out.print(subject + "\t");
        }
        System.out.println("Average\tGrade");
        
        for (int i = 0; i < numStudents; i++) {
            System.out.print(studentNames[i] + "\t");
            double sum = 0;
            for (int j = 0; j < numSubjects; j++) {
                System.out.printf("%.1f\t", grades[i][j]);
                sum += grades[i][j];
            }
            double average = sum / numSubjects;
            char grade = calculateLetterGrade(average);
            System.out.printf("%.1f\t%c%n", average, grade);
        }
        
        // Calculate class statistics
        System.out.println("\n=== Class Statistics ===");
        double classAverage = calculateClassAverage(grades);
        System.out.printf("Class Average: %.2f%n", classAverage);
        
        int highestStudent = findHighestAverageStudent(grades);
        System.out.println("Student with highest average: " + studentNames[highestStudent]);
        
        scanner.close();
    }
    
    // Helper methods
    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }
    
    public static int binarySearch(int[] arr, int target) {
        int left = 0, right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) return mid;
            if (arr[mid] < target) left = mid + 1;
            else right = mid - 1;
        }
        return -1;
    }
    
    public static int findMin(int[] arr) {
        int min = arr[0];
        for (int num : arr) {
            if (num < min) min = num;
        }
        return min;
    }
    
    public static int findMax(int[] arr) {
        int max = arr[0];
        for (int num : arr) {
            if (num > max) max = num;
        }
        return max;
    }
    
    public static char calculateLetterGrade(double average) {
        if (average >= 90) return 'A';
        else if (average >= 80) return 'B';
        else if (average >= 70) return 'C';
        else if (average >= 60) return 'D';
        else return 'F';
    }
    
    public static double calculateClassAverage(double[][] grades) {
        double total = 0;
        int count = 0;
        for (double[] studentGrade : grades) {
            for (double grade : studentGrade) {
                total += grade;
                count++;
            }
        }
        return count > 0 ? total / count : 0;
    }
    
    public static int findHighestAverageStudent(double[][] grades) {
        int highestIndex = 0;
        double highestAverage = 0;
        
        for (int i = 0; i < grades.length; i++) {
            double sum = 0;
            for (double grade : grades[i]) {
                sum += grade;
            }
            double average = sum / grades[i].length;
            if (average > highestAverage) {
                highestAverage = average;
                highestIndex = i;
            }
        }
        return highestIndex;
    }
} 