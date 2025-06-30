/**
 * Interview Practice Questions - Day 06: OOP Basics: Class, Object, Constructor, static, this
 * 
 * Question 1: What is the difference between a class and an object?
 * Question 2: Explain constructor overloading and constructor chaining
 * Question 3: What is the difference between static and instance members?
 */

public class InterviewPractice {
    
    // Question 1: Class vs Object
    public static void explainClassVsObject() {
        System.out.println("=== Question 1: Class vs Object ===");
        
        // TODO: Explain the difference between a class and an object
        // 1. What is a class?
        // 2. What is an object?
        // 3. How are they related?
        // 4. Show examples
        
        System.out.println("Your answer:");
        // Write your explanation here
        
        System.out.println("\nKey differences to mention:");
        System.out.println("- Class: blueprint/template, Object: instance of class");
        System.out.println("- Class: exists in memory once, Object: multiple instances possible");
        System.out.println("- Class: defines structure, Object: contains actual data");
        System.out.println("- Class: static members belong to class, Object: instance members belong to object");
    }
    
    // Question 2: Constructor overloading and chaining
    public static void explainConstructorOverloading() {
        System.out.println("\n=== Question 2: Constructor Overloading and Chaining ===");
        
        // TODO: Explain constructor overloading and chaining
        // 1. What is constructor overloading?
        // 2. What is constructor chaining?
        // 3. How to implement constructor chaining?
        // 4. Benefits and best practices
        
        System.out.println("Your answer:");
        // Write your answer here
        
        System.out.println("\nKey points to mention:");
        System.out.println("- Constructor overloading: multiple constructors with different parameters");
        System.out.println("- Constructor chaining: one constructor calls another using this()");
        System.out.println("- Reduces code duplication and ensures proper initialization");
        System.out.println("- Always call the most specific constructor from less specific ones");
    }
    
    // Question 3: Static vs Instance members
    public static void explainStaticVsInstance() {
        System.out.println("\n=== Question 3: Static vs Instance Members ===");
        
        // TODO: Explain the difference between static and instance members
        // 1. What are static members?
        // 2. What are instance members?
        // 3. When to use each?
        // 4. Memory and access considerations
        
        System.out.println("Your answer:");
        // Write your answer here
        
        System.out.println("\nKey differences to mention:");
        System.out.println("- Static: belongs to class, Instance: belongs to object");
        System.out.println("- Static: shared across all objects, Instance: unique to each object");
        System.out.println("- Static: accessed via class name, Instance: accessed via object reference");
        System.out.println("- Static: loaded with class, Instance: created with object");
    }
    
    // Question 4: 'this' keyword usage
    public static void explainThisKeyword() {
        System.out.println("\n=== Question 4: 'this' Keyword ===");
        
        // TODO: Explain the 'this' keyword and its usage
        // 1. What does 'this' refer to?
        // 2. Different ways to use 'this'
        // 3. Constructor chaining with this()
        // 4. Method chaining
        
        System.out.println("Your answer:");
        // Write your answer here
        
        System.out.println("\nKey points to mention:");
        System.out.println("- 'this' refers to the current object instance");
        System.out.println("- Used to distinguish instance variables from parameters");
        System.out.println("- Used for constructor chaining with this()");
        System.out.println("- Used for method chaining by returning this");
    }
    
    // Question 5: Object lifecycle
    public static void explainObjectLifecycle() {
        System.out.println("\n=== Question 5: Object Lifecycle ===");
        
        // TODO: Explain object creation and lifecycle
        // 1. How are objects created?
        // 2. What happens during object creation?
        // 3. Memory allocation and garbage collection
        // 4. Constructor execution order
        
        System.out.println("Your answer:");
        // Write your answer here
        
        System.out.println("\nKey points to mention:");
        System.out.println("- Objects created using 'new' keyword");
        System.out.println("- Memory allocated in heap");
        System.out.println("- Constructor called automatically");
        System.out.println("- Garbage collection handles cleanup");
    }
    
    public static void main(String[] args) {
        System.out.println("Interview Practice - Day 06: OOP Basics\n");
        
        explainClassVsObject();
        explainConstructorOverloading();
        explainStaticVsInstance();
        explainThisKeyword();
        explainObjectLifecycle();
        
        System.out.println("\n=== Additional Practice Questions ===");
        System.out.println("1. What is the difference between static and final keywords?");
        System.out.println("2. Can you call a static method from an instance method?");
        System.out.println("3. What happens if you don't define a constructor in a class?");
        System.out.println("4. How do you prevent object creation using constructors?");
        System.out.println("5. What is the difference between shallow copy and deep copy?");
        System.out.println("6. Can you access instance variables from static methods?");
        System.out.println("7. What is the purpose of static blocks?");
        System.out.println("8. How do you implement the singleton pattern using static members?");
    }
}
