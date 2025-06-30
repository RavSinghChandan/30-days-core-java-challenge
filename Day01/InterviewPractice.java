/**
 * Interview Practice Questions - Day 01: Java Basics
 * 
 * Question 1: Explain the difference between JVM, JRE, and JDK
 * Question 2: What is the Java compilation process?
 * Question 3: What is the difference between System.out.println() and System.out.print()?
 */

public class InterviewPractice {
    
    // Question 1: Explain the difference between JVM, JRE, and JDK
    public static void explainJavaEcosystem() {
        System.out.println("=== Question 1: JVM vs JRE vs JDK ===");
        
        // TODO: Write your explanation here
        // 1. What is JVM and what does it do?
        // 2. What is JRE and what does it contain?
        // 3. What is JDK and what does it contain?
        // 4. What is the relationship between these three?
        
        System.out.println("Your answer:");
        // Write your explanation here
        
        System.out.println("\nKey points to mention:");
        System.out.println("- JVM: Virtual machine, executes bytecode, platform independent");
        System.out.println("- JRE: Runtime environment (JVM + libraries), needed to run Java apps");
        System.out.println("- JDK: Development kit (JRE + tools), needed to develop Java apps");
        System.out.println("- JDK contains JRE, JRE contains JVM");
    }
    
    // Question 2: What is the Java compilation process?
    public static void explainCompilationProcess() {
        System.out.println("\n=== Question 2: Java Compilation Process ===");
        
        // TODO: Explain the compilation process
        // 1. What happens when you run javac HelloWorld.java?
        // 2. What is bytecode?
        // 3. What happens when you run java HelloWorld?
        // 4. Why is Java called "Write Once, Run Anywhere"?
        
        System.out.println("Your answer:");
        // Write your explanation here
        
        System.out.println("\nKey points to mention:");
        System.out.println("- javac compiles .java to .class (bytecode)");
        System.out.println("- Bytecode is platform-independent");
        System.out.println("- JVM interprets bytecode to machine code");
        System.out.println("- Same bytecode runs on any platform with JVM");
    }
    
    // Question 3: What is the difference between System.out.println() and System.out.print()?
    public static void demonstrateOutputMethods() {
        System.out.println("\n=== Question 3: println() vs print() ===");
        
        // TODO: Demonstrate the difference
        // 1. What does println() do?
        // 2. What does print() do?
        // 3. When would you use each?
        
        System.out.println("Your demonstration:");
        // Write your demonstration here
        
        System.out.println("\nExpected output:");
        System.out.println("Using println():");
        System.out.println("Line 1");
        System.out.println("Line 2");
        
        System.out.println("Using print():");
        System.out.print("Line 1");
        System.out.print("Line 2");
        System.out.println(); // Add newline
    }
    
    public static void main(String[] args) {
        System.out.println("Interview Practice - Day 01: Java Basics\n");
        
        explainJavaEcosystem();
        explainCompilationProcess();
        demonstrateOutputMethods();
        
        System.out.println("\n=== Additional Practice Questions ===");
        System.out.println("1. What is the main method and why is it special?");
        System.out.println("2. What is the difference between a class and an object?");
        System.out.println("3. What are command line arguments in Java?");
        System.out.println("4. What is the purpose of the 'public' keyword?");
        System.out.println("5. What is the difference between '==' and '.equals()'?");
    }
} 