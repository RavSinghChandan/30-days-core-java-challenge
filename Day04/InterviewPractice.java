/**
 * Interview Practice Questions - Day 04: Arrays & 2D Arrays
 * 
 * Question 1: What is the difference between an array and an ArrayList?
 * Question 2: How do you find the second largest element in an array?
 * Question 3: What is a jagged array and when would you use it?
 */

public class InterviewPractice {
    
    // Question 1: Array vs ArrayList
    public static void explainArrayVsArrayList() {
        System.out.println("=== Question 1: Array vs ArrayList ===");
        
        // TODO: Explain the differences between arrays and ArrayList
        // 1. Size flexibility
        // 2. Memory management
        // 3. Performance characteristics
        // 4. Available methods
        // 5. When to use each
        
        System.out.println("Your answer:");
        // Write your explanation here
        
        System.out.println("\nKey differences to mention:");
        System.out.println("- Arrays: fixed size, faster access, primitive support");
        System.out.println("- ArrayList: dynamic size, more methods, object only");
        System.out.println("- Arrays: stored in heap, ArrayList: wrapper around array");
        System.out.println("- Performance: arrays slightly faster for simple operations");
    }
    
    // Question 2: Find second largest element
    public static void findSecondLargest() {
        System.out.println("\n=== Question 2: Find Second Largest Element ===");
        
        // TODO: Implement a method to find the second largest element
        // 1. Handle edge cases (empty array, single element, duplicates)
        // 2. Optimize for single pass
        // 3. Consider time complexity
        
        System.out.println("Your implementation:");
        // Write your implementation here
        
        System.out.println("\nKey points to consider:");
        System.out.println("- Handle arrays with less than 2 elements");
        System.out.println("- Handle duplicate elements");
        System.out.println("- Single pass solution is more efficient");
        System.out.println("- Time complexity: O(n)");
    }
    
    // Question 3: Jagged arrays
    public static void explainJaggedArrays() {
        System.out.println("\n=== Question 3: Jagged Arrays ===");
        
        // TODO: Explain jagged arrays
        // 1. What is a jagged array?
        // 2. How to declare and initialize?
        // 3. When to use jagged arrays?
        // 4. Memory layout
        
        System.out.println("Your explanation:");
        // Write your explanation here
        
        System.out.println("\nKey points to mention:");
        System.out.println("- Jagged array: 2D array with different row lengths");
        System.out.println("- Memory efficient for irregular data");
        System.out.println("- Common use cases: sparse matrices, variable-length records");
        System.out.println("- Each row is a separate array object");
    }
    
    // Question 4: Array traversal methods
    public static void demonstrateArrayTraversal() {
        System.out.println("\n=== Question 4: Array Traversal Methods ===");
        
        // TODO: Demonstrate different array traversal methods
        // 1. Traditional for loop
        // 2. Enhanced for loop
        // 3. While loop
        // 4. When to use each
        
        System.out.println("Your demonstration:");
        // Write your demonstration here
        
        System.out.println("\nTraversal methods:");
        System.out.println("- Traditional for: when you need index");
        System.out.println("- Enhanced for: when you only need values");
        System.out.println("- While loop: when you need custom iteration logic");
        System.out.println("- Performance: all are O(n)");
    }
    
    // Question 5: Array operations and utilities
    public static void demonstrateArrayOperations() {
        System.out.println("\n=== Question 5: Array Operations ===");
        
        // TODO: Demonstrate common array operations
        // 1. Searching (linear vs binary)
        // 2. Sorting
        // 3. Copying arrays
        // 4. Array utilities (Arrays class)
        
        System.out.println("Your demonstration:");
        // Write your demonstration here
        
        System.out.println("\nCommon operations:");
        System.out.println("- Linear search: O(n), works on unsorted arrays");
        System.out.println("- Binary search: O(log n), requires sorted array");
        System.out.println("- Sorting: Arrays.sort() uses optimized algorithms");
        System.out.println("- Copying: System.arraycopy(), Arrays.copyOf(), clone()");
    }
    
    public static void main(String[] args) {
        System.out.println("Interview Practice - Day 04: Arrays & 2D Arrays\n");
        
        explainArrayVsArrayList();
        findSecondLargest();
        explainJaggedArrays();
        demonstrateArrayTraversal();
        demonstrateArrayOperations();
        
        System.out.println("\n=== Additional Practice Questions ===");
        System.out.println("1. How do you reverse an array in-place?");
        System.out.println("2. What is the time complexity of accessing an array element?");
        System.out.println("3. How do you find duplicate elements in an array?");
        System.out.println("4. What is the difference between shallow copy and deep copy?");
        System.out.println("5. How do you implement a circular buffer using arrays?");
        System.out.println("6. What are the advantages and disadvantages of arrays?");
        System.out.println("7. How do you handle ArrayIndexOutOfBoundsException?");
        System.out.println("8. What is the memory layout of a 2D array in Java?");
    }
} 