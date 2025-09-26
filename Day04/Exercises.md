/** Exercises - Day 04: Arrays & 2D Arrays

Exercise 1: Create and manipulate 1D arrays with different data types Exercise 2: Implement common array operations (search, sort, reverse) Exercise 3: Work with 2D arrays and matrix operations Exercise 4: Create a jagged array and demonstrate its usage Exercise 5: Build a simple inventory management system using arrays  */

import java.util.Arrays; import java.util.Scanner;

public class Exercises {

    // Exercise 1: 1D array operations     public static void exercise1() {         System.out.println("=== Exercise 1: 1D Array Operations ===");

        // TODO: Create arrays of different data types         // TODO: Demonstrate array initialization methods         // TODO: Perform basic operations on arrays

        // Your code here:

        // Integer array         int[] numbers = {64, 34, 25, 12, 22, 11, 90};         System.out.println("Original numbers: " + Arrays.toString(numbers));

        // String array         String[] fruits = new String[4];         fruits[0] = "Apple";         fruits[1] = "Banana";         fruits[2] = "Orange";         fruits[3] = "Grape";         System.out.println("Fruits: " + Arrays.toString(fruits));

        // Double array         double[] prices = {10.99, 5.50, 8.75, 12.25, 3.99};         System.out.println("Prices: " + Arrays.toString(prices));

        // Array operations         System.out.println("\n--- Array Operations ---");         System.out.println("Length of numbers array: " + numbers.length);         System.out.println("First element: " + numbers[0]);         System.out.println("Last element: " + numbers[numbers.length - 1]);

        // Sum of numbers         int sum = 0;         for (int num : numbers) {             sum += num;         }         System.out.println("Sum of numbers: " + sum);         System.out.println("Average: " + (double) sum / numbers.length);

        // Find min and max         int min = numbers[0], max = numbers[0];         for (int num : numbers) {             if (num < min) min = num;             if (num > max) max = num;         }         System.out.println("Minimum: " + min);         System.out.println("Maximum: " + max);     }

    // Exercise 2: Array operations implementation     public static void exercise2() {         System.out.println("\n=== Exercise 2: Array Operations Implementation ===");

        // TODO: Implement linear search         // TODO: Implement bubble sort         // TODO: Implement array reversal         // TODO: Demonstrate binary search

        // Your code here:

        int[] arr = {64, 34, 25, 12, 22, 11, 90};         System.out.println("Original array: " + Arrays.toString(arr));

        // Linear search         int target = 25;         int searchResult = linearSearch(arr, target);         System.out.println("Linear search for " + target + ": " + searchResult);

        // Bubble sort         int[] sortedArr = arr.clone();         bubbleSort(sortedArr);         System.out.println("After bubble sort: " + Arrays.toString(sortedArr));

        // Binary search (requires sorted array)         int binaryResult = binarySearch(sortedArr, target);         System.out.println("Binary search for " + target + ": " + binaryResult);

        // Reverse array         int[] reversedArr = arr.clone();         reverseArray(reversedArr);         System.out.println("Reversed array: " + Arrays.toString(reversedArr));

        // Find second largest         int secondLargest = findSecondLargest(arr);         System.out.println("Second largest element: " + secondLargest);     }

    // Exercise 3: 2D array operations     public static void exercise3() {         System.out.println("\n=== Exercise 3: 2D Array Operations ===");

        // TODO: Create and manipulate 2D arrays         // TODO: Implement matrix operations         // TODO: Demonstrate different traversal methods

        // Your code here:

        // Create a 3x3 matrix         int[][] matrix = {             {1, 2, 3},             {4, 5, 6},             {7, 8, 9}         };

        System.out.println("Original Matrix:");         printMatrix(matrix);

        // Matrix operations         System.out.println("\n--- Matrix Operations ---");

        // Sum of all elements         int sum = 0;         for (int[] row : matrix) {             for (int element : row) {                 sum += element;             }         }         System.out.println("Sum of all elements: " + sum);

        // Sum of each row         System.out.println("Sum of each row:");         for (int i = 0; i < matrix.length; i++) {             int rowSum = 0;             for (int j = 0; j < matrix[i].length; j++) {                 rowSum += matrix[i][j];             }             System.out.println("Row " + (i + 1) + ": " + rowSum);         }

        // Sum of each column         System.out.println("Sum of each column:");         for (int j = 0; j < matrix[0].length; j++) {             int colSum = 0;             for (int i = 0; i < matrix.length; i++) {                 colSum += matrix[i][j];             }             System.out.println("Column " + (j + 1) + ": " + colSum);         }

        // Transpose matrix         System.out.println("\nTransposed Matrix:");         int[][] transposed = transposeMatrix(matrix);         printMatrix(transposed);

        // Diagonal sum         int diagonalSum = 0;         for (int i = 0; i < matrix.length; i++) {             diagonalSum += matrix[i][i];         }         System.out.println("Diagonal sum: " + diagonalSum);     }

    // Exercise 4: Jagged arrays     public static void exercise4() {         System.out.println("\n=== Exercise 4: Jagged Arrays ===");

        // TODO: Create a jagged array         // TODO: Demonstrate jagged array operations         // TODO: Show practical use cases

        // Your code here:

        // Create a jagged array for student scores (different number of subjects)         int[][] studentScores = new int[4][];         studentScores[0] = new int[3]; // Student 1 has 3 subjects         studentScores[1] = new int[4]; // Student 2 has 4 subjects         studentScores[2] = new int[2]; // Student 3 has 2 subjects         studentScores[3] = new int[5]; // Student 4 has 5 subjects

        // Initialize with sample data         studentScores[0][0] = 85; studentScores[0][1] = 92; studentScores[0][2] = 78;         studentScores[1][0] = 90; studentScores[1][1] = 88; studentScores[1][2] = 95; studentScores[1][3] = 87;         studentScores[2][0] = 76; studentScores[2][1] = 82;         studentScores[3][0] = 94; studentScores[3][1] = 89; studentScores[3][2] = 91; studentScores[3][3] = 85; studentScores[3][4] = 88;

        System.out.println("Student Scores (Jagged Array):");         for (int i = 0; i < studentScores.length; i++) {             System.out.print("Student " + (i + 1) + ": ");             int sum = 0;             for (int j = 0; j < studentScores[i].length; j++) {                 System.out.print(studentScores[i][j] + " ");                 sum += studentScores[i][j];             }             double average = (double) sum / studentScores[i].length;             System.out.printf("(Average: %.1f)%n", average);         }

        // Find student with highest average         int bestStudent = 0;         double bestAverage = 0;

        for (int i = 0; i < studentScores.length; i++) {             int sum = 0;             for (int score : studentScores[i]) {                 sum += score;             }             double average = (double) sum / studentScores[i].length;             if (average > bestAverage) {                 bestAverage = average;                 bestStudent = i;             }         }

        System.out.println("\nStudent " + (bestStudent + 1) + " has the highest average: " + bestAverage);     }

    // Exercise 5: Inventory management system     public static void exercise5() {         System.out.println("\n=== Exercise 5: Inventory Management System ===");

        // TODO: Create a simple inventory system         // TODO: Use arrays to store product information         // TODO: Implement basic inventory operations

        // Your code here:

        Scanner scanner = new Scanner(System.in);

        // Product information arrays         String[] productNames = {"Laptop", "Mouse", "Keyboard", "Monitor", "Headphones"};         double[] productPrices = {999.99, 25.50, 75.00, 299.99, 89.99};         int[] productQuantities = {10, 50, 30, 15, 25};         String[] productCategories = {"Electronics", "Accessories", "Accessories", "Electronics", "Accessories"};

        System.out.println("Current Inventory:");         System.out.println("Product\t\tPrice\t\tQuantity\tCategory");         System.out.println("-------\t\t-----\t\t--------\t--------");

        for (int i = 0; i < productNames.length; i++) {             System.out.printf("%-15s\t$%-10.2f\t%-8d\t%s%n",                  productNames[i], productPrices[i], productQuantities[i], productCategories[i]);         }

        // Calculate total inventory value         double totalValue = 0;         for (int i = 0; i < productNames.length; i++) {             totalValue += productPrices[i] * productQuantities[i];         }         System.out.printf("\nTotal Inventory Value: $%.2f%n", totalValue);

        // Find products with low stock (less than 20)         System.out.println("\nProducts with low stock (< 20):");         for (int i = 0; i < productNames.length; i++) {             if (productQuantities[i] < 20) {                 System.out.println(productNames[i] + " - Quantity: " + productQuantities[i]);             }         }

        // Search for a product         System.out.print("\nEnter product name to search: ");         String searchProduct = scanner.nextLine();

        int foundIndex = -1;         for (int i = 0; i < productNames.length; i++) {             if (productNames[i].equalsIgnoreCase(searchProduct)) {                 foundIndex = i;                 break;             }         }

        if (foundIndex != -1) {             System.out.println("Product found:");             System.out.println("Name: " + productNames[foundIndex]);             System.out.println("Price: $" + productPrices[foundIndex]);             System.out.println("Quantity: " + productQuantities[foundIndex]);             System.out.println("Category: " + productCategories[foundIndex]);         } else {             System.out.println("Product not found.");         }

        scanner.close();     }

    // Helper methods     public static int linearSearch(int[] arr, int target) {         for (int i = 0; i < arr.length; i++) {             if (arr[i] == target) {                 return i;             }         }         return -1;     }

    public static void bubbleSort(int[] arr) {         for (int i = 0; i < arr.length - 1; i++) {             for (int j = 0; j < arr.length - 1 - i; j++) {                 if (arr[j] > arr[j + 1]) {                     int temp = arr[j];                     arr[j] = arr[j + 1];                     arr[j + 1] = temp;                 }             }         }     }

    public static int binarySearch(int[] arr, int target) {         int left = 0, right = arr.length - 1;         while (left <= right) {             int mid = left + (right - left) / 2;             if (arr[mid] == target) return mid;             if (arr[mid] < target) left = mid + 1;             else right = mid - 1;         }         return -1;     }

    public static void reverseArray(int[] arr) {         int left = 0, right = arr.length - 1;         while (left < right) {             int temp = arr[left];             arr[left] = arr[right];             arr[right] = temp;             left++;             right--;         }     }

    public static int findSecondLargest(int[] arr) {         if (arr.length < 2) return -1;

        int largest = Integer.MIN_VALUE;         int secondLargest = Integer.MIN_VALUE;

        for (int num : arr) {             if (num > largest) {                 secondLargest = largest;                 largest = num;             } else if (num > secondLargest && num != largest) {                 secondLargest = num;             }         }

        return secondLargest == Integer.MIN_VALUE ? -1 : secondLargest;     }

    public static void printMatrix(int[][] matrix) {         for (int[] row : matrix) {             for (int element : row) {                 System.out.print(element + " ");             }             System.out.println();         }     }

    public static int[][] transposeMatrix(int[][] matrix) {         int rows = matrix.length;         int cols = matrix[0].length;         int[][] transposed = new int[cols][rows];

        for (int i = 0; i < rows; i++) {             for (int j = 0; j < cols; j++) {                 transposed[j][i] = matrix[i][j];             }         }

        return transposed;     }

    public static void main(String[] args) {         System.out.println("Day 04 Exercises: Arrays & 2D Arrays\n");

        exercise1();         exercise2();         exercise3();         exercise4();         exercise5();

        System.out.println("\n=== Challenge Questions ===");         System.out.println("1. Implement a method to rotate an array by k positions");         System.out.println("2. Create a program to find the longest increasing subsequence");         System.out.println("3. Implement a sparse matrix using arrays");         System.out.println("4. Create a program to find the median of two sorted arrays");         System.out.println("5. Implement a circular queue using arrays");     } } 
