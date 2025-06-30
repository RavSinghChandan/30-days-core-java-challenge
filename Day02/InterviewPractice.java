/**
 * Interview Practice Questions - Day 02: Variables, Data Types, Type Casting, Wrapper Classes
 * 
 * Question 1: What is the difference between primitive data types and wrapper classes?
 * Question 2: Explain autoboxing and unboxing in Java
 * Question 3: What happens when you try to unbox a null wrapper object?
 */

public class InterviewPractice {
    
    // Question 1: Primitive vs Wrapper Classes
    public static void explainPrimitiveVsWrapper() {
        System.out.println("=== Question 1: Primitive vs Wrapper Classes ===");
        
        // TODO: Explain the differences
        // 1. Memory storage (stack vs heap)
        // 2. Default values
        // 3. Null handling
        // 4. Performance implications
        // 5. Usage in collections
        
        System.out.println("Your answer:");
        // Write your explanation here
        
        System.out.println("\nKey differences to mention:");
        System.out.println("- Primitives: stored in stack, have default values, cannot be null");
        System.out.println("- Wrappers: stored in heap, can be null, have overhead");
        System.out.println("- Collections require objects (wrappers)");
        System.out.println("- Primitives are more performant for calculations");
    }
    
    // Question 2: Autoboxing and Unboxing
    public static void explainAutoboxingUnboxing() {
        System.out.println("\n=== Question 2: Autoboxing and Unboxing ===");
        
        // TODO: Explain autoboxing and unboxing
        // 1. What is autoboxing?
        // 2. What is unboxing?
        // 3. When do they occur?
        // 4. Performance implications
        
        System.out.println("Your answer:");
        // Write your explanation here
        
        System.out.println("\nKey points to mention:");
        System.out.println("- Autoboxing: primitive → wrapper (automatic)");
        System.out.println("- Unboxing: wrapper → primitive (automatic)");
        System.out.println("- Introduced in Java 5");
        System.out.println("- Can impact performance in loops");
    }
    
    // Question 3: Null Unboxing
    public static void demonstrateNullUnboxing() {
        System.out.println("\n=== Question 3: Null Unboxing ===");
        
        // TODO: Demonstrate what happens with null unboxing
        // 1. Create a null Integer
        // 2. Try to unbox it
        // 3. Explain the exception
        
        System.out.println("Your demonstration:");
        // Write your demonstration here
        
        System.out.println("\nExpected behavior:");
        System.out.println("Integer nullableInt = null;");
        System.out.println("int value = nullableInt; // NullPointerException!");
        System.out.println("This happens because unboxing calls intValue() on null");
    }
    
    // Question 4: Type Casting Scenarios
    public static void demonstrateTypeCasting() {
        System.out.println("\n=== Question 4: Type Casting Scenarios ===");
        
        // TODO: Demonstrate different casting scenarios
        // 1. Implicit casting examples
        // 2. Explicit casting examples
        // 3. Data loss scenarios
        // 4. Character casting
        
        System.out.println("Your demonstration:");
        // Write your demonstration here
        
        System.out.println("\nCommon scenarios:");
        System.out.println("- int to long: implicit (no data loss)");
        System.out.println("- double to int: explicit (data loss)");
        System.out.println("- char to int: implicit (ASCII value)");
        System.out.println("- int to char: explicit (character representation)");
    }
    
    // Question 5: Wrapper Class Methods
    public static void demonstrateWrapperMethods() {
        System.out.println("\n=== Question 5: Wrapper Class Methods ===");
        
        // TODO: Demonstrate important wrapper class methods
        // 1. parseInt, parseDouble, etc.
        // 2. toString methods
        // 3. valueOf methods
        // 4. Constants (MAX_VALUE, MIN_VALUE)
        
        System.out.println("Your demonstration:");
        // Write your demonstration here
        
        System.out.println("\nImportant methods:");
        System.out.println("- Integer.parseInt(\"123\")");
        System.out.println("- Integer.toString(123)");
        System.out.println("- Integer.valueOf(\"123\")");
        System.out.println("- Integer.MAX_VALUE, Integer.MIN_VALUE");
    }
    
    public static void main(String[] args) {
        System.out.println("Interview Practice - Day 02: Variables, Data Types, Type Casting, Wrapper Classes\n");
        
        explainPrimitiveVsWrapper();
        explainAutoboxingUnboxing();
        demonstrateNullUnboxing();
        demonstrateTypeCasting();
        demonstrateWrapperMethods();
        
        System.out.println("\n=== Additional Practice Questions ===");
        System.out.println("1. What is the default value of an int variable?");
        System.out.println("2. What is the difference between Integer.valueOf() and new Integer()?");
        System.out.println("3. How do you convert a String to a primitive int?");
        System.out.println("4. What is the range of a byte data type?");
        System.out.println("5. What happens when you cast a double to an int?");
        System.out.println("6. What is the difference between float and double?");
        System.out.println("7. How do you handle null values with wrapper classes?");
        System.out.println("8. What is the purpose of the Character wrapper class?");
    }
} 